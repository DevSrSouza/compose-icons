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

public val SimpleIcons.Claris: ImageVector
    get() {
        if (_claris != null) {
            return _claris!!
        }
        _claris = Builder(name = "Claris", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.56f, 0.0f)
                arcToRelative(3.34f, 3.34f, 0.0f, false, false, -0.57f, 0.043f)
                lineTo(22.947f, 12.0f)
                lineTo(10.99f, 23.957f)
                curveToRelative(0.132f, 0.022f, 0.307f, 0.043f, 0.57f, 0.043f)
                curveToRelative(6.626f, 0.0f, 12.0f, -5.375f, 12.0f, -12.0f)
                reflectiveCurveToRelative(-5.374f, -12.0f, -12.0f, -12.0f)
                close()
                moveTo(10.025f, 2.414f)
                curveTo(4.738f, 2.414f, 0.44f, 6.713f, 0.44f, 12.0f)
                reflectiveCurveToRelative(4.3f, 9.588f, 9.586f, 9.588f)
                curveToRelative(0.264f, 0.0f, 0.44f, -0.023f, 0.57f, -0.045f)
                lineTo(1.054f, 12.0f)
                lineToRelative(9.543f, -9.543f)
                arcToRelative(3.337f, 3.337f, 0.0f, false, false, -0.57f, -0.043f)
                close()
                moveTo(10.771f, 4.871f)
                curveToRelative(-0.263f, 0.0f, -0.438f, 0.021f, -0.57f, 0.043f)
                lineTo(17.287f, 12.0f)
                lineToRelative(-7.086f, 7.086f)
                curveToRelative(0.132f, 0.022f, 0.307f, 0.045f, 0.57f, 0.045f)
                curveToRelative(3.927f, 0.0f, 7.13f, -3.204f, 7.13f, -7.131f)
                reflectiveCurveToRelative(-3.203f, -7.129f, -7.13f, -7.129f)
                close()
                moveTo(10.355f, 7.305f)
                arcTo(4.701f, 4.701f, 0.0f, false, false, 5.66f, 12.0f)
                arcToRelative(4.701f, 4.701f, 0.0f, false, false, 4.695f, 4.695f)
                curveToRelative(0.264f, 0.0f, 0.44f, -0.023f, 0.57f, -0.045f)
                lineTo(6.274f, 12.0f)
                lineToRelative(4.653f, -4.65f)
                arcToRelative(3.296f, 3.296f, 0.0f, false, false, -0.57f, -0.045f)
                close()
            }
        }
        .build()
        return _claris!!
    }

private var _claris: ImageVector? = null
