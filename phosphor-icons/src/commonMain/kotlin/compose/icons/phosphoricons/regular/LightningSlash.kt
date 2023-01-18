package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.LightningSlash: ImageVector
    get() {
        if (_lightningSlash != null) {
            return _lightningSlash!!
        }
        _lightningSlash = Builder(name = "LightningSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(53.9f, 34.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.3f, -0.5f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -0.5f, 11.3f)
                lineTo(81.3f, 88.6f)
                lineTo(42.2f, 130.5f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -2.0f, 7.3f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 5.0f, 5.7f)
                lineToRelative(57.6f, 21.6f)
                lineTo(88.2f, 238.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 4.1f, 8.7f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, false, 3.7f, 0.9f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, false, 5.8f, -2.6f)
                lineToRelative(61.9f, -66.2f)
                lineToRelative(38.4f, 42.2f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 224.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 5.4f, -2.1f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 0.5f, -11.3f)
                close()
                moveTo(109.4f, 213.9f)
                lineTo(119.8f, 161.5f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -5.0f, -9.0f)
                lineTo(62.0f, 132.7f)
                lineToRelative(30.1f, -32.3f)
                lineToRelative(60.8f, 66.9f)
                close()
                moveTo(108.6f, 71.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -0.3f, -11.3f)
                lineToRelative(45.9f, -49.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.6f, 7.0f)
                lineTo(153.2f, 90.9f)
                lineToRelative(57.6f, 21.6f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 3.0f, 12.9f)
                lineToRelative(-22.3f, 23.9f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -11.3f, 0.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.4f, -11.3f)
                lineTo(194.0f, 123.3f)
                lineToRelative(-52.8f, -19.8f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -5.0f, -9.1f)
                lineTo(146.6f, 42.0f)
                lineTo(120.0f, 70.6f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 108.6f, 71.0f)
                close()
            }
        }
        .build()
        return _lightningSlash!!
    }

private var _lightningSlash: ImageVector? = null
