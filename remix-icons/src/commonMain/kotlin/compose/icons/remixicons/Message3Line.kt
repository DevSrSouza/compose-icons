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

public val RemixIcons.Message3Line: ImageVector
    get() {
        if (_message3Line != null) {
            return _message3Line!!
        }
        _message3Line = Builder(name = "Message3Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 8.994f)
                arcTo(5.99f, 5.99f, 0.0f, false, true, 8.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(3.313f, 0.0f, 6.0f, 2.695f, 6.0f, 5.994f)
                lineTo(22.0f, 21.0f)
                lineTo(8.0f, 21.0f)
                curveToRelative(-3.313f, 0.0f, -6.0f, -2.695f, -6.0f, -5.994f)
                lineTo(2.0f, 8.994f)
                close()
                moveTo(20.0f, 19.0f)
                lineTo(20.0f, 8.994f)
                arcTo(4.004f, 4.004f, 0.0f, false, false, 16.0f, 5.0f)
                lineTo(8.0f, 5.0f)
                arcToRelative(3.99f, 3.99f, 0.0f, false, false, -4.0f, 3.994f)
                verticalLineToRelative(6.012f)
                arcTo(4.004f, 4.004f, 0.0f, false, false, 8.0f, 19.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(14.0f, 11.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(8.0f, 11.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineTo(8.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _message3Line!!
    }

private var _message3Line: ImageVector? = null
