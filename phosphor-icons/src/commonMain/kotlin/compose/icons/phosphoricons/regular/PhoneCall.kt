package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.PhoneCall: ImageVector
    get() {
        if (_phoneCall != null) {
            return _phoneCall!!
        }
        _phoneCall = Builder(name = "PhoneCall", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(151.7f, 37.9f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 9.8f, -5.6f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, 62.2f, 62.2f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -5.6f, 9.8f)
                arcToRelative(7.6f, 7.6f, 0.0f, false, true, -2.1f, 0.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.7f, -6.0f)
                arcToRelative(72.6f, 72.6f, 0.0f, false, false, -50.9f, -50.9f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 151.7f, 37.9f)
                close()
                moveTo(149.1f, 78.6f)
                arcToRelative(40.4f, 40.4f, 0.0f, false, true, 28.3f, 28.3f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 7.7f, 6.0f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, false, 2.0f, -0.3f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 5.7f, -9.8f)
                arcToRelative(55.8f, 55.8f, 0.0f, false, false, -39.6f, -39.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -4.1f, 15.4f)
                close()
                moveTo(231.6f, 175.1f)
                arcTo(56.2f, 56.2f, 0.0f, false, true, 176.0f, 224.0f)
                curveTo(96.6f, 224.0f, 32.0f, 159.4f, 32.0f, 80.0f)
                arcTo(56.2f, 56.2f, 0.0f, false, true, 80.9f, 24.4f)
                arcTo(16.3f, 16.3f, 0.0f, false, true, 97.6f, 34.0f)
                lineToRelative(20.1f, 46.9f)
                arcTo(15.9f, 15.9f, 0.0f, false, true, 116.3f, 96.0f)
                lineTo(99.7f, 121.4f)
                horizontalLineToRelative(0.0f)
                arcToRelative(76.5f, 76.5f, 0.0f, false, false, 35.2f, 35.0f)
                lineTo(160.0f, 139.7f)
                arcToRelative(15.6f, 15.6f, 0.0f, false, true, 15.1f, -1.3f)
                lineToRelative(46.9f, 20.0f)
                arcTo(16.3f, 16.3f, 0.0f, false, true, 231.6f, 175.1f)
                close()
                moveTo(215.7f, 173.1f)
                lineTo(168.8f, 153.1f)
                lineTo(143.8f, 169.8f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -15.7f, 1.1f)
                arcToRelative(92.5f, 92.5f, 0.0f, false, true, -42.8f, -42.6f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 1.0f, -15.7f)
                lineTo(103.0f, 87.2f)
                lineTo(82.9f, 40.3f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 48.0f, 80.0f)
                arcTo(128.1f, 128.1f, 0.0f, false, false, 176.0f, 208.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 215.7f, 173.1f)
                close()
            }
        }
        .build()
        return _phoneCall!!
    }

private var _phoneCall: ImageVector? = null
