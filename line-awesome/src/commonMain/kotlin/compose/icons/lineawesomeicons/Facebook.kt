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

public val LineAwesomeIcons.Facebook: ImageVector
    get() {
        if (_facebook != null) {
            return _facebook!!
        }
        _facebook = Builder(name = "Facebook", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(9.384f, 4.0f, 4.0f, 9.384f, 4.0f, 16.0f)
                curveTo(4.0f, 22.616f, 9.384f, 28.0f, 16.0f, 28.0f)
                curveTo(22.616f, 28.0f, 28.0f, 22.616f, 28.0f, 16.0f)
                curveTo(28.0f, 9.384f, 22.616f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(21.535f, 6.0f, 26.0f, 10.465f, 26.0f, 16.0f)
                curveTo(26.0f, 21.027f, 22.312f, 25.161f, 17.488f, 25.879f)
                lineTo(17.488f, 18.916f)
                lineTo(20.336f, 18.916f)
                lineTo(20.783f, 16.023f)
                lineTo(17.488f, 16.023f)
                lineTo(17.488f, 14.443f)
                curveTo(17.488f, 13.242f, 17.883f, 12.176f, 19.006f, 12.176f)
                lineTo(20.811f, 12.176f)
                lineTo(20.811f, 9.652f)
                curveTo(20.494f, 9.609f, 19.823f, 9.516f, 18.555f, 9.516f)
                curveTo(15.907f, 9.516f, 14.355f, 10.914f, 14.355f, 14.1f)
                lineTo(14.355f, 16.023f)
                lineTo(11.633f, 16.023f)
                lineTo(11.633f, 18.916f)
                lineTo(14.355f, 18.916f)
                lineTo(14.355f, 25.854f)
                curveTo(9.609f, 25.071f, 6.0f, 20.973f, 6.0f, 16.0f)
                curveTo(6.0f, 10.465f, 10.465f, 6.0f, 16.0f, 6.0f)
                close()
            }
        }
        .build()
        return _facebook!!
    }

private var _facebook: ImageVector? = null
