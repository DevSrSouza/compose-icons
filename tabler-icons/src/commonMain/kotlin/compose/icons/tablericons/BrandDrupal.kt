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

public val TablerIcons.BrandDrupal: ImageVector
    get() {
        if (_brandDrupal != null) {
            return _brandDrupal!!
        }
        _brandDrupal = Builder(name = "BrandDrupal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(0.0f, 4.308f, -7.0f, 6.0f, -7.0f, 12.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 14.0f, 0.0f)
                curveToRelative(0.0f, -6.0f, -7.0f, -7.697f, -7.0f, -12.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 11.33f)
                arcToRelative(65.753f, 65.753f, 0.0f, false, true, -2.012f, 2.023f)
                curveToRelative(-1.0f, 0.957f, -1.988f, 1.967f, -1.988f, 3.647f)
                curveToRelative(0.0f, 2.17f, 1.79f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.827f, 4.0f, -4.0f)
                curveToRelative(0.0f, -1.676f, -0.989f, -2.685f, -1.983f, -3.642f)
                curveToRelative(-0.42f, -0.404f, -2.259f, -2.357f, -5.517f, -5.858f)
                lineToRelative(3.5f, 3.83f)
                close()
            }
        }
        .build()
        return _brandDrupal!!
    }

private var _brandDrupal: ImageVector? = null
