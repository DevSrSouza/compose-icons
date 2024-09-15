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
                moveTo(11.983f, 18.21f)
                curveToRelative(2.86f, 0.006f, 4.04f, -0.949f, 4.043f, -2.392f)
                curveToRelative(0.003f, -1.702f, -1.694f, -3.782f, -2.923f, -5.073f)
                curveToRelative(2.318f, -2.082f, 5.325f, -3.622f, 6.508f, -2.432f)
                curveToRelative(1.367f, 1.367f, 0.02f, 5.418f, -3.213f, 9.892f)
                lineToRelative(4.26f, 1.222f)
                curveToRelative(3.613f, -6.43f, 4.38f, -12.76f, 1.89f, -14.473f)
                curveToRelative(-1.946f, -1.329f, -6.852f, 1.337f, -10.55f, 4.721f)
                curveToRelative(-3.687f, -3.398f, -8.58f, -6.08f, -10.532f, -4.759f)
                curveToRelative(-2.5f, 1.704f, -1.748f, 8.037f, 1.841f, 14.48f)
                lineToRelative(4.266f, -1.207f)
                curveTo(4.35f, 13.703f, 3.02f, 9.648f, 4.393f, 8.285f)
                curveToRelative(1.184f, -1.185f, 4.186f, 0.365f, 6.5f, 2.456f)
                curveToRelative(-1.237f, 1.286f, -2.943f, 3.36f, -2.945f, 5.062f)
                curveToRelative(-0.003f, 1.444f, 1.176f, 2.402f, 4.035f, 2.408f)
                close()
                moveTo(11.987f, 15.87f)
                curveToRelative(-0.947f, -0.001f, -1.745f, -0.242f, -1.743f, -1.05f)
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
