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

public val BoldGroup.PaintRoller: ImageVector
    get() {
        if (_paintRoller != null) {
            return _paintRoller!!
        }
        _paintRoller = Builder(name = "PaintRoller", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 84.0f)
                lineTo(216.0f, 84.0f)
                lineTo(216.0f, 64.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(52.0f, 44.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 32.0f, 64.0f)
                lineTo(32.0f, 84.0f)
                lineTo(16.0f, 84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(32.0f, 108.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(196.0f, 148.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(216.0f, 108.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(42.9f)
                lineToRelative(-97.5f, 27.9f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 116.0f, 198.0f)
                verticalLineToRelative(34.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(140.0f, 201.1f)
                lineToRelative(97.5f, -27.9f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 252.0f, 154.0f)
                lineTo(252.0f, 104.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 232.0f, 84.0f)
                close()
                moveTo(192.0f, 124.0f)
                lineTo(56.0f, 124.0f)
                lineTo(56.0f, 68.0f)
                lineTo(192.0f, 68.0f)
                close()
            }
        }
        .build()
        return _paintRoller!!
    }

private var _paintRoller: ImageVector? = null
