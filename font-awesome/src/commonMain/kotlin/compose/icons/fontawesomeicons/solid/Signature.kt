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

public val SolidGroup.Signature: ImageVector
    get() {
        if (_signature != null) {
            return _signature!!
        }
        _signature = Builder(name = "Signature", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(623.2f, 192.0f)
                curveToRelative(-51.8f, 3.5f, -125.7f, 54.7f, -163.1f, 71.5f)
                curveToRelative(-29.1f, 13.1f, -54.2f, 24.4f, -76.1f, 24.4f)
                curveToRelative(-22.6f, 0.0f, -26.0f, -16.2f, -21.3f, -51.9f)
                curveToRelative(1.1f, -8.0f, 11.7f, -79.2f, -42.7f, -76.1f)
                curveToRelative(-25.1f, 1.5f, -64.3f, 24.8f, -169.5f, 126.0f)
                lineTo(192.0f, 182.2f)
                curveToRelative(30.4f, -75.9f, -53.2f, -151.5f, -129.7f, -102.8f)
                lineTo(7.4f, 116.3f)
                curveTo(0.0f, 121.0f, -2.2f, 130.9f, 2.5f, 138.4f)
                lineToRelative(17.2f, 27.0f)
                curveToRelative(4.7f, 7.5f, 14.6f, 9.7f, 22.1f, 4.9f)
                lineToRelative(58.0f, -38.9f)
                curveToRelative(18.4f, -11.7f, 40.7f, 7.2f, 32.7f, 27.1f)
                lineTo(34.3f, 404.1f)
                curveTo(27.5f, 421.0f, 37.0f, 448.0f, 64.0f, 448.0f)
                curveToRelative(8.3f, 0.0f, 16.5f, -3.2f, 22.6f, -9.4f)
                curveToRelative(42.2f, -42.2f, 154.7f, -150.7f, 211.2f, -195.8f)
                curveToRelative(-2.2f, 28.5f, -2.1f, 58.9f, 20.6f, 83.8f)
                curveToRelative(15.3f, 16.8f, 37.3f, 25.3f, 65.5f, 25.3f)
                curveToRelative(35.6f, 0.0f, 68.0f, -14.6f, 102.3f, -30.0f)
                curveToRelative(33.0f, -14.8f, 99.0f, -62.6f, 138.4f, -65.8f)
                curveToRelative(8.5f, -0.7f, 15.2f, -7.3f, 15.2f, -15.8f)
                verticalLineToRelative(-32.1f)
                curveToRelative(0.2f, -9.1f, -7.5f, -16.8f, -16.6f, -16.2f)
                close()
            }
        }
        .build()
        return _signature!!
    }

private var _signature: ImageVector? = null
