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

public val SimpleIcons.Overleaf: ImageVector
    get() {
        if (_overleaf != null) {
            return _overleaf!!
        }
        _overleaf = Builder(name = "Overleaf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.351f, 0.748f)
                curveTo(19.111f, -0.51f, 7.365f, -0.982f, 7.345f, 6.027f)
                curveToRelative(-3.427f, 2.194f, -5.697f, 5.768f, -5.697f, 9.598f)
                arcToRelative(8.373f, 8.373f, 0.0f, false, false, 13.123f, 6.898f)
                arcToRelative(8.373f, 8.373f, 0.0f, false, false, -1.767f, -14.719f)
                curveToRelative(-0.606f, -0.234f, -1.923f, -0.648f, -2.975f, -0.559f)
                curveToRelative(-1.501f, 0.954f, -3.331f, 2.915f, -4.195f, 4.869f)
                curveToRelative(2.589f, -3.082f, 7.505f, -2.425f, 9.194f, 1.229f)
                curveToRelative(1.689f, 3.654f, -0.994f, 7.824f, -5.02f, 7.8f)
                arcToRelative(5.499f, 5.499f, 0.0f, false, true, -4.195f, -1.933f)
                curveToRelative(-1.485f, -1.748f, -1.868f, -3.644f, -1.561f, -5.497f)
                curveToRelative(1.057f, -6.495f, 8.759f, -10.189f, 14.486f, -11.609f)
                curveToRelative(-1.868f, 0.989f, -5.237f, 2.613f, -7.595f, 4.384f)
                curveTo(18.015f, 9.138f, 19.131f, 3.345f, 22.351f, 0.748f)
                close()
            }
        }
        .build()
        return _overleaf!!
    }

private var _overleaf: ImageVector? = null
