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

public val RemixIcons.Asterisk: ImageVector
    get() {
        if (_asterisk != null) {
            return _asterisk!!
        }
        _asterisk = Builder(name = "Asterisk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 3.0f)
                verticalLineToRelative(7.267f)
                lineToRelative(6.294f, -3.633f)
                lineToRelative(1.0f, 1.732f)
                lineToRelative(-6.293f, 3.633f)
                lineToRelative(6.293f, 3.635f)
                lineToRelative(-1.0f, 1.732f)
                lineTo(13.0f, 13.732f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.268f)
                lineToRelative(-6.294f, 3.634f)
                lineToRelative(-1.0f, -1.732f)
                lineTo(9.999f, 12.0f)
                lineTo(3.706f, 8.366f)
                lineToRelative(1.0f, -1.732f)
                lineTo(11.0f, 10.267f)
                verticalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _asterisk!!
    }

private var _asterisk: ImageVector? = null
