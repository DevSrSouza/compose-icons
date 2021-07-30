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

public val LineAwesomeIcons.Ups: ImageVector
    get() {
        if (_ups != null) {
            return _ups!!
        }
        _ups = Builder(name = "Ups", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5117f, 2.9883f)
                curveTo(11.5492f, 3.0758f, 7.75f, 4.0f, 5.0f, 5.5f)
                lineTo(5.0f, 18.3008f)
                curveTo(5.0f, 24.4008f, 9.4f, 26.1996f, 16.0f, 29.0996f)
                curveTo(22.6f, 26.1996f, 27.0f, 24.4008f, 27.0f, 18.3008f)
                lineTo(27.0f, 5.5f)
                curveTo(23.6f, 3.65f, 19.4742f, 2.9008f, 15.5117f, 2.9883f)
                close()
                moveTo(21.0195f, 5.502f)
                curveTo(22.7258f, 5.4629f, 24.4f, 5.5492f, 26.0f, 5.6992f)
                lineTo(26.0f, 18.1992f)
                curveTo(26.0f, 23.2992f, 22.9f, 24.9004f, 16.0f, 27.9004f)
                curveTo(9.1f, 24.9004f, 6.0f, 23.2992f, 6.0f, 18.1992f)
                lineTo(6.0f, 11.0f)
                curveTo(10.5f, 6.875f, 15.9008f, 5.6191f, 21.0195f, 5.502f)
                close()
                moveTo(16.1699f, 11.0313f)
                curveTo(15.1533f, 11.026f, 14.1867f, 11.3617f, 13.6992f, 11.6992f)
                lineTo(13.6992f, 24.0f)
                lineTo(15.5996f, 24.0f)
                lineTo(15.5996f, 20.0f)
                curveTo(16.9996f, 20.4f, 19.6992f, 19.9f, 19.6992f, 15.5f)
                curveTo(19.6992f, 12.0f, 17.8643f, 11.04f, 16.1699f, 11.0313f)
                close()
                moveTo(22.541f, 11.0645f)
                curveTo(21.2715f, 11.1631f, 20.0996f, 12.0f, 20.0996f, 13.5f)
                curveTo(20.0996f, 16.3f, 23.0996f, 15.9996f, 23.0996f, 17.5996f)
                curveTo(23.1996f, 18.9996f, 21.3992f, 18.9004f, 20.1992f, 17.9004f)
                lineTo(20.1992f, 19.5996f)
                curveTo(22.2992f, 20.8996f, 24.9f, 20.0992f, 25.0f, 17.6992f)
                curveTo(25.1f, 14.6992f, 21.9004f, 15.0004f, 21.9004f, 13.4004f)
                curveTo(21.9004f, 12.3004f, 23.6992f, 12.2008f, 24.6992f, 13.3008f)
                lineTo(24.6992f, 11.6992f)
                curveTo(24.0992f, 11.2117f, 23.3027f, 11.0053f, 22.541f, 11.0645f)
                close()
                moveTo(7.0f, 11.1992f)
                lineTo(7.0f, 17.0996f)
                curveTo(7.0f, 21.4996f, 11.6992f, 20.1004f, 12.6992f, 19.4004f)
                lineTo(12.6992f, 11.1992f)
                lineTo(10.8008f, 11.1992f)
                lineTo(10.8008f, 18.3008f)
                curveTo(10.5008f, 18.5008f, 8.9004f, 18.9992f, 8.9004f, 17.1992f)
                lineTo(8.9004f, 11.1992f)
                lineTo(7.0f, 11.1992f)
                close()
                moveTo(16.0547f, 12.5605f)
                curveTo(16.7437f, 12.4996f, 17.6992f, 12.875f, 17.6992f, 15.5f)
                curveTo(17.7992f, 19.5f, 15.7f, 18.5f, 15.5f, 18.5f)
                lineTo(15.5f, 12.6992f)
                curveTo(15.625f, 12.6492f, 15.825f, 12.5809f, 16.0547f, 12.5605f)
                close()
            }
        }
        .build()
        return _ups!!
    }

private var _ups: ImageVector? = null
