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

public val ThinGroup.DeviceMobile: ImageVector
    get() {
        if (_deviceMobile != null) {
            return _deviceMobile!!
        }
        _deviceMobile = Builder(name = "DeviceMobile", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 20.0f)
                lineTo(80.0f, 20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 60.0f, 40.0f)
                lineTo(60.0f, 216.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(196.0f, 40.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 176.0f, 20.0f)
                close()
                moveTo(68.0f, 60.0f)
                lineTo(188.0f, 60.0f)
                lineTo(188.0f, 196.0f)
                lineTo(68.0f, 196.0f)
                close()
                moveTo(80.0f, 28.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                lineTo(188.0f, 52.0f)
                lineTo(68.0f, 52.0f)
                lineTo(68.0f, 40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 80.0f, 28.0f)
                close()
                moveTo(176.0f, 228.0f)
                lineTo(80.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(68.0f, 204.0f)
                lineTo(188.0f, 204.0f)
                verticalLineToRelative(12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 176.0f, 228.0f)
                close()
            }
        }
        .build()
        return _deviceMobile!!
    }

private var _deviceMobile: ImageVector? = null
