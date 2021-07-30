package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Odnoklassniki: ImageVector
    get() {
        if (_odnoklassniki != null) {
            return _odnoklassniki!!
        }
        _odnoklassniki = Builder(name = "Odnoklassniki", defaultWidth = 320.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(275.1f, 334.0f)
                curveToRelative(-27.4f, 17.4f, -65.1f, 24.3f, -90.0f, 26.9f)
                lineToRelative(20.9f, 20.6f)
                lineToRelative(76.3f, 76.3f)
                curveToRelative(27.9f, 28.6f, -17.5f, 73.3f, -45.7f, 45.7f)
                curveToRelative(-19.1f, -19.4f, -47.1f, -47.4f, -76.3f, -76.6f)
                lineTo(84.0f, 503.4f)
                curveToRelative(-28.2f, 27.5f, -73.6f, -17.6f, -45.4f, -45.7f)
                curveToRelative(19.4f, -19.4f, 47.1f, -47.4f, 76.3f, -76.3f)
                lineToRelative(20.6f, -20.6f)
                curveToRelative(-24.6f, -2.6f, -62.9f, -9.1f, -90.6f, -26.9f)
                curveToRelative(-32.6f, -21.0f, -46.9f, -33.3f, -34.3f, -59.0f)
                curveToRelative(7.4f, -14.6f, 27.7f, -26.9f, 54.6f, -5.7f)
                curveToRelative(0.0f, 0.0f, 36.3f, 28.9f, 94.9f, 28.9f)
                reflectiveCurveToRelative(94.9f, -28.9f, 94.9f, -28.9f)
                curveToRelative(26.9f, -21.1f, 47.1f, -8.9f, 54.6f, 5.7f)
                curveToRelative(12.4f, 25.7f, -1.9f, 38.0f, -34.5f, 59.1f)
                close()
                moveTo(30.3f, 129.7f)
                curveTo(30.3f, 58.0f, 88.6f, 0.0f, 160.0f, 0.0f)
                reflectiveCurveToRelative(129.7f, 58.0f, 129.7f, 129.7f)
                curveToRelative(0.0f, 71.4f, -58.3f, 129.4f, -129.7f, 129.4f)
                reflectiveCurveToRelative(-129.7f, -58.0f, -129.7f, -129.4f)
                close()
                moveTo(96.3f, 129.7f)
                curveToRelative(0.0f, 35.1f, 28.6f, 63.7f, 63.7f, 63.7f)
                reflectiveCurveToRelative(63.7f, -28.6f, 63.7f, -63.7f)
                curveToRelative(0.0f, -35.4f, -28.6f, -64.0f, -63.7f, -64.0f)
                reflectiveCurveToRelative(-63.7f, 28.6f, -63.7f, 64.0f)
                close()
            }
        }
        .build()
        return _odnoklassniki!!
    }

private var _odnoklassniki: ImageVector? = null
