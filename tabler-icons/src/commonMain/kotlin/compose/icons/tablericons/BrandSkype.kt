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

public val TablerIcons.BrandSkype: ImageVector
    get() {
        if (_brandSkype != null) {
            return _brandSkype!!
        }
        _brandSkype = Builder(name = "BrandSkype", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 8.603f, 11.65f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -5.953f, 5.953f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -11.253f, -11.253f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 5.953f, -5.954f)
                arcToRelative(8.987f, 8.987f, 0.0f, false, true, 2.65f, -0.396f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 14.5f)
                curveToRelative(0.5f, 2.0f, 2.358f, 2.5f, 4.0f, 2.5f)
                curveToRelative(2.905f, 0.0f, 4.0f, -1.187f, 4.0f, -2.5f)
                curveToRelative(0.0f, -1.503f, -1.927f, -2.5f, -4.0f, -2.5f)
                reflectiveCurveToRelative(-4.0f, -1.0f, -4.0f, -2.5f)
                curveToRelative(0.0f, -1.313f, 1.095f, -2.5f, 4.0f, -2.5f)
                curveToRelative(1.642f, 0.0f, 3.5f, 0.5f, 4.0f, 2.5f)
            }
        }
        .build()
        return _brandSkype!!
    }

private var _brandSkype: ImageVector? = null
