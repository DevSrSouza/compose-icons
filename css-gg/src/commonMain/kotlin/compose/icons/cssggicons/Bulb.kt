package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Bulb: ImageVector
    get() {
        if (_bulb != null) {
            return _bulb!!
        }
        _bulb = Builder(name = "Bulb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 9.0f)
                curveTo(4.0f, 11.961f, 5.609f, 14.547f, 8.0f, 15.93f)
                verticalLineTo(16.0f)
                curveTo(8.0f, 18.209f, 9.791f, 20.0f, 12.0f, 20.0f)
                curveTo(14.209f, 20.0f, 16.0f, 18.209f, 16.0f, 16.0f)
                verticalLineTo(15.93f)
                curveTo(18.391f, 14.547f, 20.0f, 11.961f, 20.0f, 9.0f)
                curveTo(20.0f, 4.582f, 16.418f, 1.0f, 12.0f, 1.0f)
                curveTo(7.582f, 1.0f, 4.0f, 4.582f, 4.0f, 9.0f)
                close()
                moveTo(16.0f, 13.472f)
                curveTo(17.228f, 12.374f, 18.0f, 10.777f, 18.0f, 9.0f)
                curveTo(18.0f, 5.686f, 15.314f, 3.0f, 12.0f, 3.0f)
                curveTo(8.686f, 3.0f, 6.0f, 5.686f, 6.0f, 9.0f)
                curveTo(6.0f, 10.777f, 6.773f, 12.374f, 8.0f, 13.472f)
                lineTo(10.0f, 13.471f)
                verticalLineTo(16.0f)
                curveTo(10.0f, 17.104f, 10.895f, 18.0f, 12.0f, 18.0f)
                curveTo(13.104f, 18.0f, 14.0f, 17.104f, 14.0f, 16.0f)
                verticalLineTo(13.471f)
                lineTo(16.0f, 13.472f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 21.006f)
                verticalLineTo(21.0f)
                curveTo(10.588f, 21.34f, 11.271f, 21.535f, 12.0f, 21.535f)
                curveTo(12.729f, 21.535f, 13.412f, 21.34f, 14.0f, 21.0f)
                verticalLineTo(21.006f)
                curveTo(14.0f, 22.111f, 13.105f, 23.006f, 12.0f, 23.006f)
                curveTo(10.895f, 23.006f, 10.0f, 22.111f, 10.0f, 21.006f)
                close()
            }
        }
        .build()
        return _bulb!!
    }

private var _bulb: ImageVector? = null
