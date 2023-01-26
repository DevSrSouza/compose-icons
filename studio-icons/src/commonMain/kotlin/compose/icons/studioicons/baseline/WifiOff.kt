package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.WifiOff: ImageVector
    get() {
        if (_wifiOff != null) {
            return _wifiOff!!
        }
        _wifiOff = Builder(name = "WifiOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.99f, 9.0f)
                curveTo(19.15f, 5.16f, 13.8f, 3.76f, 8.84f, 4.78f)
                lineToRelative(2.52f, 2.52f)
                curveToRelative(3.47f, -0.17f, 6.99f, 1.05f, 9.63f, 3.7f)
                lineToRelative(2.0f, -2.0f)
                close()
                moveTo(18.99f, 13.0f)
                curveToRelative(-1.29f, -1.29f, -2.84f, -2.13f, -4.49f, -2.56f)
                lineToRelative(3.53f, 3.53f)
                lineToRelative(0.96f, -0.97f)
                close()
                moveTo(2.0f, 3.05f)
                lineTo(5.07f, 6.1f)
                curveTo(3.6f, 6.82f, 2.22f, 7.78f, 1.0f, 9.0f)
                lineToRelative(1.99f, 2.0f)
                curveToRelative(1.24f, -1.24f, 2.67f, -2.16f, 4.2f, -2.77f)
                lineToRelative(2.24f, 2.24f)
                curveTo(7.81f, 10.89f, 6.27f, 11.73f, 5.0f, 13.0f)
                verticalLineToRelative(0.01f)
                lineTo(6.99f, 15.0f)
                curveToRelative(1.36f, -1.36f, 3.14f, -2.04f, 4.92f, -2.06f)
                lineTo(18.98f, 20.0f)
                lineToRelative(1.27f, -1.26f)
                lineTo(3.29f, 1.79f)
                lineTo(2.0f, 3.05f)
                close()
                moveTo(9.0f, 17.0f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(3.0f, -3.0f)
                curveToRelative(-1.65f, -1.66f, -4.34f, -1.66f, -6.0f, 0.0f)
                close()
            }
        }
        .build()
        return _wifiOff!!
    }

private var _wifiOff: ImageVector? = null
