/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jun 11, 2023, 2:53:37 AM                    ---
 * ----------------------------------------------------------------
 */
package org.customextension.jalo;

import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.customextension.constants.CustomextensionConstants;
import org.customextension.jalo.Item1;

/**
 * Generated class for type Item2.
 */
@SLDSafe
@SuppressWarnings({"unused","cast"})
public class Item2 extends GenericItem
{
	/** Qualifier of the <code>Item2.quantity</code> attribute **/
	public static final String QUANTITY = "quantity";
	/** Qualifier of the <code>Item2.item1</code> attribute **/
	public static final String ITEM1 = "item1";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ITEM1's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<Item2> ITEM1HANDLER = new BidirectionalOneToManyHandler<Item2>(
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
		tmp.put(QUANTITY, AttributeMode.INITIAL);
		tmp.put(ITEM1, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ITEM1HANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Item2.item1</code> attribute.
	 * @return the item1
	 */
	public Item1 getItem1(final SessionContext ctx)
	{
		return (Item1)getProperty( ctx, "item1".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Item2.item1</code> attribute.
	 * @return the item1
	 */
	public Item1 getItem1()
	{
		return getItem1( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Item2.item1</code> attribute. 
	 * @param value the item1
	 */
	public void setItem1(final SessionContext ctx, final Item1 value)
	{
		ITEM1HANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Item2.item1</code> attribute. 
	 * @param value the item1
	 */
	public void setItem1(final Item1 value)
	{
		setItem1( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Item2.quantity</code> attribute.
	 * @return the quantity
	 */
	public Long getQuantity(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, "quantity".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Item2.quantity</code> attribute.
	 * @return the quantity
	 */
	public Long getQuantity()
	{
		return getQuantity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Item2.quantity</code> attribute. 
	 * @return the quantity
	 */
	public long getQuantityAsPrimitive(final SessionContext ctx)
	{
		Long value = getQuantity( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Item2.quantity</code> attribute. 
	 * @return the quantity
	 */
	public long getQuantityAsPrimitive()
	{
		return getQuantityAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Item2.quantity</code> attribute. 
	 * @param value the quantity
	 */
	public void setQuantity(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, "quantity".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Item2.quantity</code> attribute. 
	 * @param value the quantity
	 */
	public void setQuantity(final Long value)
	{
		setQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Item2.quantity</code> attribute. 
	 * @param value the quantity
	 */
	public void setQuantity(final SessionContext ctx, final long value)
	{
		setQuantity( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Item2.quantity</code> attribute. 
	 * @param value the quantity
	 */
	public void setQuantity(final long value)
	{
		setQuantity( getSession().getSessionContext(), value );
	}
	
}
