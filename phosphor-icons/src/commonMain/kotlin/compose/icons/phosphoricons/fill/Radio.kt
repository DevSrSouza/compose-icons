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

public val FillGroup.Radio: ImageVector
    get() {
        if (_radio != null) {
            return _radio!!
        }
        _radio = Builder(name = "Radio", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 72.0f)
                lineTo(86.5f, 72.0f)
                lineTo(194.3f, 39.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -4.6f, -15.4f)
                lineToRelative(-160.0f, 48.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-0.7f, 0.3f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-0.5f, 0.3f)
                lineTo(28.0f, 72.9f)
                arcToRelative(6.8f, 6.8f, 0.0f, false, false, -2.1f, 1.7f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, true, -0.1f, 0.1f)
                curveToRelative(-0.1f, 0.1f, -0.1f, 0.2f, -0.2f, 0.4f)
                lineToRelative(-0.2f, 0.2f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, false, -0.1f, 0.2f)
                arcToRelative(6.7f, 6.7f, 0.0f, false, false, -1.0f, 2.3f)
                curveToRelative(-0.1f, 0.1f, -0.1f, 0.2f, -0.1f, 0.4f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.1f, 0.7f)
                horizontalLineToRelative(0.0f)
                lineTo(24.0f, 80.0f)
                horizontalLineToRelative(0.0f)
                lineTo(24.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(216.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 88.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 72.0f)
                close()
                moveTo(96.0f, 184.0f)
                lineTo(56.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(96.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(96.0f, 152.0f)
                lineTo(56.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(96.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(96.0f, 120.0f)
                lineTo(56.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(96.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(168.0f, 172.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 168.0f, 172.0f)
                close()
            }
        }
        .build()
        return _radio!!
    }

private var _radio: ImageVector? = null
