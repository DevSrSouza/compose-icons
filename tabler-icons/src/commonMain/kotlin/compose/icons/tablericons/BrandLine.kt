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

public val TablerIcons.BrandLine: ImageVector
    get() {
        if (_brandLine != null) {
            return _brandLine!!
        }
        _brandLine = Builder(name = "BrandLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 10.663f)
                curveToRelative(0.0f, -4.224f, -4.041f, -7.663f, -9.0f, -7.663f)
                reflectiveCurveToRelative(-9.0f, 3.439f, -9.0f, 7.663f)
                curveToRelative(0.0f, 3.783f, 3.201f, 6.958f, 7.527f, 7.56f)
                curveToRelative(1.053f, 0.239f, 0.932f, 0.644f, 0.696f, 2.133f)
                curveToRelative(-0.039f, 0.238f, -0.184f, 0.932f, 0.777f, 0.512f)
                curveToRelative(0.96f, -0.42f, 5.18f, -3.201f, 7.073f, -5.48f)
                curveToRelative(1.304f, -1.504f, 1.927f, -3.029f, 1.927f, -4.715f)
                verticalLineToRelative(-0.01f)
                close()
            }
        }
        .build()
        return _brandLine!!
    }

private var _brandLine: ImageVector? = null
