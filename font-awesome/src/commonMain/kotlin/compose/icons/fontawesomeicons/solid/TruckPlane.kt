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

public val SolidGroup.TruckPlane: ImageVector
    get() {
        if (_truckPlane != null) {
            return _truckPlane!!
        }
        _truckPlane = Builder(name = "TruckPlane", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 0.0f)
                curveToRelative(-30.6f, 0.0f, -56.0f, 54.7f, -56.0f, 86.1f)
                lineTo(144.0f, 192.5f)
                lineTo(7.8f, 274.3f)
                curveTo(2.9f, 277.2f, 0.0f, 282.4f, 0.0f, 288.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 5.1f, 2.4f, 9.8f, 6.4f, 12.8f)
                reflectiveCurveToRelative(9.3f, 3.9f, 14.1f, 2.5f)
                lineToRelative(123.4f, -37.0f)
                verticalLineToRelative(81.2f)
                lineToRelative(-50.0f, 40.0f)
                curveToRelative(-3.8f, 3.0f, -6.0f, 7.6f, -6.0f, 12.5f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 5.1f, 2.5f, 10.0f, 6.6f, 13.0f)
                reflectiveCurveToRelative(9.5f, 3.8f, 14.4f, 2.2f)
                lineTo(200.0f, 480.9f)
                lineTo(290.4f, 511.0f)
                curveToRelative(-1.6f, -4.7f, -2.4f, -9.8f, -2.4f, -15.0f)
                lineTo(288.0f, 463.4f)
                curveToRelative(-18.2f, -10.5f, -30.7f, -29.7f, -31.9f, -51.8f)
                lineToRelative(-0.1f, -0.1f)
                lineTo(256.0f, 408.0f)
                lineTo(256.0f, 325.5f)
                lineTo(256.0f, 184.0f)
                lineToRelative(0.0f, -1.1f)
                lineToRelative(0.0f, 0.0f)
                lineTo(256.0f, 86.1f)
                curveTo(256.0f, 54.7f, 231.5f, 0.0f, 200.0f, 0.0f)
                close()
                moveTo(288.0f, 176.0f)
                lineTo(288.0f, 400.0f)
                curveToRelative(0.0f, 20.9f, 13.4f, 38.7f, 32.0f, 45.3f)
                lineTo(320.0f, 488.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                lineTo(384.0f, 448.0f)
                lineTo(544.0f, 448.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                lineTo(608.0f, 445.3f)
                curveToRelative(18.6f, -6.6f, 32.0f, -24.4f, 32.0f, -45.3f)
                lineTo(640.0f, 176.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                lineTo(336.0f, 128.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                close()
                moveTo(367.8f, 254.7f)
                curveToRelative(3.3f, -8.7f, 11.2f, -14.7f, 20.5f, -14.7f)
                lineTo(539.7f, 240.0f)
                curveToRelative(9.2f, 0.0f, 17.2f, 6.0f, 20.5f, 14.7f)
                lineTo(576.0f, 304.0f)
                lineTo(352.0f, 304.0f)
                lineToRelative(15.8f, -49.3f)
                close()
                moveTo(568.0f, 352.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, -48.0f)
                close()
                moveTo(336.0f, 376.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 48.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -48.0f, 0.0f)
                close()
            }
        }
        .build()
        return _truckPlane!!
    }

private var _truckPlane: ImageVector? = null
