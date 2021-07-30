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

public val LineAwesomeIcons.DnaSolid: ImageVector
    get() {
        if (_dnaSolid != null) {
            return _dnaSolid!!
        }
        _dnaSolid = Builder(name = "DnaSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 5.0f)
                curveTo(6.0f, 8.0234f, 7.2813f, 10.375f, 9.0938f, 12.2188f)
                curveTo(10.5313f, 13.6836f, 12.2773f, 14.8867f, 14.0625f, 16.0f)
                curveTo(9.8945f, 18.6328f, 6.0f, 21.5117f, 6.0f, 27.0f)
                lineTo(8.0f, 27.0f)
                curveTo(8.0f, 22.3047f, 11.7813f, 19.7422f, 15.9688f, 17.1563f)
                curveTo(16.9648f, 17.7695f, 17.9375f, 18.3672f, 18.8438f, 19.0f)
                lineTo(15.1875f, 19.0f)
                curveTo(14.1875f, 19.6016f, 13.3047f, 20.3008f, 12.4063f, 21.0f)
                lineTo(21.3125f, 21.0f)
                curveTo(21.3633f, 21.0508f, 21.418f, 21.1055f, 21.4688f, 21.1563f)
                curveTo(22.0391f, 21.7344f, 22.543f, 22.3477f, 22.9375f, 23.0f)
                lineTo(10.5938f, 23.0f)
                curveTo(10.0938f, 23.6016f, 9.8008f, 24.3008f, 9.5f, 25.0f)
                lineTo(23.75f, 25.0f)
                curveTo(23.9063f, 25.6172f, 24.0f, 26.2734f, 24.0f, 27.0f)
                lineTo(26.0f, 27.0f)
                curveTo(26.0f, 23.9766f, 24.7188f, 21.625f, 22.9063f, 19.7813f)
                curveTo(21.0938f, 17.9375f, 18.7813f, 16.5313f, 16.5313f, 15.1563f)
                curveTo(14.2813f, 13.7813f, 12.0938f, 12.4375f, 10.5313f, 10.8438f)
                curveTo(8.9688f, 9.25f, 8.0f, 7.4766f, 8.0f, 5.0f)
                close()
                moveTo(24.0f, 5.0f)
                curveTo(24.0f, 5.7188f, 23.8828f, 6.3789f, 23.7188f, 7.0f)
                lineTo(9.5f, 7.0f)
                curveTo(9.8008f, 7.6992f, 10.0938f, 8.3984f, 10.5938f, 9.0f)
                lineTo(22.875f, 9.0f)
                curveTo(22.4375f, 9.7227f, 21.8828f, 10.3789f, 21.25f, 11.0f)
                lineTo(12.4063f, 11.0f)
                curveTo(13.3047f, 11.6992f, 14.1875f, 12.3984f, 15.1875f, 13.0f)
                lineTo(18.875f, 13.0f)
                curveTo(18.2734f, 13.4375f, 17.6406f, 13.8789f, 17.0f, 14.3125f)
                curveTo(17.6016f, 14.7109f, 18.2109f, 15.0078f, 18.8125f, 15.4063f)
                curveTo(22.6133f, 12.9063f, 26.0f, 10.0f, 26.0f, 5.0f)
                close()
            }
        }
        .build()
        return _dnaSolid!!
    }

private var _dnaSolid: ImageVector? = null
