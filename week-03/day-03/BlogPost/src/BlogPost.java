public class BlogPost {
  public static void main(String[] args) {
    String authorName;
    String title;
    String text;
    String publicationDate;

    createBlogPost("John Doe","Lorem Ipsum", "Lorem ipsum dolor sit amet.", "20000504");
    createBlogPost("Tim Urban","Wait but why", "A popular long-form, stick-figure-illustrated blog about almost everything.", "20101010");
    createBlogPost("William Turton","One Engineer Is Trying to Get IBM to Reckon With Trump", "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.", "20170328");
  }

  static void createBlogPost (String a, String b, String c, String d) {
    String year = d.substring(0,4);
    String month = d.substring(4,6);
    String day = d.substring(6,8);
    String dotDate = year + "." + month + "." + day + ".";

    System.out.println("\"" + b + "\"" + " titled by " + a + " posted at " + "\"" + dotDate + "\"");
    System.out.println("\t" + c);
  }
}
