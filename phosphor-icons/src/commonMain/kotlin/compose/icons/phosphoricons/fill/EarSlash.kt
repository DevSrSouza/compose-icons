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

public val FillGroup.EarSlash: ImageVector
    get() {
        if (_earSlash != null) {
            return _earSlash!!
        }
        _earSlash = Builder(name = "EarSlash", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.1f, 39.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.8f, -11.0f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 216.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                arcTo(72.0f, 72.0f, 0.0f, false, false, 91.1f, 42.2f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 80.1f, 39.4f)
                close()
                moveTo(158.3f, 125.4f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, false, 4.8f, 1.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.4f, -3.2f)
                arcTo(31.6f, 31.6f, 0.0f, false, false, 176.0f, 104.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -48.0f, -48.0f)
                arcToRelative(48.6f, 48.6f, 0.0f, false, false, -15.6f, 2.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.2f, 15.1f)
                arcTo(32.9f, 32.9f, 0.0f, false, true, 128.0f, 72.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, true, 32.0f, 32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -3.3f, 10.2f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 158.3f, 125.4f)
                close()
                moveTo(172.7f, 165.3f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-75.4f, -83.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-28.0f, -30.8f)
                horizontalLineToRelative(-0.1f)
                lineTo(53.9f, 34.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 42.1f, 45.4f)
                lineTo(53.2f, 57.6f)
                arcTo(87.8f, 87.8f, 0.0f, false, false, 40.0f, 104.0f)
                curveToRelative(0.0f, 33.5f, 12.5f, 45.5f, 22.5f, 55.2f)
                curveToRelative(7.8f, 7.5f, 13.5f, 13.0f, 13.5f, 28.8f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 92.1f, 33.1f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -1.1f, -11.3f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -11.2f, 1.1f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 92.0f, 188.0f)
                curveToRelative(0.0f, -22.6f, -9.8f, -32.0f, -18.4f, -40.4f)
                reflectiveCurveTo(56.0f, 130.7f, 56.0f, 104.0f)
                arcToRelative(71.4f, 71.4f, 0.0f, false, true, 8.5f, -34.0f)
                lineTo(82.2f, 89.5f)
                arcTo(50.4f, 50.4f, 0.0f, false, false, 80.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.7f)
                lineToRelative(36.7f, 40.4f)
                arcToRelative(31.1f, 31.1f, 0.0f, false, false, -0.7f, 6.9f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 28.0f, 28.0f)
                arcToRelative(29.7f, 29.7f, 0.0f, false, false, 4.2f, -0.3f)
                lineToRelative(37.9f, 41.7f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 224.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 5.4f, -2.1f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 0.5f, -11.3f)
                close()
            }
        }
        .build()
        return _earSlash!!
    }

private var _earSlash: ImageVector? = null
