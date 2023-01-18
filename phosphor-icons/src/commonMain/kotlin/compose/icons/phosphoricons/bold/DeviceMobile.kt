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

public val BoldGroup.DeviceMobile: ImageVector
    get() {
        if (_deviceMobile != null) {
            return _deviceMobile!!
        }
        _deviceMobile = Builder(name = "DeviceMobile", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 12.0f)
                lineTo(80.0f, 12.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 52.0f, 40.0f)
                lineTo(52.0f, 216.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 28.0f, 28.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 28.0f, -28.0f)
                lineTo(204.0f, 40.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 176.0f, 12.0f)
                close()
                moveTo(76.0f, 76.0f)
                lineTo(180.0f, 76.0f)
                lineTo(180.0f, 180.0f)
                lineTo(76.0f, 180.0f)
                close()
                moveTo(80.0f, 36.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                lineTo(180.0f, 52.0f)
                lineTo(76.0f, 52.0f)
                lineTo(76.0f, 40.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 80.0f, 36.0f)
                close()
                moveTo(176.0f, 220.0f)
                lineTo(80.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(76.0f, 204.0f)
                lineTo(180.0f, 204.0f)
                verticalLineToRelative(12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 176.0f, 220.0f)
                close()
            }
        }
        .build()
        return _deviceMobile!!
    }

private var _deviceMobile: ImageVector? = null
