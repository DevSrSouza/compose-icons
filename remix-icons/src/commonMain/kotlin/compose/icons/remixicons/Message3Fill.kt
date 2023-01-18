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

public val RemixIcons.Message3Fill: ImageVector
    get() {
        if (_message3Fill != null) {
            return _message3Fill!!
        }
        _message3Fill = Builder(name = "Message3Fill", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(14.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(8.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                lineTo(8.0f, 11.0f)
                close()
            }
        }
        .build()
        return _message3Fill!!
    }

private var _message3Fill: ImageVector? = null
