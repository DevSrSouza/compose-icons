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

public val RegularGroup.Airplane: ImageVector
    get() {
        if (_airplane != null) {
            return _airplane!!
        }
        _airplane = Builder(name = "Airplane", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.8f, 128.8f)
                lineTo(160.2f, 91.0f)
                lineTo(160.2f, 48.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -64.0f, 0.0f)
                lineTo(96.2f, 91.0f)
                lineTo(20.4f, 128.8f)
                arcTo(8.2f, 8.2f, 0.0f, false, false, 16.0f, 136.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 9.6f, 7.8f)
                lineToRelative(70.4f, -14.0f)
                verticalLineToRelative(18.9f)
                lineTo(82.3f, 194.3f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 80.0f, 200.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 3.5f, 6.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.5f, 0.8f)
                lineToRelative(37.0f, -14.8f)
                lineToRelative(37.0f, 14.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.0f, 0.6f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 4.5f, -1.4f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 176.0f, 232.0f)
                lineTo(176.0f, 200.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -2.3f, -5.6f)
                lineToRelative(-13.5f, -13.7f)
                lineTo(160.2f, 161.8f)
                lineToRelative(70.5f, 14.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 6.6f, -1.6f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 2.9f, -6.2f)
                lineTo(240.2f, 136.0f)
                arcTo(8.2f, 8.2f, 0.0f, false, false, 235.8f, 128.8f)
                close()
                moveTo(224.2f, 158.2f)
                lineTo(153.8f, 144.2f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -6.6f, 1.6f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -3.0f, 6.2f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, 2.3f, 5.6f)
                lineTo(160.0f, 203.3f)
                verticalLineToRelative(16.9f)
                lineToRelative(-29.0f, -11.6f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -6.0f, 0.0f)
                lineTo(96.0f, 220.2f)
                lineTo(96.0f, 203.3f)
                lineToRelative(13.7f, -13.6f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 112.0f, 184.0f)
                lineTo(112.0f, 152.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -9.6f, -7.8f)
                lineTo(32.0f, 158.2f)
                lineTo(32.0f, 140.9f)
                lineToRelative(75.6f, -37.7f)
                arcTo(8.2f, 8.2f, 0.0f, false, false, 112.0f, 96.0f)
                lineTo(112.0f, 48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                lineTo(144.0f, 96.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 4.4f, 7.2f)
                lineToRelative(75.6f, 37.7f)
                close()
            }
        }
        .build()
        return _airplane!!
    }

private var _airplane: ImageVector? = null
