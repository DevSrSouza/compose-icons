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

public val SolidGroup.Car: ImageVector
    get() {
        if (_car != null) {
            return _car!!
        }
        _car = Builder(name = "Car", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(135.2f, 117.4f)
                lineTo(109.1f, 192.0f)
                lineTo(402.9f, 192.0f)
                lineToRelative(-26.1f, -74.6f)
                curveTo(372.3f, 104.6f, 360.2f, 96.0f, 346.6f, 96.0f)
                lineTo(165.4f, 96.0f)
                curveToRelative(-13.6f, 0.0f, -25.7f, 8.6f, -30.2f, 21.4f)
                close()
                moveTo(39.6f, 196.8f)
                lineTo(74.8f, 96.3f)
                curveTo(88.3f, 57.8f, 124.6f, 32.0f, 165.4f, 32.0f)
                lineTo(346.6f, 32.0f)
                curveToRelative(40.8f, 0.0f, 77.1f, 25.8f, 90.6f, 64.3f)
                lineToRelative(35.2f, 100.5f)
                curveToRelative(23.2f, 9.6f, 39.6f, 32.5f, 39.6f, 59.2f)
                lineTo(512.0f, 400.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(448.0f, 480.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(416.0f, 400.0f)
                lineTo(96.0f, 400.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(32.0f, 480.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(0.0f, 400.0f)
                lineTo(0.0f, 256.0f)
                curveToRelative(0.0f, -26.7f, 16.4f, -49.6f, 39.6f, -59.2f)
                close()
                moveTo(128.0f, 288.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 64.0f, 0.0f)
                close()
                moveTo(416.0f, 320.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, 64.0f)
                close()
            }
        }
        .build()
        return _car!!
    }

private var _car: ImageVector? = null
