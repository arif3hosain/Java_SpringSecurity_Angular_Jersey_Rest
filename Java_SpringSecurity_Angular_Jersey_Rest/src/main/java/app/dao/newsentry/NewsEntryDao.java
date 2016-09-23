package app.dao.newsentry;

import app.dao.Dao;
import app.entity.NewsEntry;


/**
 * Definition of a Data Access Object that can perform CRUD Operations for {@link NewsEntry}s.
 * 
 * @author Philip W. Sorst <philip@sorst.net>
 */
public interface NewsEntryDao extends Dao<NewsEntry, Long>
{

}