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

public val BoldGroup.PushPinSlash: ImageVector
    get() {
        if (_pushPinSlash != null) {
            return _pushPinSlash!!
        }
        _pushPinSlash = Builder(name = "PushPinSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.9f, 31.9f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 39.1f, 48.1f)
                lineTo(64.8f, 76.4f)
                curveToRelative(-11.2f, 1.2f, -24.3f, 5.5f, -37.7f, 16.3f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, -1.6f, 29.7f)
                lineTo(71.0f, 168.0f)
                lineTo(39.5f, 199.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.0f, 0.0f)
                lineTo(88.0f, 185.0f)
                lineToRelative(45.4f, 45.3f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, false, 14.1f, 5.9f)
                horizontalLineToRelative(1.4f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 14.6f, -7.9f)
                arcToRelative(91.7f, 91.7f, 0.0f, false, false, 14.3f, -27.6f)
                lineToRelative(21.3f, 23.5f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.0f, 0.8f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 0.8f, -17.0f)
                close()
                moveTo(147.0f, 210.0f)
                lineTo(45.7f, 108.7f)
                curveToRelative(21.1f, -14.6f, 39.5f, -6.6f, 41.0f, -5.9f)
                arcToRelative(12.8f, 12.8f, 0.0f, false, false, 3.1f, 1.1f)
                lineToRelative(66.0f, 72.5f)
                curveTo(158.6f, 189.1f, 152.5f, 201.8f, 147.0f, 210.0f)
                close()
                moveTo(240.7f, 96.0f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, true, -5.9f, 14.1f)
                lineToRelative(-35.7f, 35.8f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -17.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -17.0f)
                lineTo(215.0f, 96.0f)
                lineTo(160.0f, 41.0f)
                lineTo(130.5f, 70.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineToRelative(32.4f, -32.3f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, 28.2f, 0.0f)
                lineToRelative(60.7f, 60.7f)
                arcTo(19.7f, 19.7f, 0.0f, false, true, 240.7f, 96.0f)
                close()
            }
        }
        .build()
        return _pushPinSlash!!
    }

private var _pushPinSlash: ImageVector? = null
