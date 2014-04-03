package graduation.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author jiangyukun
 * 
 */
@MappedSuperclass
public class IdEntity {
	private String id;

	@Id
	@GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
	@GeneratedValue(generator = "uuid")
	@Column(name = "UUID", length = 36)
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
