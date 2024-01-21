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

public val SolidGroup.PlaneArrival: ImageVector
    get() {
        if (_planeArrival != null) {
            return _planeArrival!!
        }
        _planeArrival = Builder(name = "PlaneArrival", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.3f, 166.9f)
                lineTo(0.0f, 68.0f)
                curveTo(0.0f, 57.7f, 9.5f, 50.1f, 19.5f, 52.3f)
                lineToRelative(35.6f, 7.9f)
                curveToRelative(10.6f, 2.3f, 19.2f, 9.9f, 23.0f, 20.0f)
                lineTo(96.0f, 128.0f)
                lineToRelative(127.3f, 37.6f)
                lineTo(181.8f, 20.4f)
                curveTo(178.9f, 10.2f, 186.6f, 0.0f, 197.2f, 0.0f)
                horizontalLineToRelative(40.1f)
                curveToRelative(11.6f, 0.0f, 22.2f, 6.2f, 27.9f, 16.3f)
                lineToRelative(109.0f, 193.8f)
                lineToRelative(107.2f, 31.7f)
                curveToRelative(15.9f, 4.7f, 30.8f, 12.5f, 43.7f, 22.8f)
                lineToRelative(34.4f, 27.6f)
                curveToRelative(24.0f, 19.2f, 18.1f, 57.3f, -10.7f, 68.2f)
                curveToRelative(-41.2f, 15.6f, -86.2f, 18.1f, -128.8f, 7.0f)
                lineTo(121.7f, 289.8f)
                curveToRelative(-11.1f, -2.9f, -21.2f, -8.7f, -29.3f, -16.9f)
                lineTo(9.5f, 189.4f)
                curveToRelative(-5.9f, -6.0f, -9.3f, -14.1f, -9.3f, -22.5f)
                close()
                moveTo(32.0f, 448.0f)
                lineTo(608.0f, 448.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(32.0f, 512.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                close()
                moveTo(128.0f, 368.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
                moveTo(256.0f, 352.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
            }
        }
        .build()
        return _planeArrival!!
    }

private var _planeArrival: ImageVector? = null
