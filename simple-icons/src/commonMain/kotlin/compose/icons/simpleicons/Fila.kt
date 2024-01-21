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
                moveTo(8.814f, 8.027f)
                curveToRelative(-0.614f, 0.0f, -1.113f, 0.498f, -1.113f, 1.113f)
                verticalLineToRelative(5.72f)
                arcToRelative(1.113f, 1.113f, 0.0f, false, false, 2.226f, 0.0f)
                verticalLineTo(9.14f)
                curveToRelative(0.0f, -0.614f, -0.498f, -1.113f, -1.113f, -1.113f)
                moveToRelative(-2.849f, 0.078f)
                horizontalLineTo(1.113f)
                arcToRelative(1.113f, 1.113f, 0.0f, false, false, 0.0f, 2.226f)
                horizontalLineToRelative(4.852f)
                arcToRelative(1.113f, 1.113f, 0.0f, false, false, 0.0f, -2.226f)
                moveToRelative(17.411f, 4.417f)
                lineTo(21.03f, 8.705f)
                curveToRelative(-0.275f, -0.444f, -0.65f, -0.658f, -1.125f, -0.658f)
                curveToRelative(-0.488f, 0.0f, -0.904f, 0.229f, -1.162f, 0.658f)
                lineToRelative(-2.715f, 4.5f)
                curveToRelative(-0.186f, 0.308f, -0.4f, 0.436f, -0.753f, 0.436f)
                horizontalLineToRelative(-2.019f)
                arcToRelative(0.275f, 0.275f, 0.0f, false, true, -0.285f, -0.284f)
                verticalLineTo(9.102f)
                curveToRelative(0.0f, -0.613f, -0.497f, -1.075f, -1.11f, -1.075f)
                curveToRelative(-0.614f, 0.0f, -1.11f, 0.463f, -1.11f, 1.076f)
                verticalLineToRelative(5.215f)
                curveToRelative(0.0f, 0.784f, 0.774f, 1.544f, 1.544f, 1.544f)
                horizontalLineToRelative(4.064f)
                curveToRelative(0.576f, 0.0f, 0.963f, -0.42f, 1.292f, -0.996f)
                lineToRelative(2.114f, -3.627f)
                curveToRelative(0.018f, -0.04f, 0.053f, -0.091f, 0.093f, -0.091f)
                curveToRelative(0.043f, 0.0f, 0.07f, 0.051f, 0.091f, 0.088f)
                lineToRelative(1.384f, 2.22f)
                curveToRelative(0.058f, 0.094f, 0.069f, 0.141f, 0.032f, 0.225f)
                curveToRelative(-0.033f, 0.077f, -0.108f, 0.093f, -0.23f, 0.093f)
                horizontalLineToRelative(-1.943f)
                arcToRelative(1.044f, 1.044f, 0.0f, true, false, 0.0f, 2.088f)
                horizontalLineToRelative(3.17f)
                curveToRelative(0.77f, 0.0f, 1.638f, -0.734f, 1.638f, -1.693f)
                curveToRelative(0.0f, -0.608f, -0.117f, -0.822f, -0.624f, -1.647f)
                moveTo(5.431f, 10.954f)
                horizontalLineTo(1.113f)
                curveToRelative(-0.615f, 0.0f, -1.113f, 0.498f, -1.113f, 1.113f)
                verticalLineToRelative(2.715f)
                arcToRelative(1.113f, 1.113f, 0.0f, true, false, 2.226f, 0.0f)
                verticalLineToRelative(-1.268f)
                curveToRelative(0.0f, -0.185f, 0.15f, -0.334f, 0.334f, -0.334f)
                horizontalLineToRelative(2.87f)
                arcToRelative(1.113f, 1.113f, 0.0f, false, false, 0.0f, -2.226f)
            }
        }
        .build()
        return _fila!!
    }

private var _fila: ImageVector? = null
