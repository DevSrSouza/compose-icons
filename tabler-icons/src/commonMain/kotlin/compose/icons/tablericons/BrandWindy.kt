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

public val TablerIcons.BrandWindy: ImageVector
    get() {
        if (_brandWindy != null) {
            return _brandWindy!!
        }
        _brandWindy = Builder(name = "BrandWindy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 4.0f)
                curveToRelative(0.0f, 5.5f, -0.33f, 16.0f, 4.0f, 16.0f)
                reflectiveCurveToRelative(7.546f, -11.27f, 8.0f, -13.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 4.0f)
                curveToRelative(0.253f, 5.44f, 1.449f, 16.0f, 5.894f, 16.0f)
                curveToRelative(4.444f, 0.0f, 8.42f, -10.036f, 9.106f, -14.0f)
            }
        }
        .build()
        return _brandWindy!!
    }

private var _brandWindy: ImageVector? = null
