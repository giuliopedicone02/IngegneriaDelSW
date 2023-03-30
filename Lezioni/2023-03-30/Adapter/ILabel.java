// Codice Java che implementa il design pattern Adapter


/** ILabel e' un Target */
public interface ILabel {
	public String getNextLabel();
	public boolean checkUsed(int k);
	public void insertTag(String s);
}