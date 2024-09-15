package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val CssGgIcons.ComedyCentral: ImageVector
    get() {
        if (_comedyCentral != null) {
            return _comedyCentral!!
        }
        _comedyCentral = Builder(name = "ComedyCentral", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.545f, 19.0f)
                curveTo(14.41f, 19.0f, 17.545f, 15.866f, 17.545f, 12.0f)
                curveTo(17.545f, 8.134f, 14.41f, 5.0f, 10.545f, 5.0f)
                curveTo(8.611f, 5.0f, 6.861f, 5.784f, 5.595f, 7.05f)
                lineTo(3.473f, 4.929f)
                lineTo(3.455f, 4.947f)
                curveTo(5.266f, 3.127f, 7.774f, 2.0f, 10.545f, 2.0f)
                curveTo(16.067f, 2.0f, 20.545f, 6.477f, 20.545f, 12.0f)
                curveTo(20.545f, 17.523f, 16.067f, 22.0f, 10.545f, 22.0f)
                curveTo(7.783f, 22.0f, 5.283f, 20.881f, 3.473f, 19.071f)
                lineTo(5.595f, 16.95f)
                curveTo(6.861f, 18.216f, 8.611f, 19.0f, 10.545f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.545f, 14.0f)
                curveTo(11.138f, 14.0f, 11.67f, 13.742f, 12.037f, 13.332f)
                lineTo(14.159f, 15.454f)
                curveTo(13.249f, 16.407f, 11.966f, 17.0f, 10.545f, 17.0f)
                curveTo(7.783f, 17.0f, 5.544f, 14.761f, 5.544f, 12.0f)
                curveTo(5.544f, 9.239f, 7.783f, 7.0f, 10.545f, 7.0f)
                curveTo(11.966f, 7.0f, 13.249f, 7.593f, 14.159f, 8.546f)
                lineTo(12.037f, 10.668f)
                curveTo(11.67f, 10.258f, 11.138f, 10.0f, 10.545f, 10.0f)
                curveTo(9.44f, 10.0f, 8.544f, 10.895f, 8.544f, 12.0f)
                curveTo(8.544f, 13.105f, 9.44f, 14.0f, 10.545f, 14.0f)
                close()
            }
        }
        .build()
        return _comedyCentral!!
    }

private var _comedyCentral: ImageVector? = null
