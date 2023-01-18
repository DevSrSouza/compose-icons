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

public val LightGroup.PushPinSlash: ImageVector
    get() {
        if (_pushPinSlash != null) {
            return _pushPinSlash!!
        }
        _pushPinSlash = Builder(name = "PushPinSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(52.4f, 36.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -8.8f, 8.0f)
                lineTo(78.3f, 82.3f)
                curveToRelative(-12.0f, -1.3f, -29.4f, 0.5f, -47.5f, 15.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -1.1f, 20.8f)
                lineTo(79.5f, 168.0f)
                lineTo(43.8f, 203.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, false, 8.4f, 8.4f)
                lineTo(88.0f, 176.5f)
                lineToRelative(49.6f, 49.6f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, 9.9f, 4.1f)
                horizontalLineToRelative(1.0f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 10.2f, -5.6f)
                curveToRelative(5.9f, -7.8f, 14.1f, -21.2f, 15.6f, -36.8f)
                lineTo(203.6f, 220.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 4.4f, 2.0f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, 4.0f, -1.6f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 0.4f, -8.4f)
                close()
                moveTo(149.1f, 217.4f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.4f, 0.8f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.6f, -0.6f)
                lineTo(38.2f, 109.7f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, -0.6f, -1.5f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, 0.8f, -1.5f)
                curveToRelative(26.1f, -21.0f, 49.9f, -9.8f, 50.9f, -9.3f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 3.3f, 0.6f)
                lineToRelative(68.6f, 75.5f)
                curveTo(166.0f, 191.2f, 155.8f, 208.5f, 149.1f, 217.4f)
                close()
                moveTo(234.7f, 96.0f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, true, -4.1f, 9.9f)
                lineToRelative(-41.4f, 41.4f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -8.5f, 0.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 0.0f, -8.5f)
                lineToRelative(41.4f, -41.4f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, 0.0f, -2.8f)
                lineTo(161.4f, 33.9f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, -2.8f, 0.0f)
                lineToRelative(-38.0f, 38.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.5f, -8.5f)
                lineToRelative(38.0f, -38.0f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, true, 19.8f, 0.0f)
                lineToRelative(60.7f, 60.7f)
                arcTo(14.1f, 14.1f, 0.0f, false, true, 234.7f, 96.0f)
                close()
            }
        }
        .build()
        return _pushPinSlash!!
    }

private var _pushPinSlash: ImageVector? = null
