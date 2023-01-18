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

public val RegularGroup.Sword: ImageVector
    get() {
        if (_sword != null) {
            return _sword!!
        }
        _sword = Builder(name = "Sword", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.7f, 34.3f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 216.0f, 32.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-63.8f, 0.2f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -6.2f, 2.9f)
                lineTo(75.6f, 120.3f)
                lineTo(67.3f, 112.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, -22.6f, 0.0f)
                lineTo(32.0f, 124.7f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 0.0f, 22.6f)
                lineToRelative(20.9f, 20.9f)
                lineToRelative(-30.0f, 29.9f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, false, 0.0f, 22.7f)
                lineToRelative(12.3f, 12.3f)
                arcToRelative(16.3f, 16.3f, 0.0f, false, false, 22.7f, 0.0f)
                lineToRelative(29.9f, -30.0f)
                lineTo(108.7f, 224.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 22.6f, 0.0f)
                lineTo(144.0f, 211.3f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 0.0f, -22.6f)
                lineToRelative(-8.3f, -8.3f)
                lineTo(220.9f, 110.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 2.9f, -6.2f)
                lineTo(224.0f, 40.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 221.7f, 34.3f)
                close()
                moveTo(120.0f, 212.7f)
                lineTo(99.1f, 191.8f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, -22.6f, 0.0f)
                lineToRelative(-30.0f, 29.9f)
                lineTo(34.3f, 209.5f)
                lineToRelative(29.9f, -30.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 0.0f, -22.6f)
                lineTo(43.3f, 136.0f)
                lineTo(56.0f, 123.3f)
                lineToRelative(14.5f, 14.5f)
                horizontalLineToRelative(0.0f)
                lineToRelative(23.8f, 23.9f)
                horizontalLineToRelative(0.0f)
                lineTo(132.7f, 200.0f)
                close()
                moveTo(207.8f, 100.0f)
                lineToRelative(-83.5f, 69.0f)
                lineToRelative(-13.0f, -13.0f)
                lineToRelative(54.4f, -54.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -11.4f, -11.4f)
                lineTo(100.0f, 144.7f)
                lineToRelative(-13.0f, -13.0f)
                lineToRelative(69.0f, -83.5f)
                lineToRelative(52.0f, -0.2f)
                close()
            }
        }
        .build()
        return _sword!!
    }

private var _sword: ImageVector? = null
