package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.PaintBucket: ImageVector
    get() {
        if (_paintBucket != null) {
            return _paintBucket!!
        }
        _paintBucket = Builder(name = "PaintBucket", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.0f, 123.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -1.2f, -2.9f)
                lineTo(118.3f, 13.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -5.6f, 0.0f)
                lineToRelative(-43.0f, 42.9f)
                lineTo(40.7f, 27.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 35.0f, 32.7f)
                lineToRelative(29.1f, 29.0f)
                lineTo(16.5f, 109.3f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, 28.3f)
                lineToRelative(84.8f, 84.9f)
                arcToRelative(20.2f, 20.2f, 0.0f, false, false, 28.3f, 0.0f)
                lineToRelative(96.2f, -96.2f)
                arcTo(4.2f, 4.2f, 0.0f, false, false, 227.0f, 123.5f)
                close()
                moveTo(124.0f, 216.8f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -17.0f, 0.0f)
                lineTo(22.1f, 132.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 0.0f, -17.0f)
                lineTo(69.7f, 67.4f)
                lineToRelative(34.8f, 34.7f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 107.0f, 133.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, false, 34.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -30.9f, -36.5f)
                lineTo(75.4f, 61.7f)
                lineToRelative(40.1f, -40.0f)
                lineTo(217.3f, 123.5f)
                close()
                moveTo(124.0f, 100.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -11.3f, 4.7f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 124.0f, 100.0f)
                close()
                moveTo(230.8f, 161.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -5.6f, 0.0f)
                curveToRelative(-0.9f, 0.8f, -21.2f, 21.4f, -21.2f, 42.8f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 48.0f, 0.0f)
                curveTo(252.0f, 182.6f, 231.7f, 162.0f, 230.8f, 161.2f)
                close()
                moveTo(228.0f, 220.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                curveToRelative(0.0f, -13.7f, 10.7f, -27.9f, 16.0f, -34.1f)
                curveToRelative(5.3f, 6.2f, 16.0f, 20.4f, 16.0f, 34.1f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 228.0f, 220.0f)
                close()
            }
        }
        .build()
        return _paintBucket!!
    }

private var _paintBucket: ImageVector? = null
