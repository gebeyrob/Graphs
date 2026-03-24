package edu.grinnell.csc207.soundsofsorting.events;

import java.util.List;

/**
 * A <code>CompareEvent</code> logs a comparison a sort makes between two
 * indices in the array.
 *
 * @param <T> the carrier type of the array
 */
public class CompareEvent<T> implements SortEvent<T> {
   
    private int idxOne;
    private int idxTwo;

    /**
     * Creates a new CompareEvent for the given indices.
     *
     * @param idxOne the first index being compared
     * @param idxTwo the second index being compared
     */
    public CompareEvent(int idxOne, int idxTwo) {
        this.idxOne = idxOne;
        this.idxTwo = idxTwo;
    }

     /**
     * Applies this event to the array.
     * @param arr the array to modify
     */
    public void apply(T[] arr){}

    /**
     * @return a list of the indices affected by this event
     */
    public List<Integer> getAffectedIndices() {
        return List.of(idxOne, idxTwo);
    }

    /**
     * @return false because this event is not emphasized
     */
    public boolean isEmphasized() {
        return false;
    }

}
