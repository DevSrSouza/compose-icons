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

public val TablerIcons.BrandKbin: ImageVector
    get() {
        if (_brandKbin != null) {
            return _brandKbin!!
        }
        _brandKbin = Builder(name = "BrandKbin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.838f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.586f, 9.506f)
                horizontalLineToRelative(-2.43f)
                curveToRelative(-0.434f, -0.932f, -0.7f, -1.506f, -1.596f, -1.506f)
                lineToRelative(-2.404f, 0.019f)
                curveToRelative(-0.662f, 0.0f, -1.353f, 0.592f, -1.103f, 1.487f)
                lineToRelative(2.216f, 9.436f)
                curveToRelative(0.486f, 1.743f, 0.811f, 2.058f, 1.145f, 2.058f)
                horizontalLineToRelative(0.64f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.838f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.275f, 3.0f)
                horizontalLineToRelative(5.645f)
                curveToRelative(0.84f, 0.0f, 1.24f, 0.714f, 1.02f, 1.287f)
                lineToRelative(-4.687f, 15.109f)
                curveToRelative(-0.42f, 1.133f, -1.159f, 1.603f, -2.354f, 1.603f)
                horizontalLineToRelative(-7.485f)
                curveToRelative(0.39f, 0.0f, 0.76f, -0.618f, 1.296f, -2.061f)
                lineToRelative(4.457f, -14.49f)
                curveToRelative(0.326f, -0.83f, 0.76f, -1.448f, 2.108f, -1.448f)
                close()
            }
        }
        .build()
        return _brandKbin!!
    }

private var _brandKbin: ImageVector? = null
