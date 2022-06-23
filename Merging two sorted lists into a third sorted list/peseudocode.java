/*Merging two sorted lists into a third sorted list - iteration strategy*/
function mer(sea, fresh)
result <- new.list

	while(sea.empty = false & fresh.empty = false){
		if(sea.top_item > fresh.top_item)
			sea.top_item -> new.list ;
		else 
			fresh.top_item -> new.list ;
	}

	return new.list;