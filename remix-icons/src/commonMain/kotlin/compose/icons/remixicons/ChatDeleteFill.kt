package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.ChatDeleteFill: ImageVector
    get() {
        if (_chatDeleteFill != null) {
            return _chatDeleteFill!!
        }
        _chatDeleteFill = Builder(name = "ChatDeleteFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.455f, 19.0f)
                lineTo(2.0f, 22.5f)
                lineTo(2.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(6.455f, 19.0f)
                close()
                moveTo(13.415f, 11.0f)
                lineToRelative(2.474f, -2.475f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(12.0f, 9.586f)
                lineTo(9.525f, 7.11f)
                lineTo(8.111f, 8.525f)
                lineTo(10.586f, 11.0f)
                lineTo(8.11f, 13.475f)
                lineToRelative(1.414f, 1.414f)
                lineTo(12.0f, 12.414f)
                lineToRelative(2.475f, 2.475f)
                lineToRelative(1.414f, -1.414f)
                lineTo(13.414f, 11.0f)
                close()
            }
        }
        .build()
        return _chatDeleteFill!!
    }

private var _chatDeleteFill: ImageVector? = null
