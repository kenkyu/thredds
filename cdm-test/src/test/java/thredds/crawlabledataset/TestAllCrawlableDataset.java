/*
 * Copyright 1998-2009 University Corporation for Atmospheric Research/Unidata
 *
 * Portions of this software were developed by the Unidata Program at the
 * University Corporation for Atmospheric Research.
 *
 * Access and use of this software shall impose the following obligations
 * and understandings on the user. The user is granted the right, without
 * any fee or cost, to use, copy, modify, alter, enhance and distribute
 * this software, and any derivative works thereof, and its supporting
 * documentation for any purpose whatsoever, provided that this entire
 * notice appears in all copies of the software, derivative works and
 * supporting documentation.  Further, UCAR requests that the user credit
 * UCAR/Unidata in any publications that result from the use of this
 * software or in any product that includes this software. The names UCAR
 * and/or Unidata, however, may not be used in any advertising or publicity
 * to endorse or promote any products or commercial entity unless specific
 * written permission is obtained from UCAR/Unidata. The user also
 * understands that UCAR/Unidata is not obligated to provide the user with
 * any support, consulting, training or assistance of any kind with regard
 * to the use, operation and performance of this software nor to provide
 * the user with any updates, revisions, new versions or "bug fixes."
 *
 * THIS SOFTWARE IS PROVIDED BY UCAR/UNIDATA "AS IS" AND ANY EXPRESS OR
 * IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL UCAR/UNIDATA BE LIABLE FOR ANY SPECIAL,
 * INDIRECT OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING
 * FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT,
 * NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION
 * WITH THE ACCESS, USE OR PERFORMANCE OF THIS SOFTWARE.
 */
// $Id: TestAllCrawlableDataset.java 61 2006-07-12 21:36:00Z edavis $
package thredds.crawlabledataset;

import junit.framework.*;

/**
 * A description
 *
 * @author edavis
 * @since Mar 30, 2005T4:26:37 PM
 */
public class TestAllCrawlableDataset extends TestCase
{


  public TestAllCrawlableDataset( String name )
  {
    super( name );
  }

  public static Test suite()
  {
    TestSuite suite = new TestSuite();
    suite.addTestSuite( thredds.crawlabledataset.TestCrawlableDatasetAlias.class );
    suite.addTestSuite( thredds.crawlabledataset.TestCrawlableDatasetFilter.class );
    suite.addTestSuite( thredds.crawlabledataset.filter.TestRegExpMatchOnNameFilter.class );
    suite.addTestSuite( thredds.crawlabledataset.filter.TestWildcardMatchOnNameFilter.class );
    suite.addTestSuite( thredds.crawlabledataset.filter.TestLogicalFilterComposer.class );

    return suite;
  }
}

/*
 * $Log: TestAllCrawlableDataset.java,v $
 * Revision 1.1  2005/11/15 18:40:51  edavis
 * More work on CrawlableDataset refactor of CatGen.
 *
 * Revision 1.2  2005/08/16 21:47:51  edavis
 * Switch from Log4j to commons logging.
 *
 * Revision 1.1  2005/03/30 23:56:07  edavis
 * Fix tests.
 *
 */