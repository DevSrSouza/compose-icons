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

public val LineAwesomeIcons.Bell: ImageVector
    get() {
        if (_bell != null) {
            return _bell!!
        }
        _bell = Builder(name = "Bell", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(14.895f, 3.0f, 14.0f, 3.895f, 14.0f, 5.0f)
                curveTo(14.0f, 5.086f, 14.02f, 5.168f, 14.031f, 5.25f)
                curveTo(10.574f, 6.133f, 8.0f, 9.273f, 8.0f, 13.0f)
                lineTo(8.0f, 22.0f)
                curveTo(8.0f, 22.566f, 7.566f, 23.0f, 7.0f, 23.0f)
                lineTo(6.0f, 23.0f)
                lineTo(6.0f, 25.0f)
                lineTo(13.188f, 25.0f)
                curveTo(13.074f, 25.316f, 13.0f, 25.648f, 13.0f, 26.0f)
                curveTo(13.0f, 27.645f, 14.355f, 29.0f, 16.0f, 29.0f)
                curveTo(17.645f, 29.0f, 19.0f, 27.645f, 19.0f, 26.0f)
                curveTo(19.0f, 25.648f, 18.926f, 25.316f, 18.813f, 25.0f)
                lineTo(26.0f, 25.0f)
                lineTo(26.0f, 23.0f)
                lineTo(25.0f, 23.0f)
                curveTo(24.434f, 23.0f, 24.0f, 22.566f, 24.0f, 22.0f)
                lineTo(24.0f, 13.281f)
                curveTo(24.0f, 9.523f, 21.488f, 6.172f, 17.969f, 5.25f)
                curveTo(17.98f, 5.168f, 18.0f, 5.086f, 18.0f, 5.0f)
                curveTo(18.0f, 3.895f, 17.105f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(15.563f, 7.0f)
                curveTo(15.707f, 6.988f, 15.852f, 7.0f, 16.0f, 7.0f)
                curveTo(16.063f, 7.0f, 16.125f, 7.0f, 16.188f, 7.0f)
                curveTo(19.453f, 7.098f, 22.0f, 9.961f, 22.0f, 13.281f)
                lineTo(22.0f, 22.0f)
                curveTo(22.0f, 22.352f, 22.074f, 22.684f, 22.188f, 23.0f)
                lineTo(9.813f, 23.0f)
                curveTo(9.926f, 22.684f, 10.0f, 22.352f, 10.0f, 22.0f)
                lineTo(10.0f, 13.0f)
                curveTo(10.0f, 9.824f, 12.445f, 7.227f, 15.563f, 7.0f)
                close()
                moveTo(16.0f, 25.0f)
                curveTo(16.563f, 25.0f, 17.0f, 25.438f, 17.0f, 26.0f)
                curveTo(17.0f, 26.563f, 16.563f, 27.0f, 16.0f, 27.0f)
                curveTo(15.438f, 27.0f, 15.0f, 26.563f, 15.0f, 26.0f)
                curveTo(15.0f, 25.438f, 15.438f, 25.0f, 16.0f, 25.0f)
                close()
            }
        }
        .build()
        return _bell!!
    }

private var _bell: ImageVector? = null
