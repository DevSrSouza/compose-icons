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

public val SimpleIcons.Americanairlines: ImageVector
    get() {
        if (_americanairlines != null) {
            return _americanairlines!!
        }
        _americanairlines = Builder(name = "Americanairlines", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.244f)
                horizontalLineToRelative(3.264f)
                curveToRelative(1.377f, 0.0f, 1.942f, 0.563f, 2.499f, 1.116f)
                curveToRelative(0.637f, 0.58f, 2.57f, 3.196f, 6.657f, 8.303f)
                lineTo(7.997f, 9.663f)
                curveToRelative(-1.809f, 0.0f, -2.38f, -0.308f, -3.08f, -1.375f)
                close()
                moveTo(10.424f, 17.316f)
                lineToRelative(-2.427f, -4.013f)
                curveToRelative(-0.292f, -0.455f, -0.372f, -0.854f, -0.372f, -1.318f)
                curveToRelative(0.0f, -0.51f, 0.217f, -0.79f, 1.053f, -1.233f)
                curveToRelative(0.973f, -0.466f, 2.933f, -0.67f, 4.954f, -0.67f)
                curveToRelative(3.283f, 0.0f, 4.07f, 1.055f, 4.405f, 2.192f)
                curveToRelative(0.0f, 0.0f, -0.464f, -0.185f, -1.554f, -0.185f)
                curveToRelative(-3.459f, 0.0f, -6.223f, 1.68f, -6.223f, 4.221f)
                curveToRelative(0.0f, 0.534f, 0.164f, 1.006f, 0.164f, 1.006f)
                close()
                moveTo(15.36f, 13.899f)
                curveToRelative(-2.547f, 0.089f, -5.032f, 1.869f, -4.936f, 3.416f)
                lineToRelative(2.7f, 4.486f)
                curveToRelative(0.836f, 1.344f, 2.215f, 1.955f, 3.932f, 1.955f)
                lineTo(24.0f, 23.756f)
                lineToRelative(-8.13f, -9.852f)
                arcToRelative(5.55f, 5.55f, 0.0f, false, false, -0.51f, -0.005f)
                close()
            }
        }
        .build()
        return _americanairlines!!
    }

private var _americanairlines: ImageVector? = null
