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

public val LineAwesomeIcons.Lightbulb: ImageVector
    get() {
        if (_lightbulb != null) {
            return _lightbulb!!
        }
        _lightbulb = Builder(name = "Lightbulb", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(11.043f, 4.0f, 7.0f, 8.043f, 7.0f, 13.0f)
                curveTo(7.0f, 14.918f, 7.844f, 16.906f, 9.0f, 18.688f)
                curveTo(9.859f, 20.012f, 10.887f, 21.23f, 12.0f, 22.156f)
                lineTo(12.0f, 25.0f)
                curveTo(12.0f, 26.094f, 12.906f, 27.0f, 14.0f, 27.0f)
                lineTo(15.0f, 28.0f)
                lineTo(17.0f, 28.0f)
                lineTo(18.0f, 27.0f)
                curveTo(19.094f, 27.0f, 20.0f, 26.094f, 20.0f, 25.0f)
                lineTo(20.0f, 22.156f)
                curveTo(21.113f, 21.23f, 22.141f, 20.012f, 23.0f, 18.688f)
                curveTo(24.156f, 16.906f, 25.0f, 14.918f, 25.0f, 13.0f)
                curveTo(25.0f, 8.043f, 20.957f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(19.879f, 6.0f, 23.0f, 9.121f, 23.0f, 13.0f)
                curveTo(23.0f, 14.309f, 22.355f, 16.035f, 21.344f, 17.594f)
                curveTo(20.441f, 18.984f, 19.254f, 20.223f, 18.156f, 21.0f)
                lineTo(13.844f, 21.0f)
                curveTo(12.746f, 20.223f, 11.559f, 18.984f, 10.656f, 17.594f)
                curveTo(9.645f, 16.035f, 9.0f, 14.309f, 9.0f, 13.0f)
                curveTo(9.0f, 9.121f, 12.121f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(14.25f, 23.0f)
                lineTo(17.75f, 23.0f)
                curveTo(17.828f, 23.055f, 17.91f, 23.094f, 18.0f, 23.125f)
                lineTo(18.0f, 25.0f)
                lineTo(14.0f, 25.0f)
                lineTo(14.0f, 23.125f)
                curveTo(14.09f, 23.094f, 14.172f, 23.055f, 14.25f, 23.0f)
                close()
            }
        }
        .build()
        return _lightbulb!!
    }

private var _lightbulb: ImageVector? = null
