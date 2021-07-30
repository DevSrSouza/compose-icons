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

public val SimpleIcons.Thymeleaf: ImageVector
    get() {
        if (_thymeleaf != null) {
            return _thymeleaf!!
        }
        _thymeleaf = Builder(name = "Thymeleaf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.727f, 0.0f)
                curveTo(0.782f, 0.0f, 0.02f, 0.761f, 0.02f, 1.707f)
                verticalLineToRelative(20.586f)
                curveTo(0.02f, 23.24f, 0.782f, 24.0f, 1.727f, 24.0f)
                horizontalLineToRelative(20.546f)
                curveToRelative(0.945f, 0.0f, 1.707f, -0.761f, 1.707f, -1.707f)
                lineTo(23.98f, 1.707f)
                curveTo(23.98f, 0.76f, 23.218f, 0.0f, 22.273f, 0.0f)
                lineTo(1.727f, 0.0f)
                close()
                moveTo(20.441f, 3.273f)
                curveToRelative(-1.861f, 3.694f, -3.3f, 7.627f, -5.674f, 11.046f)
                curveToRelative(-1.064f, 1.574f, -2.329f, 3.163f, -4.16f, 3.86f)
                curveToRelative(-1.31f, 0.552f, -2.936f, 0.337f, -3.98f, -0.647f)
                curveToRelative(-0.628f, -0.523f, -0.54f, -1.43f, -0.173f, -2.075f)
                curveToRelative(0.96f, -1.224f, 2.34f, -2.02f, 3.59f, -2.915f)
                curveToRelative(3.842f, -2.625f, 7.446f, -5.654f, 10.397f, -9.27f)
                close()
                moveTo(18.748f, 4.523f)
                curveToRelative(-2.503f, 2.751f, -5.381f, 5.16f, -8.452f, 7.269f)
                lineToRelative(-0.003f, 0.002f)
                lineToRelative(-0.003f, 0.003f)
                curveToRelative(-1.327f, 0.979f, -2.835f, 1.824f, -3.993f, 3.114f)
                curveToRelative(-0.349f, 0.333f, -0.583f, 1.042f, -0.537f, 1.481f)
                curveToRelative(-0.622f, -1.043f, -0.8f, -2.614f, -0.257f, -3.74f)
                curveToRelative(0.526f, -1.19f, 1.742f, -1.807f, 2.876f, -2.292f)
                curveToRelative(3.757f, -1.353f, 6.695f, -2.926f, 10.369f, -5.836f)
                close()
            }
        }
        .build()
        return _thymeleaf!!
    }

private var _thymeleaf: ImageVector? = null
