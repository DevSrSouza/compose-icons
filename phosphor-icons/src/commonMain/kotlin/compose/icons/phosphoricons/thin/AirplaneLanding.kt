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

public val ThinGroup.AirplaneLanding: ImageVector
    get() {
        if (_airplaneLanding != null) {
            return _airplaneLanding!!
        }
        _airplaneLanding = Builder(name = "AirplaneLanding", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(96.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(240.0f, 212.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 244.0f, 216.0f)
                close()
                moveTo(222.9f, 187.9f)
                lineTo(46.3f, 138.4f)
                arcTo(36.1f, 36.1f, 0.0f, false, true, 20.0f, 103.7f)
                lineTo(20.0f, 51.1f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, true, 5.0f, -9.7f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 10.8f, -1.7f)
                lineToRelative(13.5f, 4.5f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 2.2f, 1.9f)
                lineTo(66.8f, 74.7f)
                lineTo(92.0f, 82.6f)
                lineTo(92.0f, 51.1f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, true, 5.0f, -9.7f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 10.8f, -1.7f)
                lineToRelative(13.5f, 4.5f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, 2.2f, 1.8f)
                lineToRelative(31.2f, 54.6f)
                lineToRelative(46.9f, 13.0f)
                arcTo(36.1f, 36.1f, 0.0f, false, true, 228.0f, 148.3f)
                lineTo(228.0f, 184.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.6f, 3.2f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -2.4f, 0.8f)
                close()
                moveTo(220.0f, 148.3f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, -20.5f, -27.0f)
                lineToRelative(-48.6f, -13.4f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -2.4f, -1.9f)
                lineTo(117.3f, 51.3f)
                lineToRelative(-12.0f, -4.0f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, -3.6f, 0.6f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, false, -1.7f, 3.2f)
                lineTo(100.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.2f, 3.8f)
                lineToRelative(-32.0f, -10.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.3f, -1.9f)
                lineTo(45.2f, 51.3f)
                lineToRelative(-11.9f, -4.0f)
                lineTo(32.0f, 47.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.3f, 0.8f)
                arcTo(3.7f, 3.7f, 0.0f, false, false, 28.0f, 51.1f)
                verticalLineToRelative(52.6f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 20.5f, 27.0f)
                lineToRelative(171.5f, 48.0f)
                close()
            }
        }
        .build()
        return _airplaneLanding!!
    }

private var _airplaneLanding: ImageVector? = null
