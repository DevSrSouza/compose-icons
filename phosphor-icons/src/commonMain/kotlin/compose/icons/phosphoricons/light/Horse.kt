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

public val LightGroup.Horse: ImageVector
    get() {
        if (_horse != null) {
            return _horse!!
        }
        _horse = Builder(name = "Horse", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.6f, 56.4f)
                arcTo(101.2f, 101.2f, 0.0f, false, false, 128.0f, 26.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(114.0f, 60.6f)
                lineTo(12.9f, 122.9f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, -2.8f, 3.9f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, false, 1.0f, 4.7f)
                lineToRelative(13.8f, 19.1f)
                arcToRelative(29.6f, 29.6f, 0.0f, false, false, 29.4f, 12.0f)
                curveToRelative(14.3f, -2.4f, 40.9f, -4.4f, 64.9f, 7.4f)
                lineTo(90.7f, 209.9f)
                arcTo(88.7f, 88.7f, 0.0f, false, true, 68.0f, 195.1f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.5f, 0.5f)
                arcTo(5.9f, 5.9f, 0.0f, false, false, 60.0f, 204.0f)
                arcToRelative(101.6f, 101.6f, 0.0f, false, false, 68.0f, 26.0f)
                horizontalLineToRelative(2.1f)
                arcTo(102.0f, 102.0f, 0.0f, false, false, 200.6f, 56.4f)
                close()
                moveTo(191.7f, 191.4f)
                arcTo(89.4f, 89.4f, 0.0f, false, true, 129.8f, 218.0f)
                arcToRelative(90.4f, 90.4f, 0.0f, false, true, -27.5f, -3.7f)
                lineToRelative(28.9f, -40.4f)
                arcTo(54.0f, 54.0f, 0.0f, false, false, 182.0f, 120.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                arcToRelative(42.2f, 42.2f, 0.0f, false, true, -40.5f, 42.0f)
                curveToRelative(-28.3f, -16.3f, -60.4f, -14.0f, -77.2f, -11.2f)
                arcToRelative(17.8f, 17.8f, 0.0f, false, true, -17.6f, -7.2f)
                lineTo(24.6f, 129.7f)
                lineToRelative(98.5f, -60.6f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 126.0f, 64.0f)
                lineTo(126.0f, 38.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(89.9f, 89.9f, 0.0f, false, true, 63.7f, 153.4f)
                close()
                moveTo(134.0f, 100.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 134.0f, 100.0f)
                close()
            }
        }
        .build()
        return _horse!!
    }

private var _horse: ImageVector? = null
