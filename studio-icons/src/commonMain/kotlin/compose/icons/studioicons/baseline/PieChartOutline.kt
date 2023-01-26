package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.PieChartOutline: ImageVector
    get() {
        if (_pieChartOutline != null) {
            return _pieChartOutline!!
        }
        _pieChartOutline = Builder(name = "PieChartOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.5f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.5f, 10.0f, -10.0f)
                reflectiveCurveTo(17.5f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(13.0f, 4.07f)
                curveToRelative(3.61f, 0.45f, 6.48f, 3.33f, 6.93f, 6.93f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.07f)
                close()
                moveTo(4.0f, 12.0f)
                curveToRelative(0.0f, -4.06f, 3.07f, -7.44f, 7.0f, -7.93f)
                verticalLineToRelative(15.87f)
                curveTo(7.07f, 19.44f, 4.0f, 16.06f, 4.0f, 12.0f)
                close()
                moveTo(13.0f, 19.93f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(6.93f)
                curveTo(19.48f, 16.61f, 16.61f, 19.48f, 13.0f, 19.93f)
                close()
            }
        }
        .build()
        return _pieChartOutline!!
    }

private var _pieChartOutline: ImageVector? = null
