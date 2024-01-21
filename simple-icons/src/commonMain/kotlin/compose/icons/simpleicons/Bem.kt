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

public val SimpleIcons.Bem: ImageVector
    get() {
        if (_bem != null) {
            return _bem!!
        }
        _bem = Builder(name = "Bem", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 5.163f)
                horizontalLineToRelative(5.61f)
                verticalLineToRelative(1.65f)
                lineTo(0.0f, 6.813f)
                close()
                moveTo(0.0f, 2.098f)
                horizontalLineToRelative(5.61f)
                verticalLineToRelative(1.65f)
                lineTo(0.0f, 3.748f)
                close()
                moveTo(10.067f, 8.204f)
                lineTo(0.0f, 8.204f)
                verticalLineToRelative(1.65f)
                horizontalLineToRelative(9.69f)
                curveToRelative(1.06f, 0.0f, 3.536f, 0.024f, 4.455f, 1.51f)
                verticalLineToRelative(-0.92f)
                curveToRelative(-0.448f, -1.462f, -1.768f, -2.24f, -4.078f, -2.24f)
                close()
                moveTo(10.09f, 11.269f)
                lineTo(0.0f, 11.269f)
                verticalLineToRelative(1.65f)
                horizontalLineToRelative(9.69f)
                curveToRelative(2.357f, 0.0f, 3.842f, 0.095f, 4.455f, 0.425f)
                verticalLineToRelative(-0.731f)
                curveToRelative(-0.471f, -1.155f, -2.451f, -1.344f, -4.055f, -1.344f)
                close()
                moveTo(10.067f, 19.049f)
                lineTo(0.0f, 19.049f)
                lineTo(0.0f, 17.4f)
                horizontalLineToRelative(9.69f)
                curveToRelative(1.06f, 0.0f, 3.536f, -0.024f, 4.455f, -1.509f)
                verticalLineToRelative(0.92f)
                curveToRelative(-0.448f, 1.461f, -1.768f, 2.24f, -4.078f, 2.24f)
                close()
                moveTo(10.09f, 15.984f)
                lineTo(0.0f, 15.984f)
                verticalLineToRelative(-1.65f)
                horizontalLineToRelative(9.69f)
                curveToRelative(2.357f, 0.0f, 3.842f, -0.094f, 4.455f, -0.424f)
                verticalLineToRelative(0.73f)
                curveToRelative(-0.471f, 1.156f, -2.451f, 1.344f, -4.055f, 1.344f)
                close()
                moveTo(16.597f, 21.902f)
                lineTo(24.0f, 21.902f)
                verticalLineToRelative(-1.014f)
                horizontalLineToRelative(-7.19f)
                curveToRelative(-0.637f, 0.0f, -2.146f, -0.023f, -2.688f, -0.896f)
                verticalLineToRelative(0.566f)
                curveToRelative(0.26f, 0.872f, 1.06f, 1.344f, 2.475f, 1.344f)
                close()
                moveTo(16.574f, 20.039f)
                horizontalLineToRelative(7.403f)
                verticalLineToRelative(-1.013f)
                lineTo(16.81f, 19.026f)
                curveToRelative(-1.439f, 0.0f, -2.334f, -0.047f, -2.688f, -0.26f)
                verticalLineToRelative(0.448f)
                curveToRelative(0.283f, 0.708f, 1.485f, 0.825f, 2.452f, 0.825f)
                close()
            }
        }
        .build()
        return _bem!!
    }

private var _bem: ImageVector? = null
