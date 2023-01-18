package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.AirplaneInFlight: ImageVector
    get() {
        if (_airplaneInFlight != null) {
            return _airplaneInFlight!!
        }
        _airplaneInFlight = Builder(name = "AirplaneInFlight", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(72.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(216.0f, 212.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 220.0f, 216.0f)
                close()
                moveTo(244.0f, 136.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(63.8f, 164.0f)
                arcToRelative(35.8f, 35.8f, 0.0f, false, true, -34.5f, -25.7f)
                lineToRelative(-14.0f, -46.9f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 1.8f, -10.6f)
                arcTo(12.1f, 12.1f, 0.0f, false, true, 26.8f, 76.0f)
                lineTo(44.0f, 76.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 3.1f, 1.4f)
                lineTo(65.9f, 100.0f)
                lineTo(90.5f, 100.0f)
                lineTo(79.7f, 67.8f)
                arcTo(11.9f, 11.9f, 0.0f, false, true, 81.4f, 57.0f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, true, 9.7f, -5.0f)
                lineTo(108.0f, 52.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 2.9f, 1.3f)
                lineTo(153.8f, 100.0f)
                lineTo(208.0f, 100.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 244.0f, 136.0f)
                close()
                moveTo(236.0f, 136.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, -28.0f, -28.0f)
                lineTo(152.0f, 108.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.9f, -1.3f)
                lineTo(106.2f, 60.0f)
                lineTo(91.1f, 60.0f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, false, -3.2f, 1.7f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, -0.6f, 3.6f)
                lineToRelative(12.5f, 37.4f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -0.6f, 3.6f)
                arcTo(3.7f, 3.7f, 0.0f, false, true, 96.0f, 108.0f)
                lineTo(64.0f, 108.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -3.1f, -1.4f)
                lineTo(42.1f, 84.0f)
                lineTo(26.8f, 84.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, -3.3f, 1.6f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, -0.6f, 3.5f)
                lineTo(37.0f, 136.0f)
                arcToRelative(27.8f, 27.8f, 0.0f, false, false, 26.8f, 20.0f)
                lineTo(236.0f, 156.0f)
                close()
            }
        }
        .build()
        return _airplaneInFlight!!
    }

private var _airplaneInFlight: ImageVector? = null
