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

public val SimpleIcons.Numba: ImageVector
    get() {
        if (_numba != null) {
            return _numba!!
        }
        _numba = Builder(name = "Numba", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.419f, 15.204f)
                reflectiveCurveToRelative(7.235f, -5.335f, 4.305f, -8.786f)
                curveToRelative(-3.398f, -4.003f, -12.921f, 4.486f, -13.962f, 2.76f)
                curveToRelative(-1.04f, -1.725f, 8.452f, -5.86f, 9.481f, -6.55f)
                curveToRelative(0.112f, -0.075f, 0.144f, -0.218f, 0.112f, -0.383f)
                lineToRelative(1.099f, -0.127f)
                lineToRelative(-0.685f, -0.345f)
                lineToRelative(0.175f, -0.685f)
                lineToRelative(-0.796f, 0.621f)
                curveTo(15.85f, 1.173f, 15.34f, 0.595f, 15.049f, 0.393f)
                curveToRelative(-1.035f, -0.685f, -2.93f, -0.52f, -5.685f, 0.86f)
                curveToRelative(-2.756f, 1.38f, -9.147f, 5.685f, -5.877f, 10.51f)
                curveToRelative(2.93f, 4.306f, 11.35f, -3.094f, 12.756f, -1.9f)
                curveToRelative(1.205f, 1.035f, -8.095f, 7.411f, -8.095f, 7.411f)
                horizontalLineToRelative(3.965f)
                curveTo(11.43f, 18.999f, 8.148f, 24.0f, 8.148f, 24.0f)
                lineToRelative(11.934f, -8.621f)
                curveToRelative(-1.253f, -0.186f, -3.663f, -0.175f, -3.663f, -0.175f)
                close()
                moveTo(13.175f, 0.908f)
                arcToRelative(0.776f, 0.776f, 0.0f, false, true, 0.823f, 0.716f)
                arcToRelative(0.776f, 0.776f, 0.0f, false, true, -0.717f, 0.823f)
                arcToRelative(0.776f, 0.776f, 0.0f, false, true, -0.823f, -0.716f)
                arcToRelative(0.768f, 0.768f, 0.0f, false, true, 0.717f, -0.823f)
                close()
            }
        }
        .build()
        return _numba!!
    }

private var _numba: ImageVector? = null
