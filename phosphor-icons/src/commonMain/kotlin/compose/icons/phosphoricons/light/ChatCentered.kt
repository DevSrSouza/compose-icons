package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.ChatCentered: ImageVector
    get() {
        if (_chatCentered != null) {
            return _chatCentered!!
        }
        _chatCentered = Builder(name = "ChatCentered", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 230.4f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, true, -12.0f, -6.7f)
                lineTo(101.2f, 199.0f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, -1.7f, -1.0f)
                horizontalLineTo(40.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                verticalLineTo(56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 40.0f, 42.0f)
                horizontalLineTo(216.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 14.0f, 14.0f)
                verticalLineTo(184.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                horizontalLineTo(156.5f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, -1.7f, 1.0f)
                lineTo(140.0f, 223.7f)
                arcTo(13.8f, 13.8f, 0.0f, false, true, 128.0f, 230.4f)
                close()
                moveTo(40.0f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineTo(184.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineTo(99.5f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 12.0f, 6.8f)
                lineToRelative(14.8f, 24.7f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, 3.4f, 0.0f)
                lineToRelative(14.8f, -24.7f)
                horizontalLineToRelative(0.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 12.0f, -6.8f)
                horizontalLineTo(216.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineTo(56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _chatCentered!!
    }

private var _chatCentered: ImageVector? = null