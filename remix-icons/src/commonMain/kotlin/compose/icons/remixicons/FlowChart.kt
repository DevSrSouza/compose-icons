package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.FlowChart: ImageVector
    get() {
        if (_flowChart != null) {
            return _flowChart!!
        }
        _flowChart = Builder(name = "FlowChart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 21.5f)
                curveToRelative(-1.933f, 0.0f, -3.5f, -1.567f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.567f, -3.5f, 3.5f, -3.5f)
                curveToRelative(1.585f, 0.0f, 2.924f, 1.054f, 3.355f, 2.5f)
                lineTo(15.0f, 17.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(17.0f, 9.242f)
                lineTo(14.757f, 7.0f)
                lineTo(9.0f, 7.0f)
                lineTo(9.0f, 9.0f)
                lineTo(3.0f, 9.0f)
                lineTo(3.0f, 3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.757f)
                lineTo(18.0f, 1.756f)
                lineTo(22.243f, 6.0f)
                lineTo(19.0f, 9.241f)
                lineTo(19.0f, 15.0f)
                lineTo(21.0f, 15.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                lineTo(9.355f, 19.0f)
                curveToRelative(-0.43f, 1.446f, -1.77f, 2.5f, -3.355f, 2.5f)
                close()
                moveTo(6.0f, 16.5f)
                curveToRelative(-0.828f, 0.0f, -1.5f, 0.672f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.672f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(19.0f, 17.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(18.0f, 4.586f)
                lineTo(16.586f, 6.0f)
                lineTo(18.0f, 7.414f)
                lineTo(19.414f, 6.0f)
                lineTo(18.0f, 4.586f)
                close()
                moveTo(7.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(7.0f, 5.0f)
                close()
            }
        }
        .build()
        return _flowChart!!
    }

private var _flowChart: ImageVector? = null
