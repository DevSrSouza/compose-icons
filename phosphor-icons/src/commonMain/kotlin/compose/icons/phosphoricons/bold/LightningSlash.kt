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

public val BoldGroup.LightningSlash: ImageVector
    get() {
        if (_lightningSlash != null) {
            return _lightningSlash!!
        }
        _lightningSlash = Builder(name = "LightningSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.9f, 31.9f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 39.1f, 48.1f)
                lineTo(75.9f, 88.5f)
                lineTo(39.2f, 127.8f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -2.9f, 10.9f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 7.5f, 8.5f)
                lineToRelative(54.4f, 20.4f)
                lineToRelative(-14.0f, 70.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 6.3f, 13.1f)
                arcTo(13.4f, 13.4f, 0.0f, false, false, 96.0f, 252.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 8.8f, -3.8f)
                lineToRelative(58.9f, -63.1f)
                lineToRelative(35.4f, 39.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.0f, 0.8f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 0.8f, -17.0f)
                close()
                moveTo(116.1f, 200.9f)
                lineTo(123.8f, 162.3f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -7.6f, -13.6f)
                lineTo(69.0f, 131.0f)
                lineToRelative(23.1f, -24.7f)
                lineToRelative(55.4f, 61.0f)
                close()
                moveTo(111.4f, 68.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -0.6f, -17.0f)
                lineTo(151.2f, 7.8f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 14.3f, -2.5f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 6.3f, 13.0f)
                lineToRelative(-14.0f, 70.0f)
                lineToRelative(54.4f, 20.4f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 7.5f, 8.5f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, true, -2.9f, 11.0f)
                lineToRelative(-16.9f, 18.0f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, true, -8.7f, 3.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.8f, -20.2f)
                lineToRelative(4.6f, -4.9f)
                lineToRelative(-47.2f, -17.7f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -7.6f, -13.6f)
                lineTo(139.9f, 55.0f)
                lineTo(128.4f, 67.5f)
                arcTo(12.1f, 12.1f, 0.0f, false, true, 111.4f, 68.1f)
                close()
            }
        }
        .build()
        return _lightningSlash!!
    }

private var _lightningSlash: ImageVector? = null
