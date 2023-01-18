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

public val IonIcons.HeartHalfSharp: ImageVector
    get() {
        if (_heartHalfSharp != null) {
            return _heartHalfSharp!!
        }
        _heartHalfSharp = Builder(name = "HeartHalfSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.92f, 64.0f)
                curveToRelative(-48.11f, 0.0f, -80.1f, 28.0f, -96.92f, 48.21f)
                curveTo(239.18f, 92.0f, 207.19f, 64.0f, 159.08f, 64.0f)
                curveTo(98.46f, 64.0f, 48.63f, 114.54f, 48.0f, 176.65f)
                curveToRelative(-0.56f, 55.68f, 19.71f, 107.0f, 62.0f, 157.0f)
                curveToRelative(40.12f, 47.46f, 94.25f, 79.75f, 137.0f, 108.32f)
                lineToRelative(9.0f, 6.0f)
                lineToRelative(9.0f, -6.0f)
                curveToRelative(42.78f, -28.57f, 96.91f, -60.86f, 137.0f, -108.32f)
                curveToRelative(42.25f, -50.0f, 62.52f, -101.35f, 62.0f, -157.0f)
                curveTo(463.37f, 114.54f, 413.54f, 64.0f, 352.92f, 64.0f)
                close()
                moveTo(377.59f, 313.0f)
                curveToRelative(-31.78f, 37.6f, -74.68f, 65.75f, -112.52f, 90.59f)
                lineToRelative(-9.07f, 6.0f)
                lineTo(256.0f, 162.23f)
                lineToRelative(24.59f, -29.54f)
                curveTo(294.53f, 116.0f, 318.38f, 96.0f, 352.92f, 96.0f)
                curveToRelative(43.15f, 0.0f, 78.62f, 36.32f, 79.07f, 81.0f)
                arcToRelative(178.63f, 178.63f, 0.0f, false, true, -12.69f, 68.59f)
                curveTo(410.27f, 268.43f, 396.63f, 290.5f, 377.59f, 313.0f)
                close()
            }
        }
        .build()
        return _heartHalfSharp!!
    }

private var _heartHalfSharp: ImageVector? = null
