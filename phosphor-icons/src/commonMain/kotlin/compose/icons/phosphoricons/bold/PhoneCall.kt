package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.PhoneCall: ImageVector
    get() {
        if (_phoneCall != null) {
            return _phoneCall!!
        }
        _phoneCall = Builder(name = "PhoneCall", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(147.8f, 36.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 14.7f, -8.5f)
                arcToRelative(92.3f, 92.3f, 0.0f, false, true, 65.1f, 65.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.5f, 14.7f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, true, -3.1f, 0.4f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -11.6f, -8.9f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, -48.1f, -48.1f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 147.8f, 36.9f)
                close()
                moveTo(235.5f, 175.6f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 176.0f, 228.0f)
                curveTo(94.4f, 228.0f, 28.0f, 161.6f, 28.0f, 80.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 80.4f, 20.5f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, 20.8f, 12.0f)
                lineToRelative(20.1f, 46.8f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, -1.6f, 18.9f)
                lineToRelative(-15.4f, 23.4f)
                arcToRelative(72.3f, 72.3f, 0.0f, false, false, 30.3f, 30.2f)
                lineToRelative(23.1f, -15.4f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 19.0f, -1.7f)
                lineToRelative(46.8f, 20.1f)
                arcTo(19.9f, 19.9f, 0.0f, false, true, 235.5f, 175.6f)
                close()
                moveTo(211.2f, 175.6f)
                lineTo(169.2f, 157.6f)
                lineTo(146.0f, 173.1f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -19.7f, 1.4f)
                arcToRelative(96.5f, 96.5f, 0.0f, false, true, -44.6f, -44.4f)
                arcTo(19.8f, 19.8f, 0.0f, false, true, 83.0f, 110.4f)
                lineTo(98.4f, 86.8f)
                lineToRelative(-18.0f, -42.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 52.0f, 80.0f)
                arcTo(124.1f, 124.1f, 0.0f, false, false, 176.0f, 204.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 211.2f, 175.6f)
                close()
                moveTo(145.6f, 89.5f)
                arcToRelative(31.7f, 31.7f, 0.0f, false, true, 20.9f, 20.9f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 11.5f, 8.4f)
                arcToRelative(11.3f, 11.3f, 0.0f, false, false, 3.6f, -0.6f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 7.8f, -15.0f)
                arcToRelative(55.8f, 55.8f, 0.0f, false, false, -36.6f, -36.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.2f, 22.9f)
                close()
            }
        }
        .build()
        return _phoneCall!!
    }

private var _phoneCall: ImageVector? = null
