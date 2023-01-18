package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.PhoneDisconnect: ImageVector
    get() {
        if (_phoneDisconnect != null) {
            return _phoneDisconnect!!
        }
        _phoneDisconnect = Builder(name = "PhoneDisconnect", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.5f, 164.1f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, -18.5f, 5.0f)
                lineToRelative(-47.4f, -19.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, -9.7f, -11.6f)
                lineToRelative(-6.2f, -29.7f)
                horizontalLineToRelative(0.0f)
                arcToRelative(76.3f, 76.3f, 0.0f, false, false, -49.7f, 0.1f)
                lineToRelative(-5.9f, 29.5f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -9.7f, 11.7f)
                lineTo(40.0f, 169.1f)
                arcToRelative(17.1f, 17.1f, 0.0f, false, true, -5.9f, 1.1f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, true, -12.6f, -6.1f)
                arcToRelative(56.1f, 56.1f, 0.0f, false, true, 4.7f, -73.9f)
                curveTo(82.3f, 34.0f, 173.7f, 34.0f, 229.8f, 90.2f)
                arcTo(56.1f, 56.1f, 0.0f, false, true, 234.5f, 164.1f)
                close()
                moveTo(216.0f, 192.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineTo(216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
            }
        }
        .build()
        return _phoneDisconnect!!
    }

private var _phoneDisconnect: ImageVector? = null
