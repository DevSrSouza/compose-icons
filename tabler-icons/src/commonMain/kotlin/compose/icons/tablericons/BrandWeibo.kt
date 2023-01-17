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

public val TablerIcons.BrandWeibo: ImageVector
    get() {
        if (_brandWeibo != null) {
            return _brandWeibo!!
        }
        _brandWeibo = Builder(name = "BrandWeibo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 14.127f)
                curveToRelative(0.0f, 3.073f, -3.502f, 5.873f, -8.0f, 5.873f)
                curveToRelative(-4.126f, 0.0f, -8.0f, -2.224f, -8.0f, -5.565f)
                curveToRelative(0.0f, -1.78f, 0.984f, -3.737f, 2.7f, -5.567f)
                curveToRelative(2.362f, -2.51f, 5.193f, -3.687f, 6.551f, -2.238f)
                curveToRelative(0.415f, 0.44f, 0.752f, 1.39f, 0.749f, 2.062f)
                curveToRelative(2.0f, -1.615f, 4.308f, 0.387f, 3.5f, 2.693f)
                curveToRelative(1.26f, 0.557f, 2.5f, 0.538f, 2.5f, 2.742f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 4.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 5.0f, 5.0f)
                verticalLineToRelative(1.0f)
            }
        }
        .build()
        return _brandWeibo!!
    }

private var _brandWeibo: ImageVector? = null
