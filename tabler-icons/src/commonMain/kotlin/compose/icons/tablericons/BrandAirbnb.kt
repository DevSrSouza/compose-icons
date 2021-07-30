package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BrandAirbnb: ImageVector
    get() {
        if (_brandAirbnb != null) {
            return _brandAirbnb!!
        }
        _brandAirbnb = Builder(name = "BrandAirbnb", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 10.0f)
                curveToRelative(-2.0f, 0.0f, -3.0f, 1.0f, -3.0f, 3.0f)
                curveToRelative(0.0f, 1.5f, 1.494f, 3.535f, 3.0f, 5.5f)
                curveToRelative(1.0f, 1.0f, 1.5f, 1.5f, 2.5f, 2.0f)
                reflectiveCurveToRelative(2.5f, 1.0f, 4.5f, -0.5f)
                reflectiveCurveToRelative(1.5f, -3.5f, 0.5f, -6.0f)
                reflectiveCurveToRelative(-2.333f, -5.5f, -5.0f, -9.5f)
                curveToRelative(-0.834f, -1.0f, -1.5f, -1.5f, -2.503f, -1.5f)
                curveToRelative(-1.0f, 0.0f, -1.623f, 0.45f, -2.497f, 1.5f)
                curveToRelative(-2.667f, 4.0f, -4.0f, 7.0f, -5.0f, 9.5f)
                reflectiveCurveToRelative(-1.5f, 4.5f, 0.5f, 6.0f)
                reflectiveCurveToRelative(3.5f, 1.0f, 4.5f, 0.5f)
                reflectiveCurveToRelative(1.5f, -1.0f, 2.5f, -2.0f)
                curveToRelative(1.506f, -1.965f, 3.0f, -4.0f, 3.0f, -5.5f)
                curveToRelative(0.0f, -2.0f, -1.0f, -3.0f, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _brandAirbnb!!
    }

private var _brandAirbnb: ImageVector? = null
