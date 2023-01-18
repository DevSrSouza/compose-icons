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

public val ThinGroup.ChatCentered: ImageVector
    get() {
        if (_chatCentered != null) {
            return _chatCentered!!
        }
        _chatCentered = Builder(name = "ChatCentered", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 228.4f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, true, -10.3f, -5.8f)
                lineToRelative(-14.8f, -24.7f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -3.4f, -1.9f)
                horizontalLineTo(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                verticalLineTo(56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 40.0f, 44.0f)
                horizontalLineTo(216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                verticalLineTo(184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineTo(156.5f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -3.4f, 1.9f)
                lineToRelative(-14.8f, 24.7f)
                arcTo(11.7f, 11.7f, 0.0f, false, true, 128.0f, 228.4f)
                close()
                moveTo(40.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineTo(184.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineTo(99.5f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 10.3f, 5.8f)
                lineToRelative(14.8f, 24.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.8f, 0.0f)
                lineToRelative(14.8f, -24.7f)
                horizontalLineToRelative(0.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 10.3f, -5.8f)
                horizontalLineTo(216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                verticalLineTo(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _chatCentered!!
    }

private var _chatCentered: ImageVector? = null
