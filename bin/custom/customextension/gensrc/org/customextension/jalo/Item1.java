/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jun 11, 2023, 1:32:29 PM                    ---
 * ----------------------------------------------------------------
 */
package org.customextension.jalo;

import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.customextension.constants.CustomextensionConstants;
import org.customextension.jalo.Item2;
import org.customextension.jalo.Item4;

/**
 * Generated class for type Item1.
 */
@SLDSafe
@SuppressWarnings({"unused","cast"})
public class Item1 extends GenericItem
{
	/** Qualifier of the <code>Item1.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Item1.item4</code> attribute **/
	public static final String ITEM4 = "item4";
	/** Qualifier of the <code>Item1.item2</code> attribute **/
	public static final String ITEM2 = "item2";
	/**
	* {@link OneToManyHandler} for handling 1:n ITEM2's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Item2> ITEM2HANDLER = new OneToManyHandler<Item2>(
	CustomextensionConstants.TC.ITEM2,
	false,
	"item1",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(ITEM4, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Item1.item2</code> attribute.
	 * @return the item2
	 */
	public Collection<Item2> getItem2(final SessionContext ctx)
	{
		return ITEM2HANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Item1.item2</code> attribute.
	 * @return the item2
	 */
	public Collection<Item2> getItem2()
	{
		return getItem2( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Item1.item2</code> attribute. 
	 * @param value the item2
	 */
	public void setItem2(final SessionContext ctx, final Collection<Item2> value)
	{
		ITEM2HANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Item1.item2</code> attribute. 
	 * @param value the item2
	 */
	public void setItem2(final Collection<Item2> value)
	{
		setItem2( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to item2. 
	 * @param value the item to add to item2
	 */
	public void addToItem2(final SessionContext ctx, final Item2 value)
	{
		ITEM2HANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to item2. 
	 * @param value the item to add to item2
	 */
	public void addToItem2(final Item2 value)
	{
		addToItem2( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from item2. 
	 * @param value the item to remove from item2
	 */
	public void removeFromItem2(final SessionContext ctx, final Item2 value)
	{
		ITEM2HANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from item2. 
	 * @param value the item to remove from item2
	 */
	public void removeFromItem2(final Item2 value)
	{
		removeFromItem2( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Item1.item4</code> attribute.
	 * @return the item4
	 */
	public Item4 getItem4(final SessionContext ctx)
	{
		return (Item4)getProperty( ctx, "item4".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Item1.item4</code> attribute.
	 * @return the item4
	 */
	public Item4 getItem4()
	{
		return getItem4( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Item1.item4</code> attribute. 
	 * @param value the item4
	 */
	public void setItem4(final SessionContext ctx, final Item4 value)
	{
		setProperty(ctx, "item4".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Item1.item4</code> attribute. 
	 * @param value the item4
	 */
	public void setItem4(final Item4 value)
	{
		setItem4( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Item1.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "name".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Item1.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Item1.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "name".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Item1.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
}
