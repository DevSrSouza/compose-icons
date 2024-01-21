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

public val TablerIcons.BrandWish: ImageVector
    get() {
        if (_brandWish != null) {
            return _brandWish!!
        }
        _brandWish = Builder(name = "BrandWish", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 6.0f)
                lineToRelative(5.981f, 2.392f)
                lineToRelative(-0.639f, 6.037f)
                curveToRelative(-0.18f, 0.893f, 0.06f, 1.819f, 0.65f, 2.514f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.381f, 1.057f)
                arcToRelative(4.328f, 4.328f, 0.0f, false, false, 4.132f, -3.57f)
                curveToRelative(-0.18f, 0.893f, 0.06f, 1.819f, 0.65f, 2.514f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.38f, 1.056f)
                arcToRelative(4.328f, 4.328f, 0.0f, false, false, 4.132f, -3.57f)
                lineToRelative(0.333f, -4.633f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.504f, 14.429f)
                lineToRelative(0.334f, -3.0f)
            }
        }
        .build()
        return _brandWish!!
    }

private var _brandWish: ImageVector? = null
