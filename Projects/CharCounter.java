package Projects;

public class CharCounter {

    public int countMeWithSpaces(String stringling) {
        int sum = 0;
        char[] chars = stringling.toCharArray();
        System.out.println(chars);
        for (char ch : chars) {
            sum++;
        }
        return sum;
    }

    public int countMeWithoutSpaces(String stringling) {
        int sum = 0;
        char[] chars = stringling.toCharArray();
        for (char ch : chars) {
            if (ch != ' ') {
                sum++;
            }
        }
        return sum;
    }


}
