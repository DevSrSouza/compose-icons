package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.PinDistanceFill: ImageVector
    get() {
        if (_pinDistanceFill != null) {
            return _pinDistanceFill!!
        }
        _pinDistanceFill = Builder(name = "PinDistanceFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.39f, 10.39f)
                lineTo(7.5f, 14.277f)
                lineTo(3.61f, 10.39f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 7.78f, 0.0f)
                close()
                moveTo(7.5f, 8.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                close()
                moveTo(20.39f, 19.39f)
                lineToRelative(-3.89f, 3.888f)
                lineToRelative(-3.89f, -3.889f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 7.78f, 0.0f)
                close()
                moveTo(16.5f, 17.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                close()
            }
        }
        .build()
        return _pinDistanceFill!!
    }

private var _pinDistanceFill: ImageVector? = null
