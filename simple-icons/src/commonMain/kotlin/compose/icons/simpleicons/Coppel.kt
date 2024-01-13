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

public val SimpleIcons.Coppel: ImageVector
    get() {
        if (_coppel != null) {
            return _coppel!!
        }
        _coppel = Builder(name = "Coppel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.738f, 2.879f)
                arcToRelative(0.716f, 0.716f, 0.0f, false, false, -0.738f, 0.74f)
                verticalLineToRelative(16.762f)
                curveToRelative(0.0f, 0.428f, 0.35f, 0.74f, 0.738f, 0.74f)
                horizontalLineToRelative(22.52f)
                arcToRelative(0.739f, 0.739f, 0.0f, false, false, 0.739f, -0.74f)
                lineTo(23.997f, 3.619f)
                curveToRelative(0.039f, -0.428f, -0.31f, -0.74f, -0.738f, -0.74f)
                close()
                moveTo(7.352f, 9.219f)
                curveToRelative(1.167f, 0.0f, 2.1f, 0.935f, 2.1f, 2.101f)
                curveToRelative(0.0f, 0.234f, -0.04f, 0.427f, -0.079f, 0.621f)
                horizontalLineToRelative(12.058f)
                verticalLineToRelative(1.868f)
                horizontalLineToRelative(-0.973f)
                verticalLineToRelative(2.527f)
                horizontalLineToRelative(-0.97f)
                verticalLineToRelative(-1.283f)
                horizontalLineToRelative(-0.935f)
                verticalLineToRelative(1.283f)
                horizontalLineToRelative(-0.972f)
                verticalLineToRelative(-2.527f)
                lineTo(9.373f, 13.809f)
                curveToRelative(0.04f, 0.194f, 0.079f, 0.428f, 0.079f, 0.623f)
                arcToRelative(2.09f, 2.09f, 0.0f, false, true, -2.1f, 2.1f)
                curveToRelative(-1.011f, 0.0f, -1.83f, -0.7f, -2.063f, -1.634f)
                arcToRelative(3.388f, 3.388f, 0.0f, false, true, -0.62f, 0.077f)
                arcToRelative(2.092f, 2.092f, 0.0f, false, true, -2.102f, -2.1f)
                curveToRelative(0.0f, -1.167f, 0.934f, -2.1f, 2.101f, -2.1f)
                curveToRelative(0.234f, 0.0f, 0.427f, 0.0f, 0.621f, 0.079f)
                curveToRelative(0.234f, -0.934f, 1.052f, -1.635f, 2.063f, -1.635f)
                close()
                moveTo(7.352f, 10.387f)
                curveToRelative(-0.545f, 0.0f, -0.973f, 0.428f, -0.934f, 0.933f)
                curveToRelative(0.0f, 0.506f, 0.428f, 0.932f, 0.934f, 0.932f)
                arcToRelative(0.945f, 0.945f, 0.0f, false, false, 0.933f, -0.932f)
                arcToRelative(0.947f, 0.947f, 0.0f, false, false, -0.933f, -0.933f)
                close()
                moveTo(4.668f, 11.94f)
                arcToRelative(0.947f, 0.947f, 0.0f, false, false, -0.933f, 0.934f)
                curveToRelative(0.0f, 0.506f, 0.428f, 0.934f, 0.933f, 0.934f)
                arcToRelative(0.947f, 0.947f, 0.0f, false, false, 0.934f, -0.934f)
                arcToRelative(0.947f, 0.947f, 0.0f, false, false, -0.934f, -0.934f)
                close()
                moveTo(7.352f, 13.458f)
                arcToRelative(0.947f, 0.947f, 0.0f, false, false, -0.934f, 0.934f)
                curveToRelative(0.0f, 0.505f, 0.428f, 0.933f, 0.934f, 0.933f)
                arcToRelative(0.947f, 0.947f, 0.0f, false, false, 0.933f, -0.933f)
                arcToRelative(0.947f, 0.947f, 0.0f, false, false, -0.933f, -0.934f)
                close()
            }
        }
        .build()
        return _coppel!!
    }

private var _coppel: ImageVector? = null
