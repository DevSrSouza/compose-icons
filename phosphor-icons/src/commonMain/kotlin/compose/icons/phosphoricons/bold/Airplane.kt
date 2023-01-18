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

public val BoldGroup.Airplane: ImageVector
    get() {
        if (_airplane != null) {
            return _airplane!!
        }
        _airplane = Builder(name = "Airplane", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.6f, 125.3f)
                lineTo(164.2f, 88.6f)
                lineTo(164.2f, 48.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -72.0f, 0.0f)
                lineTo(92.2f, 88.6f)
                lineTo(18.6f, 125.3f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 12.0f, 136.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 14.4f, 11.8f)
                lineTo(92.0f, 166.6f)
                lineTo(92.0f, 179.0f)
                lineTo(79.5f, 191.5f)
                arcTo(12.3f, 12.3f, 0.0f, false, false, 76.0f, 200.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.5f, 11.1f)
                lineTo(128.0f, 228.9f)
                lineToRelative(35.5f, 14.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 4.5f, 0.9f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, false, 6.7f, -2.1f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 180.0f, 232.0f)
                lineTo(180.0f, 200.0f)
                arcToRelative(11.5f, 11.5f, 0.0f, false, false, -3.5f, -8.4f)
                lineToRelative(-12.3f, -12.5f)
                lineTo(164.2f, 166.6f)
                lineToRelative(65.7f, 13.2f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 9.9f, -2.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 4.4f, -9.3f)
                lineTo(244.2f, 136.0f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 237.6f, 125.3f)
                close()
                moveTo(220.2f, 153.4f)
                lineTo(154.6f, 140.2f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 140.2f, 152.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 3.5f, 8.4f)
                lineTo(156.0f, 204.9f)
                verticalLineToRelative(9.4f)
                lineToRelative(-23.5f, -9.4f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, -9.0f, 0.0f)
                lineTo(100.0f, 214.3f)
                lineTo(100.0f, 205.0f)
                lineToRelative(12.5f, -12.5f)
                arcTo(12.3f, 12.3f, 0.0f, false, false, 116.0f, 184.0f)
                lineTo(116.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -14.4f, -11.8f)
                lineTo(36.0f, 153.4f)
                verticalLineToRelative(-10.0f)
                lineToRelative(73.4f, -36.7f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 116.0f, 96.0f)
                lineTo(116.0f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                lineTo(140.0f, 96.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 6.7f, 10.7f)
                lineToRelative(73.3f, 36.7f)
                close()
            }
        }
        .build()
        return _airplane!!
    }

private var _airplane: ImageVector? = null
