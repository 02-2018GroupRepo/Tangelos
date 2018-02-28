public class Team {
    public static void main(String args[]){

        Member newsha = new Member("Newsha", "BME", "GT", 2016);
        /*newsha.setName("Newsha");
        newsha.setMajor("BME");
        newsha.setGraduationYear(2016);
        newsha.setSchool("GT");
*/
        Member tahrim = new Member("Tahrim", "Biology", "FAU", 2014);
/*        tahrim.setName("Tahrim");
        tahrim.setMajor("Biology");
        tahrim.setGraduationYear(2014);
        tahrim.setSchool("FAU");*/

        Member noelle = new Member("Noelle", "biological engineering", "UF", 2016);
/*        noelle.setName("Noelle");
        noelle.setMajor("Biological Engineering");
        noelle.setSchool("UF");
        noelle.setGraduationYear(2016);*/

        Member hunter = new Member("Hunter", "Biology", "SPSU", 2014);
/*        hunter.setName("Hunter");
        hunter.setMajor("Biology");
        hunter.setGraduationYear(2014);
        hunter.setSchool("SPSU");*/

        Member[] teamArray = {newsha, noelle, tahrim, hunter};

        System.out.println(Member.teamName);
        System.out.println(Member.atribute);
        System.out.println("\n \n");

        for (int i = 0; i < teamArray.length; i++) {
            System.out.println(teamArray[i].getName());
            System.out.println(teamArray[i].getMajor());
            System.out.println(teamArray[i].getSchool());
            System.out.println(teamArray[i].getGraduationYear());
            System.out.println("\n ------------------------------ \n");
        }
    }

}
