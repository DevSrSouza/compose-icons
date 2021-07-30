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

public val LineAwesomeIcons.PassportSolid: ImageVector
    get() {
        if (_passportSolid != null) {
            return _passportSolid!!
        }
        _passportSolid = Builder(name = "PassportSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                lineTo(6.0f, 29.0f)
                lineTo(26.0f, 29.0f)
                lineTo(26.0f, 3.0f)
                close()
                moveTo(8.0f, 5.0f)
                lineTo(24.0f, 5.0f)
                lineTo(24.0f, 27.0f)
                lineTo(8.0f, 27.0f)
                close()
                moveTo(16.0f, 8.0f)
                curveTo(12.6992f, 8.0f, 10.0f, 10.6992f, 10.0f, 14.0f)
                curveTo(10.0f, 17.3008f, 12.6992f, 20.0f, 16.0f, 20.0f)
                curveTo(19.3008f, 20.0f, 22.0f, 17.3008f, 22.0f, 14.0f)
                curveTo(22.0f, 10.6992f, 19.3008f, 8.0f, 16.0f, 8.0f)
                close()
                moveTo(16.6875f, 10.0938f)
                curveTo(17.1719f, 10.1758f, 17.625f, 10.3242f, 18.0313f, 10.5625f)
                lineTo(18.0938f, 11.2813f)
                lineTo(17.625f, 11.0938f)
                lineTo(17.25f, 11.4063f)
                lineTo(17.3125f, 12.3125f)
                lineTo(18.2813f, 12.0313f)
                lineTo(19.4688f, 12.4063f)
                lineTo(19.1563f, 12.9375f)
                lineTo(18.4375f, 12.5f)
                lineTo(17.6563f, 12.625f)
                lineTo(16.9063f, 13.1875f)
                lineTo(16.4688f, 14.5f)
                lineTo(17.3125f, 15.1875f)
                curveTo(17.3125f, 15.1875f, 18.2031f, 15.0313f, 18.25f, 15.0313f)
                curveTo(18.2969f, 15.0313f, 18.625f, 15.8438f, 18.625f, 15.8438f)
                lineTo(18.125f, 17.375f)
                curveTo(17.5117f, 17.7578f, 16.7852f, 18.0f, 16.0f, 18.0f)
                curveTo(15.7656f, 18.0f, 15.5352f, 17.9453f, 15.3125f, 17.9063f)
                lineTo(15.125f, 17.5938f)
                lineTo(15.5938f, 15.8438f)
                lineTo(13.8125f, 14.5f)
                lineTo(12.1563f, 14.5f)
                lineTo(12.0313f, 14.25f)
                curveTo(12.0273f, 14.1641f, 12.0f, 14.0859f, 12.0f, 14.0f)
                curveTo(12.0f, 13.7852f, 12.0313f, 13.5781f, 12.0625f, 13.375f)
                lineTo(12.9063f, 12.7188f)
                lineTo(14.6875f, 11.875f)
                lineTo(14.4063f, 10.7188f)
                lineTo(15.1875f, 10.5625f)
                lineTo(15.5313f, 11.0625f)
                lineTo(16.875f, 10.8125f)
                close()
                moveTo(13.0625f, 16.7188f)
                lineTo(13.375f, 16.7188f)
                lineTo(13.9688f, 17.4375f)
                curveTo(13.6289f, 17.2383f, 13.3281f, 17.0039f, 13.0625f, 16.7188f)
                close()
                moveTo(10.0f, 22.0f)
                lineTo(10.0f, 24.0f)
                lineTo(22.0f, 24.0f)
                lineTo(22.0f, 22.0f)
                close()
            }
        }
        .build()
        return _passportSolid!!
    }

private var _passportSolid: ImageVector? = null
