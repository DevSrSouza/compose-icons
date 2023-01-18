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

public val ThinGroup.PushPinSlash: ImageVector
    get() {
        if (_pushPinSlash != null) {
            return _pushPinSlash!!
        }
        _pushPinSlash = Builder(name = "PushPinSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(51.0f, 37.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -6.0f, 5.4f)
                lineTo(83.6f, 85.1f)
                curveToRelative(-11.4f, -2.3f, -31.0f, -2.7f, -51.5f, 13.8f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, false, -4.5f, 8.8f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 3.5f, 9.1f)
                lineTo(82.3f, 168.0f)
                lineTo(45.2f, 205.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, 5.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 5.6f, 0.0f)
                lineTo(88.0f, 173.7f)
                lineToRelative(51.0f, 51.0f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, false, 8.5f, 3.5f)
                horizontalLineToRelative(0.9f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 8.7f, -4.8f)
                curveToRelative(6.3f, -8.4f, 15.4f, -23.5f, 15.4f, -40.5f)
                lineTo(205.0f, 218.7f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 5.7f, 0.3f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 0.3f, -5.7f)
                close()
                moveTo(150.7f, 218.6f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -2.9f, 1.6f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, true, -3.1f, -1.2f)
                lineTo(36.8f, 111.1f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -1.2f, -3.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.5f, -2.9f)
                curveToRelative(27.2f, -22.0f, 52.1f, -10.1f, 53.1f, -9.6f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 3.1f, 0.2f)
                lineTo(163.0f, 172.5f)
                curveTo(168.4f, 191.2f, 157.6f, 209.4f, 150.7f, 218.6f)
                close()
                moveTo(232.7f, 96.0f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, true, -3.5f, 8.5f)
                lineToRelative(-41.4f, 41.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.9f, 1.2f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -2.8f, -6.9f)
                lineToRelative(41.4f, -41.4f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, -5.6f)
                lineTo(162.8f, 32.5f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -5.6f, 0.0f)
                lineToRelative(-38.0f, 38.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -5.7f, -5.7f)
                lineToRelative(38.0f, -38.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 17.0f, 0.0f)
                lineToRelative(60.7f, 60.7f)
                arcTo(12.3f, 12.3f, 0.0f, false, true, 232.7f, 96.0f)
                close()
            }
        }
        .build()
        return _pushPinSlash!!
    }

private var _pushPinSlash: ImageVector? = null
