package DShapeModel;


/*
 * Interface to listen for shape change notifications.
 * 
 */
public interface ModelListener {
	
	/**
	 * This shows that something changed. Not detailed what changed though;
	 * 
	 * @param model pointer to the model that changed
	 */
	public void modelChanged(DShapeModel model);
        
        public void addListener(DShapeModel model);
        
        public void removeListener(DShapeModel model);

}
