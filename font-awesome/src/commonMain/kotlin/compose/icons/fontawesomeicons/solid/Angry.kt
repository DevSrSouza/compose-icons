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

public val SolidGroup.Angry: ImageVector
    get() {
        if (_angry != null) {
            return _angry!!
        }
        _angry = Builder(name = "Angry", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
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
                moveTo(136.0f, 240.0f)
                curveToRelative(0.0f, -9.3f, 4.1f, -17.5f, 10.5f, -23.4f)
                lineToRelative(-31.0f, -9.3f)
                curveToRelative(-8.5f, -2.5f, -13.3f, -11.5f, -10.7f, -19.9f)
                curveToRelative(2.5f, -8.5f, 11.4f, -13.2f, 19.9f, -10.7f)
                lineToRelative(80.0f, 24.0f)
                curveToRelative(8.5f, 2.5f, 13.3f, 11.5f, 10.7f, 19.9f)
                curveToRelative(-2.1f, 6.9f, -8.4f, 11.4f, -15.3f, 11.4f)
                curveToRelative(-0.5f, 0.0f, -1.1f, -0.2f, -1.7f, -0.2f)
                curveToRelative(0.7f, 2.7f, 1.7f, 5.3f, 1.7f, 8.2f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveTo(136.0f, 257.7f, 136.0f, 240.0f)
                close()
                moveTo(304.0f, 394.2f)
                curveToRelative(-27.8f, -33.4f, -84.2f, -33.4f, -112.1f, 0.0f)
                curveToRelative(-13.5f, 16.3f, -38.2f, -4.2f, -24.6f, -20.5f)
                curveToRelative(20.0f, -24.0f, 49.4f, -37.8f, 80.6f, -37.8f)
                reflectiveCurveToRelative(60.6f, 13.8f, 80.6f, 37.8f)
                curveToRelative(13.8f, 16.5f, -11.1f, 36.6f, -24.5f, 20.5f)
                close()
                moveTo(380.6f, 207.3f)
                lineToRelative(-31.0f, 9.3f)
                curveToRelative(6.3f, 5.8f, 10.5f, 14.1f, 10.5f, 23.4f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                curveToRelative(0.0f, -2.9f, 0.9f, -5.6f, 1.7f, -8.2f)
                curveToRelative(-0.6f, 0.1f, -1.1f, 0.2f, -1.7f, 0.2f)
                curveToRelative(-6.9f, 0.0f, -13.2f, -4.5f, -15.3f, -11.4f)
                curveToRelative(-2.5f, -8.5f, 2.3f, -17.4f, 10.7f, -19.9f)
                lineToRelative(80.0f, -24.0f)
                curveToRelative(8.4f, -2.5f, 17.4f, 2.3f, 19.9f, 10.7f)
                curveToRelative(2.5f, 8.5f, -2.3f, 17.4f, -10.8f, 19.9f)
                close()
            }
        }
        .build()
        return _angry!!
    }

private var _angry: ImageVector? = null
