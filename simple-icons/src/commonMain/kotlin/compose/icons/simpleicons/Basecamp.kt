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

public val SimpleIcons.Basecamp: ImageVector
    get() {
        if (_basecamp != null) {
            return _basecamp!!
        }
        _basecamp = Builder(name = "Basecamp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.652f, 22.453f)
                curveToRelative(-4.033f, 0.0f, -7.575f, -1.554f, -10.244f, -4.495f)
                arcToRelative(1.11f, 1.11f, 0.0f, false, true, -0.219f, -1.134f)
                curveToRelative(0.701f, -1.888f, 2.593f, -6.281f, 5.021f, -6.295f)
                horizontalLineToRelative(0.013f)
                curveToRelative(1.219f, 0.0f, 2.131f, 0.965f, 2.865f, 1.741f)
                curveToRelative(0.219f, 0.232f, 0.555f, 0.587f, 0.782f, 0.761f)
                curveToRelative(0.566f, -0.559f, 1.678f, -2.416f, 2.542f, -4.278f)
                curveToRelative(0.259f, -0.557f, 0.92f, -0.799f, 1.477f, -0.54f)
                curveToRelative(0.557f, 0.258f, 0.799f, 0.919f, 0.54f, 1.476f)
                curveToRelative(-2.622f, 5.65f, -4.019f, 5.65f, -4.478f, 5.65f)
                curveToRelative(-1.022f, 0.0f, -1.763f, -0.784f, -2.479f, -1.542f)
                curveToRelative(-0.321f, -0.339f, -0.988f, -1.045f, -1.248f, -1.045f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.567f, 0.095f, -1.809f, 2.053f, -2.697f, 4.203f)
                curveToRelative(2.193f, 2.172f, 4.923f, 3.273f, 8.127f, 3.273f)
                curveToRelative(4.396f, 0.0f, 7.683f, -1.196f, 9.1f, -3.295f)
                curveToRelative(-0.489f, -5.585f, -3.564f, -13.163f, -9.1f, -13.163f)
                curveToRelative(-4.686f, 0.0f, -8.215f, 3.264f, -10.491f, 9.701f)
                curveToRelative(-0.205f, 0.579f, -0.842f, 0.883f, -1.419f, 0.678f)
                curveToRelative(-0.579f, -0.205f, -0.882f, -0.84f, -0.678f, -1.418f)
                curveToRelative(2.624f, -7.421f, 6.859f, -11.183f, 12.588f, -11.183f)
                curveToRelative(7.483f, 0.0f, 10.93f, 9.561f, 11.346f, 15.588f)
                arcToRelative(1.115f, 1.115f, 0.0f, false, true, -0.146f, 0.631f)
                curveToRelative(-1.741f, 3.022f, -5.718f, 4.686f, -11.2f, 4.686f)
                close()
            }
        }
        .build()
        return _basecamp!!
    }

private var _basecamp: ImageVector? = null
