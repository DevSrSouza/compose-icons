package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BrandBadoo: ImageVector
    get() {
        if (_brandBadoo != null) {
            return _brandBadoo!!
        }
        _brandBadoo = Builder(name = "BrandBadoo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 9.43f)
                curveToRelative(0.0f, 5.838f, -4.477f, 10.57f, -10.0f, 10.57f)
                reflectiveCurveToRelative(-10.0f, -4.662f, -10.0f, -10.5f)
                curveToRelative(0.0f, -2.667f, 1.83f, -5.01f, 4.322f, -5.429f)
                curveToRelative(2.492f, -0.418f, 4.9f, 1.392f, 5.678f, 3.929f)
                curveToRelative(0.768f, -2.54f, 3.177f, -4.354f, 5.668f, -3.931f)
                curveToRelative(2.495f, 0.417f, 4.332f, 2.69f, 4.332f, 5.36f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 10.0f)
                curveToRelative(0.0f, 2.761f, 2.015f, 5.0f, 4.5f, 5.0f)
                reflectiveCurveToRelative(4.5f, -2.239f, 4.5f, -5.0f)
            }
        }
        .build()
        return _brandBadoo!!
    }

private var _brandBadoo: ImageVector? = null
