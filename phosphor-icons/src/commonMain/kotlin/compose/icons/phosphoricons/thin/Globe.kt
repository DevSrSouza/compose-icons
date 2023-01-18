package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.Globe: ImageVector
    get() {
        if (_globe != null) {
            return _globe!!
        }
        _globe = Builder(name = "Globe", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.4f, 161.1f)
                arcTo(100.4f, 100.4f, 0.0f, false, false, 228.0f, 128.0f)
                arcToRelative(99.0f, 99.0f, 0.0f, false, false, -5.7f, -33.2f)
                verticalLineToRelative(-0.4f)
                arcToRelative(100.0f, 100.0f, 0.0f, false, false, -188.4f, 0.0f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, -0.1f, 0.5f)
                arcToRelative(99.2f, 99.2f, 0.0f, false, false, 0.0f, 66.3f)
                curveToRelative(0.0f, 0.2f, 0.1f, 0.3f, 0.1f, 0.4f)
                arcToRelative(100.0f, 100.0f, 0.0f, false, false, 188.4f, 0.1f)
                arcTo(1.4f, 1.4f, 0.0f, false, true, 222.4f, 161.1f)
                close()
                moveTo(128.0f, 216.0f)
                curveToRelative(-14.4f, -13.5f, -25.1f, -31.7f, -30.9f, -52.0f)
                horizontalLineToRelative(61.8f)
                curveTo(153.1f, 184.3f, 142.4f, 202.5f, 128.0f, 216.0f)
                close()
                moveTo(95.0f, 156.0f)
                arcToRelative(132.2f, 132.2f, 0.0f, false, true, 0.0f, -56.0f)
                horizontalLineToRelative(66.0f)
                arcToRelative(132.2f, 132.2f, 0.0f, false, true, 0.0f, 56.0f)
                close()
                moveTo(36.0f, 128.0f)
                arcToRelative(89.2f, 89.2f, 0.0f, false, true, 4.4f, -28.0f)
                lineTo(86.8f, 100.0f)
                arcToRelative(141.4f, 141.4f, 0.0f, false, false, 0.0f, 56.0f)
                lineTo(40.4f, 156.0f)
                arcTo(89.2f, 89.2f, 0.0f, false, true, 36.0f, 128.0f)
                close()
                moveTo(128.0f, 40.0f)
                curveToRelative(14.4f, 13.5f, 25.1f, 31.7f, 30.9f, 52.0f)
                lineTo(97.1f, 92.0f)
                curveTo(102.9f, 71.7f, 113.6f, 53.5f, 128.0f, 40.0f)
                close()
                moveTo(169.2f, 100.0f)
                horizontalLineToRelative(46.4f)
                arcToRelative(91.3f, 91.3f, 0.0f, false, true, 0.0f, 56.0f)
                lineTo(169.2f, 156.0f)
                arcToRelative(141.4f, 141.4f, 0.0f, false, false, 0.0f, -56.0f)
                close()
                moveTo(212.7f, 92.0f)
                lineTo(167.4f, 92.0f)
                arcToRelative(123.1f, 123.1f, 0.0f, false, false, -31.6f, -55.7f)
                arcTo(92.3f, 92.3f, 0.0f, false, true, 212.7f, 92.0f)
                close()
                moveTo(120.3f, 36.3f)
                arcTo(122.4f, 122.4f, 0.0f, false, false, 88.6f, 92.0f)
                lineTo(43.3f, 92.0f)
                arcTo(92.3f, 92.3f, 0.0f, false, true, 120.3f, 36.3f)
                close()
                moveTo(43.3f, 164.0f)
                lineTo(88.6f, 164.0f)
                curveToRelative(5.7f, 21.5f, 16.6f, 40.8f, 31.7f, 55.7f)
                arcTo(92.3f, 92.3f, 0.0f, false, true, 43.3f, 164.0f)
                close()
                moveTo(135.8f, 219.7f)
                curveToRelative(15.0f, -14.9f, 25.9f, -34.2f, 31.6f, -55.7f)
                horizontalLineToRelative(45.3f)
                arcTo(92.3f, 92.3f, 0.0f, false, true, 135.8f, 219.7f)
                close()
            }
        }
        .build()
        return _globe!!
    }

private var _globe: ImageVector? = null
