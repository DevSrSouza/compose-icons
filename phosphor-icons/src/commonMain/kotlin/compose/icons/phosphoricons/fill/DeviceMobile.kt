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

public val FillGroup.DeviceMobile: ImageVector
    get() {
        if (_deviceMobile != null) {
            return _deviceMobile!!
        }
        _deviceMobile = Builder(name = "DeviceMobile", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 16.0f)
                lineTo(80.0f, 16.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, false, 56.0f, 40.0f)
                lineTo(56.0f, 216.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, false, 24.0f, 24.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, false, 24.0f, -24.0f)
                lineTo(200.0f, 40.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, false, 176.0f, 16.0f)
                close()
                moveTo(80.0f, 32.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineToRelative(8.0f)
                lineTo(72.0f, 48.0f)
                lineTo(72.0f, 40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 80.0f, 32.0f)
                close()
                moveTo(176.0f, 224.0f)
                lineTo(80.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineToRelative(-8.0f)
                lineTo(184.0f, 208.0f)
                verticalLineToRelative(8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 176.0f, 224.0f)
                close()
            }
        }
        .build()
        return _deviceMobile!!
    }

private var _deviceMobile: ImageVector? = null
