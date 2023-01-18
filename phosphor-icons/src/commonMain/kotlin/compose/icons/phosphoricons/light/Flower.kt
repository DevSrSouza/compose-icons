package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Flower: ImageVector
    get() {
        if (_flower != null) {
            return _flower!!
        }
        _flower = Builder(name = "Flower", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(207.4f, 134.6f)
                quadToRelative(-6.7f, -3.9f, -18.0f, -6.6f)
                quadToRelative(11.3f, -2.7f, 18.0f, -6.6f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, false, -34.0f, -58.8f)
                curveToRelative(-4.5f, 2.5f, -9.4f, 6.6f, -14.7f, 12.2f)
                curveToRelative(2.2f, -7.4f, 3.3f, -13.7f, 3.3f, -18.8f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, -68.0f, 0.0f)
                curveToRelative(0.0f, 5.1f, 1.1f, 11.4f, 3.3f, 18.8f)
                curveTo(92.0f, 69.2f, 87.1f, 65.1f, 82.6f, 62.6f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, false, -34.0f, 58.8f)
                quadToRelative(6.8f, 3.9f, 18.0f, 6.6f)
                quadToRelative(-11.2f, 2.7f, -18.0f, 6.6f)
                arcTo(34.0f, 34.0f, 0.0f, false, false, 65.7f, 198.0f)
                arcToRelative(33.3f, 33.3f, 0.0f, false, false, 16.9f, -4.6f)
                curveToRelative(4.5f, -2.5f, 9.4f, -6.6f, 14.7f, -12.2f)
                curveTo(95.1f, 188.6f, 94.0f, 194.9f, 94.0f, 200.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, 68.0f, 0.0f)
                curveToRelative(0.0f, -5.1f, -1.1f, -11.4f, -3.3f, -18.8f)
                curveToRelative(5.3f, 5.6f, 10.2f, 9.7f, 14.7f, 12.2f)
                arcToRelative(33.3f, 33.3f, 0.0f, false, false, 16.9f, 4.6f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, 17.1f, -63.4f)
                close()
                moveTo(106.0f, 128.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, 22.0f, 22.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, true, 106.0f, 128.0f)
                close()
                moveTo(179.4f, 72.9f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, 22.0f, 38.2f)
                curveToRelative(-7.4f, 4.2f, -21.3f, 7.4f, -40.3f, 9.2f)
                arcToRelative(33.6f, 33.6f, 0.0f, false, false, -9.9f, -17.1f)
                curveTo(162.3f, 87.6f, 172.0f, 77.2f, 179.4f, 72.9f)
                close()
                moveTo(128.0f, 34.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, true, 22.0f, 22.0f)
                curveToRelative(0.0f, 8.5f, -4.2f, 22.1f, -12.1f, 39.5f)
                arcToRelative(33.4f, 33.4f, 0.0f, false, false, -19.8f, 0.0f)
                curveTo(110.2f, 78.1f, 106.0f, 64.5f, 106.0f, 56.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, true, 128.0f, 34.0f)
                close()
                moveTo(46.6f, 81.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, true, 30.0f, -8.1f)
                curveToRelative(7.4f, 4.3f, 17.1f, 14.7f, 28.2f, 30.3f)
                arcToRelative(33.6f, 33.6f, 0.0f, false, false, -9.9f, 17.1f)
                curveToRelative(-19.0f, -1.8f, -32.9f, -5.0f, -40.3f, -9.2f)
                arcTo(22.0f, 22.0f, 0.0f, false, true, 46.6f, 81.0f)
                close()
                moveTo(76.6f, 183.1f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, -22.0f, -38.2f)
                curveToRelative(7.4f, -4.2f, 21.3f, -7.4f, 40.3f, -9.2f)
                arcToRelative(33.6f, 33.6f, 0.0f, false, false, 9.9f, 17.1f)
                curveTo(93.7f, 168.4f, 84.0f, 178.8f, 76.6f, 183.1f)
                close()
                moveTo(128.0f, 222.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, true, -22.0f, -22.0f)
                curveToRelative(0.0f, -8.5f, 4.2f, -22.1f, 12.1f, -39.5f)
                arcToRelative(33.4f, 33.4f, 0.0f, false, false, 19.8f, 0.0f)
                curveToRelative(7.9f, 17.4f, 12.1f, 31.0f, 12.1f, 39.5f)
                arcTo(22.1f, 22.1f, 0.0f, false, true, 128.0f, 222.0f)
                close()
                moveTo(209.4f, 175.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, true, -30.0f, 8.1f)
                curveToRelative(-7.4f, -4.3f, -17.1f, -14.7f, -28.2f, -30.3f)
                arcToRelative(33.6f, 33.6f, 0.0f, false, false, 9.9f, -17.1f)
                curveToRelative(19.0f, 1.8f, 32.9f, 5.0f, 40.3f, 9.2f)
                arcTo(22.0f, 22.0f, 0.0f, false, true, 209.4f, 175.0f)
                close()
            }
        }
        .build()
        return _flower!!
    }

private var _flower: ImageVector? = null
