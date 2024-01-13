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

public val SolidGroup.CarRear: ImageVector
    get() {
        if (_carRear != null) {
            return _carRear!!
        }
        _carRear = Builder(name = "CarRear", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(165.4f, 96.0f)
                lineTo(346.6f, 96.0f)
                curveToRelative(13.6f, 0.0f, 25.7f, 8.6f, 30.2f, 21.4f)
                lineTo(402.9f, 192.0f)
                lineTo(109.1f, 192.0f)
                lineToRelative(26.1f, -74.6f)
                curveToRelative(4.5f, -12.8f, 16.6f, -21.4f, 30.2f, -21.4f)
                close()
                moveTo(74.8f, 96.3f)
                lineTo(39.6f, 196.8f)
                curveTo(16.4f, 206.4f, 0.0f, 229.3f, 0.0f, 256.0f)
                verticalLineToRelative(80.0f)
                curveToRelative(0.0f, 23.7f, 12.9f, 44.4f, 32.0f, 55.4f)
                lineTo(32.0f, 448.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(96.0f, 480.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(128.0f, 400.0f)
                lineTo(384.0f, 400.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(480.0f, 391.4f)
                curveToRelative(19.1f, -11.1f, 32.0f, -31.7f, 32.0f, -55.4f)
                lineTo(512.0f, 256.0f)
                curveToRelative(0.0f, -26.7f, -16.4f, -49.6f, -39.6f, -59.2f)
                lineTo(437.2f, 96.3f)
                curveTo(423.7f, 57.8f, 387.4f, 32.0f, 346.6f, 32.0f)
                lineTo(165.4f, 32.0f)
                curveToRelative(-40.8f, 0.0f, -77.1f, 25.8f, -90.6f, 64.3f)
                close()
                moveTo(208.0f, 272.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                lineTo(208.0f, 336.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                lineTo(192.0f, 288.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                close()
                moveTo(48.0f, 280.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                lineTo(72.0f, 304.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                close()
                moveTo(408.0f, 256.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                lineTo(408.0f, 304.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.7f, -24.0f, 24.0f, -24.0f)
                close()
            }
        }
        .build()
        return _carRear!!
    }

private var _carRear: ImageVector? = null
