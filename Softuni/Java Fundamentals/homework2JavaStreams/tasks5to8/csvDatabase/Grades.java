package homework2JavaStreams.tasks5to8.csvDatabase;

public class Grades {

	private int id;
	private String mathGrades;
	private String literGrades;
	
	public Grades(int id, String mathGrades, String literGrades) {
		super();
		this.id = id;
		this.mathGrades = mathGrades;
		this.literGrades = literGrades;
	}

	public int getId() {
		return id;
	}

	public String getMathGrades() {
		return mathGrades;
	}

	public String getLiterGrades() {
		return literGrades;
	}

	@Override
	public String toString() {
		return "Grades [id=" + id + ", mathGrades=" + mathGrades + 
				", literGrades=" + literGrades + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((literGrades == null) ? 0 : literGrades.hashCode());
		result = prime * result + ((mathGrades == null) ? 0 : mathGrades.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Grades other = (Grades) obj;
		if (id != other.id)
			return false;
		if (literGrades == null) {
			if (other.literGrades != null)
				return false;
		} else if (!literGrades.equals(other.literGrades))
			return false;
		if (mathGrades == null) {
			if (other.mathGrades != null)
				return false;
		} else if (!mathGrades.equals(other.mathGrades))
			return false;
		return true;
	}
	
	
	
}
