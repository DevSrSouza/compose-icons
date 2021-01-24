package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.ExclamationTriangle: ImageVector
    get() {
        if (_exclamationTriangle != null) {
            return _exclamationTriangle!!
        }
        _exclamationTriangle = Builder(name = "ExclamationTriangle", defaultWidth = 576.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(569.517f, 440.013f)
                curveTo(587.975f, 472.007f, 564.806f, 512.0f, 527.94f, 512.0f)
                lineTo(48.054f, 512.0f)
                curveToRelative(-36.937f, 0.0f, -59.999f, -40.055f, -41.577f, -71.987f)
                lineTo(246.423f, 23.985f)
                curveToRelative(18.467f, -32.009f, 64.72f, -31.951f, 83.154f, 0.0f)
                lineToRelative(239.94f, 416.028f)
                close()
                moveTo(288.0f, 354.0f)
                curveToRelative(-25.405f, 0.0f, -46.0f, 20.595f, -46.0f, 46.0f)
                reflectiveCurveToRelative(20.595f, 46.0f, 46.0f, 46.0f)
                reflectiveCurveToRelative(46.0f, -20.595f, 46.0f, -46.0f)
                reflectiveCurveToRelative(-20.595f, -46.0f, -46.0f, -46.0f)
                close()
                moveTo(244.327f, 188.654f)
                lineToRelative(7.418f, 136.0f)
                curveToRelative(0.347f, 6.364f, 5.609f, 11.346f, 11.982f, 11.346f)
                horizontalLineToRelative(48.546f)
                curveToRelative(6.373f, 0.0f, 11.635f, -4.982f, 11.982f, -11.346f)
                lineToRelative(7.418f, -136.0f)
                curveToRelative(0.375f, -6.874f, -5.098f, -12.654f, -11.982f, -12.654f)
                horizontalLineToRelative(-63.383f)
                curveToRelative(-6.884f, 0.0f, -12.356f, 5.78f, -11.981f, 12.654f)
                close()
            }
        }
        .build()
        return _exclamationTriangle!!
    }

private var _exclamationTriangle: ImageVector? = null
