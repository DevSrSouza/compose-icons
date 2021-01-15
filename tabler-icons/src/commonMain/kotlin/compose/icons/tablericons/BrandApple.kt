package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BrandApple: ImageVector
    get() {
        if (_brandApple != null) {
            return _brandApple!!
        }
        _brandApple = Builder(name = "BrandApple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 7.0f)
                curveToRelative(-3.0f, 0.0f, -4.0f, 3.0f, -4.0f, 5.5f)
                curveToRelative(0.0f, 3.0f, 2.0f, 7.5f, 4.0f, 7.5f)
                curveToRelative(1.088f, -0.046f, 1.679f, -0.5f, 3.0f, -0.5f)
                curveToRelative(1.312f, 0.0f, 1.5f, 0.5f, 3.0f, 0.5f)
                reflectiveCurveToRelative(4.0f, -3.0f, 4.0f, -5.0f)
                curveToRelative(-0.028f, -0.01f, -2.472f, -0.403f, -2.5f, -3.0f)
                curveToRelative(-0.019f, -2.17f, 2.416f, -2.954f, 2.5f, -3.0f)
                curveToRelative(-1.023f, -1.492f, -2.951f, -1.963f, -3.5f, -2.0f)
                curveToRelative(-1.433f, -0.111f, -2.83f, 1.0f, -3.5f, 1.0f)
                curveToRelative(-0.68f, 0.0f, -1.9f, -1.0f, -3.0f, -1.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
            }
        }
        .build()
        return _brandApple!!
    }

private var _brandApple: ImageVector? = null
