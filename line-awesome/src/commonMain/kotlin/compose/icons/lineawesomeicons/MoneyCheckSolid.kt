package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.MoneyCheckSolid: ImageVector
    get() {
        if (_moneyCheckSolid != null) {
            return _moneyCheckSolid!!
        }
        _moneyCheckSolid = Builder(name = "MoneyCheckSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 7.0f)
                lineTo(2.0f, 25.0f)
                lineTo(30.0f, 25.0f)
                lineTo(30.0f, 7.0f)
                lineTo(2.0f, 7.0f)
                close()
                moveTo(4.0f, 9.0f)
                lineTo(28.0f, 9.0f)
                lineTo(28.0f, 23.0f)
                lineTo(4.0f, 23.0f)
                lineTo(4.0f, 9.0f)
                close()
                moveTo(6.0f, 11.0f)
                lineTo(6.0f, 13.0f)
                lineTo(16.0f, 13.0f)
                lineTo(16.0f, 11.0f)
                lineTo(6.0f, 11.0f)
                close()
                moveTo(20.0f, 11.0f)
                lineTo(20.0f, 16.0f)
                lineTo(26.0f, 16.0f)
                lineTo(26.0f, 11.0f)
                lineTo(20.0f, 11.0f)
                close()
                moveTo(6.0f, 14.0f)
                lineTo(6.0f, 16.0f)
                lineTo(13.0f, 16.0f)
                lineTo(13.0f, 14.0f)
                lineTo(6.0f, 14.0f)
                close()
                moveTo(8.5f, 17.0f)
                curveTo(7.895f, 17.0f, 7.4695f, 17.3442f, 7.1875f, 17.6563f)
                curveTo(6.9065f, 17.9692f, 6.6993f, 18.3165f, 6.5313f, 18.6875f)
                curveTo(6.1953f, 19.4345f, 6.0f, 20.238f, 6.0f, 21.0f)
                lineTo(8.0f, 21.0f)
                curveTo(8.0f, 20.68f, 8.156f, 19.984f, 8.375f, 19.5f)
                curveTo(8.437f, 19.359f, 8.5005f, 19.3118f, 8.5625f, 19.2188f)
                curveTo(8.6365f, 19.3207f, 8.6912f, 19.3862f, 8.7813f, 19.5313f)
                curveTo(8.9263f, 19.7652f, 9.0863f, 20.0475f, 9.2813f, 20.3125f)
                curveTo(9.4762f, 20.5785f, 9.7148f, 21.0152f, 10.4688f, 21.0313f)
                curveTo(11.0627f, 21.0432f, 11.2455f, 20.8285f, 11.4375f, 20.6875f)
                curveTo(11.6285f, 20.5465f, 11.7612f, 20.4142f, 11.9063f, 20.2813f)
                curveTo(12.0042f, 20.1912f, 12.0822f, 20.1255f, 12.1563f, 20.0625f)
                curveTo(12.1833f, 20.1015f, 12.2947f, 20.1672f, 12.8457f, 20.4063f)
                curveTo(13.5127f, 20.6982f, 14.523f, 21.0f, 16.0f, 21.0f)
                lineTo(16.0f, 19.0f)
                curveTo(14.77f, 19.0f, 14.1292f, 18.8008f, 13.6563f, 18.5938f)
                curveTo(13.1833f, 18.3867f, 12.824f, 18.0f, 12.0f, 18.0f)
                curveTo(11.398f, 18.0f, 11.2465f, 18.234f, 11.0625f, 18.375f)
                curveTo(10.8985f, 18.5f, 10.7852f, 18.633f, 10.6563f, 18.75f)
                curveTo(10.5972f, 18.656f, 10.57f, 18.609f, 10.5f, 18.5f)
                curveTo(10.332f, 18.227f, 10.1327f, 17.918f, 9.8438f, 17.625f)
                curveTo(9.5548f, 17.332f, 9.098f, 17.0f, 8.5f, 17.0f)
                close()
                moveTo(20.0f, 19.0f)
                lineTo(20.0f, 21.0f)
                lineTo(26.0f, 21.0f)
                lineTo(26.0f, 19.0f)
                lineTo(20.0f, 19.0f)
                close()
            }
        }
        .build()
        return _moneyCheckSolid!!
    }

private var _moneyCheckSolid: ImageVector? = null
