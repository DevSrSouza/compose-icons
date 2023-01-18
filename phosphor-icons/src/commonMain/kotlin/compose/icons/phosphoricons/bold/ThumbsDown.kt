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

public val BoldGroup.ThumbsDown: ImageVector
    get() {
        if (_thumbsDown != null) {
            return _thumbsDown!!
        }
        _thumbsDown = Builder(name = "ThumbsDown", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(241.7f, 156.5f)
                lineToRelative(-12.0f, -96.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 201.9f, 36.0f)
                lineTo(32.0f, 36.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 12.0f, 56.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(72.6f, 164.0f)
                lineToRelative(36.7f, 73.4f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 120.0f, 244.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 44.0f, -44.0f)
                lineTo(164.0f, 188.0f)
                horizontalLineToRelative(49.9f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 27.8f, -31.5f)
                close()
                moveTo(68.0f, 140.0f)
                lineTo(36.0f, 140.0f)
                lineTo(36.0f, 60.0f)
                lineTo(68.0f, 60.0f)
                close()
                moveTo(216.9f, 162.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -3.0f, 1.4f)
                lineTo(152.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -13.2f, 18.8f)
                lineTo(92.0f, 149.2f)
                lineTo(92.0f, 60.0f)
                lineTo(201.9f, 60.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 3.9f, 3.5f)
                lineToRelative(12.0f, 96.0f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 216.9f, 162.6f)
                close()
            }
        }
        .build()
        return _thumbsDown!!
    }

private var _thumbsDown: ImageVector? = null
