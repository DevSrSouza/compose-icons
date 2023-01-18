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

public val BoldGroup.Recycle: ImageVector
    get() {
        if (_recycle != null) {
            return _recycle!!
        }
        _recycle = Builder(name = "Recycle", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.2f, 206.0f)
                arcTo(27.5f, 27.5f, 0.0f, false, true, 216.0f, 220.0f)
                horizontalLineTo(157.0f)
                lineToRelative(3.5f, 3.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -17.0f, 0.0f)
                lineToRelative(-24.0f, -24.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 0.0f, -17.0f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                lineTo(157.0f, 196.0f)
                horizontalLineToRelative(59.0f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 3.4f, -2.0f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 0.0f, -4.0f)
                lineToRelative(-19.9f, -34.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 20.8f, -12.0f)
                lineTo(240.2f, 178.0f)
                arcTo(27.5f, 27.5f, 0.0f, false, true, 240.2f, 206.0f)
                close()
                moveTo(128.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.5f, 2.0f)
                lineToRelative(29.4f, 50.9f)
                lineToRelative(-4.7f, -1.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -6.2f, 23.2f)
                lineToRelative(32.7f, 8.8f)
                arcToRelative(11.5f, 11.5f, 0.0f, false, false, 3.1f, 0.4f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 11.6f, -8.9f)
                lineToRelative(8.8f, -32.8f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 183.0f, 72.1f)
                lineToRelative(-1.3f, 4.8f)
                lineTo(152.2f, 26.0f)
                arcToRelative(27.9f, 27.9f, 0.0f, false, false, -48.4f, 0.0f)
                lineToRelative(-20.0f, 34.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 20.8f, 12.1f)
                lineTo(124.5f, 38.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 128.0f, 36.0f)
                close()
                moveTo(80.0f, 196.0f)
                horizontalLineTo(40.0f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -3.4f, -2.0f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, 0.0f, -4.0f)
                lineToRelative(29.5f, -51.0f)
                lineToRelative(1.3f, 4.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.5f, 8.9f)
                arcToRelative(17.5f, 17.5f, 0.0f, false, false, 3.2f, -0.4f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 8.4f, -14.7f)
                lineToRelative(-8.7f, -32.8f)
                arcToRelative(12.5f, 12.5f, 0.0f, false, false, -5.6f, -7.3f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -9.1f, -1.2f)
                lineToRelative(-32.8f, 8.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.2f, 23.2f)
                lineToRelative(4.7f, -1.3f)
                lineTo(15.8f, 178.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 40.0f, 220.0f)
                horizontalLineTo(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
            }
        }
        .build()
        return _recycle!!
    }

private var _recycle: ImageVector? = null
