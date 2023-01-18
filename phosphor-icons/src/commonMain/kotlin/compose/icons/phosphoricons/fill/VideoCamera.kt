package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.VideoCamera: ImageVector
    get() {
        if (_videoCamera != null) {
            return _videoCamera!!
        }
        _videoCamera = Builder(name = "VideoCamera", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 92.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(48.0f, 204.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 8.0f, 164.0f)
                lineTo(8.0f, 68.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 24.0f, 52.0f)
                lineTo(136.0f, 52.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 176.0f, 92.0f)
                close()
                moveTo(244.0f, 73.1f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(196.0f, 95.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.0f, 7.0f)
                verticalLineToRelative(50.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.0f, 7.0f)
                lineToRelative(40.0f, 22.8f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, 4.0f, 1.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.0f, -1.1f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 4.0f, -6.9f)
                lineTo(248.0f, 80.0f)
                arcTo(7.8f, 7.8f, 0.0f, false, false, 244.0f, 73.1f)
                close()
            }
        }
        .build()
        return _videoCamera!!
    }

private var _videoCamera: ImageVector? = null
