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

public val SimpleIcons.Wiiu: ImageVector
    get() {
        if (_wiiu != null) {
            return _wiiu!!
        }
        _wiiu = Builder(name = "Wiiu", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.133f, 8.432f)
                curveToRelative(-0.465f, 0.0f, -0.835f, 0.359f, -0.835f, 0.814f)
                curveToRelative(0.007f, 0.454f, 0.381f, 0.817f, 0.835f, 0.812f)
                curveToRelative(0.488f, 0.0f, 0.873f, -0.358f, 0.873f, -0.81f)
                curveToRelative(0.0f, -0.455f, -0.385f, -0.816f, -0.873f, -0.816f)
                close()
                moveTo(14.063f, 8.432f)
                curveToRelative(-0.465f, 0.0f, -0.848f, 0.359f, -0.848f, 0.814f)
                curveToRelative(0.0f, 0.442f, 0.383f, 0.812f, 0.848f, 0.812f)
                curveToRelative(0.477f, 0.0f, 0.861f, -0.358f, 0.861f, -0.81f)
                curveToRelative(0.0f, -0.455f, -0.385f, -0.816f, -0.861f, -0.816f)
                close()
                moveTo(17.718f, 8.443f)
                curveToRelative(-0.53f, 0.0f, -0.99f, 0.335f, -0.99f, 0.858f)
                verticalLineToRelative(3.315f)
                curveToRelative(0.0f, 0.809f, 0.56f, 1.289f, 1.377f, 1.289f)
                horizontalLineToRelative(4.647f)
                curveToRelative(0.689f, 0.0f, 1.248f, -0.477f, 1.248f, -1.162f)
                lineTo(24.0f, 9.345f)
                curveToRelative(0.0f, -0.412f, -0.308f, -0.86f, -0.688f, -0.86f)
                horizontalLineToRelative(-1.075f)
                verticalLineToRelative(2.799f)
                curveToRelative(0.0f, 2.122f, -3.701f, 2.104f, -3.701f, 0.04f)
                verticalLineToRelative(-2.88f)
                horizontalLineToRelative(-0.818f)
                close()
                moveTo(19.397f, 8.443f)
                verticalLineToRelative(2.453f)
                curveToRelative(0.0f, 1.636f, 1.934f, 1.402f, 1.934f, 0.256f)
                lineTo(21.331f, 8.445f)
                horizontalLineToRelative(-1.934f)
                verticalLineToRelative(-0.002f)
                close()
                moveTo(4.833f, 8.77f)
                curveToRelative(-0.465f, 0.0f, -0.776f, 0.232f, -0.938f, 0.756f)
                curveToRelative(-0.152f, 0.533f, -1.116f, 4.242f, -1.116f, 4.242f)
                lineToRelative(-1.267f, -4.94f)
                lineTo(0.0f, 8.828f)
                reflectiveCurveToRelative(1.451f, 5.264f, 1.65f, 5.881f)
                curveToRelative(0.15f, 0.476f, 0.521f, 0.86f, 1.058f, 0.86f)
                curveToRelative(0.627f, 0.0f, 0.917f, -0.454f, 1.045f, -0.86f)
                curveToRelative(0.14f, -0.421f, 1.08f, -3.895f, 1.08f, -3.895f)
                reflectiveCurveToRelative(0.942f, 3.476f, 1.069f, 3.895f)
                curveToRelative(0.14f, 0.406f, 0.431f, 0.86f, 1.047f, 0.86f)
                curveToRelative(0.547f, 0.0f, 0.906f, -0.385f, 1.07f, -0.86f)
                curveToRelative(0.196f, -0.617f, 1.65f, -5.881f, 1.65f, -5.881f)
                lineTo(8.148f, 8.828f)
                lineToRelative(-1.258f, 4.94f)
                reflectiveCurveToRelative(-0.963f, -3.709f, -1.125f, -4.242f)
                curveToRelative(-0.15f, -0.526f, -0.479f, -0.756f, -0.93f, -0.756f)
                horizontalLineToRelative(-0.002f)
                close()
                moveTo(10.438f, 10.86f)
                verticalLineToRelative(4.662f)
                horizontalLineToRelative(1.441f)
                lineTo(11.879f, 10.86f)
                horizontalLineToRelative(-1.441f)
                close()
                moveTo(13.354f, 10.86f)
                verticalLineToRelative(4.662f)
                horizontalLineToRelative(1.442f)
                lineTo(14.796f, 10.86f)
                horizontalLineToRelative(-1.442f)
                close()
            }
        }
        .build()
        return _wiiu!!
    }

private var _wiiu: ImageVector? = null
