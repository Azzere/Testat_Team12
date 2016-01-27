/**
 * 
 */
package de.hrw.swep.service.business;

/**
 * @author andriesc
 *
 */
public class FrageGeschlossen implements FrageStatus {

    private Frage frage;

    /**
     * 
     * @param frage
     *            Frage, zu der dies der neue Status ist
     */
    public FrageGeschlossen(Frage frage) {
        this.frage = frage;
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.hrw.swep.service.business.FrageStatus#abstimmen(int)
     */
    @Override
    public void abstimmen(int antwortNummer) {
        throw new IllegalStateException();

    }

    /*
     * (non-Javadoc)
     * 
     * @see de.hrw.swep.service.business.FrageStatus#oeffnen()
     */
    @Override
    public void oeffnen() {
        this.frage.oeffnen();
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.hrw.swep.service.business.FrageStatus#schliessen()
     */
    @Override
    public void schliessen() {
        this.frage.setCurrentState(new FrageGeschlossen(frage));

    }

    /*
     * (non-Javadoc)
     * 
     * @see de.hrw.swep.service.business.FrageStatus#getStatus()
     */
    @Override
    public String getStatus() {
        // TODO Auto-generated method stub
        return Frage.STATUS_GESCHLOSSEN;
    }

}
