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

public val SolidGroup.ExclamationCircle: ImageVector
    get() {
        if (_exclamationCircle != null) {
            return _exclamationCircle!!
        }
        _exclamationCircle = Builder(name = "ExclamationCircle", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(504.0f, 256.0f)
                curveToRelative(0.0f, 136.997f, -111.043f, 248.0f, -248.0f, 248.0f)
                reflectiveCurveTo(8.0f, 392.997f, 8.0f, 256.0f)
                curveTo(8.0f, 119.083f, 119.043f, 8.0f, 256.0f, 8.0f)
                reflectiveCurveToRelative(248.0f, 111.083f, 248.0f, 248.0f)
                close()
                moveTo(256.0f, 306.0f)
                curveToRelative(-25.405f, 0.0f, -46.0f, 20.595f, -46.0f, 46.0f)
                reflectiveCurveToRelative(20.595f, 46.0f, 46.0f, 46.0f)
                reflectiveCurveToRelative(46.0f, -20.595f, 46.0f, -46.0f)
                reflectiveCurveToRelative(-20.595f, -46.0f, -46.0f, -46.0f)
                close()
                moveTo(212.327f, 140.654f)
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
        return _exclamationCircle!!
    }

private var _exclamationCircle: ImageVector? = null
