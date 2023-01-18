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

public val ThinGroup.Recycle: ImageVector
    get() {
        if (_recycle != null) {
            return _recycle!!
        }
        _recycle = Builder(name = "Recycle", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(233.3f, 202.0f)
                arcTo(19.9f, 19.9f, 0.0f, false, true, 216.0f, 212.0f)
                horizontalLineTo(137.7f)
                lineToRelative(17.1f, 17.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 5.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -5.6f, 0.0f)
                lineToRelative(-24.0f, -24.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, -5.6f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.6f, 5.6f)
                lineTo(137.7f, 204.0f)
                horizontalLineTo(216.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 10.4f, -6.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 0.0f, -12.0f)
                lineToRelative(-24.0f, -41.4f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 1.5f, -5.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.4f, 1.5f)
                lineToRelative(24.0f, 41.4f)
                arcTo(19.9f, 19.9f, 0.0f, false, true, 233.3f, 202.0f)
                close()
                moveTo(88.0f, 204.0f)
                horizontalLineTo(40.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -10.4f, -6.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 0.0f, -12.0f)
                lineToRelative(39.2f, -67.7f)
                lineToRelative(6.3f, 23.5f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 3.9f, 3.0f)
                lineToRelative(1.0f, -0.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 2.8f, -4.9f)
                lineTo(74.0f, 106.9f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, -1.8f, -2.4f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, -3.1f, -0.4f)
                lineToRelative(-32.7f, 8.8f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -2.9f, 4.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.9f, 2.8f)
                lineToRelative(23.5f, -6.3f)
                lineTo(22.7f, 182.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 40.0f, 212.0f)
                horizontalLineTo(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(138.4f, 34.0f)
                lineToRelative(39.1f, 67.6f)
                lineToRelative(-23.4f, -6.3f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -4.9f, 2.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.8f, 4.9f)
                lineToRelative(32.8f, 8.7f)
                lineToRelative(1.0f, 0.2f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 3.9f, -3.0f)
                lineToRelative(8.8f, -32.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -7.7f, -2.0f)
                lineToRelative(-6.3f, 23.4f)
                lineTo(145.3f, 30.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -34.6f, 0.0f)
                lineToRelative(-24.0f, 41.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.5f, 5.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.5f, -1.4f)
                lineTo(117.6f, 34.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 20.8f, 0.0f)
                close()
            }
        }
        .build()
        return _recycle!!
    }

private var _recycle: ImageVector? = null
