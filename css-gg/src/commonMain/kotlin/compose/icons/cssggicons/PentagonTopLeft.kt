package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.PentagonTopLeft: ImageVector
    get() {
        if (_pentagonTopLeft != null) {
            return _pentagonTopLeft!!
        }
        _pentagonTopLeft = Builder(name = "PentagonTopLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.33f, 15.16f)
                lineTo(11.0f, 19.392f)
                lineTo(6.0f, 10.732f)
                lineTo(9.33f, 6.5f)
                lineTo(14.66f, 5.732f)
                lineTo(19.66f, 14.392f)
                lineTo(14.33f, 15.16f)
                close()
                moveTo(16.451f, 12.834f)
                lineTo(13.253f, 13.295f)
                lineTo(11.255f, 15.834f)
                lineTo(8.409f, 10.905f)
                lineTo(10.407f, 8.365f)
                lineTo(13.605f, 7.905f)
                lineTo(16.451f, 12.834f)
                close()
            }
        }
        .build()
        return _pentagonTopLeft!!
    }

private var _pentagonTopLeft: ImageVector? = null
