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

public val SimpleIcons.Erlang: ImageVector
    get() {
        if (_erlang != null) {
            return _erlang!!
        }
        _erlang = Builder(name = "Erlang", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.859f, 7.889f)
                curveToRelative(0.154f, -1.863f, 1.623f, -3.115f, 3.344f, -3.119f)
                curveToRelative(1.734f, 0.004f, 2.986f, 1.256f, 3.029f, 3.119f)
                close()
                moveTo(20.969f, 19.596f)
                curveToRelative(0.802f, -0.86f, 1.52f, -1.872f, 2.172f, -3.03f)
                lineToRelative(-3.616f, -1.807f)
                curveToRelative(-1.27f, 2.064f, -3.127f, 3.965f, -5.694f, 3.977f)
                curveToRelative(-3.738f, -0.012f, -5.206f, -3.208f, -5.198f, -7.322f)
                horizontalLineToRelative(13.966f)
                curveToRelative(0.019f, -0.464f, 0.019f, -0.68f, 0.0f, -0.904f)
                curveToRelative(0.091f, -2.447f, -0.558f, -4.504f, -1.737f, -6.106f)
                lineToRelative(-0.007f, 0.005f)
                lineTo(24.0f, 4.409f)
                verticalLineToRelative(15.186f)
                horizontalLineToRelative(-3.039f)
                close()
                moveTo(3.763f, 19.595f)
                curveTo(1.901f, 17.62f, 0.811f, 14.894f, 0.813f, 11.64f)
                curveToRelative(-0.002f, -2.877f, 0.902f, -5.35f, 2.456f, -7.232f)
                lineTo(0.0f, 4.408f)
                verticalLineToRelative(15.187f)
                horizontalLineToRelative(3.761f)
                close()
            }
        }
        .build()
        return _erlang!!
    }

private var _erlang: ImageVector? = null
