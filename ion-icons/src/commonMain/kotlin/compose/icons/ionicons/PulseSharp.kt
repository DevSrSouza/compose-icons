package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.PulseSharp: ImageVector
    get() {
        if (_pulseSharp != null) {
            return _pulseSharp!!
        }
        _pulseSharp = Builder(name = "PulseSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(426.0f, 266.0f)
                arcToRelative(54.07f, 54.07f, 0.0f, false, false, -49.3f, 32.0f)
                horizontalLineTo(351.86f)
                lineToRelative(-27.0f, -81.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -42.0f, 0.92f)
                lineTo(245.66f, 348.12f)
                lineToRelative(-48.0f, -281.74f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -43.0f, -1.72f)
                lineTo(94.82f, 298.0f)
                horizontalLineTo(32.0f)
                verticalLineToRelative(44.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 21.34f, -16.66f)
                lineTo(171.69f, 172.0f)
                lineTo(218.3f, 445.62f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 238.76f, 464.0f)
                curveToRelative(0.42f, 0.0f, 0.82f, 0.0f, 1.24f, 0.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 21.15f, -16.0f)
                lineToRelative(44.47f, -149.62f)
                lineTo(315.13f, 327.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 336.0f, 342.0f)
                horizontalLineToRelative(40.7f)
                arcTo(54.0f, 54.0f, 0.0f, true, false, 426.0f, 266.0f)
                close()
            }
        }
        .build()
        return _pulseSharp!!
    }

private var _pulseSharp: ImageVector? = null
