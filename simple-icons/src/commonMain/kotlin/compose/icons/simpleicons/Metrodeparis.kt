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

public val SimpleIcons.Metrodeparis: ImageVector
    get() {
        if (_metrodeparis != null) {
            return _metrodeparis!!
        }
        _metrodeparis = Builder(name = "Metrodeparis", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.708f, 18.099f)
                curveToRelative(-0.202f, 0.152f, -0.44f, 0.228f, -0.714f, 0.228f)
                curveToRelative(-0.242f, 0.0f, -0.471f, -0.076f, -0.688f, -0.228f)
                curveToRelative(-0.218f, -0.152f, -0.327f, -0.373f, -0.327f, -0.66f)
                lineTo(15.979f, 9.626f)
                horizontalLineToRelative(-0.023f)
                lineToRelative(-2.984f, 6.057f)
                arcToRelative(1.453f, 1.453f, 0.0f, false, true, -0.385f, 0.505f)
                curveToRelative(-0.145f, 0.112f, -0.337f, 0.168f, -0.578f, 0.168f)
                curveToRelative(-0.24f, 0.0f, -0.433f, -0.056f, -0.577f, -0.168f)
                arcToRelative(1.442f, 1.442f, 0.0f, false, true, -0.385f, -0.505f)
                lineTo(8.063f, 9.627f)
                lineTo(8.04f, 9.627f)
                verticalLineToRelative(7.811f)
                arcToRelative(0.748f, 0.748f, 0.0f, false, true, -0.339f, 0.66f)
                arcToRelative(1.23f, 1.23f, 0.0f, false, true, -0.7f, 0.229f)
                curveToRelative(-0.275f, 0.0f, -0.508f, -0.076f, -0.702f, -0.228f)
                curveToRelative(-0.193f, -0.152f, -0.29f, -0.373f, -0.29f, -0.66f)
                lineTo(6.009f, 6.958f)
                curveToRelative(0.0f, -0.304f, 0.096f, -0.589f, 0.29f, -0.853f)
                curveToRelative(0.192f, -0.264f, 0.537f, -0.396f, 1.036f, -0.396f)
                curveToRelative(0.37f, 0.0f, 0.655f, 0.084f, 0.856f, 0.252f)
                curveToRelative(0.2f, 0.169f, 0.38f, 0.421f, 0.542f, 0.757f)
                lineToRelative(3.277f, 6.754f)
                horizontalLineToRelative(0.024f)
                lineToRelative(3.253f, -6.754f)
                curveToRelative(0.16f, -0.336f, 0.342f, -0.588f, 0.543f, -0.757f)
                curveToRelative(0.2f, -0.168f, 0.485f, -0.252f, 0.855f, -0.252f)
                curveToRelative(0.498f, 0.0f, 0.844f, 0.132f, 1.036f, 0.396f)
                curveToRelative(0.193f, 0.265f, 0.29f, 0.55f, 0.29f, 0.854f)
                verticalLineToRelative(10.478f)
                curveToRelative(0.0f, 0.288f, -0.101f, 0.509f, -0.302f, 0.66f)
                close()
                moveTo(11.976f, 22.255f)
                curveToRelative(5.658f, 0.0f, 10.279f, -4.64f, 10.279f, -10.327f)
                curveToRelative(0.0f, -5.62f, -4.603f, -10.183f, -10.279f, -10.183f)
                curveToRelative(-5.674f, 0.0f, -10.23f, 4.536f, -10.23f, 10.183f)
                curveToRelative(0.0f, 5.59f, 4.715f, 10.327f, 10.23f, 10.327f)
                close()
                moveTo(11.976f, 24.0f)
                curveTo(5.495f, 24.0f, 0.0f, 18.48f, 0.0f, 11.928f)
                curveTo(0.0f, 5.315f, 5.34f, 0.0f, 11.976f, 0.0f)
                curveTo(18.613f, 0.0f, 24.0f, 5.34f, 24.0f, 11.928f)
                curveTo(24.0f, 18.577f, 18.6f, 24.0f, 11.976f, 24.0f)
                close()
            }
        }
        .build()
        return _metrodeparis!!
    }

private var _metrodeparis: ImageVector? = null
