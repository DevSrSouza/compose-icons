package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.Fingerprint2Fill: ImageVector
    get() {
        if (_fingerprint2Fill != null) {
            return _fingerprint2Fill!!
        }
        _fingerprint2Fill = Builder(name = "Fingerprint2Fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 9.0f, 9.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(8.99f, 8.99f, 0.0f, false, true, -3.81f, 7.354f)
                curveToRelative(0.474f, -1.522f, 0.75f, -3.131f, 0.802f, -4.797f)
                lineTo(18.0f, 16.0f)
                verticalLineToRelative(-2.001f)
                horizontalLineToRelative(-2.0f)
                lineTo(16.0f, 16.0f)
                lineToRelative(-0.003f, 0.315f)
                arcToRelative(15.932f, 15.932f, 0.0f, false, true, -1.431f, 6.315f)
                arcToRelative(9.045f, 9.045f, 0.0f, false, true, -3.574f, 0.314f)
                arcToRelative(12.935f, 12.935f, 0.0f, false, false, 2.001f, -6.52f)
                lineTo(13.0f, 16.0f)
                lineTo(13.0f, 9.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(7.0f)
                lineToRelative(-0.004f, 0.288f)
                arcToRelative(10.95f, 10.95f, 0.0f, false, true, -2.087f, 6.167f)
                arcToRelative(8.98f, 8.98f, 0.0f, false, true, -2.626f, -1.504f)
                arcToRelative(7.959f, 7.959f, 0.0f, false, false, 1.71f, -4.623f)
                lineTo(8.0f, 16.0f)
                verticalLineToRelative(-6.0f)
                lineToRelative(0.005f, -0.2f)
                arcToRelative(3.978f, 3.978f, 0.0f, false, true, 0.435f, -1.625f)
                lineToRelative(0.114f, -0.207f)
                lineToRelative(-1.445f, -1.445f)
                arcToRelative(5.969f, 5.969f, 0.0f, false, false, -1.102f, 3.18f)
                lineTo(6.0f, 10.0f)
                verticalLineToRelative(6.0f)
                lineToRelative(-0.004f, 0.225f)
                arcToRelative(5.968f, 5.968f, 0.0f, false, true, -1.121f, 3.273f)
                arcTo(8.958f, 8.958f, 0.0f, false, true, 3.0f, 14.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 9.0f, -9.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(-1.196f, 0.0f, -2.31f, 0.35f, -3.246f, 0.953f)
                lineToRelative(-0.23f, 0.156f)
                lineToRelative(1.444f, 1.445f)
                arcToRelative(3.977f, 3.977f, 0.0f, false, true, 1.787f, -0.547f)
                lineTo(12.0f, 6.0f)
                lineToRelative(0.2f, 0.005f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.795f, 3.789f)
                lineTo(16.0f, 10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                close()
            }
        }
        .build()
        return _fingerprint2Fill!!
    }

private var _fingerprint2Fill: ImageVector? = null
