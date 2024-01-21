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

public val SimpleIcons.Eclipsevertdotx: ImageVector
    get() {
        if (_eclipsevertdotx != null) {
            return _eclipsevertdotx!!
        }
        _eclipsevertdotx = Builder(name = "Eclipsevertdotx", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.356f, 0.01f)
                curveTo(1.566f, 0.01f, 0.027f, 1.269f, 0.0f, 2.938f)
                verticalLineToRelative(1.436f)
                horizontalLineToRelative(2.515f)
                lineToRelative(3.861f, 8.896f)
                lineToRelative(4.028f, -8.791f)
                horizontalLineToRelative(5.078f)
                lineToRelative(2.182f, 3.986f)
                lineToRelative(2.56f, -3.986f)
                lineTo(24.0f, 4.479f)
                lineTo(24.0f, 2.946f)
                curveTo(24.0f, 1.281f, 22.44f, 0.011f, 20.645f, 0.011f)
                close()
                moveTo(24.0f, 5.668f)
                lineToRelative(-8.874f, 13.56f)
                lineTo(12.44f, 19.228f)
                curveToRelative(-0.02f, -0.629f, -0.188f, -1.237f, -0.503f, -1.74f)
                lineToRelative(3.609f, -5.708f)
                lineToRelative(-2.744f, -4.36f)
                lineToRelative(-3.829f, 8.42f)
                lineToRelative(-0.036f, -0.002f)
                arcToRelative(3.443f, 3.443f, 0.0f, false, false, -3.434f, 3.433f)
                curveToRelative(0.0f, 0.021f, 0.003f, 0.042f, 0.004f, 0.063f)
                horizontalLineToRelative(-0.263f)
                lineTo(0.0f, 7.5f)
                verticalLineToRelative(13.553f)
                curveToRelative(0.0f, 1.665f, 1.56f, 2.935f, 3.356f, 2.935f)
                horizontalLineToRelative(17.289f)
                curveToRelative(1.812f, 0.0f, 3.355f, -1.276f, 3.355f, -2.935f)
                verticalLineToRelative(-1.826f)
                horizontalLineToRelative(-3.587f)
                lineToRelative(-1.594f, -2.874f)
                lineToRelative(2.224f, -3.378f)
                lineTo(24.0f, 17.638f)
                close()
                moveTo(8.934f, 17.168f)
                arcToRelative(2.102f, 2.102f, 0.0f, false, true, 2.109f, 2.103f)
                arcToRelative(2.106f, 2.106f, 0.0f, true, true, -4.212f, 0.0f)
                curveToRelative(0.0f, -1.16f, 0.937f, -2.1f, 2.103f, -2.103f)
                close()
            }
        }
        .build()
        return _eclipsevertdotx!!
    }

private var _eclipsevertdotx: ImageVector? = null
