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

public val ThinGroup.BellRinging: ImageVector
    get() {
        if (_bellRinging != null) {
            return _bellRinging!!
        }
        _bellRinging = Builder(name = "BellRinging", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(203.8f, 112.0f)
                arcToRelative(75.6f, 75.6f, 0.0f, false, false, -75.2f, -76.0f)
                lineTo(128.0f, 36.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, -75.8f, 76.0f)
                curveToRelative(0.0f, 35.2f, -7.4f, 55.3f, -13.6f, 65.9f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 0.0f, 12.1f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 49.0f, 196.0f)
                lineTo(92.0f, 196.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 72.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(43.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 10.4f, -6.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 0.0f, -12.1f)
                curveTo(211.2f, 167.3f, 203.8f, 147.2f, 203.8f, 112.0f)
                close()
                moveTo(156.0f, 200.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -56.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(56.0f)
                close()
                moveTo(210.5f, 186.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -3.5f, 2.0f)
                lineTo(49.0f, 188.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -3.5f, -2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.1f, -4.0f)
                curveToRelative(6.6f, -11.5f, 14.6f, -33.0f, 14.6f, -70.0f)
                arcTo(67.9f, 67.9f, 0.0f, false, true, 128.0f, 44.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(67.6f, 67.6f, 0.0f, false, true, 67.3f, 68.0f)
                curveToRelative(0.0f, 37.0f, 8.0f, 58.5f, 14.6f, 70.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 210.5f, 186.0f)
                close()
                moveTo(223.1f, 69.7f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -1.7f, 0.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.6f, -2.2f)
                arcToRelative(100.4f, 100.4f, 0.0f, false, false, -36.5f, -40.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 4.3f, -6.8f)
                arcToRelative(108.3f, 108.3f, 0.0f, false, true, 39.3f, 43.7f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 223.1f, 69.7f)
                close()
                moveTo(34.6f, 70.1f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -1.7f, -0.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.8f, -5.4f)
                arcTo(108.3f, 108.3f, 0.0f, false, true, 70.4f, 20.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 4.3f, 6.8f)
                arcTo(100.4f, 100.4f, 0.0f, false, false, 38.2f, 67.9f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 34.6f, 70.1f)
                close()
            }
        }
        .build()
        return _bellRinging!!
    }

private var _bellRinging: ImageVector? = null
