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

public val LightGroup.AirplaneInFlight: ImageVector
    get() {
        if (_airplaneInFlight != null) {
            return _airplaneInFlight!!
        }
        _airplaneInFlight = Builder(name = "AirplaneInFlight", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.0f, 216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(72.0f, 222.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(216.0f, 210.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 222.0f, 216.0f)
                close()
                moveTo(246.0f, 136.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(63.8f, 166.0f)
                arcToRelative(37.8f, 37.8f, 0.0f, false, true, -36.4f, -27.1f)
                lineTo(13.3f, 92.0f)
                arcToRelative(14.4f, 14.4f, 0.0f, false, true, 2.2f, -12.4f)
                arcTo(14.2f, 14.2f, 0.0f, false, true, 26.8f, 74.0f)
                lineTo(44.0f, 74.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, 4.6f, 2.2f)
                lineTo(66.8f, 98.0f)
                lineTo(87.7f, 98.0f)
                lineTo(77.8f, 68.4f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 91.1f, 50.0f)
                lineTo(108.0f, 50.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.4f, 1.9f)
                lineTo(154.6f, 98.0f)
                lineTo(208.0f, 98.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, true, 246.0f, 136.0f)
                close()
                moveTo(234.0f, 136.0f)
                arcToRelative(26.1f, 26.1f, 0.0f, false, false, -26.0f, -26.0f)
                lineTo(152.0f, 110.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.4f, -1.9f)
                lineTo(105.4f, 62.0f)
                lineTo(91.1f, 62.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, -1.6f, 0.8f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.3f, 1.8f)
                lineToRelative(12.5f, 37.5f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 96.0f, 110.0f)
                lineTo(64.0f, 110.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -4.6f, -2.2f)
                lineTo(41.2f, 86.0f)
                lineTo(26.8f, 86.0f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, false, -1.7f, 0.8f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, -0.3f, 1.8f)
                lineToRelative(14.1f, 46.9f)
                arcTo(25.7f, 25.7f, 0.0f, false, false, 63.8f, 154.0f)
                lineTo(234.0f, 154.0f)
                close()
            }
        }
        .build()
        return _airplaneInFlight!!
    }

private var _airplaneInFlight: ImageVector? = null
