package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.Wrench: ImageVector
    get() {
        if (_wrench != null) {
            return _wrench!!
        }
        _wrench = Builder(name = "Wrench", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(185.0f, 37.1f)
                lineTo(143.0f, 79.0f)
                lineToRelative(5.7f, 28.3f)
                lineTo(177.0f, 113.0f)
                lineToRelative(41.9f, -42.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(63.9f, 63.9f, 0.0f, false, true, -89.8f, 81.0f)
                horizontalLineToRelative(0.0f)
                lineTo(73.0f, 217.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -34.0f, -34.0f)
                lineToRelative(65.0f, -56.1f)
                horizontalLineToRelative(0.0f)
                arcToRelative(63.9f, 63.9f, 0.0f, false, true, 81.0f, -89.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.3f, 67.9f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, -4.6f, -4.4f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, false, -6.3f, 0.4f)
                arcToRelative(5.1f, 5.1f, 0.0f, false, false, -2.1f, 1.5f)
                lineToRelative(-39.0f, 38.9f)
                lineToRelative(-18.8f, -3.8f)
                lineToRelative(-3.8f, -18.8f)
                lineToRelative(38.9f, -39.0f)
                arcToRelative(5.1f, 5.1f, 0.0f, false, false, 1.5f, -2.1f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, false, 0.4f, -6.3f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, -4.4f, -4.6f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, -94.0f, 95.2f)
                lineTo(33.8f, 177.0f)
                curveToRelative(-0.1f, 0.1f, -0.3f, 0.2f, -0.4f, 0.4f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, false, 0.0f, 45.2f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, false, 45.2f, 0.0f)
                curveToRelative(0.2f, -0.1f, 0.3f, -0.3f, 0.4f, -0.4f)
                lineToRelative(52.1f, -60.3f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, 95.2f, -94.0f)
                close()
                moveTo(199.6f, 135.6f)
                arcToRelative(56.2f, 56.2f, 0.0f, false, true, -66.5f, 9.5f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -10.1f, 1.7f)
                lineTo(67.1f, 211.5f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.6f, -22.6f)
                lineTo(109.2f, 133.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.8f, -9.9f)
                arcToRelative(56.1f, 56.1f, 0.0f, false, true, 58.9f, -82.3f)
                lineTo(137.4f, 73.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.2f, 7.2f)
                lineToRelative(5.6f, 28.3f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, false, 6.3f, 6.3f)
                lineToRelative(28.3f, 5.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.2f, -2.2f)
                lineToRelative(32.6f, -32.5f)
                arcTo(55.9f, 55.9f, 0.0f, false, true, 199.6f, 135.6f)
                close()
            }
        }
        .build()
        return _wrench!!
    }

private var _wrench: ImageVector? = null
