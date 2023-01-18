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

public val ThinGroup.ThumbsUp: ImageVector
    get() {
        if (_thumbsUp != null) {
            return _thumbsUp!!
        }
        _thumbsUp = Builder(name = "ThumbsUp", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.9f, 82.8f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -15.0f, -6.8f)
                horizontalLineTo(156.0f)
                verticalLineTo(56.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -36.0f, -36.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, -3.6f, 2.2f)
                lineTo(77.5f, 100.0f)
                horizontalLineTo(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineTo(201.9f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 19.8f, -17.5f)
                lineToRelative(12.0f, -96.0f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 228.9f, 82.8f)
                close()
                moveTo(28.0f, 200.0f)
                verticalLineTo(112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineTo(76.0f)
                verticalLineToRelative(96.0f)
                horizontalLineTo(32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 28.0f, 200.0f)
                close()
                moveTo(225.8f, 97.5f)
                lineToRelative(-12.0f, 96.0f)
                arcTo(12.1f, 12.1f, 0.0f, false, true, 201.9f, 204.0f)
                horizontalLineTo(84.0f)
                verticalLineTo(104.9f)
                lineToRelative(38.4f, -76.8f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 148.0f, 56.0f)
                verticalLineTo(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(61.9f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 9.0f, 4.1f)
                arcTo(12.2f, 12.2f, 0.0f, false, true, 225.8f, 97.5f)
                close()
            }
        }
        .build()
        return _thumbsUp!!
    }

private var _thumbsUp: ImageVector? = null
