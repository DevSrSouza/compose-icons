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
                moveTo(12.859f, 16.01f)
                curveTo(12.606f, 16.046f, 12.367f, 16.178f, 12.201f, 16.398f)
                curveTo(11.869f, 16.839f, 11.957f, 17.467f, 12.398f, 17.799f)
                curveTo(13.098f, 18.326f, 13.894f, 18.671f, 14.734f, 18.852f)
                lineTo(12.293f, 21.293f)
                curveTo(11.902f, 21.684f, 11.902f, 22.316f, 12.293f, 22.707f)
                curveTo(12.684f, 23.098f, 13.316f, 23.098f, 13.707f, 22.707f)
                lineTo(16.0f, 20.414f)
                lineTo(18.293f, 22.707f)
                curveTo(18.488f, 22.902f, 18.744f, 23.0f, 19.0f, 23.0f)
                curveTo(19.256f, 23.0f, 19.512f, 22.902f, 19.707f, 22.707f)
                curveTo(20.098f, 22.316f, 20.098f, 21.684f, 19.707f, 21.293f)
                lineTo(17.266f, 18.852f)
                curveTo(18.105f, 18.671f, 18.899f, 18.326f, 19.6f, 17.801f)
                curveTo(20.041f, 17.469f, 20.13f, 16.841f, 19.799f, 16.4f)
                curveTo(19.468f, 15.957f, 18.842f, 15.869f, 18.398f, 16.201f)
                curveTo(17.005f, 17.248f, 14.991f, 17.246f, 13.6f, 16.201f)
                curveTo(13.38f, 16.035f, 13.113f, 15.974f, 12.859f, 16.01f)
                close()
            }
        }
        .build()
        return _odnoklassnikiSquare!!
    }

private var _odnoklassnikiSquare: ImageVector? = null
