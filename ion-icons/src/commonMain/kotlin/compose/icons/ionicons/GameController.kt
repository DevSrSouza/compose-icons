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

public val IonIcons.GameController: ImageVector
    get() {
        if (_gameController != null) {
            return _gameController!!
        }
        _gameController = Builder(name = "GameController", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(483.13f, 245.38f)
                curveTo(461.92f, 149.49f, 430.0f, 98.31f, 382.65f, 84.33f)
                arcTo(107.13f, 107.13f, 0.0f, false, false, 352.0f, 80.0f)
                curveToRelative(-13.71f, 0.0f, -25.65f, 3.34f, -38.28f, 6.88f)
                curveTo(298.5f, 91.15f, 281.21f, 96.0f, 256.0f, 96.0f)
                reflectiveCurveToRelative(-42.51f, -4.84f, -57.76f, -9.11f)
                curveTo(185.6f, 83.34f, 173.67f, 80.0f, 160.0f, 80.0f)
                arcToRelative(115.74f, 115.74f, 0.0f, false, false, -31.73f, 4.32f)
                curveToRelative(-47.1f, 13.92f, -79.0f, 65.08f, -100.52f, 161.0f)
                curveTo(4.61f, 348.54f, 16.0f, 413.71f, 59.69f, 428.83f)
                arcToRelative(56.62f, 56.62f, 0.0f, false, false, 18.64f, 3.22f)
                curveToRelative(29.93f, 0.0f, 53.93f, -24.93f, 70.33f, -45.34f)
                curveToRelative(18.53f, -23.1f, 40.22f, -34.82f, 107.34f, -34.82f)
                curveToRelative(59.95f, 0.0f, 84.76f, 8.13f, 106.19f, 34.82f)
                curveToRelative(13.47f, 16.78f, 26.2f, 28.52f, 38.9f, 35.91f)
                curveToRelative(16.89f, 9.82f, 33.77f, 12.0f, 50.16f, 6.37f)
                curveToRelative(25.82f, -8.81f, 40.62f, -32.1f, 44.0f, -69.24f)
                curveTo(497.82f, 331.27f, 493.86f, 293.86f, 483.13f, 245.38f)
                close()
                moveTo(208.0f, 240.0f)
                lineTo(176.0f, 240.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -32.0f, 0.0f)
                lineTo(144.0f, 240.0f)
                lineTo(112.0f, 240.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -32.0f)
                horizontalLineToRelative(32.0f)
                lineTo(144.0f, 176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, 32.0f)
                close()
                moveTo(292.0f, 244.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 292.0f, 244.0f)
                close()
                moveTo(336.0f, 288.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -19.95f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 336.0f, 288.0f)
                close()
                moveTo(336.0f, 200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 336.0f, 200.0f)
                close()
                moveTo(380.0f, 244.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 380.0f, 244.0f)
                close()
            }
        }
        .build()
        return _gameController!!
    }

private var _gameController: ImageVector? = null
