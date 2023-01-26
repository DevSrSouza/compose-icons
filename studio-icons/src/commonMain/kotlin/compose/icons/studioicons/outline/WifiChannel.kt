package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.WifiChannel: ImageVector
    get() {
        if (_wifiChannel != null) {
            return _wifiChannel!!
        }
        _wifiChannel = Builder(name = "WifiChannel", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveToRelative(-2.51f, 0.0f, -3.77f, 5.61f, -4.4f, 10.57f)
                curveTo(10.79f, 10.66f, 9.61f, 8.0f, 8.0f, 8.0f)
                curveTo(4.43f, 8.0f, 3.0f, 21.0f, 3.0f, 21.0f)
                horizontalLineToRelative(2.01f)
                curveToRelative(0.61f, -5.27f, 2.0f, -9.82f, 2.99f, -10.87f)
                curveToRelative(0.98f, 1.05f, 2.38f, 5.61f, 2.99f, 10.87f)
                horizontalLineTo(13.0f)
                curveToRelative(0.5f, -2.53f, 2.0f, -6.0f, 3.0f, -6.0f)
                reflectiveCurveToRelative(2.5f, 3.53f, 3.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                curveTo(21.0f, 21.0f, 20.5f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 13.0f)
                curveToRelative(-0.99f, 0.0f, -1.82f, 0.62f, -2.5f, 1.5f)
                curveToRelative(0.57f, -4.77f, 1.54f, -8.62f, 2.5f, -9.44f)
                curveToRelative(0.97f, 0.81f, 1.91f, 4.67f, 2.49f, 9.43f)
                curveTo(17.81f, 13.62f, 16.98f, 13.0f, 16.0f, 13.0f)
                close()
            }
        }
        .build()
        return _wifiChannel!!
    }

private var _wifiChannel: ImageVector? = null
