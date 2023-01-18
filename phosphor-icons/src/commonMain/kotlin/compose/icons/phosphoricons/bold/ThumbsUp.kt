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

public val BoldGroup.ThumbsUp: ImageVector
    get() {
        if (_thumbsUp != null) {
            return _thumbsUp!!
        }
        _thumbsUp = Builder(name = "ThumbsUp", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.9f, 77.5f)
                arcToRelative(28.3f, 28.3f, 0.0f, false, false, -21.0f, -9.5f)
                horizontalLineTo(164.0f)
                verticalLineTo(56.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -44.0f, -44.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -10.7f, 6.6f)
                lineTo(72.6f, 92.0f)
                horizontalLineTo(32.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineTo(201.9f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 27.8f, -24.5f)
                lineToRelative(12.0f, -96.0f)
                arcTo(28.4f, 28.4f, 0.0f, false, false, 234.9f, 77.5f)
                close()
                moveTo(36.0f, 116.0f)
                horizontalLineTo(68.0f)
                verticalLineToRelative(80.0f)
                horizontalLineTo(36.0f)
                close()
                moveTo(217.8f, 96.5f)
                lineToRelative(-12.0f, 96.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -3.9f, 3.5f)
                horizontalLineTo(92.0f)
                verticalLineTo(106.8f)
                lineToRelative(34.8f, -69.6f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 140.0f, 56.0f)
                verticalLineTo(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(61.9f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 3.0f, 1.4f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 217.8f, 96.5f)
                close()
            }
        }
        .build()
        return _thumbsUp!!
    }

private var _thumbsUp: ImageVector? = null
