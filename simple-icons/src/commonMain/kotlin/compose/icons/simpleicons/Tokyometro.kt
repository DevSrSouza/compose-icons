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

public val SimpleIcons.Tokyometro: ImageVector
    get() {
        if (_tokyometro != null) {
            return _tokyometro!!
        }
        _tokyometro = Builder(name = "Tokyometro", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9832f, 18.2104f)
                curveToRelative(2.86f, 0.006f, 4.04f, -0.949f, 4.043f, -2.392f)
                curveToRelative(0.003f, -1.7021f, -1.694f, -3.7822f, -2.923f, -5.0732f)
                curveToRelative(2.318f, -2.082f, 5.3251f, -3.622f, 6.5082f, -2.432f)
                curveToRelative(1.367f, 1.367f, 0.02f, 5.418f, -3.2131f, 9.8922f)
                lineToRelative(4.26f, 1.222f)
                curveToRelative(3.6132f, -6.4301f, 4.3802f, -12.7603f, 1.8901f, -14.4733f)
                curveToRelative(-1.946f, -1.329f, -6.8521f, 1.337f, -10.5502f, 4.721f)
                curveToRelative(-3.6871f, -3.398f, -8.5802f, -6.08f, -10.5323f, -4.759f)
                curveToRelative(-2.5f, 1.704f, -1.748f, 8.0372f, 1.841f, 14.4803f)
                lineToRelative(4.2662f, -1.207f)
                curveTo(4.35f, 13.7033f, 3.02f, 9.6482f, 4.393f, 8.285f)
                curveToRelative(1.184f, -1.185f, 4.1861f, 0.365f, 6.5002f, 2.4561f)
                curveToRelative(-1.237f, 1.286f, -2.9431f, 3.36f, -2.9451f, 5.0621f)
                curveToRelative(-0.003f, 1.444f, 1.176f, 2.402f, 4.035f, 2.408f)
                close()
                moveTo(11.9872f, 15.8704f)
                curveToRelative(-0.947f, -0.001f, -1.745f, -0.242f, -1.743f, -1.0501f)
                curveToRelative(0.0f, -0.748f, 0.637f, -1.88f, 1.75f, -3.106f)
                curveToRelative(1.11f, 1.23f, 1.739f, 2.364f, 1.738f, 3.113f)
                curveToRelative(-0.001f, 0.807f, -0.8f, 1.045f, -1.745f, 1.044f)
                close()
            }
        }
        .build()
        return _tokyometro!!
    }

private var _tokyometro: ImageVector? = null
