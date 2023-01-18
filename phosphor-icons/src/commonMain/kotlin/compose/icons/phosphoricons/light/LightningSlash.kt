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

public val LightGroup.LightningSlash: ImageVector
    get() {
        if (_lightningSlash != null) {
            return _lightningSlash!!
        }
        _lightningSlash = Builder(name = "LightningSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(52.4f, 36.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -8.8f, 8.0f)
                lineTo(84.0f, 88.6f)
                lineTo(43.6f, 131.9f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, false, -1.4f, 5.4f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 3.7f, 4.3f)
                lineToRelative(59.2f, 22.2f)
                lineToRelative(-15.0f, 75.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.2f, 6.5f)
                arcToRelative(5.2f, 5.2f, 0.0f, false, false, 2.7f, 0.7f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, false, 4.4f, -1.9f)
                lineToRelative(63.3f, -67.9f)
                lineTo(203.6f, 220.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 4.4f, 2.0f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, 4.0f, -1.6f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 0.4f, -8.4f)
                close()
                moveTo(106.0f, 220.4f)
                lineToRelative(11.9f, -59.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -3.8f, -6.8f)
                lineTo(58.5f, 133.5f)
                lineToRelative(33.6f, -36.0f)
                lineToRelative(63.5f, 69.8f)
                close()
                moveTo(110.0f, 69.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.3f, -8.4f)
                lineToRelative(45.9f, -49.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 7.1f, -1.3f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, true, 3.2f, 6.6f)
                lineToRelative(-15.0f, 74.9f)
                lineToRelative(59.2f, 22.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.3f, 9.7f)
                lineTo(190.1f, 148.0f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, true, -4.4f, 1.9f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, true, -4.1f, -1.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.3f, -8.5f)
                lineToRelative(16.2f, -17.4f)
                lineToRelative(-55.6f, -20.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -3.8f, -6.8f)
                lineTo(150.0f, 35.5f)
                lineTo(118.5f, 69.2f)
                arcTo(5.9f, 5.9f, 0.0f, false, true, 110.0f, 69.5f)
                close()
            }
        }
        .build()
        return _lightningSlash!!
    }

private var _lightningSlash: ImageVector? = null
