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

public val LightGroup.ThermometerHot: ImageVector
    get() {
        if (_thermometerHot != null) {
            return _thermometerHot!!
        }
        _thermometerHot = Builder(name = "ThermometerHot", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(126.0f, 162.7f)
                lineTo(126.0f, 48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(114.0f, 162.7f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, false, 12.0f, 0.0f)
                close()
                moveTo(120.0f, 202.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 120.0f, 202.0f)
                close()
                moveTo(179.5f, 84.2f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, 0.0f, -8.4f)
                arcToRelative(25.8f, 25.8f, 0.0f, false, true, 36.7f, 0.0f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, 19.8f, 0.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.5f, 0.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, 0.0f, 8.4f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -36.7f, 0.0f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, -19.8f, 0.0f)
                arcTo(5.9f, 5.9f, 0.0f, false, true, 179.5f, 84.2f)
                close()
                moveTo(244.5f, 115.8f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, 0.0f, 8.4f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -36.7f, 0.0f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, -19.8f, 0.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -8.5f, 0.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, 0.0f, -8.4f)
                arcToRelative(25.8f, 25.8f, 0.0f, false, true, 36.7f, 0.0f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, 19.8f, 0.0f)
                arcTo(5.9f, 5.9f, 0.0f, false, true, 244.5f, 115.8f)
                close()
                moveTo(158.0f, 144.2f)
                lineTo(158.0f, 48.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, -76.0f, 0.0f)
                verticalLineToRelative(96.2f)
                arcToRelative(58.0f, 58.0f, 0.0f, true, false, 76.0f, 0.0f)
                close()
                moveTo(120.0f, 234.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, true, -28.6f, -82.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 2.6f, -5.0f)
                lineTo(94.0f, 48.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 52.0f, 0.0f)
                verticalLineToRelative(99.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 2.5f, 4.9f)
                arcTo(46.0f, 46.0f, 0.0f, false, true, 120.0f, 234.0f)
                close()
            }
        }
        .build()
        return _thermometerHot!!
    }

private var _thermometerHot: ImageVector? = null