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

public val SimpleIcons.Foursquarecityguide: ImageVector
    get() {
        if (_foursquarecityguide != null) {
            return _foursquarecityguide!!
        }
        _foursquarecityguide = Builder(name = "Foursquarecityguide", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.727f, 3.465f)
                lineToRelative(-0.535f, 2.799f)
                curveToRelative(-0.064f, 0.303f, -0.445f, 0.623f, -0.801f, 0.623f)
                lineTo(11.41f, 6.887f)
                curveToRelative(-0.562f, 0.0f, -0.963f, 0.391f, -0.963f, 0.945f)
                verticalLineToRelative(0.614f)
                curveToRelative(0.0f, 0.569f, 0.405f, 0.96f, 0.966f, 0.96f)
                horizontalLineToRelative(4.23f)
                curveToRelative(0.395f, 0.0f, 0.785f, 0.436f, 0.697f, 0.855f)
                lineToRelative(-0.535f, 2.76f)
                curveToRelative(-0.051f, 0.24f, -0.314f, 0.63f, -0.785f, 0.63f)
                horizontalLineToRelative(-3.457f)
                curveToRelative(-0.63f, 0.0f, -0.818f, 0.091f, -1.239f, 0.601f)
                curveToRelative(-0.42f, 0.524f, -4.206f, 5.069f, -4.206f, 5.069f)
                curveToRelative(-0.037f, 0.045f, -0.074f, 0.029f, -0.074f, -0.015f)
                lineTo(6.044f, 3.42f)
                curveToRelative(0.0f, -0.359f, 0.311f, -0.78f, 0.776f, -0.78f)
                horizontalLineToRelative(10.274f)
                curveToRelative(0.375f, 0.0f, 0.73f, 0.356f, 0.633f, 0.821f)
                verticalLineToRelative(0.004f)
                close()
                moveTo(18.178f, 14.445f)
                curveToRelative(0.145f, -0.578f, 1.746f, -8.784f, 2.281f, -11.385f)
                moveTo(18.486f, 0.0f)
                lineTo(5.683f, 0.0f)
                curveTo(3.918f, 0.0f, 3.4f, 1.328f, 3.4f, 2.164f)
                verticalLineToRelative(20.34f)
                curveToRelative(0.0f, 0.94f, 0.504f, 1.291f, 0.789f, 1.405f)
                curveToRelative(0.284f, 0.117f, 1.069f, 0.214f, 1.541f, -0.328f)
                curveToRelative(0.0f, 0.0f, 6.044f, -7.014f, 6.146f, -7.117f)
                curveToRelative(0.165f, -0.157f, 0.165f, -0.157f, 0.315f, -0.157f)
                horizontalLineToRelative(3.914f)
                curveToRelative(1.65f, 0.0f, 1.906f, -1.17f, 2.086f, -1.86f)
                curveToRelative(0.15f, -0.569f, 1.754f, -8.774f, 2.279f, -11.385f)
                curveTo(20.875f, 1.08f, 20.365f, 0.0f, 18.49f, 0.0f)
                horizontalLineToRelative(-0.004f)
                close()
            }
        }
        .build()
        return _foursquarecityguide!!
    }

private var _foursquarecityguide: ImageVector? = null
