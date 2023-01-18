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

public val RemixIcons.ChatSmile3Line: ImageVector
    get() {
        if (_chatSmile3Line != null) {
            return _chatSmile3Line!!
        }
        _chatSmile3Line = Builder(name = "ChatSmile3Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                lineTo(2.0f, 22.0f)
                lineToRelative(2.929f, -2.929f)
                arcTo(9.969f, 9.969f, 0.0f, false, true, 2.0f, 12.0f)
                close()
                moveTo(6.828f, 20.0f)
                lineTo(12.0f, 20.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, -8.0f)
                curveToRelative(0.0f, 2.152f, 0.851f, 4.165f, 2.343f, 5.657f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-0.929f, 0.929f)
                close()
                moveTo(8.0f, 13.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f)
                close()
            }
        }
        .build()
        return _chatSmile3Line!!
    }

private var _chatSmile3Line: ImageVector? = null
