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

public val SolidGroup.FireBurner: ImageVector
    get() {
        if (_fireBurner != null) {
            return _fireBurner!!
        }
        _fireBurner = Builder(name = "FireBurner", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 352.0f)
                curveToRelative(-88.4f, 0.0f, -160.0f, -71.6f, -160.0f, -160.0f)
                curveToRelative(0.0f, -76.7f, 62.5f, -144.7f, 107.2f, -179.4f)
                curveToRelative(5.0f, -3.9f, 10.9f, -5.8f, 16.8f, -5.8f)
                curveToRelative(7.9f, -0.1f, 16.0f, 3.1f, 22.0f, 9.2f)
                lineToRelative(46.0f, 46.0f)
                lineToRelative(11.3f, -11.3f)
                curveToRelative(11.7f, -11.7f, 30.6f, -12.7f, 42.3f, -1.0f)
                curveTo(464.5f, 108.0f, 480.0f, 160.2f, 480.0f, 192.0f)
                curveToRelative(0.0f, 88.4f, -71.6f, 160.0f, -160.0f, 160.0f)
                close()
                moveTo(384.0f, 240.2f)
                curveToRelative(0.0f, -36.5f, -37.0f, -73.0f, -54.8f, -88.4f)
                curveToRelative(-5.4f, -4.7f, -13.1f, -4.7f, -18.5f, 0.0f)
                curveTo(293.0f, 167.1f, 256.0f, 203.6f, 256.0f, 240.2f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                reflectiveCurveToRelative(64.0f, -28.7f, 64.0f, -64.0f)
                close()
                moveTo(32.0f, 288.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineTo(96.0f, 256.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                verticalLineToRelative(64.0f)
                lineTo(544.0f, 384.0f)
                lineTo(544.0f, 320.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(32.0f, 512.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineTo(32.0f, 288.0f)
                close()
                moveTo(320.0f, 480.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, 64.0f)
                close()
                moveTo(480.0f, 448.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 64.0f, 0.0f)
                close()
                moveTo(192.0f, 480.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, 64.0f)
                close()
            }
        }
        .build()
        return _fireBurner!!
    }

private var _fireBurner: ImageVector? = null
