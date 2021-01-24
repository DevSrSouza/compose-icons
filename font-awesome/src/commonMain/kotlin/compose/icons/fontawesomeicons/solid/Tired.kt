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

public val SolidGroup.Tired: ImageVector
    get() {
        if (_tired != null) {
            return _tired!!
        }
        _tired = Builder(name = "Tired", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 8.0f)
                curveTo(111.0f, 8.0f, 0.0f, 119.0f, 0.0f, 256.0f)
                reflectiveCurveToRelative(111.0f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.0f, 248.0f, -248.0f)
                reflectiveCurveTo(385.0f, 8.0f, 248.0f, 8.0f)
                close()
                moveTo(281.8f, 197.7f)
                lineToRelative(80.0f, -48.0f)
                curveToRelative(11.6f, -6.9f, 24.0f, 7.7f, 15.4f, 18.0f)
                lineTo(343.6f, 208.0f)
                lineToRelative(33.6f, 40.3f)
                curveToRelative(8.7f, 10.4f, -3.9f, 24.8f, -15.4f, 18.0f)
                lineToRelative(-80.0f, -48.0f)
                curveToRelative(-7.7f, -4.7f, -7.7f, -15.9f, 0.0f, -20.6f)
                close()
                moveTo(118.8f, 167.7f)
                curveToRelative(-8.6f, -10.3f, 3.8f, -24.9f, 15.4f, -18.0f)
                lineToRelative(80.0f, 48.0f)
                curveToRelative(7.8f, 4.7f, 7.8f, 15.9f, 0.0f, 20.6f)
                lineToRelative(-80.0f, 48.0f)
                curveToRelative(-11.5f, 6.8f, -24.0f, -7.6f, -15.4f, -18.0f)
                lineToRelative(33.6f, -40.3f)
                lineToRelative(-33.6f, -40.3f)
                close()
                moveTo(248.0f, 288.0f)
                curveToRelative(51.9f, 0.0f, 115.3f, 43.8f, 123.2f, 106.7f)
                curveToRelative(1.7f, 13.6f, -8.0f, 24.6f, -17.7f, 20.4f)
                curveToRelative(-25.9f, -11.1f, -64.4f, -17.4f, -105.5f, -17.4f)
                reflectiveCurveToRelative(-79.6f, 6.3f, -105.5f, 17.4f)
                curveToRelative(-9.8f, 4.2f, -19.4f, -7.0f, -17.7f, -20.4f)
                curveTo(132.7f, 331.8f, 196.1f, 288.0f, 248.0f, 288.0f)
                close()
            }
        }
        .build()
        return _tired!!
    }

private var _tired: ImageVector? = null
