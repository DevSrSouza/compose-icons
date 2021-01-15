package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Allocine: ImageVector
    get() {
        if (_allocine != null) {
            return _allocine!!
        }
        _allocine = Builder(name = "Allocine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.447f, 21.162f)
                lineTo(17.207f, 0.695f)
                arcToRelative(0.815f, 0.815f, 0.0f, false, false, -0.926f, -0.686f)
                horizontalLineToRelative(-0.004f)
                lineToRelative(-3.42f, 0.551f)
                arcToRelative(2.632f, 2.632f, 0.0f, false, true, -5.199f, 0.824f)
                lineToRelative(-3.42f, 0.542f)
                arcToRelative(0.815f, 0.815f, 0.0f, false, false, -0.687f, 0.926f)
                verticalLineToRelative(0.003f)
                lineToRelative(3.244f, 20.458f)
                curveToRelative(0.069f, 0.443f, 0.484f, 0.746f, 0.928f, 0.677f)
                horizontalLineToRelative(0.001f)
                lineToRelative(3.421f, -0.542f)
                arcToRelative(2.636f, 2.636f, 0.0f, true, true, 5.208f, -0.815f)
                lineToRelative(3.42f, -0.541f)
                arcToRelative(0.81f, 0.81f, 0.0f, false, false, 0.675f, -0.925f)
                verticalLineToRelative(-0.005f)
                close()
                moveTo(14.77f, 8.21f)
                lineToRelative(-1.23f, 1.805f)
                arcToRelative(0.854f, 0.854f, 0.0f, false, true, -0.433f, 0.3f)
                curveToRelative(-0.509f, 0.12f, -1.249f, -0.962f, -1.772f, 1.505f)
                curveToRelative(-0.524f, 2.467f, 0.592f, 1.784f, 1.004f, 2.106f)
                arcToRelative(0.875f, 0.875f, 0.0f, false, true, 0.283f, 0.436f)
                lineToRelative(0.394f, 2.142f)
                horizontalLineToRelative(-0.012f)
                arcToRelative(0.602f, 0.602f, 0.0f, false, true, -0.343f, 0.644f)
                curveToRelative(-0.454f, 0.183f, -1.167f, 0.427f, -1.588f, 0.337f)
                curveToRelative(-0.903f, -0.193f, -2.338f, -2.428f, -1.562f, -6.072f)
                curveToRelative(0.777f, -3.643f, 2.994f, -5.078f, 3.896f, -4.885f)
                curveToRelative(0.413f, 0.09f, 0.972f, 0.601f, 1.315f, 0.953f)
                arcToRelative(0.602f, 0.602f, 0.0f, false, true, 0.048f, 0.729f)
                close()
            }
        }
        .build()
        return _allocine!!
    }

private var _allocine: ImageVector? = null
