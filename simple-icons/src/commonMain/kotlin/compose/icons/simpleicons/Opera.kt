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

public val SimpleIcons.Opera: ImageVector
    get() {
        if (_opera != null) {
            return _opera!!
        }
        _opera = Builder(name = "Opera", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.051f, 5.238f)
                curveToRelative(-1.328f, 1.566f, -2.186f, 3.883f, -2.246f, 6.48f)
                verticalLineToRelative(0.564f)
                curveToRelative(0.061f, 2.598f, 0.918f, 4.912f, 2.246f, 6.479f)
                curveToRelative(1.721f, 2.236f, 4.279f, 3.654f, 7.139f, 3.654f)
                curveToRelative(1.756f, 0.0f, 3.4f, -0.537f, 4.807f, -1.471f)
                curveTo(17.879f, 22.846f, 15.074f, 24.0f, 12.0f, 24.0f)
                curveToRelative(-0.192f, 0.0f, -0.383f, -0.004f, -0.57f, -0.014f)
                curveTo(5.064f, 23.689f, 0.0f, 18.436f, 0.0f, 12.0f)
                curveTo(0.0f, 5.371f, 5.373f, 0.0f, 12.0f, 0.0f)
                horizontalLineToRelative(0.045f)
                curveToRelative(3.055f, 0.012f, 5.84f, 1.166f, 7.953f, 3.055f)
                curveToRelative(-1.408f, -0.93f, -3.051f, -1.471f, -4.81f, -1.471f)
                curveToRelative(-2.858f, 0.0f, -5.417f, 1.42f, -7.14f, 3.654f)
                horizontalLineToRelative(0.003f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 3.556f, -1.545f, 6.748f, -4.002f, 8.945f)
                curveToRelative(-3.078f, 1.5f, -5.946f, 0.451f, -6.896f, -0.205f)
                curveToRelative(3.023f, -0.664f, 5.307f, -4.32f, 5.307f, -8.74f)
                curveToRelative(0.0f, -4.422f, -2.283f, -8.075f, -5.307f, -8.74f)
                curveToRelative(0.949f, -0.654f, 3.818f, -1.703f, 6.896f, -0.205f)
                curveTo(22.455f, 5.25f, 24.0f, 8.445f, 24.0f, 12.0f)
                close()
            }
        }
        .build()
        return _opera!!
    }

private var _opera: ImageVector? = null
