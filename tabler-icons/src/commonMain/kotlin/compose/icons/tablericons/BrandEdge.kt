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

public val TablerIcons.BrandEdge: ImageVector
    get() {
        if (_brandEdge != null) {
            return _brandEdge!!
        }
        _brandEdge = Builder(name = "BrandEdge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.978f, 11.372f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, -1.593f, 5.773f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.978f, 11.372f)
                curveToRelative(0.21f, 2.993f, -5.034f, 2.413f, -6.913f, 1.486f)
                curveToRelative(1.392f, -1.6f, 0.402f, -4.038f, -2.274f, -3.851f)
                curveToRelative(-1.745f, 0.122f, -2.927f, 1.157f, -2.784f, 3.202f)
                curveToRelative(0.28f, 3.99f, 4.444f, 6.205f, 10.36f, 4.79f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.022f, 12.628f)
                curveToRelative(-0.283f, -4.043f, 8.717f, -7.228f, 11.248f, -2.688f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.628f, 20.978f)
                curveToRelative(-2.993f, 0.21f, -5.162f, -4.725f, -3.567f, -9.748f)
            }
        }
        .build()
        return _brandEdge!!
    }

private var _brandEdge: ImageVector? = null
