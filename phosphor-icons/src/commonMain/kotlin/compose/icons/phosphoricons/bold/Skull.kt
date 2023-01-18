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

public val BoldGroup.Skull: ImageVector
    get() {
        if (_skull != null) {
            return _skull!!
        }
        _skull = Builder(name = "Skull", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.0f, 132.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -24.0f, -24.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, true, 116.0f, 132.0f)
                close()
                moveTo(164.0f, 108.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 24.0f, 24.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, false, 164.0f, 108.0f)
                close()
                moveTo(232.0f, 116.0f)
                arcToRelative(103.8f, 103.8f, 0.0f, false, true, -32.0f, 75.0f)
                verticalLineToRelative(25.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(76.0f, 236.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(56.0f, 191.0f)
                arcToRelative(104.1f, 104.1f, 0.0f, false, true, -32.0f, -74.8f)
                curveTo(23.9f, 59.5f, 69.9f, 12.8f, 126.5f, 12.0f)
                arcTo(104.0f, 104.0f, 0.0f, false, true, 232.0f, 116.0f)
                close()
                moveTo(208.0f, 116.0f)
                arcToRelative(79.9f, 79.9f, 0.0f, false, false, -80.0f, -80.0f)
                horizontalLineToRelative(-1.1f)
                curveToRelative(-43.6f, 0.6f, -79.0f, 36.6f, -78.9f, 80.2f)
                arcToRelative(79.7f, 79.7f, 0.0f, false, false, 27.8f, 60.4f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 4.2f, 9.1f)
                lineTo(80.0f, 212.0f)
                lineTo(96.0f, 212.0f)
                lineTo(96.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(16.0f)
                lineTo(136.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(16.0f)
                lineTo(176.0f, 185.7f)
                arcToRelative(11.5f, 11.5f, 0.0f, false, true, 4.2f, -9.0f)
                arcTo(80.1f, 80.1f, 0.0f, false, false, 208.0f, 116.0f)
                close()
            }
        }
        .build()
        return _skull!!
    }

private var _skull: ImageVector? = null
