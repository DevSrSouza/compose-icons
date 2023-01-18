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

public val LightGroup.Recycle: ImageVector
    get() {
        if (_recycle != null) {
            return _recycle!!
        }
        _recycle = Builder(name = "Recycle", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.0f, 203.0f)
                arcToRelative(21.6f, 21.6f, 0.0f, false, true, -19.0f, 11.0f)
                horizontalLineTo(142.5f)
                lineToRelative(13.7f, 13.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, true, -8.4f, 8.4f)
                lineToRelative(-24.0f, -24.0f)
                arcTo(5.6f, 5.6f, 0.0f, false, true, 122.0f, 208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 1.8f, -4.3f)
                lineToRelative(24.0f, -23.9f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.4f, 8.4f)
                lineTo(142.5f, 202.0f)
                horizontalLineTo(216.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 8.6f, -15.0f)
                lineToRelative(-23.9f, -41.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 10.4f, -6.0f)
                lineTo(235.0f, 181.0f)
                arcTo(21.7f, 21.7f, 0.0f, false, true, 235.0f, 203.0f)
                close()
                moveTo(88.0f, 202.0f)
                horizontalLineTo(40.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -8.6f, -15.0f)
                lineToRelative(36.7f, -63.5f)
                lineToRelative(5.1f, 18.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.8f, 4.5f)
                lineToRelative(1.5f, -0.2f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, 4.3f, -7.4f)
                lineTo(76.0f, 106.4f)
                arcToRelative(6.7f, 6.7f, 0.0f, false, false, -2.8f, -3.6f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, -4.6f, -0.6f)
                lineTo(35.8f, 111.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -4.2f, 7.3f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 7.3f, 4.3f)
                lineToRelative(18.8f, -5.1f)
                lineTo(21.0f, 181.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 19.0f, 33.0f)
                horizontalLineTo(88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(136.7f, 35.0f)
                lineToRelative(36.7f, 63.4f)
                lineToRelative(-18.8f, -5.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -7.3f, 4.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.2f, 7.4f)
                lineToRelative(32.8f, 8.8f)
                lineToRelative(1.5f, 0.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.8f, -4.5f)
                lineToRelative(8.8f, -32.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -4.2f, -7.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.4f, 4.2f)
                lineToRelative(-5.0f, 18.9f)
                lineTo(147.0f, 29.0f)
                arcToRelative(21.9f, 21.9f, 0.0f, false, false, -38.0f, 0.0f)
                lineTo(85.0f, 70.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.2f, 8.2f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 8.2f, -2.2f)
                lineTo(119.3f, 35.0f)
                arcToRelative(10.1f, 10.1f, 0.0f, false, true, 17.4f, 0.0f)
                close()
            }
        }
        .build()
        return _recycle!!
    }

private var _recycle: ImageVector? = null
