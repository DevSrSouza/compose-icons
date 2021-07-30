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

public val LineAwesomeIcons.OdnoklassnikiSquare: ImageVector
    get() {
        if (_odnoklassnikiSquare != null) {
            return _odnoklassnikiSquare!!
        }
        _odnoklassnikiSquare = Builder(name = "OdnoklassnikiSquare", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(16.0f, 9.0f)
                curveTo(14.07f, 9.0f, 12.5f, 10.57f, 12.5f, 12.5f)
                curveTo(12.5f, 14.43f, 14.07f, 16.0f, 16.0f, 16.0f)
                curveTo(17.93f, 16.0f, 19.5f, 14.43f, 19.5f, 12.5f)
                curveTo(19.5f, 10.57f, 17.93f, 9.0f, 16.0f, 9.0f)
                close()
                moveTo(16.0f, 11.0f)
                curveTo(16.827f, 11.0f, 17.5f, 11.673f, 17.5f, 12.5f)
                curveTo(17.5f, 13.327f, 16.827f, 14.0f, 16.0f, 14.0f)
                curveTo(15.173f, 14.0f, 14.5f, 13.327f, 14.5f, 12.5f)
                curveTo(14.5f, 11.673f, 15.173f, 11.0f, 16.0f, 11.0f)
                close()
                moveTo(12.8594f, 16.0098f)
                curveTo(12.606f, 16.0456f, 12.3667f, 16.1779f, 12.2012f, 16.3984f)
                curveTo(11.8692f, 16.8394f, 11.9574f, 17.4668f, 12.3984f, 17.7988f)
                curveTo(13.0983f, 18.3258f, 13.8942f, 18.6714f, 14.7344f, 18.8516f)
                lineTo(12.293f, 21.293f)
                curveTo(11.902f, 21.684f, 11.902f, 22.316f, 12.293f, 22.707f)
                curveTo(12.684f, 23.098f, 13.316f, 23.098f, 13.707f, 22.707f)
                lineTo(16.0f, 20.4141f)
                lineTo(18.293f, 22.707f)
                curveTo(18.488f, 22.902f, 18.744f, 23.0f, 19.0f, 23.0f)
                curveTo(19.256f, 23.0f, 19.512f, 22.902f, 19.707f, 22.707f)
                curveTo(20.098f, 22.316f, 20.098f, 21.684f, 19.707f, 21.293f)
                lineTo(17.2656f, 18.8516f)
                curveTo(18.105f, 18.6715f, 18.8992f, 18.3262f, 19.5996f, 17.8008f)
                curveTo(20.0406f, 17.4688f, 20.1298f, 16.8414f, 19.7988f, 16.4004f)
                curveTo(19.4678f, 15.9574f, 18.8424f, 15.8692f, 18.3984f, 16.2012f)
                curveTo(17.0054f, 17.2482f, 14.9906f, 17.2462f, 13.5996f, 16.2012f)
                curveTo(13.3796f, 16.0352f, 13.1128f, 15.9739f, 12.8594f, 16.0098f)
                close()
            }
        }
        .build()
        return _odnoklassnikiSquare!!
    }

private var _odnoklassnikiSquare: ImageVector? = null
