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

public val LineAwesomeIcons.BullseyeSolid: ImageVector
    get() {
        if (_bullseyeSolid != null) {
            return _bullseyeSolid!!
        }
        _bullseyeSolid = Builder(name = "BullseyeSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.8281f, 3.0f, 3.0f, 8.8281f, 3.0f, 16.0f)
                curveTo(3.0f, 23.1719f, 8.8281f, 29.0f, 16.0f, 29.0f)
                curveTo(23.1719f, 29.0f, 29.0f, 23.1719f, 29.0f, 16.0f)
                curveTo(29.0f, 8.8281f, 23.1719f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 4.0f)
                curveTo(22.6328f, 4.0f, 28.0f, 9.3672f, 28.0f, 16.0f)
                curveTo(28.0f, 22.6328f, 22.6328f, 28.0f, 16.0f, 28.0f)
                curveTo(9.3672f, 28.0f, 4.0f, 22.6328f, 4.0f, 16.0f)
                curveTo(4.0f, 9.3672f, 9.3672f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(10.4883f, 6.0f, 6.0f, 10.4883f, 6.0f, 16.0f)
                curveTo(6.0f, 21.5117f, 10.4883f, 26.0f, 16.0f, 26.0f)
                curveTo(21.5117f, 26.0f, 26.0f, 21.5117f, 26.0f, 16.0f)
                curveTo(26.0f, 10.4883f, 21.5117f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(16.0f, 8.0f)
                curveTo(20.4297f, 8.0f, 24.0f, 11.5703f, 24.0f, 16.0f)
                curveTo(24.0f, 20.4297f, 20.4297f, 24.0f, 16.0f, 24.0f)
                curveTo(11.5703f, 24.0f, 8.0f, 20.4297f, 8.0f, 16.0f)
                curveTo(8.0f, 11.5703f, 11.5703f, 8.0f, 16.0f, 8.0f)
                close()
                moveTo(16.0f, 10.0f)
                curveTo(12.6992f, 10.0f, 10.0f, 12.6992f, 10.0f, 16.0f)
                curveTo(10.0f, 19.3008f, 12.6992f, 22.0f, 16.0f, 22.0f)
                curveTo(19.3008f, 22.0f, 22.0f, 19.3008f, 22.0f, 16.0f)
                curveTo(22.0f, 12.6992f, 19.3008f, 10.0f, 16.0f, 10.0f)
                close()
                moveTo(16.0f, 12.0f)
                curveTo(18.2227f, 12.0f, 20.0f, 13.7773f, 20.0f, 16.0f)
                curveTo(20.0f, 18.2227f, 18.2227f, 20.0f, 16.0f, 20.0f)
                curveTo(13.7773f, 20.0f, 12.0f, 18.2227f, 12.0f, 16.0f)
                curveTo(12.0f, 13.7773f, 13.7773f, 12.0f, 16.0f, 12.0f)
                close()
                moveTo(16.0f, 14.0f)
                curveTo(14.8945f, 14.0f, 14.0f, 14.8945f, 14.0f, 16.0f)
                curveTo(14.0f, 17.1055f, 14.8945f, 18.0f, 16.0f, 18.0f)
                curveTo(17.1055f, 18.0f, 18.0f, 17.1055f, 18.0f, 16.0f)
                curveTo(18.0f, 14.8945f, 17.1055f, 14.0f, 16.0f, 14.0f)
                close()
            }
        }
        .build()
        return _bullseyeSolid!!
    }

private var _bullseyeSolid: ImageVector? = null
