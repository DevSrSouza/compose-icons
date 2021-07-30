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

public val LineAwesomeIcons.RssSquareSolid: ImageVector
    get() {
        if (_rssSquareSolid != null) {
            return _rssSquareSolid!!
        }
        _rssSquareSolid = Builder(name = "RssSquareSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                close()
                moveTo(12.0f, 10.0f)
                curveTo(11.3164f, 10.0f, 10.6445f, 10.0547f, 10.0f, 10.1875f)
                lineTo(10.0f, 12.25f)
                curveTo(10.6406f, 12.082f, 11.3086f, 12.0f, 12.0f, 12.0f)
                curveTo(16.4102f, 12.0f, 20.0f, 15.5898f, 20.0f, 20.0f)
                curveTo(20.0f, 20.6914f, 19.9141f, 21.3594f, 19.75f, 22.0f)
                lineTo(21.8125f, 22.0f)
                curveTo(21.9453f, 21.3555f, 22.0f, 20.6836f, 22.0f, 20.0f)
                curveTo(22.0f, 14.4844f, 17.5156f, 10.0f, 12.0f, 10.0f)
                close()
                moveTo(12.0f, 14.0f)
                curveTo(11.2969f, 14.0f, 10.6289f, 14.1211f, 10.0f, 14.3438f)
                lineTo(10.0f, 16.5625f)
                curveTo(10.5898f, 16.2188f, 11.2695f, 16.0f, 12.0f, 16.0f)
                curveTo(14.207f, 16.0f, 16.0f, 17.793f, 16.0f, 20.0f)
                curveTo(16.0f, 20.7305f, 15.7813f, 21.4102f, 15.4375f, 22.0f)
                lineTo(17.6563f, 22.0f)
                curveTo(17.8789f, 21.3711f, 18.0f, 20.7031f, 18.0f, 20.0f)
                curveTo(18.0f, 16.6914f, 15.3086f, 14.0f, 12.0f, 14.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveTo(10.8945f, 18.0f, 10.0f, 18.8945f, 10.0f, 20.0f)
                curveTo(10.0f, 21.1055f, 10.8945f, 22.0f, 12.0f, 22.0f)
                curveTo(13.1055f, 22.0f, 14.0f, 21.1055f, 14.0f, 20.0f)
                curveTo(14.0f, 18.8945f, 13.1055f, 18.0f, 12.0f, 18.0f)
                close()
            }
        }
        .build()
        return _rssSquareSolid!!
    }

private var _rssSquareSolid: ImageVector? = null
