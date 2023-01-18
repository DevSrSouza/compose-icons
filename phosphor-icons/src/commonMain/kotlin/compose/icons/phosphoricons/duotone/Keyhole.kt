package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.Keyhole: ImageVector
    get() {
        if (_keyhole != null) {
            return _keyhole!!
        }
        _keyhole = Builder(name = "Keyhole", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(155.2f, 164.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.3f, 11.2f)
                horizontalLineTo(108.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.3f, -11.2f)
                lineToRelative(13.8f, -32.2f)
                arcToRelative(28.1f, 28.1f, 0.0f, true, true, 26.8f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.2f, 104.2f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 88.0f, -88.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, true, 128.0f, 216.0f)
                close()
                moveTo(163.8f, 104.2f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 92.0f, 108.0f)
                arcToRelative(35.7f, 35.7f, 0.0f, false, false, 12.7f, 27.4f)
                lineTo(93.4f, 161.7f)
                arcTo(16.1f, 16.1f, 0.0f, false, false, 108.1f, 184.0f)
                horizontalLineToRelative(39.8f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 14.7f, -22.3f)
                lineToRelative(-11.3f, -26.3f)
                arcTo(35.9f, 35.9f, 0.0f, false, false, 163.8f, 104.2f)
                close()
                moveTo(134.0f, 135.7f)
                lineTo(147.9f, 168.0f)
                lineTo(108.1f, 168.0f)
                lineTo(122.0f, 135.7f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -3.6f, -10.1f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 108.0f, 108.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 20.0f, -20.0f)
                horizontalLineToRelative(2.3f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 7.3f, 37.5f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 134.0f, 135.7f)
                close()
            }
        }
        .build()
        return _keyhole!!
    }

private var _keyhole: ImageVector? = null
