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

public val BoldGroup.VideoCamera: ImageVector
    get() {
        if (_videoCamera != null) {
            return _videoCamera!!
        }
        _videoCamera = Builder(name = "VideoCamera", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.0f, 69.6f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(196.0f, 91.3f)
                arcTo(44.1f, 44.1f, 0.0f, false, false, 152.0f, 48.0f)
                lineTo(24.0f, 48.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 4.0f, 68.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 44.0f, 44.0f)
                lineTo(176.0f, 208.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(196.0f, 164.7f)
                lineToRelative(38.0f, 21.7f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, 6.0f, 1.6f)
                arcToRelative(11.5f, 11.5f, 0.0f, false, false, 6.0f, -1.6f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 6.0f, -10.4f)
                lineTo(252.0f, 80.0f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 246.0f, 69.6f)
                close()
                moveTo(172.0f, 184.0f)
                lineTo(48.0f, 184.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(28.0f, 72.0f)
                lineTo(152.0f, 72.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 20.0f, 20.0f)
                close()
                moveTo(228.0f, 155.3f)
                lineTo(196.0f, 137.0f)
                lineTo(196.0f, 119.0f)
                lineToRelative(32.0f, -18.3f)
                close()
            }
        }
        .build()
        return _videoCamera!!
    }

private var _videoCamera: ImageVector? = null
