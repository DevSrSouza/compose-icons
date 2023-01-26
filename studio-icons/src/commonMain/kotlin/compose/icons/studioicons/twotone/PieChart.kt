package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.PieChart: ImageVector
    get() {
        if (_pieChart != null) {
            return _pieChart!!
        }
        _pieChart = Builder(name = "PieChart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 12.0f)
                curveToRelative(0.0f, 4.07f, 3.06f, 7.44f, 7.0f, 7.93f)
                lineTo(11.0f, 4.07f)
                curveTo(7.06f, 4.56f, 4.0f, 7.93f, 4.0f, 12.0f)
                close()
                moveTo(13.0f, 19.93f)
                curveToRelative(3.61f, -0.45f, 6.48f, -3.32f, 6.93f, -6.93f)
                lineTo(13.0f, 13.0f)
                verticalLineToRelative(6.93f)
                close()
                moveTo(13.0f, 4.07f)
                lineTo(13.0f, 11.0f)
                horizontalLineToRelative(6.93f)
                curveToRelative(-0.45f, -3.61f, -3.32f, -6.48f, -6.93f, -6.93f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(11.0f, 19.93f)
                curveToRelative(-3.94f, -0.49f, -7.0f, -3.86f, -7.0f, -7.93f)
                reflectiveCurveToRelative(3.06f, -7.44f, 7.0f, -7.93f)
                verticalLineToRelative(15.86f)
                close()
                moveTo(13.0f, 19.93f)
                lineTo(13.0f, 13.0f)
                horizontalLineToRelative(6.93f)
                curveToRelative(-0.45f, 3.61f, -3.32f, 6.48f, -6.93f, 6.93f)
                close()
                moveTo(13.0f, 11.0f)
                lineTo(13.0f, 4.07f)
                curveToRelative(3.61f, 0.45f, 6.48f, 3.32f, 6.93f, 6.93f)
                lineTo(13.0f, 11.0f)
                close()
            }
        }
        .build()
        return _pieChart!!
    }

private var _pieChart: ImageVector? = null
