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

public val ThinGroup.Butterfly: ImageVector
    get() {
        if (_butterfly != null) {
            return _butterfly!!
        }
        _butterfly = Builder(name = "Butterfly", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.3f, 52.8f)
                curveTo(223.7f, 47.0f, 216.9f, 44.0f, 208.0f, 44.0f)
                curveToRelative(-25.5f, 0.0f, -60.5f, 28.7f, -76.0f, 57.3f)
                lineTo(132.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(45.3f)
                curveTo(108.5f, 72.7f, 73.5f, 44.0f, 48.0f, 44.0f)
                curveToRelative(-8.9f, 0.0f, -15.7f, 3.0f, -20.3f, 8.8f)
                curveToRelative(-11.1f, 14.3f, -6.0f, 42.5f, 0.4f, 68.2f)
                curveToRelative(3.6f, 14.4f, 10.4f, 24.7f, 20.3f, 30.5f)
                arcToRelative(35.7f, 35.7f, 0.0f, false, false, 11.7f, 4.3f)
                arcTo(40.0f, 40.0f, 0.0f, true, false, 128.0f, 197.4f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 67.9f, -41.6f)
                arcToRelative(35.7f, 35.7f, 0.0f, false, false, 11.7f, -4.3f)
                curveToRelative(9.9f, -5.8f, 16.7f, -16.1f, 20.3f, -30.5f)
                curveTo(234.3f, 95.3f, 239.4f, 67.1f, 228.3f, 52.8f)
                close()
                moveTo(92.0f, 212.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, true, -20.8f, -56.4f)
                lineToRelative(0.3f, -0.2f)
                arcToRelative(31.8f, 31.8f, 0.0f, false, true, 16.9f, -7.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.6f, -4.4f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -4.4f, -3.6f)
                arcToRelative(40.8f, 40.8f, 0.0f, false, false, -20.2f, 8.2f)
                curveToRelative(-21.7f, 0.5f, -29.2f, -20.3f, -31.5f, -29.4f)
                curveTo(30.3f, 96.6f, 25.0f, 69.3f, 34.1f, 57.7f)
                curveToRelative(3.0f, -3.8f, 7.5f, -5.7f, 13.9f, -5.7f)
                curveToRelative(29.1f, 0.0f, 76.0f, 46.9f, 76.0f, 76.0f)
                verticalLineToRelative(52.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, true, 92.0f, 212.0f)
                close()
                moveTo(220.1f, 119.0f)
                curveToRelative(-2.3f, 9.1f, -9.8f, 29.9f, -31.5f, 29.4f)
                arcToRelative(40.8f, 40.8f, 0.0f, false, false, -20.2f, -8.2f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -4.4f, 3.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.6f, 4.4f)
                arcToRelative(31.8f, 31.8f, 0.0f, false, true, 16.9f, 7.2f)
                lineToRelative(0.3f, 0.2f)
                arcTo(32.0f, 32.0f, 0.0f, true, true, 132.0f, 180.0f)
                lineTo(132.0f, 128.0f)
                curveToRelative(0.0f, -29.1f, 46.9f, -76.0f, 76.0f, -76.0f)
                curveToRelative(6.4f, 0.0f, 10.9f, 1.9f, 13.9f, 5.7f)
                curveTo(231.0f, 69.3f, 225.7f, 96.6f, 220.1f, 119.0f)
                close()
            }
        }
        .build()
        return _butterfly!!
    }

private var _butterfly: ImageVector? = null
