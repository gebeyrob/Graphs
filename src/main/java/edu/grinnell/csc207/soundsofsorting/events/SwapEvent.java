package edu.grinnell.csc207.soundsofsorting.events;


import java.util.List;

/**
 * A <code>SwapEvent</code> logs a swap between two indices of the array.
 * 
 *  @param <T> the carrier type of the array
 */
public class SwapEvent<T> implements SortEvent<T> {
   
    private int idxOne;
    private int idxTwo;

    /**
     * Creates a new SwapEvent for the given indices.
     *
     * @param idxOne the first index being compared
     * @param idxTwo the second index being compared
     */
    public SwapEvent(int idxOne, int idxTwo)
    {
        this.idxOne = idxOne;
        this.idxTwo = idxTwo;
    }


    /**
     * Applies this event to the array by swapping the elements of the array.
     * @param arr the array to modify
     */
    public void apply(T[] arr)
    {
        T temp = arr[idxOne];
        arr[idxOne] = arr[idxTwo];
        arr[idxTwo] = temp;
    }

    /**
     * @return a list of the indices affected by this event
     */
    public List<Integer> getAffectedIndices() {
        return List.of(idxOne, idxTwo);
    }

    /**
     * @return true because this event is emphasized
     */
    public boolean isEmphasized() {
        return true;
    }
}
