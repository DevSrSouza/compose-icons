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

public val TablerIcons.BrandToyota: ImageVector
    get() {
        if (_brandToyota != null) {
            return _brandToyota!!
        }
        _brandToyota = Builder(name = "BrandToyota", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-10.0f, 0.0f)
                arcToRelative(10.0f, 7.0f, 0.0f, true, false, 20.0f, 0.0f)
                arcToRelative(10.0f, 7.0f, 0.0f, true, false, -20.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 12.0f)
                curveToRelative(0.0f, 3.866f, 1.343f, 7.0f, 3.0f, 7.0f)
                reflectiveCurveToRelative(3.0f, -3.134f, 3.0f, -7.0f)
                reflectiveCurveToRelative(-1.343f, -7.0f, -3.0f, -7.0f)
                reflectiveCurveToRelative(-3.0f, 3.134f, -3.0f, 7.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.415f, 6.191f)
                curveToRelative(-0.888f, 0.503f, -1.415f, 1.13f, -1.415f, 1.809f)
                curveToRelative(0.0f, 1.657f, 3.134f, 3.0f, 7.0f, 3.0f)
                reflectiveCurveToRelative(7.0f, -1.343f, 7.0f, -3.0f)
                curveToRelative(0.0f, -0.678f, -0.525f, -1.304f, -1.41f, -1.806f)
            }
        }
        .build()
        return _brandToyota!!
    }

private var _brandToyota: ImageVector? = null
