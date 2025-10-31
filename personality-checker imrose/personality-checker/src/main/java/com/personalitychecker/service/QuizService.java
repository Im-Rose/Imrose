package com.personalitychecker.service;

import com.personalitychecker.model.PersonalityResult;
import com.personalitychecker.model.Question;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class QuizService {

    public List<Question> getQuestions() {
        return Arrays.asList(
                // E/I (1–5)
                new Question(1, "How do you usually spend your weekends?",
                        Arrays.asList("Reading alone", "Hanging out with friends", "Watching movies solo", "Going to events")),
                new Question(2, "At a party, you're most likely to:",
                        Arrays.asList("Stay near snacks quietly", "Mingle with everyone", "Talk to one close friend", "Dance!")),
                new Question(3, "After a long day, you recharge by:",
                        Arrays.asList("Alone time", "Talking to someone", "Listening to music alone", "Being around others")),
                new Question(4, "Your ideal vacation is:",
                        Arrays.asList("Solo cabin in nature", "Group tour in a city", "Quiet beach escape", "Adventure with friends")),
                new Question(5, "In class or meetings, you prefer to:",
                        Arrays.asList("Listen quietly", "Speak your mind often", "Take notes silently", "Discuss with the group")),

                // S/N (6–10)
                new Question(6, "When learning something new, you prefer:",
                        Arrays.asList("Clear, practical examples", "Abstract concepts", "Step-by-step instruction", "Theoretical ideas first")),
                new Question(7, "You notice:",
                        Arrays.asList("Specific facts", "Trends and patterns", "What’s present", "What could be")),
                new Question(8, "You prefer information that is:",
                        Arrays.asList("Concrete", "Imagined", "Observed", "Inferred")),
                new Question(9, "You’re more drawn to:",
                        Arrays.asList("Reality", "Fantasy", "Facts", "Ideas")),
                new Question(10, "When explaining something, you use:",
                        Arrays.asList("Exact details", "Metaphors", "Examples", "Hypotheticals")),

                // T/F (11–15)
                new Question(11, "When making a decision, you rely on:",
                        Arrays.asList("Logic", "Empathy", "Analysis", "Feelings")),
                new Question(12, "You’re more motivated by:",
                        Arrays.asList("Success", "Purpose", "Achievement", "Connection")),
                new Question(13, "In arguments, you:",
                        Arrays.asList("Stick to logic", "Try to maintain peace", "Defend with facts", "Care about harmony")),
                new Question(14, "If a friend makes a mistake, you:",
                        Arrays.asList("Correct them directly", "Support them emotionally", "Offer practical advice", "Comfort them")),
                new Question(15, "Which best describes you:",
                        Arrays.asList("Objective", "Compassionate", "Rational", "Sensitive")),

                // J/P (16–20)
                new Question(16, "Your schedule is usually:",
                        Arrays.asList("Organized", "Flexible", "Planned", "Spontaneous")),
                new Question(17, "You like tasks to be:",
                        Arrays.asList("Completed early", "Started late", "Structured", "Open-ended")),
                new Question(18, "When traveling, you:",
                        Arrays.asList("Make an itinerary", "Go with the flow", "Plan ahead", "Decide as you go")),
                new Question(19, "Your decision-making style is:",
                        Arrays.asList("Definitive", "Adaptable", "Orderly", "Flexible")),
                new Question(20, "When facing deadlines:",
                        Arrays.asList("Start right away", "Work best under pressure", "Manage tasks on time", "Procrastinate creatively"))
        );
    }

    public String getPersonalityResult(List<Integer> answers) {
        int E = 0, I = 0;
        int S = 0, N = 0;
        int T = 0, F = 0;
        int J = 0, P = 0;

        for (int i = 0; i < answers.size(); i++) {
            int choice = answers.get(i);

            if (i < 5) { // E/I
                if (choice == 0 || choice == 2) I++; else E++;
            } else if (i < 10) { // S/N
                if (choice == 0 || choice == 2) S++; else N++;
            } else if (i < 15) { // T/F
                if (choice == 0 || choice == 2) T++; else F++;
            } else { // J/P
                if (choice == 0 || choice == 2) J++; else P++;
            }
        }

        return (E >= I ? "E" : "I") +
                (S >= N ? "S" : "N") +
                (T >= F ? "T" : "F") +
                (J >= P ? "J" : "P");
    }

    public PersonalityResult getFullPersonalityResult(List<Integer> answers) {
        String personality = getPersonalityResult(answers);

        // Print the personality type in console
        System.out.println("MBTI result = " + personality);

        String description = getDescription(personality);
        String imageUrl = getImageUrl(personality);
        return new PersonalityResult(personality, description, imageUrl);
    }

    private String getDescription(String personality) {
        switch (personality) {
            case "INTJ": return "You are a strategic thinker who loves planning and solving complex problems.";
            case "INTP": return "You are an innovative thinker, curious and always exploring new ideas.";
            case "ENTJ": return "You are a natural leader, confident and driven to achieve your goals.";
            case "ENTP": return "You are an energetic innovator and idea generator, always challenging the status quo.";
            case "INFJ": return "You are a thoughtful idealist with deep insight and compassion.";
            case "INFP": return "You are a caring and creative idealist with strong personal values.";
            case "ENFJ": return "You are a charismatic leader, empathetic and inspiring.";
            case "ENFP": return "You are enthusiastic, imaginative, and enjoy exploring possibilities.";
            case "ISTJ": return "You are responsible, organized, and value traditions.";
            case "ISFJ": return "You are nurturing, dependable, and attentive to others' needs.";
            case "ESTJ": return "You are practical, organized, and thrive in leadership roles.";
            case "ESFJ": return "You are warm-hearted, social, and highly conscientious.";
            case "ISTP": return "You are independent, logical, and enjoy hands-on problem solving.";
            case "ISFP": return "You are sensitive, artistic, and live in the present moment.";
            case "ESTP": return "You are energetic, action-oriented, and enjoy living on the edge.";
            case "ESFP": return "You are outgoing, spontaneous, and love to entertain.";
            default: return "Description not available for this personality type.";
        }
    }

    private String getImageUrl(String personality) {
        switch (personality) {
            case "INTJ": return "https://example.com/images/intj.png";
            case "INTP": return "https://example.com/images/intp.png";
            case "ENTJ": return "https://example.com/images/entj.png";
            case "ENTP": return "https://example.com/images/entp.png";
            case "INFJ": return "https://example.com/images/infj.png";
            case "INFP": return "https://example.com/images/infp.png";
            case "ENFJ": return "https://example.com/images/enfj.png";
            case "ENFP": return "https://example.com/images/enfp.png";
            case "ISTJ": return "https://example.com/images/istj.png";
            case "ISFJ": return "https://example.com/images/isfj.png";
            case "ESTJ": return "https://example.com/images/estj.png";
            case "ESFJ": return "https://example.com/images/esfj.png";
            case "ISTP": return "https://example.com/images/istp.png";
            case "ISFP": return "https://example.com/images/isfp.png";
            case "ESTP": return "https://example.com/images/estp.png";
            case "ESFP": return "https://example.com/images/esfp.png";
            default: return "https://example.com/images/default.png";
        }
    }
}
