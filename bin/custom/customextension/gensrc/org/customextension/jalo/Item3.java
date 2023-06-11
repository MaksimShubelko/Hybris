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
import de.hybris.platform.jalo.type.TypeManager;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.customextension.constants.CustomextensionConstants;
import org.customextension.jalo.AllTypesContainer;
import org.customextension.jalo.Item4;

/**
 * Generated class for type Item3.
 */
@SLDSafe
@SuppressWarnings({"unused","cast"})
public class Item3 extends GenericItem
{
	/** Qualifier of the <code>Item3.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Item3.allTypesContainer</code> attribute **/
	public static final String ALLTYPESCONTAINER = "allTypesContainer";
	/** Qualifier of the <code>Item3.items4</code> attribute **/
	public static final String ITEMS4 = "items4";
	/** Relation ordering override parameter constants for Many2many from ((customextension))*/
	protected static String MANY2MANY_SRC_ORDERED = "relation.Many2many.source.ordered";
	protected static String MANY2MANY_TGT_ORDERED = "relation.Many2many.target.ordered";
	/** Relation disable markmodifed parameter constants for Many2many from ((customextension))*/
	protected static String MANY2MANY_MARKMODIFIED = "relation.Many2many.markmodified";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ALLTYPESCONTAINER's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<Item3> ALLTYPESCONTAINERHANDLER = new BidirectionalOneToManyHandler<Item3>(
	CustomextensionConstants.TC.ITEM3,
	false,
	"allTypesContainer",
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
		tmp.put(ALLTYPESCONTAINER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Item3.allTypesContainer</code> attribute.
	 * @return the allTypesContainer
	 */
	public AllTypesContainer getAllTypesContainer(final SessionContext ctx)
	{
		return (AllTypesContainer)getProperty( ctx, "allTypesContainer".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Item3.allTypesContainer</code> attribute.
	 * @return the allTypesContainer
	 */
	public AllTypesContainer getAllTypesContainer()
	{
		return getAllTypesContainer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Item3.allTypesContainer</code> attribute. 
	 * @param value the allTypesContainer
	 */
	public void setAllTypesContainer(final SessionContext ctx, final AllTypesContainer value)
	{
		ALLTYPESCONTAINERHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Item3.allTypesContainer</code> attribute. 
	 * @param value the allTypesContainer
	 */
	public void setAllTypesContainer(final AllTypesContainer value)
	{
		setAllTypesContainer( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ALLTYPESCONTAINERHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * @deprecated since 2011, use {@link Utilities#getMarkModifiedOverride(de.hybris.platform.jalo.type.RelationType)
	 */
	@Override
	@Deprecated(since = "2105", forRemoval = true)
	public boolean isMarkModifiedDisabled(final Item referencedItem)
	{
		ComposedType relationSecondEnd0 = TypeManager.getInstance().getComposedType("Item4");
		if(relationSecondEnd0.isAssignableFrom(referencedItem.getComposedType()))
		{
			return Utilities.getMarkModifiedOverride(MANY2MANY_MARKMODIFIED);
		}
		return true;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Item3.items4</code> attribute.
	 * @return the items4
	 */
	public Collection<Item4> getItems4(final SessionContext ctx)
	{
		final List<Item4> items = getLinkedItems( 
			ctx,
			true,
			CustomextensionConstants.Relations.MANY2MANY,
			"Item4",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Item3.items4</code> attribute.
	 * @return the items4
	 */
	public Collection<Item4> getItems4()
	{
		return getItems4( getSession().getSessionContext() );
	}
	
	public long getItems4Count(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			CustomextensionConstants.Relations.MANY2MANY,
			"Item4",
			null
		);
	}
	
	public long getItems4Count()
	{
		return getItems4Count( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Item3.items4</code> attribute. 
	 * @param value the items4
	 */
	public void setItems4(final SessionContext ctx, final Collection<Item4> value)
	{
		setLinkedItems( 
			ctx,
			true,
			CustomextensionConstants.Relations.MANY2MANY,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(MANY2MANY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Item3.items4</code> attribute. 
	 * @param value the items4
	 */
	public void setItems4(final Collection<Item4> value)
	{
		setItems4( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to items4. 
	 * @param value the item to add to items4
	 */
	public void addToItems4(final SessionContext ctx, final Item4 value)
	{
		addLinkedItems( 
			ctx,
			true,
			CustomextensionConstants.Relations.MANY2MANY,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(MANY2MANY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to items4. 
	 * @param value the item to add to items4
	 */
	public void addToItems4(final Item4 value)
	{
		addToItems4( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from items4. 
	 * @param value the item to remove from items4
	 */
	public void removeFromItems4(final SessionContext ctx, final Item4 value)
	{
		removeLinkedItems( 
			ctx,
			true,
			CustomextensionConstants.Relations.MANY2MANY,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(MANY2MANY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from items4. 
	 * @param value the item to remove from items4
	 */
	public void removeFromItems4(final Item4 value)
	{
		removeFromItems4( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Item3.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "name".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Item3.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Item3.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "name".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Item3.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
}
