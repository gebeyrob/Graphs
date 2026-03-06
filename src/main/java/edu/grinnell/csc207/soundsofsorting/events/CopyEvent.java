package edu.grinnell.csc207.soundsofsorting.events;

import java.util.List;

/**
 * A <code>CopyEvent</code> logs a copy of a value into an index of the array.
 * 
 * @param <T> the carrier type of the array
 */
public class CopyEvent<T> implements SortEvent<T> {

    private int idx;
    private T value;

    /**
     * Creates a new CopyEvent for the given index and value.
     *
     * @param idx   the index to copy into
     * @param value the value to copy into the index
     */
    public CopyEvent(int idx, T value) {
        this.idx = idx;
        this.value = value;
    }

    /**
     * Applies this event to the array by copying the value into the array.
     * 
     * @param arr the array to modify
     */
    public void apply(T[] arr) {
        arr[idx] = value;
    };

    /**
     * @return a list of the indices (index) affected by this event
     */
    public List<Integer> getAffectedIndices() {
        return List.of(idx);
    }

    /**
     * @return true because this event is emphasized
     */
    public boolean isEmphasized() {
        return true;
    }

}
