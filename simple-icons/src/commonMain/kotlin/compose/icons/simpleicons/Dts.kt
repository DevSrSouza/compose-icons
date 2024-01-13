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

public val SimpleIcons.Dts: ImageVector
    get() {
        if (_dts != null) {
            return _dts!!
        }
        _dts = Builder(name = "Dts", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.556f, 14.346f)
                lineToRelative(-1.194f, -1.173f)
                arcToRelative(0.841f, 0.841f, 0.0f, false, true, 0.604f, -1.445f)
                horizontalLineToRelative(0.59f)
                arcToRelative(0.346f, 0.346f, 0.0f, false, false, 0.349f, -0.343f)
                verticalLineToRelative(-0.636f)
                horizontalLineTo(18.97f)
                arcToRelative(1.492f, 1.492f, 0.0f, false, false, -1.507f, 1.477f)
                verticalLineToRelative(0.003f)
                curveToRelative(0.0f, 0.396f, 0.16f, 0.775f, 0.444f, 1.05f)
                lineToRelative(1.201f, 1.18f)
                arcToRelative(0.841f, 0.841f, 0.0f, false, true, -0.604f, 1.446f)
                horizontalLineToRelative(-1.849f)
                arcToRelative(1.306f, 1.306f, 0.0f, false, true, -1.317f, -1.294f)
                verticalLineToRelative(-2.876f)
                horizontalLineToRelative(1.135f)
                arcToRelative(0.346f, 0.346f, 0.0f, false, false, 0.35f, -0.343f)
                verticalLineToRelative(-0.636f)
                horizontalLineToRelative(-1.485f)
                verticalLineTo(7.587f)
                lineToRelative(-3.866f, 1.66f)
                verticalLineToRelative(1.494f)
                horizontalLineToRelative(-1.87f)
                verticalLineTo(7.123f)
                horizontalLineToRelative(-2.87f)
                arcToRelative(0.986f, 0.986f, 0.0f, false, false, -0.997f, 0.98f)
                verticalLineToRelative(2.638f)
                horizontalLineTo(3.67f)
                curveTo(1.514f, 10.741f, 0.0f, 11.893f, 0.0f, 13.81f)
                curveToRelative(0.0f, 1.71f, 1.776f, 3.068f, 3.676f, 3.068f)
                horizontalLineToRelative(4.615f)
                arcToRelative(1.306f, 1.306f, 0.0f, false, false, 1.318f, -1.294f)
                verticalLineToRelative(-3.855f)
                horizontalLineToRelative(1.863f)
                verticalLineToRelative(2.503f)
                curveToRelative(0.0f, 1.423f, 0.874f, 2.646f, 2.65f, 2.646f)
                horizontalLineToRelative(8.371f)
                arcTo(1.492f, 1.492f, 0.0f, false, false, 24.0f, 15.4f)
                verticalLineToRelative(-0.003f)
                arcToRelative(1.444f, 1.444f, 0.0f, false, false, -0.444f, -1.051f)
                close()
                moveTo(5.729f, 15.683f)
                arcToRelative(0.217f, 0.217f, 0.0f, false, true, -0.219f, 0.214f)
                horizontalLineToRelative(-0.13f)
                curveToRelative(-1.34f, 0.0f, -1.835f, -0.908f, -1.85f, -2.088f)
                curveToRelative(0.015f, -1.216f, 0.525f, -2.088f, 1.85f, -2.088f)
                horizontalLineToRelative(0.349f)
                verticalLineToRelative(3.962f)
                close()
            }
        }
        .build()
        return _dts!!
    }

private var _dts: ImageVector? = null
