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

public val CssGgIcons.PentagonTopRight: ImageVector
    get() {
        if (_pentagonTopRight != null) {
            return _pentagonTopRight!!
        }
        _pentagonTopRight = Builder(name = "PentagonTopRight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.33f, 15.16f)
                lineTo(5.0f, 14.392f)
                lineTo(10.0f, 5.732f)
                lineTo(15.33f, 6.5f)
                lineTo(18.66f, 10.732f)
                lineTo(13.66f, 19.392f)
                lineTo(10.33f, 15.16f)
                close()
                moveTo(13.405f, 15.834f)
                lineTo(11.407f, 13.295f)
                lineTo(8.209f, 12.834f)
                lineTo(11.055f, 7.905f)
                lineTo(14.253f, 8.365f)
                lineTo(16.251f, 10.905f)
                lineTo(13.405f, 15.834f)
                close()
            }
        }
        .build()
        return _pentagonTopRight!!
    }

private var _pentagonTopRight: ImageVector? = null
