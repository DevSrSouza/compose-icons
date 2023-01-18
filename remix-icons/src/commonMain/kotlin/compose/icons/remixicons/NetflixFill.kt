package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.NetflixFill: ImageVector
    get() {
        if (_netflixFill != null) {
            return _netflixFill!!
        }
        _netflixFill = Builder(name = "NetflixFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.29f, 3.814f)
                lineToRelative(2.02f, 5.707f)
                lineToRelative(0.395f, 1.116f)
                lineToRelative(0.007f, -4.81f)
                lineToRelative(0.01f, -4.818f)
                horizontalLineToRelative(4.27f)
                lineTo(18.0f, 11.871f)
                curveToRelative(0.003f, 5.98f, -0.003f, 10.89f, -0.015f, 10.9f)
                curveToRelative(-0.012f, 0.009f, -0.209f, 0.0f, -0.436f, -0.027f)
                curveToRelative(-0.989f, -0.118f, -2.29f, -0.236f, -3.34f, -0.282f)
                arcToRelative(14.57f, 14.57f, 0.0f, false, true, -0.636f, -0.038f)
                curveToRelative(-0.003f, -0.004f, -0.273f, -0.762f, -0.776f, -2.184f)
                verticalLineToRelative(-0.004f)
                lineToRelative(-2.144f, -6.061f)
                lineToRelative(-0.34f, -0.954f)
                lineToRelative(-0.008f, 4.586f)
                curveToRelative(-0.006f, 4.365f, -0.01f, 4.61f, -0.057f, 4.61f)
                curveToRelative(-0.163f, 0.0f, -1.57f, 0.09f, -2.04f, 0.136f)
                curveToRelative(-0.308f, 0.027f, -0.926f, 0.09f, -1.37f, 0.145f)
                curveToRelative(-0.446f, 0.051f, -0.816f, 0.085f, -0.823f, 0.078f)
                curveTo(6.006f, 22.77f, 6.0f, 17.867f, 6.0f, 11.883f)
                verticalLineTo(1.002f)
                horizontalLineToRelative(0.005f)
                verticalLineTo(1.0f)
                horizontalLineToRelative(4.288f)
                lineToRelative(0.028f, 0.08f)
                curveToRelative(0.007f, 0.016f, 0.065f, 0.176f, 0.157f, 0.437f)
                lineToRelative(0.641f, 1.778f)
                lineToRelative(0.173f, 0.496f)
                lineToRelative(-0.001f, 0.023f)
                close()
            }
        }
        .build()
        return _netflixFill!!
    }

private var _netflixFill: ImageVector? = null
