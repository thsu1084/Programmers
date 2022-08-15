public class skilltree {

    public static void main(String[] args) {
        solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"});
    }

    public static int solution(String skill, String[] skill_trees){
        
        int answer = 0;

        for(String key: skill_trees){
            String s = key.replaceAll("[^"+skill+"]", "");

            

            if(skill.startsWith(s)) answer++;
        }


        
        return answer;
    }
}
