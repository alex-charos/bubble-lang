package gr.charos.bubblelang.core;

import java.util.HashMap;
import java.util.Map;

import gr.charos.bubblelang.model.ExecutionResult;

public class MapHeap implements Heap {

	private Map<String, ExecutionResult> heapList = null;

	public MapHeap() {
		heapList = new HashMap<String, ExecutionResult>();

	}

	public ExecutionResult add(String name, ExecutionResult er) {
		heapList.put(name, er);
		return er;
	}

	public ExecutionResult remove(String name) {
		return heapList.remove(name);
	}

	public ExecutionResult get(String name) {
		
		return heapList.get(name);
	}

}
