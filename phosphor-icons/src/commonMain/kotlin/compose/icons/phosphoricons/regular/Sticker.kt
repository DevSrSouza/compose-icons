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

public val RegularGroup.Sticker: ImageVector
    get() {
        if (_sticker != null) {
            return _sticker!!
        }
        _sticker = Builder(name = "Sticker", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.9f, 137.2f)
                arcToRelative(4.9f, 4.9f, 0.0f, false, false, 0.1f, -1.2f)
                lineTo(224.0f, 88.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, -56.0f, -56.0f)
                lineTo(88.0f, 32.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 32.0f, 88.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 56.0f, 56.0f)
                horizontalLineToRelative(49.4f)
                lineToRelative(1.1f, -0.3f)
                horizontalLineToRelative(0.0f)
                curveToRelative(26.3f, -8.8f, 76.3f, -58.8f, 85.1f, -85.1f)
                horizontalLineToRelative(0.0f)
                lineToRelative(0.3f, -1.1f)
                close()
                moveTo(48.0f, 168.0f)
                lineTo(48.0f, 88.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 88.0f, 48.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 40.0f, 40.0f)
                verticalLineToRelative(40.0f)
                lineTo(184.0f, 128.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, -56.0f, 56.0f)
                verticalLineToRelative(24.0f)
                lineTo(88.0f, 208.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 48.0f, 168.0f)
                close()
                moveTo(144.0f, 203.1f)
                lineTo(144.0f, 184.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 40.0f, -40.0f)
                horizontalLineToRelative(19.1f)
                curveTo(191.0f, 163.5f, 163.5f, 191.0f, 144.0f, 203.1f)
                close()
            }
        }
        .build()
        return _sticker!!
    }

private var _sticker: ImageVector? = null
