package graduation.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author jiangyukun
 * @since 2014-03-30 21:04
 */
@Entity(name = "GRA_DISCUSS")
public class Discuss extends IdEntity {

	private String content;
	private Date discussDate;
	private boolean isUsed;

	@Column(name = "CONTENT")
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "DISCUSS_DATE")
	public Date getDiscussDate() {
		return discussDate;
	}

	public void setDiscussDate(Date discussDate) {
		this.discussDate = discussDate;
	}

	@Column(name = "IS_USED")
	public boolean isUsed() {
		return isUsed;
	}

	public void setUsed(boolean isUsed) {
		this.isUsed = isUsed;
	}
}
