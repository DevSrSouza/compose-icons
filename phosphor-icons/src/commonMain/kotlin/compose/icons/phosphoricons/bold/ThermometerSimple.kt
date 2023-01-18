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

public val BoldGroup.ThermometerSimple: ImageVector
    get() {
        if (_thermometerSimple != null) {
            return _thermometerSimple!!
        }
        _thermometerSimple = Builder(name = "ThermometerSimple", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 188.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -36.0f, -20.8f)
                lineTo(116.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(75.2f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 152.0f, 188.0f)
                close()
                moveTo(192.0f, 188.0f)
                arcTo(64.0f, 64.0f, 0.0f, true, true, 76.0f, 150.7f)
                lineTo(76.0f, 56.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, 104.0f, 0.0f)
                verticalLineToRelative(94.7f)
                arcTo(63.8f, 63.8f, 0.0f, false, true, 192.0f, 188.0f)
                close()
                moveTo(168.0f, 188.0f)
                arcToRelative(40.6f, 40.6f, 0.0f, false, false, -9.2f, -25.6f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, true, -2.8f, -7.6f)
                lineTo(156.0f, 56.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -56.0f, 0.0f)
                verticalLineToRelative(98.8f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -2.9f, 7.8f)
                arcTo(40.0f, 40.0f, 0.0f, true, false, 168.0f, 188.0f)
                close()
            }
        }
        .build()
        return _thermometerSimple!!
    }

private var _thermometerSimple: ImageVector? = null
