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

public val BoldGroup.ChatCentered: ImageVector
    get() {
        if (_chatCentered != null) {
            return _chatCentered!!
        }
        _chatCentered = Builder(name = "ChatCentered", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 236.4f)
                arcToRelative(19.6f, 19.6f, 0.0f, false, true, -17.1f, -9.7f)
                lineTo(97.2f, 204.0f)
                horizontalLineTo(40.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, -20.0f)
                verticalLineTo(56.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 40.0f, 36.0f)
                horizontalLineTo(216.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 20.0f, 20.0f)
                verticalLineTo(184.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, 20.0f)
                horizontalLineTo(158.8f)
                lineToRelative(-13.6f, 22.7f)
                arcTo(19.9f, 19.9f, 0.0f, false, true, 128.0f, 236.4f)
                close()
                moveTo(44.0f, 180.0f)
                horizontalLineTo(99.5f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 17.1f, 9.7f)
                lineToRelative(11.4f, 19.0f)
                lineToRelative(11.4f, -19.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 17.1f, -9.7f)
                horizontalLineTo(212.0f)
                verticalLineTo(60.0f)
                horizontalLineTo(44.0f)
                close()
            }
        }
        .build()
        return _chatCentered!!
    }

private var _chatCentered: ImageVector? = null
