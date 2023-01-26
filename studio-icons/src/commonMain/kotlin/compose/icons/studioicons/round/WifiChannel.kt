package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.WifiChannel: ImageVector
    get() {
        if (_wifiChannel != null) {
            return _wifiChannel!!
        }
        _wifiChannel = Builder(name = "WifiChannel", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.13f, 21.0f)
                curveToRelative(0.5f, 0.0f, 0.92f, -0.38f, 0.99f, -0.87f)
                curveToRelative(0.65f, -4.89f, 1.95f, -9.01f, 2.88f, -10.0f)
                curveToRelative(0.91f, 0.98f, 2.19f, 5.01f, 2.86f, 9.82f)
                curveToRelative(0.08f, 0.6f, 0.59f, 1.05f, 1.19f, 1.05f)
                curveToRelative(0.54f, 0.0f, 1.02f, -0.36f, 1.16f, -0.89f)
                curveTo(13.83f, 17.73f, 15.11f, 15.0f, 16.0f, 15.0f)
                curveToRelative(0.9f, 0.0f, 2.19f, 2.83f, 2.81f, 5.2f)
                curveToRelative(0.12f, 0.48f, 0.56f, 0.8f, 1.05f, 0.8f)
                curveToRelative(0.62f, 0.0f, 1.12f, -0.52f, 1.09f, -1.14f)
                curveTo(20.75f, 15.89f, 19.81f, 3.0f, 16.0f, 3.0f)
                curveToRelative(-2.51f, 0.0f, -3.77f, 5.61f, -4.4f, 10.57f)
                curveTo(10.79f, 10.66f, 9.61f, 8.0f, 8.0f, 8.0f)
                curveToRelative(-2.92f, 0.0f, -4.41f, 8.71f, -4.85f, 11.87f)
                curveTo(3.06f, 20.47f, 3.53f, 21.0f, 4.13f, 21.0f)
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
