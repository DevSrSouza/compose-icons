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

public val TablerIcons.BrandAdobe: ImageVector
    get() {
        if (_brandAdobe != null) {
            return _brandAdobe!!
        }
        _brandAdobe = Builder(name = "BrandAdobe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.893f, 4.514f)
                lineToRelative(7.977f, 14.0f)
                arcToRelative(0.993f, 0.993f, 0.0f, false, true, -0.394f, 1.365f)
                arcToRelative(1.04f, 1.04f, 0.0f, false, true, -0.5f, 0.127f)
                horizontalLineToRelative(-3.476f)
                lineToRelative(-4.5f, -8.0f)
                lineToRelative(-2.5f, 4.0f)
                horizontalLineToRelative(1.5f)
                lineToRelative(2.0f, 4.0f)
                horizontalLineToRelative(-8.977f)
                curveToRelative(-0.565f, 0.0f, -1.023f, -0.45f, -1.023f, -1.0f)
                curveToRelative(0.0f, -0.171f, 0.045f, -0.34f, 0.13f, -0.49f)
                lineToRelative(7.977f, -13.993f)
                arcToRelative(1.034f, 1.034f, 0.0f, false, true, 1.786f, 0.0f)
                close()
            }
        }
        .build()
        return _brandAdobe!!
    }

private var _brandAdobe: ImageVector? = null
