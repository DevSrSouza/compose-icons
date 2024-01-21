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

public val SimpleIcons.Mixpanel: ImageVector
    get() {
        if (_mixpanel != null) {
            return _mixpanel!!
        }
        _mixpanel = Builder(name = "Mixpanel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.967f, 9.996f)
                horizontalLineToRelative(3.053f)
                curveToRelative(-0.763f, -0.477f, -1.048f, -1.145f, -1.431f, -2.384f)
                lineTo(7.443f, 3.366f)
                curveTo(6.919f, 1.458f, 6.49f, 0.551f, 4.39f, 0.551f)
                lineTo(0.004f, 0.551f)
                verticalLineToRelative(1.145f)
                horizontalLineToRelative(0.621f)
                curveToRelative(1.286f, 0.0f, 1.431f, 0.477f, 1.814f, 1.908f)
                lineTo(3.44f, 7.326f)
                curveToRelative(0.524f, 1.814f, 1.337f, 2.67f, 3.53f, 2.67f)
                horizontalLineToRelative(-0.003f)
                close()
                moveTo(14.027f, 9.996f)
                horizontalLineToRelative(3.053f)
                curveToRelative(2.194f, 0.0f, 2.956f, -0.86f, 3.484f, -2.67f)
                lineToRelative(1.001f, -3.722f)
                curveToRelative(0.382f, -1.431f, 0.57f, -1.908f, 1.814f, -1.908f)
                lineTo(24.0f, 1.696f)
                lineTo(24.0f, 0.551f)
                horizontalLineToRelative(-4.34f)
                curveToRelative(-2.146f, 0.0f, -2.576f, 0.86f, -3.053f, 2.815f)
                lineToRelative(-1.145f, 4.246f)
                curveToRelative(-0.384f, 1.286f, -0.673f, 1.907f, -1.435f, 2.384f)
                close()
                moveTo(10.02f, 14.004f)
                horizontalLineToRelative(4.007f)
                lineTo(14.027f, 9.996f)
                lineTo(10.02f, 9.996f)
                verticalLineToRelative(4.008f)
                close()
                moveTo(0.0f, 23.449f)
                horizontalLineToRelative(4.39f)
                curveToRelative(2.1f, 0.0f, 2.529f, -0.907f, 3.053f, -2.815f)
                lineToRelative(1.146f, -4.246f)
                curveToRelative(0.383f, -1.239f, 0.668f, -1.907f, 1.431f, -2.384f)
                lineTo(6.967f, 14.004f)
                curveToRelative(-2.194f, 0.0f, -3.007f, 0.86f, -3.531f, 2.67f)
                lineToRelative(-1.001f, 3.722f)
                curveToRelative(-0.383f, 1.431f, -0.524f, 1.907f, -1.814f, 1.907f)
                lineTo(0.0f, 22.303f)
                verticalLineToRelative(1.146f)
                close()
                moveTo(19.65f, 23.449f)
                horizontalLineToRelative(4.343f)
                verticalLineToRelative(-1.146f)
                horizontalLineToRelative(-0.622f)
                curveToRelative(-1.239f, 0.0f, -1.431f, -0.476f, -1.814f, -1.907f)
                lineToRelative(-1.001f, -3.722f)
                curveToRelative(-0.524f, -1.814f, -1.286f, -2.67f, -3.483f, -2.67f)
                horizontalLineToRelative(-3.046f)
                curveToRelative(0.762f, 0.477f, 1.041f, 1.098f, 1.424f, 2.384f)
                lineToRelative(1.145f, 4.246f)
                curveToRelative(0.477f, 1.955f, 0.907f, 2.815f, 3.054f, 2.815f)
                close()
            }
        }
        .build()
        return _mixpanel!!
    }

private var _mixpanel: ImageVector? = null
