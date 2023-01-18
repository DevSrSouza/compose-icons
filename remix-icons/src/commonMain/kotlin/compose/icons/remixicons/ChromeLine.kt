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

public val RemixIcons.ChromeLine: ImageVector
    get() {
        if (_chromeLine != null) {
            return _chromeLine!!
        }
        _chromeLine = Builder(name = "ChromeLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.365f, 19.833f)
                lineToRelative(1.93f, -3.342f)
                arcToRelative(4.499f, 4.499f, 0.0f, false, true, -4.234f, -2.315f)
                lineTo(4.794f, 8.52f)
                arcToRelative(8.003f, 8.003f, 0.0f, false, false, 5.57f, 11.313f)
                close()
                moveTo(12.59f, 19.979f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 19.602f, 9.5f)
                horizontalLineToRelative(-3.86f)
                arcTo(4.48f, 4.48f, 0.0f, false, true, 16.5f, 12.0f)
                arcToRelative(4.48f, 4.48f, 0.0f, false, true, -0.642f, 2.318f)
                lineToRelative(-3.268f, 5.66f)
                close()
                moveTo(14.143f, 13.288f)
                lineToRelative(0.022f, -0.038f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -4.354f, -0.042f)
                lineToRelative(0.024f, 0.042f)
                arcToRelative(2.499f, 2.499f, 0.0f, false, false, 4.308f, 0.038f)
                close()
                moveTo(6.035f, 6.668f)
                lineToRelative(1.929f, 3.34f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 12.0f, 7.5f)
                horizontalLineToRelative(6.615f)
                arcTo(7.992f, 7.992f, 0.0f, false, false, 12.0f, 4.0f)
                arcToRelative(7.98f, 7.98f, 0.0f, false, false, -5.965f, 2.669f)
                close()
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                close()
            }
        }
        .build()
        return _chromeLine!!
    }

private var _chromeLine: ImageVector? = null
