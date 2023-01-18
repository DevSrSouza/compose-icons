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

public val FillGroup.ThumbsDown: ImageVector
    get() {
        if (_thumbsDown != null) {
            return _thumbsDown!!
        }
        _thumbsDown = Builder(name = "ThumbsDown", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.7f, 157.0f)
                lineToRelative(-12.0f, -96.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, false, -23.8f, -21.0f)
                horizontalLineTo(32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 16.0f, 56.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(75.0f)
                lineToRelative(37.8f, 75.6f)
                arcTo(8.2f, 8.2f, 0.0f, false, false, 120.0f, 240.0f)
                arcToRelative(40.1f, 40.1f, 0.0f, false, false, 40.0f, -40.0f)
                verticalLineTo(184.0f)
                horizontalLineToRelative(53.9f)
                arcToRelative(23.9f, 23.9f, 0.0f, false, false, 23.8f, -27.0f)
                close()
                moveTo(72.0f, 144.0f)
                horizontalLineTo(32.0f)
                verticalLineTo(56.0f)
                horizontalLineTo(72.0f)
                close()
            }
        }
        .build()
        return _thumbsDown!!
    }

private var _thumbsDown: ImageVector? = null
