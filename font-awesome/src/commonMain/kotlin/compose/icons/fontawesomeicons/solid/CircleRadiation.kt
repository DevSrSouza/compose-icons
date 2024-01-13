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

public val SolidGroup.CircleRadiation: ImageVector
    get() {
        if (_circleRadiation != null) {
            return _circleRadiation!!
        }
        _circleRadiation = Builder(name = "CircleRadiation", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 64.0f)
                arcToRelative(192.0f, 192.0f, 0.0f, true, true, 0.0f, 384.0f)
                arcToRelative(192.0f, 192.0f, 0.0f, true, true, 0.0f, -384.0f)
                close()
                moveTo(256.0f, 512.0f)
                arcTo(256.0f, 256.0f, 0.0f, true, false, 256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, 512.0f)
                close()
                moveTo(200.0f, 256.0f)
                curveToRelative(0.0f, -20.7f, 11.3f, -38.8f, 28.0f, -48.5f)
                lineToRelative(-36.0f, -62.3f)
                curveToRelative(-8.8f, -15.3f, -28.7f, -20.8f, -42.0f, -9.0f)
                curveToRelative(-25.6f, 22.6f, -43.9f, 53.3f, -50.9f, 88.1f)
                curveTo(95.7f, 241.5f, 110.3f, 256.0f, 128.0f, 256.0f)
                lineToRelative(72.0f, 0.0f)
                close()
                moveTo(228.0f, 304.5f)
                lineToRelative(-36.0f, 62.4f)
                curveToRelative(-8.8f, 15.3f, -3.6f, 35.2f, 13.1f, 40.8f)
                curveToRelative(16.0f, 5.4f, 33.1f, 8.3f, 50.9f, 8.3f)
                reflectiveCurveToRelative(34.9f, -2.9f, 50.9f, -8.3f)
                curveToRelative(16.7f, -5.6f, 21.9f, -25.5f, 13.1f, -40.8f)
                lineToRelative(-36.0f, -62.4f)
                curveToRelative(-8.2f, 4.8f, -17.8f, 7.5f, -28.0f, 7.5f)
                reflectiveCurveToRelative(-19.8f, -2.7f, -28.0f, -7.5f)
                close()
                moveTo(312.0f, 256.0f)
                lineToRelative(72.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.3f, -14.5f, 28.8f, -31.8f)
                curveToRelative(-7.0f, -34.8f, -25.3f, -65.5f, -50.9f, -88.1f)
                curveToRelative(-13.2f, -11.7f, -33.1f, -6.3f, -42.0f, 9.0f)
                lineToRelative(-36.0f, 62.3f)
                curveToRelative(16.7f, 9.7f, 28.0f, 27.8f, 28.0f, 48.5f)
                close()
                moveTo(256.0f, 288.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, 64.0f)
                close()
            }
        }
        .build()
        return _circleRadiation!!
    }

private var _circleRadiation: ImageVector? = null
