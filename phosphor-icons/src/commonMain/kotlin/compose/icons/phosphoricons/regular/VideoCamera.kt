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

public val RegularGroup.VideoCamera: ImageVector
    get() {
        if (_videoCamera != null) {
            return _videoCamera!!
        }
        _videoCamera = Builder(name = "VideoCamera", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 73.1f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(192.0f, 98.2f)
                lineTo(192.0f, 92.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -40.0f, -40.0f)
                lineTo(24.0f, 52.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 8.0f, 68.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, 40.0f)
                lineTo(176.0f, 204.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(192.0f, 157.8f)
                lineToRelative(44.0f, 25.1f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, 4.0f, 1.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.0f, -1.1f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 4.0f, -6.9f)
                lineTo(248.0f, 80.0f)
                arcTo(7.8f, 7.8f, 0.0f, false, false, 244.0f, 73.1f)
                close()
                moveTo(176.0f, 188.0f)
                lineTo(48.0f, 188.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, true, -24.0f, -24.0f)
                lineTo(24.0f, 68.0f)
                lineTo(152.0f, 68.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, true, 24.0f, 24.0f)
                verticalLineToRelative(20.1f)
                horizontalLineToRelative(0.0f)
                lineTo(176.0f, 188.0f)
                close()
                moveTo(232.0f, 162.2f)
                lineTo(192.0f, 139.4f)
                lineTo(192.0f, 116.6f)
                lineToRelative(40.0f, -22.8f)
                close()
            }
        }
        .build()
        return _videoCamera!!
    }

private var _videoCamera: ImageVector? = null
