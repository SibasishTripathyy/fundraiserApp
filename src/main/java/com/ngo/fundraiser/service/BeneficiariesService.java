package com.ngo.fundraiser.service;

import com.ngo.fundraiser.dto.BeneficiariesDTO;

public interface BeneficiariesService {
	public BeneficiariesDTO createBeneficiary(BeneficiariesDTO dto);
	public BeneficiariesDTO updateBeneficiary(BeneficiariesDTO dto);
	public BeneficiariesDTO deleteBeneficiary(BeneficiariesDTO dto);
}
