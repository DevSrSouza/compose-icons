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

public val RemixIcons.CameraSwitchFill: ImageVector
    get() {
        if (_cameraSwitchFill != null) {
            return _cameraSwitchFill!!
        }
        _cameraSwitchFill = Builder(name = "CameraSwitchFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 3.0f)
                horizontalLineToRelative(6.0f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(3.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(2.0f, -2.0f)
                close()
                moveTo(14.684f, 18.368f)
                lineToRelative(-0.895f, -1.79f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.0f, 13.0f)
                horizontalLineToRelative(2.001f)
                lineTo(7.839f, 8.677f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.845f, 9.69f)
                close()
                moveTo(9.316f, 7.632f)
                lineToRelative(0.895f, 1.79f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 16.0f, 13.0f)
                horizontalLineToRelative(-2.001f)
                lineToRelative(2.161f, 4.323f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.845f, -9.69f)
                close()
            }
        }
        .build()
        return _cameraSwitchFill!!
    }

private var _cameraSwitchFill: ImageVector? = null
