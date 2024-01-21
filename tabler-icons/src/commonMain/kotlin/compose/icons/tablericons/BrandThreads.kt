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

public val TablerIcons.BrandThreads: ImageVector
    get() {
        if (_brandThreads != null) {
            return _brandThreads!!
        }
        _brandThreads = Builder(name = "BrandThreads", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 7.5f)
                curveToRelative(-1.333f, -3.0f, -3.667f, -4.5f, -7.0f, -4.5f)
                curveToRelative(-5.0f, 0.0f, -8.0f, 2.5f, -8.0f, 9.0f)
                reflectiveCurveToRelative(3.5f, 9.0f, 8.0f, 9.0f)
                reflectiveCurveToRelative(7.0f, -3.0f, 7.0f, -5.0f)
                reflectiveCurveToRelative(-1.0f, -5.0f, -7.0f, -5.0f)
                curveToRelative(-2.5f, 0.0f, -3.0f, 1.25f, -3.0f, 2.5f)
                curveToRelative(0.0f, 1.5f, 1.0f, 2.5f, 2.5f, 2.5f)
                curveToRelative(2.5f, 0.0f, 3.5f, -1.5f, 3.5f, -5.0f)
                reflectiveCurveToRelative(-2.0f, -4.0f, -3.0f, -4.0f)
                reflectiveCurveToRelative(-1.833f, 0.333f, -2.5f, 1.0f)
            }
        }
        .build()
        return _brandThreads!!
    }

private var _brandThreads: ImageVector? = null
