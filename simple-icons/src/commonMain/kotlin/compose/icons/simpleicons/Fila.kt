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

public val SimpleIcons.Fila: ImageVector
    get() {
        if (_fila != null) {
            return _fila!!
        }
        _fila = Builder(name = "Fila", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.736f, 8.048f)
                curveToRelative(-0.582f, 0.0f, -1.035f, 0.471f, -1.035f, 1.054f)
                lineToRelative(0.023f, 5.795f)
                curveToRelative(0.0f, 0.582f, 0.445f, 1.054f, 1.029f, 1.054f)
                horizontalLineToRelative(0.12f)
                curveToRelative(0.583f, 0.0f, 1.054f, -0.472f, 1.054f, -1.054f)
                lineToRelative(-0.023f, -5.795f)
                curveToRelative(0.0f, -0.583f, -0.472f, -1.054f, -1.055f, -1.054f)
                close()
                moveTo(11.807f, 8.055f)
                curveToRelative(-0.574f, 0.0f, -1.04f, 0.468f, -1.04f, 1.044f)
                verticalLineToRelative(5.24f)
                curveToRelative(0.0f, 0.785f, 0.773f, 1.542f, 1.541f, 1.542f)
                horizontalLineToRelative(4.058f)
                curveToRelative(0.577f, 0.0f, 0.965f, -0.42f, 1.292f, -0.995f)
                lineToRelative(2.112f, -3.622f)
                curveToRelative(0.018f, -0.04f, 0.053f, -0.09f, 0.093f, -0.09f)
                curveToRelative(0.044f, 0.0f, 0.07f, 0.05f, 0.092f, 0.088f)
                lineToRelative(1.381f, 2.216f)
                curveToRelative(0.058f, 0.094f, 0.068f, 0.141f, 0.032f, 0.225f)
                curveToRelative(-0.032f, 0.077f, -0.109f, 0.093f, -0.23f, 0.093f)
                horizontalLineToRelative(-1.939f)
                curveToRelative(-0.578f, 0.0f, -1.044f, 0.467f, -1.044f, 1.044f)
                verticalLineToRelative(0.065f)
                curveToRelative(0.0f, 0.577f, 0.466f, 0.976f, 1.044f, 0.976f)
                horizontalLineToRelative(3.163f)
                curveToRelative(0.77f, 0.0f, 1.638f, -0.732f, 1.638f, -1.69f)
                curveToRelative(0.0f, -0.607f, -0.118f, -0.822f, -0.624f, -1.645f)
                lineToRelative(-2.342f, -3.814f)
                curveToRelative(-0.275f, -0.442f, -0.65f, -0.656f, -1.123f, -0.656f)
                curveToRelative(-0.49f, 0.0f, -0.904f, 0.229f, -1.163f, 0.656f)
                lineToRelative(-2.712f, 4.496f)
                curveToRelative(-0.185f, 0.308f, -0.398f, 0.434f, -0.75f, 0.434f)
                horizontalLineToRelative(-2.018f)
                arcToRelative(0.275f, 0.275f, 0.0f, false, true, -0.285f, -0.283f)
                lineToRelative(0.002f, -4.28f)
                curveToRelative(0.0f, -0.576f, -0.468f, -1.044f, -1.044f, -1.044f)
                close()
                moveTo(1.055f, 8.198f)
                curveTo(0.473f, 8.198f, 0.0f, 8.644f, 0.0f, 9.226f)
                lineTo(0.0f, 9.3f)
                curveToRelative(0.0f, 0.584f, 0.473f, 1.055f, 1.055f, 1.055f)
                lineTo(5.99f, 10.355f)
                curveToRelative(0.581f, 0.0f, 1.055f, -0.471f, 1.055f, -1.055f)
                verticalLineToRelative(-0.066f)
                arcTo(1.04f, 1.04f, 0.0f, false, false, 5.99f, 8.198f)
                close()
                moveTo(1.242f, 11.017f)
                curveToRelative(-0.724f, 0.0f, -1.241f, 0.568f, -1.241f, 1.241f)
                lineTo(0.0f, 14.91f)
                curveToRelative(0.0f, 0.577f, 0.467f, 1.042f, 1.042f, 1.042f)
                horizontalLineToRelative(0.134f)
                arcToRelative(1.04f, 1.04f, 0.0f, false, false, 1.042f, -1.042f)
                verticalLineToRelative(-1.458f)
                curveToRelative(0.0f, -0.157f, 0.126f, -0.284f, 0.283f, -0.284f)
                lineTo(5.48f, 13.168f)
                curveToRelative(0.575f, 0.0f, 1.043f, -0.465f, 1.043f, -1.042f)
                verticalLineToRelative(-0.066f)
                curveToRelative(0.0f, -0.576f, -0.468f, -1.043f, -1.043f, -1.043f)
                close()
            }
        }
        .build()
        return _fila!!
    }

private var _fila: ImageVector? = null
