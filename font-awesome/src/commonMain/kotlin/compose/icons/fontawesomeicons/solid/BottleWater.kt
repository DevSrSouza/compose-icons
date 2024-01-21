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

public val SolidGroup.BottleWater: ImageVector
    get() {
        if (_bottleWater != null) {
            return _bottleWater!!
        }
        _bottleWater = Builder(name = "BottleWater", defaultWidth = 320.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 0.0f)
                horizontalLineToRelative(80.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                lineTo(224.0f, 64.0f)
                lineTo(96.0f, 64.0f)
                lineTo(96.0f, 24.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                close()
                moveTo(32.0f, 167.5f)
                curveToRelative(0.0f, -19.5f, 10.0f, -37.6f, 26.6f, -47.9f)
                lineToRelative(15.8f, -9.9f)
                curveTo(88.7f, 100.7f, 105.2f, 96.0f, 122.1f, 96.0f)
                horizontalLineToRelative(75.8f)
                curveToRelative(16.9f, 0.0f, 33.4f, 4.7f, 47.7f, 13.7f)
                lineToRelative(15.8f, 9.9f)
                curveTo(278.0f, 129.9f, 288.0f, 148.0f, 288.0f, 167.5f)
                curveToRelative(0.0f, 17.0f, -7.5f, 32.3f, -19.4f, 42.6f)
                curveTo(280.6f, 221.7f, 288.0f, 238.0f, 288.0f, 256.0f)
                curveToRelative(0.0f, 19.1f, -8.4f, 36.3f, -21.7f, 48.0f)
                curveToRelative(13.3f, 11.7f, 21.7f, 28.9f, 21.7f, 48.0f)
                reflectiveCurveToRelative(-8.4f, 36.3f, -21.7f, 48.0f)
                curveToRelative(13.3f, 11.7f, 21.7f, 28.9f, 21.7f, 48.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(96.0f, 512.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                curveToRelative(0.0f, -19.1f, 8.4f, -36.3f, 21.7f, -48.0f)
                curveTo(40.4f, 388.3f, 32.0f, 371.1f, 32.0f, 352.0f)
                reflectiveCurveToRelative(8.4f, -36.3f, 21.7f, -48.0f)
                curveTo(40.4f, 292.3f, 32.0f, 275.1f, 32.0f, 256.0f)
                curveToRelative(0.0f, -18.0f, 7.4f, -34.3f, 19.4f, -45.9f)
                curveTo(39.5f, 199.7f, 32.0f, 184.5f, 32.0f, 167.5f)
                close()
                moveTo(96.0f, 240.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                reflectiveCurveToRelative(-7.2f, -16.0f, -16.0f, -16.0f)
                lineTo(112.0f, 224.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                close()
                moveTo(112.0f, 352.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                reflectiveCurveToRelative(7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                reflectiveCurveToRelative(-7.2f, -16.0f, -16.0f, -16.0f)
                lineTo(112.0f, 352.0f)
                close()
            }
        }
        .build()
        return _bottleWater!!
    }

private var _bottleWater: ImageVector? = null
