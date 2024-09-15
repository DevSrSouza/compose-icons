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
                curveTo(11.316f, 10.0f, 10.645f, 10.055f, 10.0f, 10.188f)
                lineTo(10.0f, 12.25f)
                curveTo(10.641f, 12.082f, 11.309f, 12.0f, 12.0f, 12.0f)
                curveTo(16.41f, 12.0f, 20.0f, 15.59f, 20.0f, 20.0f)
                curveTo(20.0f, 20.691f, 19.914f, 21.359f, 19.75f, 22.0f)
                lineTo(21.813f, 22.0f)
                curveTo(21.945f, 21.355f, 22.0f, 20.684f, 22.0f, 20.0f)
                curveTo(22.0f, 14.484f, 17.516f, 10.0f, 12.0f, 10.0f)
                close()
                moveTo(12.0f, 14.0f)
                curveTo(11.297f, 14.0f, 10.629f, 14.121f, 10.0f, 14.344f)
                lineTo(10.0f, 16.563f)
                curveTo(10.59f, 16.219f, 11.27f, 16.0f, 12.0f, 16.0f)
                curveTo(14.207f, 16.0f, 16.0f, 17.793f, 16.0f, 20.0f)
                curveTo(16.0f, 20.73f, 15.781f, 21.41f, 15.438f, 22.0f)
                lineTo(17.656f, 22.0f)
                curveTo(17.879f, 21.371f, 18.0f, 20.703f, 18.0f, 20.0f)
                curveTo(18.0f, 16.691f, 15.309f, 14.0f, 12.0f, 14.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveTo(10.895f, 18.0f, 10.0f, 18.895f, 10.0f, 20.0f)
                curveTo(10.0f, 21.105f, 10.895f, 22.0f, 12.0f, 22.0f)
                curveTo(13.105f, 22.0f, 14.0f, 21.105f, 14.0f, 20.0f)
                curveTo(14.0f, 18.895f, 13.105f, 18.0f, 12.0f, 18.0f)
                close()
            }
        }
        .build()
        return _rssSquareSolid!!
    }

private var _rssSquareSolid: ImageVector? = null
