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

public val TablerIcons.BrandTailwind: ImageVector
    get() {
        if (_brandTailwind != null) {
            return _brandTailwind!!
        }
        _brandTailwind = Builder(name = "BrandTailwind", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.667f, 6.0f)
                curveToRelative(-2.49f, 0.0f, -4.044f, 1.222f, -4.667f, 3.667f)
                curveToRelative(0.933f, -1.223f, 2.023f, -1.68f, 3.267f, -1.375f)
                curveToRelative(0.71f, 0.174f, 1.217f, 0.68f, 1.778f, 1.24f)
                curveToRelative(0.916f, 0.912f, 2.0f, 1.968f, 4.288f, 1.968f)
                curveToRelative(2.49f, 0.0f, 4.044f, -1.222f, 4.667f, -3.667f)
                curveToRelative(-0.933f, 1.223f, -2.023f, 1.68f, -3.267f, 1.375f)
                curveToRelative(-0.71f, -0.174f, -1.217f, -0.68f, -1.778f, -1.24f)
                curveToRelative(-0.916f, -0.912f, -1.975f, -1.968f, -4.288f, -1.968f)
                close()
                moveTo(7.667f, 12.5f)
                curveToRelative(-2.49f, 0.0f, -4.044f, 1.222f, -4.667f, 3.667f)
                curveToRelative(0.933f, -1.223f, 2.023f, -1.68f, 3.267f, -1.375f)
                curveToRelative(0.71f, 0.174f, 1.217f, 0.68f, 1.778f, 1.24f)
                curveToRelative(0.916f, 0.912f, 1.975f, 1.968f, 4.288f, 1.968f)
                curveToRelative(2.49f, 0.0f, 4.044f, -1.222f, 4.667f, -3.667f)
                curveToRelative(-0.933f, 1.223f, -2.023f, 1.68f, -3.267f, 1.375f)
                curveToRelative(-0.71f, -0.174f, -1.217f, -0.68f, -1.778f, -1.24f)
                curveToRelative(-0.916f, -0.912f, -1.975f, -1.968f, -4.288f, -1.968f)
                close()
            }
        }
        .build()
        return _brandTailwind!!
    }

private var _brandTailwind: ImageVector? = null
