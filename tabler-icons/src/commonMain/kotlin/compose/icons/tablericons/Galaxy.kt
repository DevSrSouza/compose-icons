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

public val TablerIcons.Galaxy: ImageVector
    get() {
        if (_galaxy != null) {
            return _galaxy!!
        }
        _galaxy = Builder(name = "Galaxy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveToRelative(-1.333f, 1.0f, -2.0f, 2.5f, -2.0f, 4.5f)
                curveToRelative(0.0f, 3.0f, 2.0f, 4.5f, 2.0f, 4.5f)
                reflectiveCurveToRelative(2.0f, 1.5f, 2.0f, 4.5f)
                curveToRelative(0.0f, 2.0f, -0.667f, 3.5f, -2.0f, 4.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.794f, 16.5f)
                curveToRelative(-0.2f, -1.655f, -1.165f, -2.982f, -2.897f, -3.982f)
                curveToRelative(-2.597f, -1.5f, -4.897f, -0.518f, -4.897f, -0.518f)
                reflectiveCurveToRelative(-2.299f, 0.982f, -4.897f, -0.518f)
                curveToRelative(-1.732f, -1.0f, -2.698f, -2.327f, -2.897f, -3.982f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.794f, 7.5f)
                curveToRelative(-1.532f, -0.655f, -3.165f, -0.482f, -4.897f, 0.518f)
                curveToRelative(-2.597f, 1.5f, -2.897f, 3.982f, -2.897f, 3.982f)
                reflectiveCurveToRelative(-0.299f, 2.482f, -2.897f, 3.982f)
                curveToRelative(-1.732f, 1.0f, -3.365f, 1.173f, -4.897f, 0.518f)
            }
        }
        .build()
        return _galaxy!!
    }

private var _galaxy: ImageVector? = null
