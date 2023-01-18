package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.AirplaneLanding: ImageVector
    get() {
        if (_airplaneLanding != null) {
            return _airplaneLanding!!
        }
        _airplaneLanding = Builder(name = "AirplaneLanding", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(96.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(240.0f, 204.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 252.0f, 216.0f)
                close()
                moveTo(220.8f, 195.6f)
                lineTo(44.1f, 146.1f)
                arcTo(44.1f, 44.1f, 0.0f, false, true, 12.0f, 103.7f)
                lineTo(12.0f, 51.1f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 26.3f, -19.0f)
                lineToRelative(13.5f, 4.5f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 6.8f, 5.8f)
                lineTo(72.3f, 68.0f)
                lineTo(84.0f, 71.7f)
                lineTo(84.0f, 51.1f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 26.3f, -19.0f)
                lineToRelative(13.5f, 4.5f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, true, 6.6f, 5.4f)
                lineTo(160.0f, 93.8f)
                lineToRelative(43.8f, 12.1f)
                arcTo(44.2f, 44.2f, 0.0f, false, true, 236.0f, 148.3f)
                lineTo(236.0f, 184.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -12.0f, 12.0f)
                arcTo(11.2f, 11.2f, 0.0f, false, true, 220.8f, 195.6f)
                close()
                moveTo(212.0f, 148.3f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, -14.6f, -19.2f)
                lineToRelative(-48.6f, -13.5f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, true, -7.2f, -5.6f)
                lineTo(111.9f, 57.9f)
                lineTo(108.0f, 56.6f)
                lineTo(108.0f, 88.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -4.9f, 9.7f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, true, -10.7f, 1.8f)
                lineToRelative(-32.0f, -10.0f)
                arcToRelative(12.4f, 12.4f, 0.0f, false, true, -7.0f, -5.9f)
                lineTo(39.7f, 57.9f)
                lineTo(36.0f, 56.6f)
                verticalLineToRelative(47.1f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 50.6f, 123.0f)
                lineTo(212.0f, 168.2f)
                close()
            }
        }
        .build()
        return _airplaneLanding!!
    }

private var _airplaneLanding: ImageVector? = null
