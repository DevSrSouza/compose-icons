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

public val RegularGroup.Recycle: ImageVector
    get() {
        if (_recycle != null) {
            return _recycle!!
        }
        _recycle = Builder(name = "Recycle", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.8f, 204.0f)
                arcTo(23.9f, 23.9f, 0.0f, false, true, 216.0f, 216.0f)
                horizontalLineTo(147.3f)
                lineToRelative(10.4f, 10.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, 11.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                lineToRelative(-24.0f, -24.1f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 120.0f, 208.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 2.3f, -5.7f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, 11.4f)
                lineTo(147.3f, 200.0f)
                horizontalLineTo(216.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 6.9f, -4.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 0.0f, -8.0f)
                lineToRelative(-24.0f, -41.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.9f, -8.0f)
                lineTo(236.7f, 180.0f)
                arcTo(23.7f, 23.7f, 0.0f, false, true, 236.8f, 204.0f)
                close()
                moveTo(88.0f, 200.0f)
                horizontalLineTo(40.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -6.9f, -4.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, 0.0f, -8.0f)
                lineToRelative(34.3f, -59.3f)
                lineToRelative(3.8f, 14.1f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 7.8f, 6.0f)
                lineToRelative(2.0f, -0.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.7f, -9.8f)
                lineToRelative(-8.8f, -32.8f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -3.7f, -4.8f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, false, -6.1f, -0.8f)
                lineTo(35.3f, 109.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.2f, 15.5f)
                lineToRelative(14.0f, -3.8f)
                lineTo(19.3f, 180.0f)
                arcTo(23.9f, 23.9f, 0.0f, false, false, 40.0f, 216.0f)
                horizontalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(128.0f, 32.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, 6.9f, 4.0f)
                lineToRelative(34.3f, 59.2f)
                lineToRelative(-14.1f, -3.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -4.1f, 15.4f)
                lineToRelative(32.8f, 8.8f)
                lineToRelative(2.0f, 0.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 7.8f, -5.9f)
                lineToRelative(8.8f, -32.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -15.5f, -4.2f)
                lineToRelative(-3.8f, 14.2f)
                lineTo(148.8f, 28.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -41.6f, 0.0f)
                lineTo(83.3f, 69.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 13.8f, 8.0f)
                lineToRelative(24.0f, -41.4f)
                arcTo(7.8f, 7.8f, 0.0f, false, true, 128.0f, 32.0f)
                close()
            }
        }
        .build()
        return _recycle!!
    }

private var _recycle: ImageVector? = null
