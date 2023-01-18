package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.WifiNone: ImageVector
    get() {
        if (_wifiNone != null) {
            return _wifiNone!!
        }
        _wifiNone = Builder(name = "WifiNone", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 219.7f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -12.1f, -5.6f)
                lineTo(12.9f, 92.7f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 9.2f, 80.5f)
                arcToRelative(16.3f, 16.3f, 0.0f, false, true, 6.2f, -11.0f)
                curveToRelative(66.3f, -50.0f, 158.9f, -50.0f, 225.2f, 0.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, 2.5f, 23.2f)
                lineToRelative(-103.0f, 121.4f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 219.7f)
                close()
                moveTo(25.1f, 82.3f)
                horizontalLineToRelative(0.0f)
                lineTo(128.0f, 203.6f)
                lineTo(230.9f, 82.4f)
                verticalLineToRelative(-0.2f)
                curveTo(170.4f, 36.6f, 85.7f, 36.6f, 25.1f, 82.3f)
                close()
                moveTo(20.2f, 75.9f)
                close()
            }
        }
        .build()
        return _wifiNone!!
    }

private var _wifiNone: ImageVector? = null
