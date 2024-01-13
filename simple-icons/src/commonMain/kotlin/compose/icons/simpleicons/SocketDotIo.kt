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

public val SimpleIcons.Socketdotio: ImageVector
    get() {
        if (_socketdotio != null) {
            return _socketdotio!!
        }
        _socketdotio = Builder(name = "Socketdotio", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9362f, 0.0137f)
                arcToRelative(12.1694f, 12.1694f, 0.0f, false, false, -2.9748f, 0.378f)
                curveTo(4.2816f, 1.5547f, 0.5678f, 5.7944f, 0.0918f, 10.6012f)
                curveToRelative(-0.59f, 4.5488f, 1.7079f, 9.2856f, 5.6437f, 11.6345f)
                curveToRelative(3.8608f, 2.4179f, 9.0926f, 2.3199f, 12.8734f, -0.223f)
                curveToRelative(3.3969f, -2.206f, 5.5118f, -6.2277f, 5.3858f, -10.2845f)
                curveToRelative(-0.058f, -4.0159f, -2.31f, -7.9167f, -5.7588f, -9.9796f)
                curveTo(16.354f, 0.5876f, 14.1431f, 0.0047f, 11.9362f, 0.0137f)
                close()
                moveTo(11.8732f, 1.7097f)
                curveToRelative(4.9448f, -0.007f, 9.7886f, 3.8137f, 10.2815f, 8.9245f)
                curveToRelative(0.945f, 5.6597f, -3.7528f, 11.4125f, -9.4875f, 11.5795f)
                curveToRelative(-5.4538f, 0.544f, -10.7245f, -4.0798f, -10.8795f, -9.5566f)
                curveToRelative(-0.407f, -4.4338f, 2.5159f, -8.8346f, 6.6977f, -10.2995f)
                arcToRelative(9.1126f, 9.1126f, 0.0f, false, true, 3.3878f, -0.647f)
                close()
                moveTo(16.964f, 4.9345f)
                curveToRelative(-2.6869f, 2.0849f, -5.2598f, 4.3078f, -7.8886f, 6.4567f)
                curveToRelative(1.2029f, 0.017f, 2.4118f, 0.016f, 3.6208f, 0.01f)
                curveToRelative(1.41f, -2.165f, 2.8589f, -4.3008f, 4.2678f, -6.4667f)
                close()
                moveTo(11.2993f, 12.5881f)
                curveToRelative(-1.41f, 2.166f, -2.86f, 4.3088f, -4.2699f, 6.4737f)
                curveToRelative(2.693f, -2.0799f, 5.2548f, -4.3198f, 7.9017f, -6.4557f)
                arcToRelative(255.4132f, 255.4132f, 0.0f, false, false, -3.6318f, -0.018f)
                close()
            }
        }
        .build()
        return _socketdotio!!
    }

private var _socketdotio: ImageVector? = null
