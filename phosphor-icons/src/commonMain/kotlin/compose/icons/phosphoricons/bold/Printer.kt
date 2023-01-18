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

public val BoldGroup.Printer: ImageVector
    get() {
        if (_printer != null) {
            return _printer!!
        }
        _printer = Builder(name = "Printer", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(210.7f, 68.0f)
                lineTo(204.0f, 68.0f)
                lineTo(204.0f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(64.0f, 28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 52.0f, 40.0f)
                lineTo(52.0f, 68.0f)
                lineTo(45.3f, 68.0f)
                curveTo(29.2f, 68.0f, 16.0f, 80.6f, 16.0f, 96.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(52.0f, 188.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(192.0f, 232.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(204.0f, 188.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(240.0f, 96.0f)
                curveTo(240.0f, 80.6f, 226.8f, 68.0f, 210.7f, 68.0f)
                close()
                moveTo(76.0f, 52.0f)
                lineTo(180.0f, 52.0f)
                lineTo(180.0f, 68.0f)
                lineTo(76.0f, 68.0f)
                close()
                moveTo(180.0f, 208.0f)
                lineTo(76.0f, 208.0f)
                lineTo(76.0f, 168.0f)
                lineTo(180.0f, 168.0f)
                close()
                moveTo(216.0f, 164.0f)
                lineTo(204.0f, 164.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(64.0f, 144.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(8.0f)
                lineTo(40.0f, 164.0f)
                lineTo(40.0f, 96.0f)
                curveToRelative(0.0f, -2.2f, 2.4f, -4.0f, 5.3f, -4.0f)
                lineTo(210.7f, 92.0f)
                curveToRelative(2.9f, 0.0f, 5.3f, 1.8f, 5.3f, 4.0f)
                close()
                moveTo(204.0f, 116.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 204.0f, 116.0f)
                close()
            }
        }
        .build()
        return _printer!!
    }

private var _printer: ImageVector? = null
