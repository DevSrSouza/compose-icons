package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.BasketShopping: ImageVector
    get() {
        if (_basketShopping != null) {
            return _basketShopping!!
        }
        _basketShopping = Builder(name = "BasketShopping", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(253.3f, 35.1f)
                curveToRelative(6.1f, -11.8f, 1.5f, -26.3f, -10.2f, -32.4f)
                reflectiveCurveToRelative(-26.3f, -1.5f, -32.4f, 10.2f)
                lineTo(117.6f, 192.0f)
                lineTo(32.0f, 192.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(83.9f, 463.5f)
                curveTo(91.0f, 492.0f, 116.6f, 512.0f, 146.0f, 512.0f)
                lineTo(430.0f, 512.0f)
                curveToRelative(29.4f, 0.0f, 55.0f, -20.0f, 62.1f, -48.5f)
                lineTo(544.0f, 256.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(458.4f, 192.0f)
                lineTo(365.3f, 12.9f)
                curveTo(359.2f, 1.2f, 344.7f, -3.4f, 332.9f, 2.7f)
                reflectiveCurveToRelative(-16.3f, 20.6f, -10.2f, 32.4f)
                lineTo(404.3f, 192.0f)
                lineTo(171.7f, 192.0f)
                lineTo(253.3f, 35.1f)
                close()
                moveTo(192.0f, 304.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                reflectiveCurveToRelative(-16.0f, -7.2f, -16.0f, -16.0f)
                lineTo(160.0f, 304.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.2f, 16.0f, 16.0f)
                close()
                moveTo(288.0f, 288.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                reflectiveCurveToRelative(-16.0f, -7.2f, -16.0f, -16.0f)
                lineTo(272.0f, 304.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                close()
                moveTo(416.0f, 304.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                reflectiveCurveToRelative(-16.0f, -7.2f, -16.0f, -16.0f)
                lineTo(384.0f, 304.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.2f, 16.0f, 16.0f)
                close()
            }
        }
        .build()
        return _basketShopping!!
    }

private var _basketShopping: ImageVector? = null
