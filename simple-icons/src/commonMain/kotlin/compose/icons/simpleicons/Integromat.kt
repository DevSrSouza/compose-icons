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

public val SimpleIcons.Integromat: ImageVector
    get() {
        if (_integromat != null) {
            return _integromat!!
        }
        _integromat = Builder(name = "Integromat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveToRelative(-0.681f, 0.0f, -1.349f, 0.057f, -2.0f, 0.166f)
                verticalLineToRelative(4.09f)
                arcToRelative(8.002f, 8.002f, 0.0f, false, true, 2.0f, -0.253f)
                curveToRelative(0.69f, 0.0f, 1.36f, 0.088f, 2.0f, 0.253f)
                verticalLineTo(0.166f)
                curveTo(13.35f, 0.056f, 12.68f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(8.002f, 0.683f)
                curveTo(3.342f, 2.332f, 0.0f, 6.78f, 0.0f, 12.0f)
                curveToRelative(0.0f, 6.623f, 5.377f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.377f, 12.0f, -12.0f)
                curveTo(24.0f, 6.78f, 20.658f, 2.332f, 15.999f, 0.683f)
                verticalLineToRelative(4.392f)
                arcToRelative(7.997f, 7.997f, 0.0f, true, true, -7.997f, 0.0f)
                close()
                moveTo(12.0f, 6.003f)
                curveToRelative(-0.7f, 0.0f, -1.374f, 0.12f, -2.0f, 0.342f)
                verticalLineToRelative(9.32f)
                arcToRelative(5.98f, 5.98f, 0.0f, false, false, 2.0f, 0.343f)
                curveToRelative(0.7f, 0.0f, 1.374f, -0.121f, 2.0f, -0.342f)
                verticalLineTo(6.345f)
                arcToRelative(5.977f, 5.977f, 0.0f, false, false, -2.0f, -0.342f)
                close()
            }
        }
        .build()
        return _integromat!!
    }

private var _integromat: ImageVector? = null
