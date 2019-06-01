package ssm.service;

import java.util.List;

import ssm.po.ItemsCustom;
import ssm.po.ItemsQueryVo;

public interface ItemsService {
	
	public ItemsCustom findItemsById(Integer id);
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;
	public void updateItems(Integer id, ItemsCustom itemsCustom) throws Exception;
}
