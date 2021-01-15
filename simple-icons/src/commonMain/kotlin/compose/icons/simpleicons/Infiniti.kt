package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Infiniti: ImageVector
    get() {
        if (_infiniti != null) {
            return _infiniti!!
        }
        _infiniti = Builder(name = "Infiniti", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.893f, 14.606f)
                curveTo(5.17f, 14.46f, 2.18f, 13.33f, 2.18f, 11.359f)
                curveToRelative(0.0f, -2.5f, 4.343f, -4.818f, 9.819f, -4.818f)
                curveToRelative(5.75f, 0.0f, 9.82f, 2.318f, 9.82f, 4.818f)
                curveToRelative(0.0f, 1.97f, -2.978f, 3.087f, -4.702f, 3.233f)
                curveToRelative(-0.475f, -0.609f, -5.118f, -6.791f, -5.118f, -6.791f)
                reflectiveCurveToRelative(-4.662f, 6.232f, -5.106f, 6.805f)
                close()
                moveTo(20.637f, 16.721f)
                curveTo(22.921f, 15.6f, 24.0f, 13.734f, 24.0f, 12.088f)
                curveToRelative(0.0f, -3.533f, -4.928f, -6.264f, -12.001f, -6.264f)
                curveTo(4.927f, 5.824f, 0.0f, 8.555f, 0.0f, 12.088f)
                curveToRelative(0.0f, 1.646f, 1.079f, 3.511f, 3.363f, 4.633f)
                curveToRelative(2.118f, 1.041f, 5.116f, 1.403f, 5.55f, 1.455f)
                lineToRelative(3.086f, -8.982f)
                lineToRelative(3.118f, 8.982f)
                curveToRelative(0.432f, -0.052f, 3.401f, -0.414f, 5.52f, -1.455f)
                close()
            }
        }
        .build()
        return _infiniti!!
    }

private var _infiniti: ImageVector? = null
