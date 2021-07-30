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
                moveTo(0.0f, 1.6416f)
                verticalLineToRelative(20.7168f)
                horizontalLineToRelative(8.5156f)
                curveToRelative(1.3133f, 0.0f, 2.4886f, -0.1588f, 3.5371f, -0.4766f)
                curveToRelative(1.038f, -0.3177f, 1.9716f, -0.7833f, 2.7871f, -1.4082f)
                curveToRelative(1.1545f, -0.8896f, 2.0431f, -2.0456f, 2.668f, -3.4648f)
                curveToRelative(0.6143f, -1.4192f, 0.9316f, -3.0486f, 0.9316f, -4.8809f)
                curveToRelative(-0.0105f, -1.578f, -0.243f, -3.0203f, -0.709f, -4.3125f)
                curveToRelative(-0.466f, -1.2921f, -1.1116f, -2.3919f, -1.959f, -3.3027f)
                curveToRelative(-0.8366f, -0.9109f, -1.8536f, -1.6108f, -3.0292f, -2.1191f)
                curveToRelative(-1.1757f, -0.4979f, -2.4784f, -0.752f, -3.9082f, -0.752f)
                close()
                moveTo(5.2012f, 7.3506f)
                lineToRelative(8.039f, 4.6601f)
                lineToRelative(-8.039f, 4.6485f)
                close()
                moveTo(21.1934f, 16.5126f)
                curveToRelative(-1.4934f, 0.0f, -2.711f, 1.2177f, -2.711f, 2.711f)
                curveToRelative(0.0f, 1.4934f, 1.2176f, 2.711f, 2.711f, 2.711f)
                horizontalLineToRelative(0.0957f)
                curveToRelative(1.4933f, 0.0f, 2.7109f, -1.2176f, 2.7109f, -2.711f)
                curveToRelative(0.0f, -1.4933f, -1.2176f, -2.711f, -2.711f, -2.711f)
                close()
            }
        }
        .build()
        return _dtube!!
    }

private var _dtube: ImageVector? = null
