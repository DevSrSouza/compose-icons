package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.WifiMedium: ImageVector
    get() {
        if (_wifiMedium != null) {
            return _wifiMedium!!
        }
        _wifiMedium = Builder(name = "WifiMedium", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.6f, 69.6f)
                curveTo(174.3f, 19.5f, 81.7f, 19.5f, 15.4f, 69.5f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, -6.2f, 11.0f)
                arcTo(16.3f, 16.3f, 0.0f, false, false, 13.0f, 92.8f)
                lineTo(115.8f, 214.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 12.2f, 5.7f)
                horizontalLineToRelative(0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 12.1f, -5.6f)
                horizontalLineToRelative(0.0f)
                lineToRelative(103.0f, -121.4f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 3.7f, -12.2f)
                arcTo(15.6f, 15.6f, 0.0f, false, false, 240.6f, 69.6f)
                close()
                moveTo(25.0f, 82.3f)
                close()
                moveTo(204.5f, 113.5f)
                arcToRelative(131.0f, 131.0f, 0.0f, false, false, -17.0f, -10.7f)
                lineToRelative(-0.8f, -0.4f)
                arcTo(125.8f, 125.8f, 0.0f, false, false, 169.0f, 94.8f)
                lineToRelative(-1.6f, -0.4f)
                arcTo(115.2f, 115.2f, 0.0f, false, false, 149.0f, 89.8f)
                lineToRelative(-1.6f, -0.2f)
                arcToRelative(118.4f, 118.4f, 0.0f, false, false, -38.8f, 0.0f)
                lineToRelative(-1.6f, 0.2f)
                arcToRelative(115.2f, 115.2f, 0.0f, false, false, -18.4f, 4.6f)
                lineToRelative(-1.5f, 0.4f)
                arcToRelative(127.0f, 127.0f, 0.0f, false, false, -17.8f, 7.6f)
                lineToRelative(-0.8f, 0.4f)
                arcToRelative(123.5f, 123.5f, 0.0f, false, false, -16.9f, 10.7f)
                horizontalLineToRelative(0.0f)
                lineTo(25.1f, 82.3f)
                curveToRelative(60.6f, -45.7f, 145.3f, -45.7f, 205.8f, 0.1f)
                close()
            }
        }
        .build()
        return _wifiMedium!!
    }

private var _wifiMedium: ImageVector? = null
