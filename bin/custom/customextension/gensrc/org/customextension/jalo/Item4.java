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
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.customextension.constants.CustomextensionConstants;
import org.customextension.jalo.Item3;

/**
 * Generated class for type Item4.
 */
@SLDSafe
@SuppressWarnings({"unused","cast"})
public class Item4 extends GenericItem
{
	/** Qualifier of the <code>Item4.quantity</code> attribute **/
	public static final String QUANTITY = "quantity";
	/** Qualifier of the <code>Item4.items3</code> attribute **/
	public static final String ITEMS3 = "items3";
	/** Relation ordering override parameter constants for Many2many from ((customextension))*/
	protected static String MANY2MANY_SRC_ORDERED = "relation.Many2many.source.ordered";
	protected static String MANY2MANY_TGT_ORDERED = "relation.Many2many.target.ordered";
	/** Relation disable markmodifed parameter constants for Many2many from ((customextension))*/
	protected static String MANY2MANY_MARKMODIFIED = "relation.Many2many.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(QUANTITY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * @deprecated since 2011, use {@link Utilities#getMarkModifiedOverride(de.hybris.platform.jalo.type.RelationType)
	 */
	@Override
	@Deprecated(since = "2105", forRemoval = true)
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Item3");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(MANY2MANY_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Item4.items3</code> attribute.
	 * @return the items3
	 */
	public Collection<Item3> getItems3(final SessionContext ctx)
	{
		final List<Item3> items = getLinkedItems( 
			ctx,
			false,
			CustomextensionConstants.Relations.MANY2MANY,
			"Item3",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Item4.items3</code> attribute.
	 * @return the items3
	 */
	public Collection<Item3> getItems3()
	{
		return getItems3( getSession().getSessionContext() );
	}
	
	public long getItems3Count(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			CustomextensionConstants.Relations.MANY2MANY,
			"Item3",
			null
		);
	}
	
	public long getItems3Count()
	{
		return getItems3Count( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Item4.items3</code> attribute. 
	 * @param value the items3
	 */
	public void setItems3(final SessionContext ctx, final Collection<Item3> value)
	{
		setLinkedItems( 
			ctx,
			false,
			CustomextensionConstants.Relations.MANY2MANY,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(MANY2MANY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Item4.items3</code> attribute. 
	 * @param value the items3
	 */
	public void setItems3(final Collection<Item3> value)
	{
		setItems3( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to items3. 
	 * @param value the item to add to items3
	 */
	public void addToItems3(final SessionContext ctx, final Item3 value)
	{
		addLinkedItems( 
			ctx,
			false,
			CustomextensionConstants.Relations.MANY2MANY,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(MANY2MANY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to items3. 
	 * @param value the item to add to items3
	 */
	public void addToItems3(final Item3 value)
	{
		addToItems3( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from items3. 
	 * @param value the item to remove from items3
	 */
	public void removeFromItems3(final SessionContext ctx, final Item3 value)
	{
		removeLinkedItems( 
			ctx,
			false,
			CustomextensionConstants.Relations.MANY2MANY,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(MANY2MANY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from items3. 
	 * @param value the item to remove from items3
	 */
	public void removeFromItems3(final Item3 value)
	{
		removeFromItems3( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Item4.quantity</code> attribute.
	 * @return the quantity
	 */
	public Long getQuantity(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, "quantity".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Item4.quantity</code> attribute.
	 * @return the quantity
	 */
	public Long getQuantity()
	{
		return getQuantity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Item4.quantity</code> attribute. 
	 * @return the quantity
	 */
	public long getQuantityAsPrimitive(final SessionContext ctx)
	{
		Long value = getQuantity( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Item4.quantity</code> attribute. 
	 * @return the quantity
	 */
	public long getQuantityAsPrimitive()
	{
		return getQuantityAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Item4.quantity</code> attribute. 
	 * @param value the quantity
	 */
	public void setQuantity(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, "quantity".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Item4.quantity</code> attribute. 
	 * @param value the quantity
	 */
	public void setQuantity(final Long value)
	{
		setQuantity( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Item4.quantity</code> attribute. 
	 * @param value the quantity
	 */
	public void setQuantity(final SessionContext ctx, final long value)
	{
		setQuantity( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Item4.quantity</code> attribute. 
	 * @param value the quantity
	 */
	public void setQuantity(final long value)
	{
		setQuantity( getSession().getSessionContext(), value );
	}
	
}
