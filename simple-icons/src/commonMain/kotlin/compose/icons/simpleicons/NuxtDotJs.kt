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

public val SimpleIcons.Nuxtdotjs: ImageVector
    get() {
        if (_nuxtdotjs != null) {
            return _nuxtdotjs!!
        }
        _nuxtdotjs = Builder(name = "Nuxtdotjs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.078f, 3.965f)
                curveToRelative(-0.588f, 0.0f, -1.177f, 0.289f, -1.514f, 0.867f)
                lineTo(0.236f, 17.433f)
                curveToRelative(-0.672f, 1.156f, 0.17f, 2.601f, 1.514f, 2.601f)
                horizontalLineToRelative(5.72f)
                arcToRelative(1.676f, 1.676f, 0.0f, false, true, -0.35f, -2.117f)
                lineToRelative(5.547f, -9.513f)
                lineToRelative(-2.076f, -3.572f)
                arcToRelative(1.734f, 1.734f, 0.0f, false, false, -1.513f, -0.867f)
                close()
                moveTo(16.485f, 6.887f)
                curveToRelative(-0.487f, 0.0f, -0.973f, 0.236f, -1.252f, 0.709f)
                lineTo(9.17f, 17.906f)
                curveToRelative(-0.557f, 0.945f, 0.138f, 2.13f, 1.251f, 2.13f)
                horizontalLineToRelative(12.13f)
                curveToRelative(1.114f, 0.0f, 1.81f, -1.185f, 1.253f, -2.13f)
                lineToRelative(-6.067f, -10.31f)
                arcToRelative(1.437f, 1.437f, 0.0f, false, false, -1.252f, -0.71f)
                close()
            }
        }
        .build()
        return _nuxtdotjs!!
    }

private var _nuxtdotjs: ImageVector? = null
