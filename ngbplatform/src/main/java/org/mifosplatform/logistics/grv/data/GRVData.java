package org.mifosplatform.logistics.grv.data;

import java.util.Collection;
import java.util.List;

import org.joda.time.LocalDate;
import org.mifosplatform.logistics.item.data.ItemData;
import org.mifosplatform.logistics.mrn.data.MRNDetailsData;
import org.mifosplatform.organisation.office.data.OfficeData;

public class GRVData {

	private String id;
	private LocalDate requestedDate;
	private String fromOffice;
	private String toOffice;
	private Long orderdQuantity;
	private Long receivedQuantity;
	private String status;
	private Long officeId;
	private Long parentId;
	private String officeName;
	private Collection<OfficeData> officeData;
	private Collection<ItemData> itemMasterData;
	private Long itemId;
	private String itemCode;
	private String itemDescription;
	private List<GRVData> grvIds;
	private List<GRVData> itemsaleIds;
	private Long grvId;
	private List<String> serialNumber;
	private List<String> cartoonNumber;
	private Long fromOfficeNum;
	private Long toOfficeNum;
	/*private String notes;*/
	
	
	
	public GRVData() {
	}


	public GRVData(final String id, final LocalDate requestedDate, final String fromOffice, final String toOffice, final Long orderdQuantity, 
			        final Long receivedQuantity, final String status, final String itemDescription/*, final String notes*/){
		this.id = id;
		this.requestedDate = requestedDate;
		this.fromOffice = fromOffice;
		this.toOffice = toOffice;
		this.orderdQuantity = orderdQuantity;
		this.receivedQuantity = receivedQuantity;
		this.status = status;
		this.itemDescription = itemDescription;
		/*this.notes = notes;*/
	}

	
	public GRVData(Collection<OfficeData> officeData, Collection<ItemData> itemMasterData) {
		this.officeData = officeData;
		this.itemMasterData = itemMasterData;
	}
	
	public GRVData(List<GRVData> grvIds,List<GRVData> itemsaleIds) {
	this.grvIds = grvIds;
	this.itemsaleIds=itemsaleIds;
	}
	
	public GRVData(Long grvId,String itemDescription, Long itemId,String itemsaleId/*,final String notes*/) {
		
		this.id=itemsaleId;
		this.grvId = grvId;
		this.itemDescription = itemDescription;
		this.itemId = itemId;
		/*this.notes =notes;*/
	}

	public GRVData(List<String> serialNumber) {
		this.serialNumber = serialNumber;
	}
	

	public GRVData(List<String> cartoonNumber, Object object) {
		this.cartoonNumber = cartoonNumber;
	}
	
	/*public MRNDetailsData(List<String> cartoonNumber) {
		this.cartoonNumber = cartoonNumber;
	}*/
	

	public GRVData(Long agentId) {
		
			this.officeId=agentId;
	}

	public LocalDate getRequestedDate() {
		return requestedDate;
	}

	public void setRequestedDate(LocalDate requestedDate) {
		this.requestedDate = requestedDate;
	}

	public String getFromOffice() {
		return fromOffice;
	}

	public void setFromOffice(String fromOffice) {
		this.fromOffice = fromOffice;
	}

	public String getToOffice() {
		return toOffice;
	}

	public void setToOffice(String toOffice) {
		this.toOffice = toOffice;
	}

	public Long getOrderdQuantity() {
		return orderdQuantity;
	}

	public void setOrderdQuantity(Long orderdQuantity) {
		this.orderdQuantity = orderdQuantity;
	}

	public Long getReceivedQuantity() {
		return receivedQuantity;
	}

	public void setReceivedQuantity(Long receivedQuantity) {
		this.receivedQuantity = receivedQuantity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getOfficeId() {
		return officeId;
	}

	public void setOfficeId(Long officeId) {
		this.officeId = officeId;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public Collection<OfficeData> getOfficeData() {
		return officeData;
	}

	public void setOfficeData(Collection<OfficeData> officeData) {
		this.officeData = officeData;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public Collection<ItemData> getItemMasterData() {
		return itemMasterData;
	}
	
	
	public void setItemMasterData(Collection<ItemData> itemMasterData) {
		this.itemMasterData = itemMasterData;
	}


	public List<GRVData> getgrvIds() {
		return grvIds;
	}

	public void setGrvIds(List<GRVData> grvIds) {
		this.grvIds = grvIds;
	}

	public Long getGrvId() {
		return grvId;
	}

	public void setGrvId(Long grvId) {
		this.grvId = grvId;
	}

	public List<String> getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(List<String> serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Long getFromOfficeNum() {
		return fromOfficeNum;
	}

	public void setFromOfficeNum(Long fromOfficeNum) {
		this.fromOfficeNum = fromOfficeNum;
	}

	public Long getToOfficeNum() {
		return toOfficeNum;
	}

	public void setToOfficeNum(Long toOfficeNum) {
		this.toOfficeNum = toOfficeNum;
	} 
	
	public List<String> getCartoonNumber() {
		return cartoonNumber;
	}

	public void setCartoonNumber(List<String> cartoonNumber) {
		this.cartoonNumber = cartoonNumber;
	}
	
	


}
