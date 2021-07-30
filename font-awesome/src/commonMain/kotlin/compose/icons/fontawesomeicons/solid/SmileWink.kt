package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.SmileWink: ImageVector
    get() {
        if (_smileWink != null) {
            return _smileWink!!
        }
        _smileWink = Builder(name = "SmileWink", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 256.0f)
                curveToRelative(0.0f, 137.0f, 111.0f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.0f, 248.0f, -248.0f)
                reflectiveCurveTo(385.0f, 8.0f, 248.0f, 8.0f)
                reflectiveCurveTo(0.0f, 119.0f, 0.0f, 256.0f)
                close()
                moveTo(200.0f, 208.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                close()
                moveTo(358.5f, 224.5f)
                curveToRelative(-14.8f, -13.2f, -46.2f, -13.2f, -61.0f, 0.0f)
                lineTo(288.0f, 233.0f)
                curveToRelative(-8.3f, 7.4f, -21.6f, 0.4f, -19.8f, -10.8f)
                curveToRelative(4.0f, -25.2f, 34.2f, -42.1f, 59.9f, -42.1f)
                reflectiveCurveTo(384.0f, 197.0f, 388.0f, 222.2f)
                curveToRelative(1.7f, 11.1f, -11.4f, 18.3f, -19.8f, 10.8f)
                lineToRelative(-9.7f, -8.5f)
                close()
                moveTo(157.8f, 325.8f)
                curveTo(180.2f, 352.7f, 213.0f, 368.0f, 248.0f, 368.0f)
                reflectiveCurveToRelative(67.8f, -15.4f, 90.2f, -42.2f)
                curveToRelative(13.6f, -16.2f, 38.1f, 4.2f, 24.6f, 20.5f)
                curveTo(334.3f, 380.4f, 292.5f, 400.0f, 248.0f, 400.0f)
                reflectiveCurveToRelative(-86.3f, -19.6f, -114.8f, -53.8f)
                curveToRelative(-13.5f, -16.3f, 11.2f, -36.7f, 24.6f, -20.4f)
                close()
            }
        }
        .build()
        return _smileWink!!
    }

private var _smileWink: ImageVector? = null
