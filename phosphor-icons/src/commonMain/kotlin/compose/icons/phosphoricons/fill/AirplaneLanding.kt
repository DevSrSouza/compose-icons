package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.AirplaneLanding: ImageVector
    get() {
        if (_airplaneLanding != null) {
            return _airplaneLanding!!
        }
        _airplaneLanding = Builder(name = "AirplaneLanding", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(96.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(240.0f, 208.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 248.0f, 216.0f)
                close()
                moveTo(224.0f, 188.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 2.4f, -0.8f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 228.0f, 184.0f)
                lineTo(228.0f, 148.3f)
                arcToRelative(36.1f, 36.1f, 0.0f, false, false, -26.4f, -34.7f)
                lineToRelative(-46.9f, -13.0f)
                lineTo(123.5f, 46.0f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, -2.2f, -1.8f)
                lineToRelative(-13.5f, -4.5f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 97.0f, 41.4f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, false, -5.0f, 9.7f)
                lineTo(92.0f, 82.6f)
                lineTo(66.8f, 74.7f)
                lineTo(51.5f, 46.1f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -2.2f, -1.9f)
                lineTo(35.8f, 39.7f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 25.0f, 41.4f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, false, -5.0f, 9.7f)
                verticalLineToRelative(52.6f)
                arcToRelative(36.1f, 36.1f, 0.0f, false, false, 26.3f, 34.7f)
                lineToRelative(176.6f, 49.5f)
                close()
            }
        }
        .build()
        return _airplaneLanding!!
    }

private var _airplaneLanding: ImageVector? = null
