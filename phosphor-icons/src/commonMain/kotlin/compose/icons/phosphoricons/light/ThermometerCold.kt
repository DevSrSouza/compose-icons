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

public val LightGroup.ThermometerCold: ImageVector
    get() {
        if (_thermometerCold != null) {
            return _thermometerCold!!
        }
        _thermometerCold = Builder(name = "ThermometerCold", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(126.0f, 162.7f)
                verticalLineTo(120.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(42.7f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, false, 12.0f, 0.0f)
                close()
                moveTo(120.0f, 202.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 120.0f, 202.0f)
                close()
                moveTo(244.3f, 75.8f)
                lineToRelative(-22.6f, 7.4f)
                lineToRelative(14.0f, 19.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -1.4f, 8.3f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, true, -3.5f, 1.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -4.8f, -2.5f)
                lineTo(212.0f, 90.2f)
                lineToRelative(-14.0f, 19.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -4.8f, 2.5f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, true, -3.5f, -1.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -1.4f, -8.3f)
                lineToRelative(14.0f, -19.2f)
                lineToRelative(-22.6f, -7.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 3.7f, -11.4f)
                lineTo(206.0f, 71.7f)
                verticalLineTo(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineTo(71.7f)
                lineToRelative(22.6f, -7.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 3.7f, 11.4f)
                close()
                moveTo(158.0f, 144.2f)
                verticalLineTo(48.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, -76.0f, 0.0f)
                verticalLineToRelative(96.2f)
                arcToRelative(58.0f, 58.0f, 0.0f, true, false, 76.0f, 0.0f)
                close()
                moveTo(120.0f, 234.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, true, -28.6f, -82.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 2.6f, -5.0f)
                verticalLineTo(48.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 52.0f, 0.0f)
                verticalLineToRelative(99.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 2.5f, 4.9f)
                arcTo(46.0f, 46.0f, 0.0f, false, true, 120.0f, 234.0f)
                close()
            }
        }
        .build()
        return _thermometerCold!!
    }

private var _thermometerCold: ImageVector? = null
