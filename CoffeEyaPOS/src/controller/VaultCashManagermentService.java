package controller;

import java.util.ArrayList;

import model.Member;
import model.VaultCash;
import model.VaultCashDAO;

public class VaultCashManagermentService {
	
	private VaultCashDAO dao = new VaultCashDAO();
	
	public boolean vaultCashJoin(VaultCash v) {
		int rows = dao.insert(v);
		if (rows == 0)
			return false;
		else
			return true;
	}
	
	public int vaultCashLookup() {
		return dao.vaultCashSum();
	}
	
	public int[] vaultCashLookup2() {
		return dao.vaultCashData();
	}

}
