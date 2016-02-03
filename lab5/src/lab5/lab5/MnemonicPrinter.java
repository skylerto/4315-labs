package lab5;

import gov.nasa.jpf.ListenerAdapter;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.VM;
import gov.nasa.jpf.vm.VMListener;

public class MnemonicPrinter extends ListenerAdapter implements VMListener {
	public void instructionExecuted(VM vm, ThreadInfo currentThread, Instruction nextInstruction,
			Instruction executedInstruction) {
		if (executedInstruction.toString().contains(" ")) {
			System.out.println(executedInstruction.toString().substring(0, executedInstruction.toString().indexOf(" ")));
		} else {
			System.out.println(executedInstruction.toString());
		}

	}
}
