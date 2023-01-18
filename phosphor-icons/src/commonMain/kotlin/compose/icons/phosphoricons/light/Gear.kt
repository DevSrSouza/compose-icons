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

public val LightGroup.Gear: ImageVector
    get() {
        if (_gear != null) {
            return _gear!!
        }
        _gear = Builder(name = "Gear", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 74.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, true, false, 54.0f, 54.0f)
                arcTo(54.0f, 54.0f, 0.0f, false, false, 128.0f, 74.0f)
                close()
                moveTo(128.0f, 170.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, true, true, 42.0f, -42.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, true, 128.0f, 170.0f)
                close()
                moveTo(233.2f, 151.6f)
                lineTo(217.9f, 131.2f)
                curveToRelative(0.1f, -2.2f, 0.0f, -4.7f, 0.0f, -6.4f)
                lineToRelative(15.3f, -20.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.0f, -5.2f)
                arcToRelative(109.1f, 109.1f, 0.0f, false, false, -10.8f, -25.9f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, -4.3f, -3.0f)
                lineToRelative(-25.2f, -3.6f)
                curveToRelative(-1.5f, -1.6f, -3.0f, -3.1f, -4.6f, -4.6f)
                lineToRelative(-3.6f, -25.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.9f, -4.3f)
                arcToRelative(113.4f, 113.4f, 0.0f, false, false, -26.0f, -10.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.2f, 1.0f)
                lineTo(131.3f, 38.1f)
                quadToRelative(-3.3f, -0.1f, -6.6f, 0.0f)
                lineTo(104.4f, 22.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.2f, -1.0f)
                arcTo(109.1f, 109.1f, 0.0f, false, false, 73.3f, 32.6f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, -3.0f, 4.3f)
                lineTo(66.7f, 62.1f)
                curveToRelative(-1.6f, 1.5f, -3.1f, 3.0f, -4.6f, 4.6f)
                lineTo(36.9f, 70.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.3f, 2.9f)
                arcToRelative(113.4f, 113.4f, 0.0f, false, false, -10.8f, 26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.0f, 5.2f)
                lineToRelative(15.3f, 20.4f)
                curveToRelative(-0.1f, 2.2f, 0.0f, 4.7f, 0.0f, 6.4f)
                lineTo(22.8f, 151.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -1.0f, 5.2f)
                arcToRelative(109.1f, 109.1f, 0.0f, false, false, 10.8f, 25.9f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 4.3f, 3.0f)
                lineToRelative(25.2f, 3.6f)
                lineToRelative(4.6f, 4.6f)
                lineToRelative(3.6f, 25.2f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 3.0f, 4.3f)
                arcToRelative(110.9f, 110.9f, 0.0f, false, false, 25.9f, 10.8f)
                lineToRelative(1.6f, 0.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.6f, -1.2f)
                lineToRelative(20.3f, -15.3f)
                horizontalLineToRelative(6.6f)
                lineToRelative(20.3f, 15.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.2f, 1.0f)
                arcToRelative(111.6f, 111.6f, 0.0f, false, false, 26.0f, -10.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.9f, -4.3f)
                lineToRelative(3.6f, -25.2f)
                curveToRelative(1.6f, -1.5f, 3.3f, -3.3f, 4.5f, -4.6f)
                lineToRelative(25.3f, -3.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.3f, -2.9f)
                arcToRelative(113.4f, 113.4f, 0.0f, false, false, 10.8f, -26.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 233.2f, 151.6f)
                close()
                moveTo(214.4f, 174.2f)
                lineTo(190.1f, 177.7f)
                arcToRelative(6.9f, 6.9f, 0.0f, false, false, -3.6f, 1.8f)
                curveToRelative(-1.2f, 1.4f, -4.9f, 5.2f, -6.8f, 6.9f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, -2.0f, 3.7f)
                lineToRelative(-3.5f, 24.3f)
                arcToRelative(92.8f, 92.8f, 0.0f, false, true, -17.8f, 7.4f)
                lineTo(136.7f, 207.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.9f, -1.1f)
                horizontalLineToRelative(-9.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.9f, 1.1f)
                lineTo(99.6f, 221.8f)
                arcToRelative(86.8f, 86.8f, 0.0f, false, true, -17.8f, -7.4f)
                lineToRelative(-3.5f, -24.3f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, -2.0f, -3.7f)
                arcToRelative(70.6f, 70.6f, 0.0f, false, true, -6.7f, -6.7f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, -3.7f, -2.0f)
                lineToRelative(-24.3f, -3.5f)
                arcToRelative(92.8f, 92.8f, 0.0f, false, true, -7.4f, -17.8f)
                lineTo(49.0f, 136.7f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, false, 1.2f, -3.8f)
                curveToRelative(-0.1f, -1.8f, -0.2f, -7.1f, -0.1f, -9.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -1.1f, -3.9f)
                lineTo(34.2f, 99.6f)
                arcToRelative(86.8f, 86.8f, 0.0f, false, true, 7.4f, -17.8f)
                lineToRelative(24.3f, -3.5f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, 3.7f, -2.0f)
                arcToRelative(70.6f, 70.6f, 0.0f, false, true, 6.7f, -6.7f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, 2.0f, -3.7f)
                lineToRelative(3.5f, -24.3f)
                arcToRelative(92.8f, 92.8f, 0.0f, false, true, 17.8f, -7.4f)
                lineTo(119.3f, 49.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.9f, 1.1f)
                quadToRelative(4.8f, -0.1f, 9.6f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.9f, -1.1f)
                lineToRelative(19.7f, -14.8f)
                arcToRelative(86.8f, 86.8f, 0.0f, false, true, 17.8f, 7.4f)
                lineToRelative(3.5f, 24.3f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, 2.0f, 3.7f)
                arcToRelative(70.6f, 70.6f, 0.0f, false, true, 6.7f, 6.7f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, 3.7f, 2.0f)
                lineToRelative(24.3f, 3.5f)
                arcToRelative(92.8f, 92.8f, 0.0f, false, true, 7.4f, 17.8f)
                lineTo(207.0f, 119.3f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, false, -1.2f, 3.8f)
                curveToRelative(0.1f, 1.8f, 0.2f, 7.1f, 0.1f, 9.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.1f, 3.9f)
                lineToRelative(14.8f, 19.7f)
                arcTo(86.8f, 86.8f, 0.0f, false, true, 214.4f, 174.2f)
                close()
            }
        }
        .build()
        return _gear!!
    }

private var _gear: ImageVector? = null
