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

public val BoldGroup.PaintBucket: ImageVector
    get() {
        if (_paintBucket != null) {
            return _paintBucket!!
        }
        _paintBucket = Builder(name = "PaintBucket", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.0f, 123.5f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -3.5f, -8.5f)
                lineTo(124.0f, 7.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineTo(69.7f, 44.8f)
                lineTo(46.3f, 21.4f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 29.4f, 38.3f)
                lineTo(52.8f, 61.7f)
                lineToRelative(-42.0f, 42.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 0.0f, 39.6f)
                lineToRelative(84.9f, 84.8f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 39.6f, 0.0f)
                lineTo(231.5f, 132.0f)
                arcTo(12.3f, 12.3f, 0.0f, false, false, 235.0f, 123.5f)
                close()
                moveTo(118.3f, 211.2f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -5.6f, 0.0f)
                lineTo(27.8f, 126.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.7f)
                lineTo(69.7f, 78.7f)
                lineToRelative(21.8f, 21.8f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 58.0f, 41.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -41.0f, -57.9f)
                lineTo(86.7f, 61.7f)
                lineTo(115.5f, 33.0f)
                lineTo(206.0f, 123.5f)
                close()
                moveTo(124.0f, 104.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 8.5f, 3.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.0f, 0.0f)
                arcTo(12.2f, 12.2f, 0.0f, false, true, 124.0f, 104.0f)
                close()
                moveTo(232.5f, 167.5f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -17.0f, 0.0f)
                curveToRelative(-2.4f, 2.4f, -23.5f, 24.2f, -23.5f, 48.5f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 64.0f, 0.0f)
                curveTo(256.0f, 191.7f, 234.9f, 169.9f, 232.5f, 167.5f)
                close()
                moveTo(224.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                curveToRelative(0.0f, -6.9f, 3.8f, -14.7f, 8.0f, -20.9f)
                curveToRelative(4.1f, 6.2f, 8.0f, 14.0f, 8.0f, 20.9f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 224.0f)
                close()
            }
        }
        .build()
        return _paintBucket!!
    }

private var _paintBucket: ImageVector? = null
