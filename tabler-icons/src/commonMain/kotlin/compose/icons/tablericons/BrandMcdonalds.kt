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

public val TablerIcons.BrandMcdonalds: ImageVector
    get() {
        if (_brandMcdonalds != null) {
            return _brandMcdonalds!!
        }
        _brandMcdonalds = Builder(name = "BrandMcdonalds", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 20.0f)
                curveToRelative(0.0f, -3.952f, -0.966f, -16.0f, -4.038f, -16.0f)
                reflectiveCurveToRelative(-3.962f, 9.087f, -3.962f, 14.756f)
                curveToRelative(0.0f, -5.669f, -0.896f, -14.756f, -3.962f, -14.756f)
                curveToRelative(-3.065f, 0.0f, -4.038f, 12.048f, -4.038f, 16.0f)
            }
        }
        .build()
        return _brandMcdonalds!!
    }

private var _brandMcdonalds: ImageVector? = null
