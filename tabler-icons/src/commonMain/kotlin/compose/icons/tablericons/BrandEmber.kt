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

public val TablerIcons.BrandEmber: ImageVector
    get() {
        if (_brandEmber != null) {
            return _brandEmber!!
        }
        _brandEmber = Builder(name = "BrandEmber", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 12.958f)
                curveToRelative(8.466f, 1.647f, 11.112f, -1.196f, 12.17f, -2.294f)
                curveToRelative(2.116f, -2.196f, 0.0f, -6.589f, -2.646f, -5.49f)
                curveToRelative(-2.644f, 1.096f, -6.35f, 7.686f, -3.174f, 12.078f)
                curveToRelative(2.116f, 2.928f, 6.0f, 2.178f, 11.65f, -2.252f)
            }
        }
        .build()
        return _brandEmber!!
    }

private var _brandEmber: ImageVector? = null
