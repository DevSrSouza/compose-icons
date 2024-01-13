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

public val TablerIcons.BrandItch: ImageVector
    get() {
        if (_brandItch != null) {
            return _brandItch!!
        }
        _brandItch = Builder(name = "BrandItch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 7.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 1.087f, 1.078f, 2.0f, 2.0f, 2.0f)
                curveToRelative(1.107f, 0.0f, 2.0f, -0.91f, 2.0f, -2.0f)
                curveToRelative(0.0f, 1.09f, 0.893f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.91f, 2.0f, -2.0f)
                curveToRelative(0.0f, 1.09f, 0.893f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.91f, 2.0f, -2.0f)
                curveToRelative(0.0f, 1.09f, 0.893f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.91f, 2.0f, -2.0f)
                curveToRelative(0.0f, 1.09f, 0.893f, 2.0f, 2.0f, 2.0f)
                curveToRelative(0.922f, 0.0f, 2.0f, -0.913f, 2.0f, -2.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(-0.009f, -0.275f, -0.538f, -0.964f, -1.588f, -2.068f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.174f, -0.932f)
                horizontalLineToRelative(-12.476f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.174f, 0.932f)
                curveToRelative(-1.05f, 1.104f, -1.58f, 1.793f, -1.588f, 2.068f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 10.0f)
                curveToRelative(-0.117f, 6.28f, 0.154f, 9.765f, 0.814f, 10.456f)
                curveToRelative(1.534f, 0.367f, 4.355f, 0.535f, 7.186f, 0.536f)
                curveToRelative(2.83f, -0.001f, 5.652f, -0.169f, 7.186f, -0.536f)
                curveToRelative(0.99f, -1.037f, 0.898f, -9.559f, 0.814f, -10.456f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 16.0f)
                lineToRelative(2.0f, -2.0f)
                lineToRelative(2.0f, 2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 14.0f)
                verticalLineToRelative(4.0f)
            }
        }
        .build()
        return _brandItch!!
    }

private var _brandItch: ImageVector? = null
