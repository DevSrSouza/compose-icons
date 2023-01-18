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

public val LightGroup.AirplaneLanding: ImageVector
    get() {
        if (_airplaneLanding != null) {
            return _airplaneLanding!!
        }
        _airplaneLanding = Builder(name = "AirplaneLanding", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.0f, 216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(96.0f, 222.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(240.0f, 210.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 246.0f, 216.0f)
                close()
                moveTo(222.4f, 189.8f)
                lineTo(45.8f, 140.3f)
                arcTo(38.1f, 38.1f, 0.0f, false, true, 18.0f, 103.7f)
                lineTo(18.0f, 51.1f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 36.4f, 37.8f)
                lineToRelative(13.5f, 4.5f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, 3.4f, 2.9f)
                lineTo(68.1f, 73.0f)
                lineTo(90.0f, 79.8f)
                lineTo(90.0f, 51.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 18.4f, -13.3f)
                lineToRelative(13.5f, 4.5f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 3.3f, 2.7f)
                lineTo(156.0f, 98.9f)
                lineToRelative(46.2f, 12.8f)
                arcTo(38.1f, 38.1f, 0.0f, false, true, 230.0f, 148.3f)
                lineTo(230.0f, 184.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -2.4f, 4.8f)
                arcTo(5.8f, 5.8f, 0.0f, false, true, 224.0f, 190.0f)
                close()
                moveTo(218.0f, 148.3f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -19.0f, -25.0f)
                lineToRelative(-48.6f, -13.5f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -3.6f, -2.8f)
                lineTo(115.9f, 53.0f)
                lineToRelative(-11.3f, -3.8f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.8f, 0.3f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, -0.8f, 1.6f)
                lineTo(102.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -2.4f, 4.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -5.4f, 0.9f)
                lineToRelative(-32.0f, -10.0f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, true, -3.5f, -2.9f)
                lineTo(43.8f, 52.9f)
                lineTo(32.6f, 49.2f)
                lineTo(32.0f, 49.2f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, -1.2f, 0.4f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, -0.8f, 1.6f)
                verticalLineToRelative(52.6f)
                arcToRelative(26.2f, 26.2f, 0.0f, false, false, 19.0f, 25.1f)
                lineToRelative(169.0f, 47.3f)
                close()
            }
        }
        .build()
        return _airplaneLanding!!
    }

private var _airplaneLanding: ImageVector? = null
