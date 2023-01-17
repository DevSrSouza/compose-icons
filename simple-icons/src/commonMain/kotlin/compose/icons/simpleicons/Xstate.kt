package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Xstate: ImageVector
    get() {
        if (_xstate != null) {
            return _xstate!!
        }
        _xstate = Builder(name = "Xstate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.891f, 0.0f)
                horizontalLineToRelative(6.023f)
                lineToRelative(-6.085f, 10.563f)
                curveToRelative(-1.853f, -3.305f, -1.822f, -7.32f, 0.062f, -10.563f)
                close()
                moveTo(21.946f, 23.999f)
                lineTo(8.078f, 0.001f)
                lineTo(2.055f, 0.001f)
                lineToRelative(6.919f, 12.015f)
                lineTo(2.055f, 24.0f)
                horizontalLineToRelative(6.023f)
                lineTo(12.0f, 17.236f)
                lineTo(15.892f, 24.0f)
                close()
            }
        }
        .build()
        return _xstate!!
    }

private var _xstate: ImageVector? = null
