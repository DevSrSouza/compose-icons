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
                moveTo(368.6f, 96.0f)
                lineToRelative(76.8f, 96.0f)
                lineTo(288.0f, 192.0f)
                lineTo(288.0f, 96.0f)
                horizontalLineToRelative(80.6f)
                close()
                moveTo(224.0f, 80.0f)
                lineTo(224.0f, 192.0f)
                lineTo(64.0f, 192.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(65.1f, 352.0f)
                curveToRelative(-0.7f, 5.2f, -1.1f, 10.6f, -1.1f, 16.0f)
                curveToRelative(0.0f, 61.9f, 50.1f, 112.0f, 112.0f, 112.0f)
                reflectiveCurveToRelative(112.0f, -50.1f, 112.0f, -112.0f)
                curveToRelative(0.0f, -5.4f, -0.4f, -10.8f, -1.1f, -16.0f)
                horizontalLineToRelative(66.3f)
                curveToRelative(-0.7f, 5.2f, -1.1f, 10.6f, -1.1f, 16.0f)
                curveToRelative(0.0f, 61.9f, 50.1f, 112.0f, 112.0f, 112.0f)
                reflectiveCurveToRelative(112.0f, -50.1f, 112.0f, -112.0f)
                curveToRelative(0.0f, -5.4f, -0.4f, -10.8f, -1.1f, -16.0f)
                lineTo(608.0f, 352.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(608.0f, 224.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(527.4f, 192.0f)
                lineTo(418.6f, 56.0f)
                curveToRelative(-12.1f, -15.2f, -30.5f, -24.0f, -50.0f, -24.0f)
                lineTo(272.0f, 32.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                close()
                moveTo(224.0f, 368.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 96.0f, 0.0f)
                close()
                moveTo(512.0f, 368.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 96.0f, 0.0f)
                close()
            }
        }
        .build()
        return _truckPickup!!
    }

private var _truckPickup: ImageVector? = null
