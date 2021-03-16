package Week14HW148;



public class HW148 {
    public static void main(String[] args) {
        String phone = "(123) 456-7890";
        String[] tokens = phone.split("\\)");
        String[] tokens2 = tokens[0].split("\\(");
        String[] tokens3 = tokens[1].split("-");
        
        String cleanPhone = tokens2[1].concat(tokens3[0].trim()).concat(tokens3[1]);
        System.out.println(cleanPhone);
    }
}
