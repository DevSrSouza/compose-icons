package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.SortAlphaUpSolid: ImageVector
    get() {
        if (_sortAlphaUpSolid != null) {
            return _sortAlphaUpSolid!!
        }
        _sortAlphaUpSolid = Builder(name = "SortAlphaUpSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.1895f, 5.0f)
                lineTo(7.9707f, 5.6602f)
                lineTo(6.0293f, 11.0f)
                lineTo(6.0f, 11.0f)
                lineTo(6.0f, 11.0605f)
                lineTo(5.0605f, 13.6602f)
                lineTo(5.0f, 13.8105f)
                lineTo(5.0f, 15.0f)
                lineTo(7.0f, 15.0f)
                lineTo(7.0f, 14.1602f)
                lineTo(7.4102f, 13.0f)
                lineTo(10.5898f, 13.0f)
                lineTo(11.0f, 14.1602f)
                lineTo(11.0f, 15.0f)
                lineTo(13.0f, 15.0f)
                lineTo(13.0f, 13.8105f)
                lineTo(12.9395f, 13.6602f)
                lineTo(12.0f, 11.0605f)
                lineTo(12.0f, 11.0f)
                lineTo(11.9707f, 11.0f)
                lineTo(10.0293f, 5.6602f)
                lineTo(9.8105f, 5.0f)
                lineTo(8.1895f, 5.0f)
                close()
                moveTo(23.0f, 5.5f)
                lineTo(22.2793f, 6.1895f)
                lineTo(18.0f, 10.5f)
                lineTo(19.4102f, 11.9102f)
                lineTo(22.0f, 9.3105f)
                lineTo(22.0f, 28.0f)
                lineTo(24.0f, 28.0f)
                lineTo(24.0f, 9.3105f)
                lineTo(26.5898f, 11.9102f)
                lineTo(28.0f, 10.5f)
                lineTo(23.7207f, 6.1895f)
                lineTo(23.0f, 5.5f)
                close()
                moveTo(9.0f, 8.6602f)
                lineTo(9.8398f, 11.0f)
                lineTo(8.1602f, 11.0f)
                lineTo(9.0f, 8.6602f)
                close()
                moveTo(5.0f, 17.0f)
                lineTo(5.0f, 19.0f)
                lineTo(10.5605f, 19.0f)
                lineTo(5.2793f, 24.2793f)
                lineTo(5.0f, 24.5898f)
                lineTo(5.0f, 27.0f)
                lineTo(13.0f, 27.0f)
                lineTo(13.0f, 25.0f)
                lineTo(7.4395f, 25.0f)
                lineTo(12.7207f, 19.7207f)
                lineTo(13.0f, 19.4102f)
                lineTo(13.0f, 17.0f)
                lineTo(5.0f, 17.0f)
                close()
            }
        }
        .build()
        return _sortAlphaUpSolid!!
    }

private var _sortAlphaUpSolid: ImageVector? = null
