package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.ChatCentered: ImageVector
    get() {
        if (_chatCentered != null) {
            return _chatCentered!!
        }
        _chatCentered = Builder(name = "ChatCentered", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(149.7f, 195.9f)
                lineToRelative(-14.8f, 24.7f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -13.8f, 0.0f)
                lineToRelative(-14.8f, -24.7f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -6.8f, -3.9f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineTo(184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(156.5f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 149.7f, 195.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 232.4f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, -13.7f, -7.7f)
                lineTo(99.5f, 200.0f)
                horizontalLineTo(40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 40.0f)
                horizontalLineTo(216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineTo(184.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineTo(156.5f)
                lineToRelative(-6.8f, -4.1f)
                lineToRelative(6.8f, 4.1f)
                lineToRelative(-14.8f, 24.7f)
                arcTo(15.9f, 15.9f, 0.0f, false, true, 128.0f, 232.4f)
                close()
                moveTo(40.0f, 56.0f)
                verticalLineTo(184.0f)
                horizontalLineTo(99.5f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, 13.7f, 7.8f)
                lineTo(128.0f, 216.4f)
                lineToRelative(14.8f, -24.6f)
                horizontalLineToRelative(0.0f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, true, 13.7f, -7.8f)
                horizontalLineTo(216.0f)
                verticalLineTo(56.0f)
                close()
            }
        }
        .build()
        return _chatCentered!!
    }

private var _chatCentered: ImageVector? = null
