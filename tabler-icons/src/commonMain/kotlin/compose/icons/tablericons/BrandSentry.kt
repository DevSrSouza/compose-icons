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

public val TablerIcons.BrandSentry: ImageVector
    get() {
        if (_brandSentry != null) {
            return _brandSentry!!
        }
        _brandSentry = Builder(name = "BrandSentry", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 18.0f)
                arcToRelative(1.93f, 1.93f, 0.0f, false, false, 0.306f, 1.076f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.584f, 0.924f)
                curveToRelative(0.646f, 0.033f, -0.537f, 0.0f, 0.11f, 0.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(4.992f, 4.992f, 0.0f, false, false, -3.66f, -4.81f)
                curveToRelative(0.558f, -0.973f, 1.24f, -2.149f, 2.04f, -3.531f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 5.62f, 8.341f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.663f, 0.0f, 2.337f, 0.0f, 3.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.84f, -2.75f)
                lineToRelative(-7.1f, -12.25f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -3.5f, 0.0f)
                lineToRelative(-1.84f, 3.176f)
                curveToRelative(4.482f, 2.05f, 7.6f, 6.571f, 7.6f, 11.824f)
            }
        }
        .build()
        return _brandSentry!!
    }

private var _brandSentry: ImageVector? = null
