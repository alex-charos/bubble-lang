package gr.charos.bubblelang.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import gr.charos.bubblelang.model.ExecutionResult;

public class ListHeap implements Heap {

	private List<ExecutionResult> heapList = null;

	public ListHeap() {
		heapList = new ArrayList<ExecutionResult>();

	}

	public ExecutionResult add(ExecutionResult er) {
		heapList.add(er);
		return er;
	}

	public ExecutionResult remove(ExecutionResult er) {
		heapList.remove(er);

		return er;
	}

	public ExecutionResult get(ExecutionResult er) {
		Optional<ExecutionResult> erz = null;
		erz = heapList.stream().filter(e -> e.equals(er)).distinct().findFirst();
		
		return erz.get();
	}

}
