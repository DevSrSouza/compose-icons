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

public val RoundGroup.WifiTethering: ImageVector
    get() {
        if (_wifiTethering != null) {
            return _wifiTethering!!
        }
        _wifiTethering = Builder(name = "WifiTethering", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 11.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(18.0f, 13.0f)
                curveToRelative(0.0f, -3.56f, -3.11f, -6.4f, -6.75f, -5.95f)
                curveToRelative(-2.62f, 0.32f, -4.78f, 2.41f, -5.18f, 5.02f)
                curveToRelative(-0.33f, 2.15f, 0.49f, 4.11f, 1.93f, 5.4f)
                curveToRelative(0.48f, 0.43f, 1.23f, 0.33f, 1.56f, -0.23f)
                lineToRelative(0.01f, -0.01f)
                curveToRelative(0.24f, -0.42f, 0.14f, -0.93f, -0.22f, -1.26f)
                curveToRelative(-1.03f, -0.93f, -1.59f, -2.37f, -1.22f, -3.94f)
                curveToRelative(0.33f, -1.42f, 1.48f, -2.57f, 2.9f, -2.91f)
                curveTo(13.65f, 8.49f, 16.0f, 10.47f, 16.0f, 13.0f)
                curveToRelative(0.0f, 1.18f, -0.52f, 2.23f, -1.33f, 2.96f)
                curveToRelative(-0.36f, 0.32f, -0.47f, 0.84f, -0.23f, 1.26f)
                lineToRelative(0.01f, 0.01f)
                curveToRelative(0.31f, 0.53f, 1.03f, 0.69f, 1.5f, 0.28f)
                curveTo(17.2f, 16.41f, 18.0f, 14.8f, 18.0f, 13.0f)
                close()
                moveTo(10.83f, 3.07f)
                curveToRelative(-4.62f, 0.52f, -8.35f, 4.33f, -8.78f, 8.96f)
                curveToRelative(-0.35f, 3.7f, 1.32f, 7.02f, 4.02f, 9.01f)
                curveToRelative(0.48f, 0.35f, 1.16f, 0.2f, 1.46f, -0.31f)
                curveToRelative(0.25f, -0.43f, 0.14f, -0.99f, -0.26f, -1.29f)
                curveToRelative(-2.28f, -1.69f, -3.65f, -4.55f, -3.16f, -7.7f)
                curveToRelative(0.54f, -3.5f, 3.46f, -6.29f, 6.98f, -6.68f)
                curveTo(15.91f, 4.51f, 20.0f, 8.28f, 20.0f, 13.0f)
                curveToRelative(0.0f, 2.65f, -1.29f, 4.98f, -3.27f, 6.44f)
                curveToRelative(-0.4f, 0.3f, -0.51f, 0.85f, -0.26f, 1.29f)
                curveToRelative(0.3f, 0.52f, 0.98f, 0.66f, 1.46f, 0.31f)
                curveTo(20.4f, 19.22f, 22.0f, 16.3f, 22.0f, 13.0f)
                curveToRelative(0.0f, -5.91f, -5.13f, -10.62f, -11.17f, -9.93f)
                close()
            }
        }
        .build()
        return _wifiTethering!!
    }

private var _wifiTethering: ImageVector? = null
