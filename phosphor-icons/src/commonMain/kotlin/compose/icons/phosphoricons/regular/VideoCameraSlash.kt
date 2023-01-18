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

public val RegularGroup.VideoCameraSlash: ImageVector
    get() {
        if (_videoCameraSlash != null) {
            return _videoCameraSlash!!
        }
        _videoCameraSlash = Builder(name = "VideoCameraSlash", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 73.1f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(192.0f, 98.2f)
                lineTo(192.0f, 68.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(110.9f, 52.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(176.0f, 68.0f)
                verticalLineToRelative(76.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 4.0f, 6.9f)
                lineToRelative(56.0f, 32.0f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, 4.0f, 1.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.0f, -1.1f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 4.0f, -6.9f)
                lineTo(248.0f, 80.0f)
                arcTo(7.8f, 7.8f, 0.0f, false, false, 244.0f, 73.1f)
                close()
                moveTo(232.0f, 162.2f)
                lineTo(192.0f, 139.4f)
                lineTo(192.0f, 116.6f)
                lineToRelative(40.0f, -22.8f)
                close()
                moveTo(40.8f, 18.6f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -11.3f, -0.5f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 29.0f, 29.4f)
                lineTo(49.6f, 52.0f)
                lineTo(24.0f, 52.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 8.0f, 68.0f)
                lineTo(8.0f, 188.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(176.0f, 204.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 9.1f, -2.9f)
                lineToRelative(33.0f, 36.3f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 240.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 5.4f, -2.1f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 0.5f, -11.3f)
                close()
                moveTo(24.0f, 188.0f)
                lineTo(24.0f, 68.0f)
                lineTo(64.1f, 68.0f)
                lineTo(173.2f, 188.0f)
                close()
            }
        }
        .build()
        return _videoCameraSlash!!
    }

private var _videoCameraSlash: ImageVector? = null
