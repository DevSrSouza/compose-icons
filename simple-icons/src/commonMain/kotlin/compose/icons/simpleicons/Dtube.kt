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

public val SimpleIcons.Dtube: ImageVector
    get() {
        if (_dtube != null) {
            return _dtube!!
        }
        _dtube = Builder(name = "Dtube", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 1.642f)
                verticalLineToRelative(20.717f)
                horizontalLineToRelative(8.516f)
                curveToRelative(1.313f, 0.0f, 2.489f, -0.159f, 3.537f, -0.477f)
                curveToRelative(1.038f, -0.318f, 1.972f, -0.783f, 2.787f, -1.408f)
                curveToRelative(1.155f, -0.89f, 2.043f, -2.046f, 2.668f, -3.465f)
                curveToRelative(0.614f, -1.419f, 0.932f, -3.049f, 0.932f, -4.881f)
                curveToRelative(-0.01f, -1.578f, -0.243f, -3.02f, -0.709f, -4.313f)
                curveToRelative(-0.466f, -1.292f, -1.112f, -2.392f, -1.959f, -3.303f)
                curveToRelative(-0.837f, -0.911f, -1.854f, -1.611f, -3.029f, -2.119f)
                curveToRelative(-1.176f, -0.498f, -2.478f, -0.752f, -3.908f, -0.752f)
                close()
                moveTo(5.201f, 7.351f)
                lineToRelative(8.039f, 4.66f)
                lineToRelative(-8.039f, 4.648f)
                close()
                moveTo(21.193f, 16.513f)
                curveToRelative(-1.493f, 0.0f, -2.711f, 1.218f, -2.711f, 2.711f)
                curveToRelative(0.0f, 1.493f, 1.218f, 2.711f, 2.711f, 2.711f)
                horizontalLineToRelative(0.096f)
                curveToRelative(1.493f, 0.0f, 2.711f, -1.218f, 2.711f, -2.711f)
                curveToRelative(0.0f, -1.493f, -1.218f, -2.711f, -2.711f, -2.711f)
                close()
            }
        }
        .build()
        return _dtube!!
    }

private var _dtube: ImageVector? = null
