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

public val TablerIcons.BrandGolang: ImageVector
    get() {
        if (_brandGolang != null) {
            return _brandGolang!!
        }
        _brandGolang = Builder(name = "BrandGolang", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.695f, 14.305f)
                curveToRelative(1.061f, 1.06f, 2.953f, 0.888f, 4.226f, -0.384f)
                curveToRelative(1.272f, -1.273f, 1.444f, -3.165f, 0.384f, -4.226f)
                curveToRelative(-1.061f, -1.06f, -2.953f, -0.888f, -4.226f, 0.384f)
                curveToRelative(-1.272f, 1.273f, -1.444f, 3.165f, -0.384f, 4.226f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.68f, 9.233f)
                curveToRelative(-1.084f, -0.497f, -2.545f, -0.191f, -3.591f, 0.846f)
                curveToRelative(-1.284f, 1.273f, -1.457f, 3.165f, -0.388f, 4.226f)
                curveToRelative(1.07f, 1.06f, 2.978f, 0.888f, 4.261f, -0.384f)
                arcToRelative(3.669f, 3.669f, 0.0f, false, false, 1.038f, -1.921f)
                horizontalLineToRelative(-2.427f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.5f, 15.0f)
                horizontalLineToRelative(-1.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 9.0f)
                horizontalLineToRelative(-2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 12.0f)
                horizontalLineToRelative(-3.0f)
            }
        }
        .build()
        return _brandGolang!!
    }

private var _brandGolang: ImageVector? = null
