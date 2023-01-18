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

public val LightGroup.PushPinSimpleSlash: ImageVector
    get() {
        if (_pushPinSimpleSlash != null) {
            return _pushPinSimpleSlash!!
        }
        _pushPinSimpleSlash = Builder(name = "PushPinSimpleSlash", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(85.2f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineTo(192.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                horizontalLineToRelative(-8.8f)
                lineToRelative(19.1f, 108.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.8f, 7.0f)
                horizontalLineToRelative(-1.1f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -5.9f, -5.0f)
                lineTo(171.0f, 46.0f)
                horizontalLineTo(91.2f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 85.2f, 40.0f)
                close()
                moveTo(212.0f, 220.4f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, true, -4.0f, 1.6f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -4.4f, -2.0f)
                lineTo(169.0f, 182.0f)
                horizontalLineTo(134.0f)
                verticalLineToRelative(58.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                verticalLineTo(182.0f)
                horizontalLineTo(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineTo(51.0f)
                lineTo(68.4f, 71.3f)
                lineTo(43.6f, 44.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.8f, -8.0f)
                lineToRelative(160.0f, 176.0f)
                arcTo(5.8f, 5.8f, 0.0f, false, true, 212.0f, 220.4f)
                close()
                moveTo(158.1f, 170.0f)
                lineTo(78.6f, 82.6f)
                lineTo(63.2f, 170.0f)
                close()
            }
        }
        .build()
        return _pushPinSimpleSlash!!
    }

private var _pushPinSimpleSlash: ImageVector? = null
