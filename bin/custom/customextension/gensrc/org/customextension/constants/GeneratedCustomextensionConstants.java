/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jun 23, 2023, 11:47:59 PM                   ---
 * ----------------------------------------------------------------
 */
package org.customextension.constants;

/**
 * @deprecated since ages - use constants in Model classes instead
 */
@Deprecated(since = "ages", forRemoval = false)
@SuppressWarnings({"unused","cast"})
public class GeneratedCustomextensionConstants
{
	public static final String EXTENSIONNAME = "customextension";
	public static class TC
	{
		public static final String ALLTYPESCONTAINER = "AllTypesContainer".intern();
		public static final String BAND = "Band".intern();
		public static final String CONCERT = "Concert".intern();
		public static final String CONCERTTYPE = "ConcertType".intern();
		public static final String CONTACTREQUEST = "ContactRequest".intern();
		public static final String CUSTOMORDER = "CustomOrder".intern();
		public static final String DYNAMICENUM = "DynamicEnum".intern();
		public static final String ITEM1 = "Item1".intern();
		public static final String ITEM2 = "Item2".intern();
		public static final String ITEM3 = "Item3".intern();
		public static final String ITEM4 = "Item4".intern();
		public static final String MUSICTYPE = "MusicType".intern();
		public static final String NEWS = "News".intern();
		public static final String NONDYNAMICENUM = "NonDynamicEnum".intern();
		public static final String NOTLOREMIPSUMCONSTRAINT = "NotLoremIpsumConstraint".intern();
		public static final String TOKENKEEPER = "TokenKeeper".intern();
	}
	public static class Attributes
	{
		public static class MusicType
		{
			public static final String BANDS = "bands".intern();
		}
		public static class Product
		{
			public static final String BAND = "band".intern();
			public static final String HASHTAG = "hashtag".intern();
		}
	}
	public static class Enumerations
	{
		public static class ConcertType
		{
			public static final String OPENAIR = "openair".intern();
			public static final String INDOOR = "indoor".intern();
		}
		public static class DynamicEnum
		{
			public static final String VALUE = "value".intern();
		}
		public static class MusicType
		{
			// no values defined
		}
		public static class NonDynamicEnum
		{
			public static final String VALUE = "value".intern();
		}
	}
	public static class Relations
	{
		public static final String BAND2MUSICTYPE = "Band2MusicType".intern();
		public static final String ITEMALLTYPESCONTAINERRELATION = "ItemAllTypesContainerRelation".intern();
		public static final String MANY2MANY = "Many2many".intern();
		public static final String ONE2MANY = "One2many".intern();
		public static final String PRODUCT2ROCKBAND = "Product2RockBand".intern();
	}
	
	protected GeneratedCustomextensionConstants()
	{
		// private constructor
	}
	
	
}
