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

public val IonIcons.ShieldCheckmark: ImageVector
    get() {
        if (_shieldCheckmark != null) {
            return _shieldCheckmark!!
        }
        _shieldCheckmark = Builder(name = "ShieldCheckmark", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(479.07f, 111.36f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -13.15f, -14.74f)
                curveToRelative(-86.5f, -15.52f, -122.61f, -26.74f, -203.33f, -63.2f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -13.18f, 0.0f)
                curveTo(168.69f, 69.88f, 132.58f, 81.1f, 46.08f, 96.62f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -13.15f, 14.74f)
                curveToRelative(-3.85f, 61.11f, 4.36f, 118.05f, 24.43f, 169.24f)
                arcTo(349.47f, 349.47f, 0.0f, false, false, 129.0f, 393.11f)
                curveToRelative(53.47f, 56.73f, 110.24f, 81.37f, 121.07f, 85.73f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 12.0f, 0.0f)
                curveToRelative(10.83f, -4.36f, 67.6f, -29.0f, 121.07f, -85.73f)
                arcTo(349.47f, 349.47f, 0.0f, false, false, 454.64f, 280.6f)
                curveTo(474.71f, 229.41f, 482.92f, 172.47f, 479.07f, 111.36f)
                close()
                moveTo(348.07f, 186.47f)
                lineTo(237.27f, 314.47f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 225.86f, 320.0f)
                horizontalLineToRelative(-0.66f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -11.2f, -4.57f)
                lineToRelative(-49.2f, -48.2f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 22.4f, -22.86f)
                lineToRelative(37.0f, 36.29f)
                lineTo(323.9f, 165.53f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 24.2f, 20.94f)
                close()
            }
        }
        .build()
        return _shieldCheckmark!!
    }

private var _shieldCheckmark: ImageVector? = null
