package graduation.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "GRA_NEWS")
public class News extends IdEntity {
	private String title;
	private String news;
	private short top;
	private Date newsDate;

	private User adder;

	@Column(name = "TITLE", nullable = false, length = 100)
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "NEWS", length = 2000)
	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		this.news = news;
	}

	@Column(name = "TOP")
	public short getTop() {
		return top;
	}

	public void setTop(short top) {
		this.top = top;
	}

	@Column(name = "NEWS_DATE")
	public Date getNewsDate() {
		return newsDate;
	}

	public void setNewsDate(Date newsDate) {
		this.newsDate = newsDate;
	}

	@JoinColumn(name = "ADDER")
	@ManyToOne
	public User getAdder() {
		return adder;
	}

	public void setAdder(User adder) {
		this.adder = adder;
	}
}
