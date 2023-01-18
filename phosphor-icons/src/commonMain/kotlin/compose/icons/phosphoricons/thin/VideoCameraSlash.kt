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

public val ThinGroup.VideoCameraSlash: ImageVector
    get() {
        if (_videoCameraSlash != null) {
            return _videoCameraSlash!!
        }
        _videoCameraSlash = Builder(name = "VideoCameraSlash", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(242.0f, 76.5f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -4.0f, 0.0f)
                lineToRelative(-50.0f, 28.6f)
                lineTo(188.0f, 68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(110.9f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(176.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(76.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 2.0f, 3.5f)
                lineToRelative(56.0f, 32.0f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 4.0f, 0.0f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 2.0f, -3.5f)
                lineTo(244.0f, 80.0f)
                arcTo(4.3f, 4.3f, 0.0f, false, false, 242.0f, 76.5f)
                close()
                moveTo(236.0f, 169.1f)
                lineTo(188.0f, 141.7f)
                lineTo(188.0f, 114.3f)
                lineToRelative(48.0f, -27.4f)
                close()
                moveTo(37.9f, 21.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.0f, 5.4f)
                lineTo(58.6f, 56.0f)
                lineTo(24.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 68.0f)
                lineTo(12.0f, 188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(176.0f, 200.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 9.4f, -4.5f)
                lineTo(221.0f, 234.7f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 5.7f, 0.3f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 0.3f, -5.7f)
                close()
                moveTo(176.0f, 192.0f)
                lineTo(24.0f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(20.0f, 68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(65.9f, 64.0f)
                lineTo(179.8f, 189.3f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 176.0f, 192.0f)
                close()
            }
        }
        .build()
        return _videoCameraSlash!!
    }

private var _videoCameraSlash: ImageVector? = null
