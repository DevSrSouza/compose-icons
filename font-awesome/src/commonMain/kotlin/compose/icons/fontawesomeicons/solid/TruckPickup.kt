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

public val SolidGroup.TruckPickup: ImageVector
    get() {
        if (_truckPickup != null) {
            return _truckPickup!!
        }
        _truckPickup = Builder(name = "TruckPickup", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(624.0f, 288.0f)
                horizontalLineToRelative(-16.0f)
                verticalLineToRelative(-64.0f)
                curveToRelative(0.0f, -17.67f, -14.33f, -32.0f, -32.0f, -32.0f)
                horizontalLineToRelative(-48.0f)
                lineTo(419.22f, 56.02f)
                arcTo(64.025f, 64.025f, 0.0f, false, false, 369.24f, 32.0f)
                lineTo(256.0f, 32.0f)
                curveToRelative(-17.67f, 0.0f, -32.0f, 14.33f, -32.0f, 32.0f)
                verticalLineToRelative(128.0f)
                lineTo(64.0f, 192.0f)
                curveToRelative(-17.67f, 0.0f, -32.0f, 14.33f, -32.0f, 32.0f)
                verticalLineToRelative(64.0f)
                lineTo(16.0f, 288.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, 7.16f, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(49.61f)
                curveToRelative(-0.76f, 5.27f, -1.61f, 10.52f, -1.61f, 16.0f)
                curveToRelative(0.0f, 61.86f, 50.14f, 112.0f, 112.0f, 112.0f)
                reflectiveCurveToRelative(112.0f, -50.14f, 112.0f, -112.0f)
                curveToRelative(0.0f, -5.48f, -0.85f, -10.73f, -1.61f, -16.0f)
                horizontalLineToRelative(67.23f)
                curveToRelative(-0.76f, 5.27f, -1.61f, 10.52f, -1.61f, 16.0f)
                curveToRelative(0.0f, 61.86f, 50.14f, 112.0f, 112.0f, 112.0f)
                reflectiveCurveToRelative(112.0f, -50.14f, 112.0f, -112.0f)
                curveToRelative(0.0f, -5.48f, -0.85f, -10.73f, -1.61f, -16.0f)
                lineTo(624.0f, 352.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                close()
                moveTo(288.0f, 96.0f)
                horizontalLineToRelative(81.24f)
                lineToRelative(76.8f, 96.0f)
                lineTo(288.0f, 192.0f)
                lineTo(288.0f, 96.0f)
                close()
                moveTo(176.0f, 416.0f)
                curveToRelative(-26.47f, 0.0f, -48.0f, -21.53f, -48.0f, -48.0f)
                reflectiveCurveToRelative(21.53f, -48.0f, 48.0f, -48.0f)
                reflectiveCurveToRelative(48.0f, 21.53f, 48.0f, 48.0f)
                reflectiveCurveToRelative(-21.53f, 48.0f, -48.0f, 48.0f)
                close()
                moveTo(464.0f, 416.0f)
                curveToRelative(-26.47f, 0.0f, -48.0f, -21.53f, -48.0f, -48.0f)
                reflectiveCurveToRelative(21.53f, -48.0f, 48.0f, -48.0f)
                reflectiveCurveToRelative(48.0f, 21.53f, 48.0f, 48.0f)
                reflectiveCurveToRelative(-21.53f, 48.0f, -48.0f, 48.0f)
                close()
            }
        }
        .build()
        return _truckPickup!!
    }

private var _truckPickup: ImageVector? = null
