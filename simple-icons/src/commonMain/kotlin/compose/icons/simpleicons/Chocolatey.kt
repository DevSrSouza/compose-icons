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

public val SimpleIcons.Chocolatey: ImageVector
    get() {
        if (_chocolatey != null) {
            return _chocolatey!!
        }
        _chocolatey = Builder(name = "Chocolatey", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 1.249f)
                lineToRelative(1.439f, 3.18f)
                lineTo(0.0f, 6.926f)
                lineToRelative(1.439f, 2.5f)
                lineTo(0.0f, 11.923f)
                lineToRelative(1.439f, 2.424f)
                lineTo(0.0f, 16.845f)
                lineToRelative(1.439f, 2.5f)
                lineTo(0.0f, 22.75f)
                lineToRelative(2.8f, -0.91f)
                curveToRelative(6.3f, 0.01f, 12.696f, 0.006f, 18.096f, 0.0f)
                lineToRelative(3.104f, 0.91f)
                lineToRelative(-2.044f, -3.635f)
                lineToRelative(1.136f, -1.892f)
                lineToRelative(-2.196f, -2.272f)
                lineToRelative(-0.004f, -0.017f)
                lineTo(20.892f, 2.005f)
                curveToRelative(-6.551f, -0.001f, -12.243f, 0.0f, -18.091f, 0.0f)
                close()
                moveTo(19.688f, 3.217f)
                verticalLineToRelative(7.03f)
                lineToRelative(-0.23f, -0.898f)
                lineToRelative(-1.438f, -4.39f)
                lineToRelative(-3.56f, 0.605f)
                lineToRelative(-1.89f, -2.343f)
                close()
                moveTo(7.993f, 3.221f)
                horizontalLineToRelative(4.563f)
                lineTo(9.539f, 4.428f)
                close()
                moveTo(10.853f, 6.901f)
                arcToRelative(3.903f, 3.903f, 0.0f, false, true, 1.64f, 0.254f)
                curveToRelative(1.968f, 0.757f, 1.286f, 2.8f, 0.15f, 4.012f)
                curveToRelative(-0.378f, 0.378f, -1.21f, 0.227f, -0.605f, -0.908f)
                curveToRelative(0.228f, -0.454f, 0.454f, -1.363f, -0.227f, -1.59f)
                curveToRelative(-1.515f, -0.53f, -3.255f, 0.682f, -3.634f, 2.271f)
                curveToRelative(-0.378f, 1.363f, 0.606f, 2.801f, 2.347f, 2.423f)
                curveToRelative(1.439f, -0.303f, 2.802f, -1.288f, 3.332f, -1.742f)
                curveToRelative(0.53f, -0.455f, 0.907f, 0.38f, 0.301f, 1.288f)
                curveToRelative(-0.68f, 0.908f, -1.74f, 1.968f, -2.65f, 2.574f)
                curveToRelative(-3.558f, 2.423f, -6.662f, -0.758f, -5.375f, -4.392f)
                curveToRelative(0.677f, -1.845f, 2.454f, -4.041f, 4.72f, -4.19f)
                close()
                moveTo(17.38f, 8.932f)
                arcToRelative(0.66f, 0.66f, 0.0f, false, true, 0.454f, 0.182f)
                curveToRelative(0.324f, 0.326f, 0.204f, 0.972f, -0.268f, 1.445f)
                curveToRelative(-0.473f, 0.474f, -1.121f, 0.593f, -1.446f, 0.268f)
                curveToRelative(-0.325f, -0.326f, -0.205f, -0.972f, 0.267f, -1.445f)
                curveToRelative(0.292f, -0.292f, 0.666f, -0.461f, 0.993f, -0.45f)
                close()
                moveTo(16.96f, 12.165f)
                arcToRelative(0.66f, 0.66f, 0.0f, false, true, 0.454f, 0.182f)
                curveToRelative(0.325f, 0.325f, 0.206f, 0.973f, -0.268f, 1.446f)
                curveToRelative(-0.473f, 0.473f, -1.12f, 0.592f, -1.445f, 0.268f)
                curveToRelative(-0.324f, -0.326f, -0.205f, -0.972f, 0.268f, -1.445f)
                curveToRelative(0.291f, -0.292f, 0.664f, -0.462f, 0.99f, -0.451f)
                close()
            }
        }
        .build()
        return _chocolatey!!
    }

private var _chocolatey: ImageVector? = null
