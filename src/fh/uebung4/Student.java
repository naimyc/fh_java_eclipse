package fh.uebung4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class Student implements Serializable{
	private String name, vorname, studiengang;
	private int alter;
	private boolean zweitstudium;
	
	public static void main(String[] args) {
		Student s = new Student("Pablo", "Jwan", "IT", 8, false);
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("studenten.txt"))){
			oos.writeObject(s);
			oos.flush();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("studenten.txt"))){
			Student ss = (Student) ois.readObject();
			String name =ss.getName(), vorname = ss.getVorname();
			System.out.println(vorname +",\t"+ name);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	
	@Override
	public String toString() {
		return String.format("Student [name=%s, vorname=%s, studiengang=%s, alter=%s, zweitstudium=%s]", name, vorname,
				studiengang, alter, zweitstudium);
	}

	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getVorname() {
		return vorname;
	}


	public void setVorname(String vorname) {
		this.vorname = vorname;
	}


	public String getStudiengang() {
		return studiengang;
	}


	public void setStudiengang(String studiengang) {
		this.studiengang = studiengang;
	}


	public int getAlter() {
		return alter;
	}


	public void setAlter(int alter) {
		this.alter = alter;
	}


	public boolean isZweitstudium() {
		return zweitstudium;
	}


	public void setZweitstudium(boolean zweitstudium) {
		this.zweitstudium = zweitstudium;
	}


	/**
	 * @param name
	 * @param vorname
	 * @param studiengang
	 * @param alter
	 * @param zweitstudium
	 */
	public Student(String name, String vorname, String studiengang, int alter, boolean zweitstudium) {
		this.name = name;
		this.vorname = vorname;
		this.studiengang = studiengang;
		this.alter = alter;
		this.zweitstudium = zweitstudium;
	}
	

	
	
}
