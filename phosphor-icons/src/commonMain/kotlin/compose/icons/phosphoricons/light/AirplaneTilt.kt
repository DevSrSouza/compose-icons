package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.AirplaneTilt: ImageVector
    get() {
        if (_airplaneTilt != null) {
            return _airplaneTilt!!
        }
        _airplaneTilt = Builder(name = "AirplaneTilt", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.8f, 83.5f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -44.0f, -40.7f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -0.8f, 1.0f)
                lineTo(142.3f, 73.0f)
                lineTo(58.1f, 42.4f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -6.3f, 1.4f)
                lineToRelative(-24.0f, 24.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 26.0f, 72.6f)
                arcTo(6.1f, 6.1f, 0.0f, false, false, 28.7f, 77.0f)
                lineToRelative(65.9f, 43.9f)
                lineTo(77.5f, 138.0f)
                lineTo(56.0f, 138.0f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, false, -4.2f, 1.8f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, -1.6f, 5.6f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 3.9f, 4.3f)
                lineToRelative(39.0f, 13.2f)
                lineToRelative(13.2f, 39.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 4.3f, 3.9f)
                lineToRelative(1.4f, 0.2f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, false, 4.2f, -1.8f)
                lineToRelative(24.0f, -24.0f)
                arcTo(5.6f, 5.6f, 0.0f, false, false, 118.0f, 200.0f)
                lineTo(118.0f, 178.7f)
                lineToRelative(17.1f, -15.6f)
                lineTo(179.0f, 227.4f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, false, 4.4f, 2.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.8f, -1.8f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 1.4f, -6.3f)
                lineTo(183.0f, 113.7f)
                lineToRelative(30.8f, -28.9f)
                arcTo(6.4f, 6.4f, 0.0f, false, false, 214.8f, 83.5f)
                close()
                moveTo(204.7f, 76.7f)
                lineTo(204.3f, 77.2f)
                lineTo(171.9f, 107.6f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -1.5f, 6.5f)
                lineToRelative(30.7f, 84.4f)
                lineToRelative(-16.2f, 16.1f)
                lineToRelative(-43.8f, -64.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, -4.2f, -2.5f)
                horizontalLineToRelative(-0.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -4.0f, 1.6f)
                lineToRelative(-24.2f, 22.0f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, -2.0f, 4.4f)
                verticalLineToRelative(21.5f)
                lineTo(90.6f, 212.9f)
                lineTo(79.5f, 180.2f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, -3.8f, -3.7f)
                lineTo(43.1f, 165.4f)
                lineTo(58.5f, 150.0f)
                lineTo(80.0f, 150.0f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, false, 4.2f, -1.8f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.8f, -4.8f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, -2.7f, -4.4f)
                lineTo(41.4f, 71.1f)
                lineTo(57.5f, 54.9f)
                lineToRelative(84.4f, 30.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 6.5f, -1.5f)
                lineToRelative(31.7f, -33.5f)
                lineToRelative(0.2f, -0.3f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 24.4f, 26.4f)
                close()
            }
        }
        .build()
        return _airplaneTilt!!
    }

private var _airplaneTilt: ImageVector? = null
