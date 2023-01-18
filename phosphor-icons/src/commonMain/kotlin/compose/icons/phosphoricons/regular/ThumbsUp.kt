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

public val RegularGroup.ThumbsUp: ImageVector
    get() {
        if (_thumbsUp != null) {
            return _thumbsUp!!
        }
        _thumbsUp = Builder(name = "ThumbsUp", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.9f, 80.1f)
                arcToRelative(24.3f, 24.3f, 0.0f, false, false, -18.0f, -8.1f)
                horizontalLineTo(160.0f)
                verticalLineTo(56.0f)
                arcToRelative(40.1f, 40.1f, 0.0f, false, false, -40.0f, -40.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, -7.2f, 4.4f)
                lineTo(75.0f, 96.0f)
                horizontalLineTo(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(201.9f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, false, 23.8f, -21.0f)
                lineToRelative(12.0f, -96.0f)
                arcTo(24.5f, 24.5f, 0.0f, false, false, 231.9f, 80.1f)
                close()
                moveTo(32.0f, 112.0f)
                horizontalLineTo(72.0f)
                verticalLineToRelative(88.0f)
                horizontalLineTo(32.0f)
                close()
                moveTo(221.8f, 97.0f)
                lineToRelative(-12.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.9f, 7.0f)
                horizontalLineTo(88.0f)
                verticalLineTo(105.9f)
                lineToRelative(36.7f, -73.4f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 144.0f, 56.0f)
                verticalLineTo(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(61.9f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, 6.0f, 2.7f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 221.8f, 97.0f)
                close()
            }
        }
        .build()
        return _thumbsUp!!
    }

private var _thumbsUp: ImageVector? = null
