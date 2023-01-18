package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.PaintBucket: ImageVector
    get() {
        if (_paintBucket != null) {
            return _paintBucket!!
        }
        _paintBucket = Builder(name = "PaintBucket", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.0f, 123.5f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, false, -1.8f, -4.3f)
                lineTo(119.7f, 11.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -8.5f, 0.0f)
                lineTo(69.7f, 53.3f)
                lineTo(42.1f, 25.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.5f, 8.5f)
                lineTo(61.3f, 61.7f)
                lineTo(15.1f, 107.9f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 0.0f, 31.1f)
                lineToRelative(84.8f, 84.9f)
                arcToRelative(22.2f, 22.2f, 0.0f, false, false, 15.6f, 6.4f)
                arcToRelative(21.8f, 21.8f, 0.0f, false, false, 15.5f, -6.4f)
                lineToRelative(96.2f, -96.2f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 229.0f, 123.5f)
                close()
                moveTo(122.6f, 215.4f)
                arcToRelative(10.1f, 10.1f, 0.0f, false, true, -14.2f, 0.0f)
                lineTo(23.6f, 130.5f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, -14.1f)
                lineTo(69.7f, 70.2f)
                lineToRelative(32.2f, 32.2f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, 40.5f, 32.0f)
                horizontalLineToRelative(0.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 124.0f, 90.0f)
                arcToRelative(25.7f, 25.7f, 0.0f, false, false, -13.6f, 3.9f)
                lineTo(78.2f, 61.7f)
                lineToRelative(37.3f, -37.2f)
                lineToRelative(99.0f, 99.0f)
                close()
                moveTo(124.0f, 102.0f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, true, 9.9f, 4.1f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, true, 0.0f, 19.8f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -19.8f, 0.0f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, true, 0.0f, -19.8f)
                arcTo(14.1f, 14.1f, 0.0f, false, true, 124.0f, 102.0f)
                close()
                moveTo(232.2f, 159.8f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, -8.4f, 0.0f)
                curveToRelative(-0.9f, 0.8f, -21.8f, 22.0f, -21.8f, 44.2f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, 52.0f, 0.0f)
                curveTo(254.0f, 181.8f, 233.1f, 160.6f, 232.2f, 159.8f)
                close()
                moveTo(228.0f, 218.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                curveToRelative(0.0f, -11.9f, 8.6f, -24.3f, 14.0f, -30.9f)
                curveToRelative(5.4f, 6.6f, 14.0f, 19.0f, 14.0f, 30.9f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 228.0f, 218.0f)
                close()
            }
        }
        .build()
        return _paintBucket!!
    }

private var _paintBucket: ImageVector? = null
