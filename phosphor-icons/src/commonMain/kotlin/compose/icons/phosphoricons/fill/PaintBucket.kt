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

public val FillGroup.PaintBucket: ImageVector
    get() {
        if (_paintBucket != null) {
            return _paintBucket!!
        }
        _paintBucket = Builder(name = "PaintBucket", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(115.5f, 124.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -17.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 17.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 17.0f)
                close()
                moveTo(43.5f, 24.2f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 32.2f, 35.5f)
                lineTo(58.4f, 61.7f)
                lineTo(69.7f, 50.4f)
                close()
                moveTo(233.7f, 158.3f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, -11.4f, 0.0f)
                curveToRelative(-0.9f, 1.0f, -22.3f, 22.7f, -22.3f, 45.7f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 56.0f, 0.0f)
                curveTo(256.0f, 181.0f, 234.6f, 159.3f, 233.7f, 158.3f)
                close()
                moveTo(231.0f, 123.5f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, -2.4f, -5.7f)
                lineTo(121.1f, 10.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.3f, 0.0f)
                lineTo(69.7f, 50.4f)
                lineToRelative(41.0f, 41.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -11.3f, 11.3f)
                lineToRelative(-41.0f, -41.0f)
                lineTo(13.7f, 106.5f)
                arcToRelative(23.9f, 23.9f, 0.0f, false, false, 0.0f, 33.9f)
                lineToRelative(84.8f, 84.9f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, false, 34.0f, 0.0f)
                lineToRelative(96.1f, -96.2f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 231.0f, 123.5f)
                close()
            }
        }
        .build()
        return _paintBucket!!
    }

private var _paintBucket: ImageVector? = null
