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

public val LightGroup.Thermometer: ImageVector
    get() {
        if (_thermometer != null) {
            return _thermometer!!
        }
        _thermometer = Builder(name = "Thermometer", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 54.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, false, 26.0f, 26.0f)
                arcTo(26.1f, 26.1f, 0.0f, false, false, 212.0f, 54.0f)
                close()
                moveTo(212.0f, 94.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 212.0f, 94.0f)
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
                moveTo(126.0f, 162.7f)
                lineTo(126.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(74.7f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, false, 12.0f, 0.0f)
                close()
                moveTo(120.0f, 202.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 120.0f, 202.0f)
                close()
            }
        }
        .build()
        return _thermometer!!
    }

private var _thermometer: ImageVector? = null
