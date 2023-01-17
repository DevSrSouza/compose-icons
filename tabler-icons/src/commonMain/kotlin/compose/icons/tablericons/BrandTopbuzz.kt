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

public val TablerIcons.BrandTopbuzz: ImageVector
    get() {
        if (_brandTopbuzz != null) {
            return _brandTopbuzz!!
        }
        _brandTopbuzz = Builder(name = "BrandTopbuzz", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.417f, 8.655f)
                arcToRelative(0.524f, 0.524f, 0.0f, false, true, -0.405f, -0.622f)
                lineToRelative(0.986f, -4.617f)
                arcToRelative(0.524f, 0.524f, 0.0f, false, true, 0.626f, -0.404f)
                lineToRelative(14.958f, 3.162f)
                curveToRelative(0.285f, 0.06f, 0.467f, 0.339f, 0.406f, 0.622f)
                lineToRelative(-0.987f, 4.618f)
                arcToRelative(0.524f, 0.524f, 0.0f, false, true, -0.625f, 0.404f)
                lineToRelative(-4.345f, -0.92f)
                curveToRelative(-0.198f, -0.04f, -0.315f, 0.024f, -0.353f, 0.197f)
                lineToRelative(-2.028f, 9.49f)
                arcToRelative(0.527f, 0.527f, 0.0f, false, true, -0.625f, 0.404f)
                lineToRelative(-4.642f, -0.982f)
                arcToRelative(0.527f, 0.527f, 0.0f, false, true, -0.406f, -0.622f)
                lineToRelative(2.028f, -9.493f)
                curveToRelative(0.037f, -0.17f, -0.031f, -0.274f, -0.204f, -0.31f)
                lineToRelative(-4.384f, -0.927f)
                close()
            }
        }
        .build()
        return _brandTopbuzz!!
    }

private var _brandTopbuzz: ImageVector? = null
