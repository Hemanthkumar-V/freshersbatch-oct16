package Stream;
import java.util.Arrays;
	import java.util.Comparator;
	import java.util.List;
	import java.util.Optional;
	import java.util.stream.Collector;
	import java.util.stream.Collectors;
	import java.util.stream.Stream;

	public class Question5{

		int newsId;
		String postedByUser;
		String commentByUser;
		String comment;

		public Question5(int newsId, String postedByUser, String commentByUser, String comment) {
			super();
			this.newsId = newsId;
			this.postedByUser = postedByUser;
			this.commentByUser = commentByUser;
			this.comment = comment;
		}

		public int getNewsId() {
			return newsId;
		}

		public void setNewsId(int newsId) {
			this.newsId = newsId;
		}

		public String getPostedByUser() {
			return postedByUser;
		}

		public void setPostedByUser(String postedByUser) {
			this.postedByUser = postedByUser;
		}

		public String getCommentByUser() {
			return commentByUser;
		}

		public void setCommentByUser(String commentByUser) {
			this.commentByUser = commentByUser;
		}

		public String getComment() {
			return comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public static void main(String[] args ) {

			List<Question5> list=Arrays.asList(
					new Question5(123, "Iron Man", "Thanos", "Finance Minister Nirmala Sitharaman on Saturday said that the government, undeterred by the COVID-19 pandemic, has been pursuing reforms for achieving sustained long-term growth in a bid to make India one of the top economies of the world in the coming decades."),
					new Question5(234, "Thor", "Loki", "Replying to debate on Budget 2021-22 in Lok Sabha, she said, the Prime Minister did not lose any opportunity to continue with the reforms and this Budget has set the pace for India to become self-reliant or Aatmanirbhar."),
					new Question5(345, "Hulk", "She Hulk", "She Budget for 2021-22, has provided the highest capex growth of 34.4 per cent by providing more money to railways, roads and defence."),
					new Question5(456, "Hulk", "Loki", "She said her Budget for 2021-22, has provided the highest capex growth of 34.4 per cent by providing more money to railways, roads and defence.")
					);

			//Question 5
					int count=(int) list.stream()
							.filter(x-> x.comment.contains("Budget"))
							.count();
					System.out.println(count);
					
				

			
		}

		@Override
		public String toString() {
			return "News [newsId=" + newsId + ", postedByUser=" + postedByUser + ", commentByUser=" + commentByUser
					+ ", comment=" + comment + "]";
		}


	}
	



