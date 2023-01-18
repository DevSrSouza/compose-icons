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

public val LightGroup.Rocket: ImageVector
    get() {
        if (_rocket != null) {
            return _rocket!!
        }
        _rocket = Builder(name = "Rocket", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(150.0f, 224.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(112.0f, 230.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(32.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 150.0f, 224.0f)
                close()
                moveTo(221.0f, 157.1f)
                lineTo(208.6f, 212.8f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, true, -9.0f, 10.1f)
                arcToRelative(12.6f, 12.6f, 0.0f, false, true, -4.7f, 0.8f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, true, -8.7f, -3.0f)
                lineTo(157.9f, 198.0f)
                lineTo(98.1f, 198.0f)
                lineTo(69.8f, 220.7f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, true, -8.7f, 3.0f)
                arcToRelative(12.6f, 12.6f, 0.0f, false, true, -4.7f, -0.8f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, true, -9.0f, -10.1f)
                lineTo(35.0f, 157.1f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, true, 2.9f, -12.0f)
                lineToRelative(30.0f, -36.0f)
                arcToRelative(121.3f, 121.3f, 0.0f, false, true, 8.0f, -35.8f)
                curveTo(87.5f, 43.5f, 108.0f, 24.1f, 119.2f, 15.1f)
                horizontalLineToRelative(0.0f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, true, 17.6f, 0.0f)
                curveToRelative(11.0f, 9.0f, 31.3f, 28.5f, 42.7f, 58.3f)
                arcToRelative(119.2f, 119.2f, 0.0f, false, true, 7.9f, 35.0f)
                lineToRelative(30.7f, 36.7f)
                arcTo(14.1f, 14.1f, 0.0f, false, true, 221.0f, 157.1f)
                close()
                moveTo(99.5f, 186.0f)
                horizontalLineToRelative(57.0f)
                curveToRelative(48.7f, -89.7f, -8.4f, -146.2f, -27.3f, -161.5f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, -2.5f, -0.1f)
                horizontalLineToRelative(0.0f)
                curveTo(107.6f, 39.8f, 49.7f, 96.3f, 99.5f, 186.0f)
                close()
                moveTo(88.3f, 190.5f)
                curveTo(76.6f, 169.0f, 69.8f, 148.0f, 68.1f, 127.6f)
                lineToRelative(-21.0f, 25.2f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, -0.4f, 1.7f)
                lineToRelative(12.4f, 55.7f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, 1.3f, 1.4f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, 1.9f, -0.3f)
                close()
                moveTo(208.9f, 152.8f)
                lineTo(187.4f, 127.1f)
                curveToRelative(-1.5f, 20.5f, -8.1f, 41.7f, -19.7f, 63.4f)
                lineToRelative(26.0f, 20.8f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, 1.9f, 0.3f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, 1.3f, -1.4f)
                lineToRelative(12.4f, -55.7f)
                arcTo(2.1f, 2.1f, 0.0f, false, false, 208.9f, 152.8f)
                close()
                moveTo(128.0f, 106.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 128.0f, 106.0f)
                close()
            }
        }
        .build()
        return _rocket!!
    }

private var _rocket: ImageVector? = null
