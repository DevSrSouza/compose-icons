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

public val IonIcons.ShieldCheckmarkSharp: ImageVector
    get() {
        if (_shieldCheckmarkSharp != null) {
            return _shieldCheckmarkSharp!!
        }
        _shieldCheckmarkSharp = Builder(name = "ShieldCheckmarkSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(479.07f, 111.36f)
                lineToRelative(-0.79f, -12.53f)
                lineToRelative(-12.36f, -2.21f)
                curveToRelative(-86.5f, -15.52f, -122.61f, -26.74f, -203.33f, -63.2f)
                lineToRelative(-6.59f, -3.0f)
                lineToRelative(-6.59f, 3.0f)
                curveTo(168.69f, 69.88f, 132.58f, 81.1f, 46.08f, 96.62f)
                lineTo(33.72f, 98.83f)
                lineToRelative(-0.79f, 12.53f)
                curveToRelative(-3.85f, 61.11f, 4.36f, 118.05f, 24.43f, 169.24f)
                arcTo(349.47f, 349.47f, 0.0f, false, false, 129.0f, 393.11f)
                curveToRelative(53.47f, 56.73f, 110.24f, 81.37f, 121.07f, 85.73f)
                lineToRelative(6.0f, 2.41f)
                lineToRelative(6.0f, -2.41f)
                curveToRelative(10.83f, -4.36f, 67.6f, -29.0f, 121.07f, -85.73f)
                arcTo(349.47f, 349.47f, 0.0f, false, false, 454.64f, 280.6f)
                curveTo(474.71f, 229.41f, 482.92f, 172.47f, 479.07f, 111.36f)
                close()
                moveTo(226.16f, 327.36f)
                lineTo(153.37f, 256.0f)
                lineToRelative(22.4f, -22.86f)
                lineToRelative(48.47f, 47.49f)
                lineTo(334.37f, 153.43f)
                lineToRelative(24.2f, 20.94f)
                close()
            }
        }
        .build()
        return _shieldCheckmarkSharp!!
    }

private var _shieldCheckmarkSharp: ImageVector? = null
