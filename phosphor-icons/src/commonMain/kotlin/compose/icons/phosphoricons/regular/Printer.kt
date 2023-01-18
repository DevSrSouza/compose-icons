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

public val RegularGroup.Printer: ImageVector
    get() {
        if (_printer != null) {
            return _printer!!
        }
        _printer = Builder(name = "Printer", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(210.7f, 72.0f)
                lineTo(200.0f, 72.0f)
                lineTo(200.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(64.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(56.0f, 72.0f)
                lineTo(45.3f, 72.0f)
                curveTo(31.4f, 72.0f, 20.0f, 82.8f, 20.0f, 96.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(56.0f, 184.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(192.0f, 228.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(200.0f, 184.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(236.0f, 96.0f)
                curveTo(236.0f, 82.8f, 224.6f, 72.0f, 210.7f, 72.0f)
                close()
                moveTo(72.0f, 48.0f)
                lineTo(184.0f, 48.0f)
                lineTo(184.0f, 72.0f)
                lineTo(72.0f, 72.0f)
                close()
                moveTo(184.0f, 212.0f)
                lineTo(72.0f, 212.0f)
                lineTo(72.0f, 160.0f)
                lineTo(184.0f, 160.0f)
                close()
                moveTo(220.0f, 168.0f)
                lineTo(200.0f, 168.0f)
                lineTo(200.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(64.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(16.0f)
                lineTo(36.0f, 168.0f)
                lineTo(36.0f, 96.0f)
                curveToRelative(0.0f, -4.4f, 4.2f, -8.0f, 9.3f, -8.0f)
                lineTo(210.7f, 88.0f)
                curveToRelative(5.1f, 0.0f, 9.3f, 3.6f, 9.3f, 8.0f)
                close()
                moveTo(200.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 200.0f, 116.0f)
                close()
            }
        }
        .build()
        return _printer!!
    }

private var _printer: ImageVector? = null
