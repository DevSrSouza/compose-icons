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

public val LineAwesomeIcons.PraySolid: ImageVector
    get() {
        if (_praySolid != null) {
            return _praySolid!!
        }
        _praySolid = Builder(name = "PraySolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 4.0f)
                curveTo(15.57f, 4.0f, 14.0f, 5.57f, 14.0f, 7.5f)
                curveTo(14.0f, 9.43f, 15.57f, 11.0f, 17.5f, 11.0f)
                curveTo(19.43f, 11.0f, 21.0f, 9.43f, 21.0f, 7.5f)
                curveTo(21.0f, 5.57f, 19.43f, 4.0f, 17.5f, 4.0f)
                close()
                moveTo(17.5f, 6.0f)
                curveTo(18.327f, 6.0f, 19.0f, 6.673f, 19.0f, 7.5f)
                curveTo(19.0f, 8.327f, 18.327f, 9.0f, 17.5f, 9.0f)
                curveTo(16.673f, 9.0f, 16.0f, 8.327f, 16.0f, 7.5f)
                curveTo(16.0f, 6.673f, 16.673f, 6.0f, 17.5f, 6.0f)
                close()
                moveTo(13.1563f, 12.0f)
                curveTo(12.0533f, 12.0f, 11.061f, 12.6549f, 10.627f, 13.6699f)
                lineTo(8.6602f, 18.2559f)
                curveTo(8.1412f, 19.4679f, 8.4644f, 20.8587f, 9.5254f, 21.7637f)
                lineTo(13.9434f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 27.0f)
                lineTo(15.4844f, 27.0f)
                curveTo(16.1334f, 27.0f, 16.7062f, 26.5877f, 16.9082f, 25.9707f)
                curveTo(17.1102f, 25.3537f, 16.8921f, 24.6818f, 16.3691f, 24.2988f)
                lineTo(10.7676f, 20.1973f)
                curveTo(10.4336f, 19.9113f, 10.325f, 19.4489f, 10.498f, 19.0449f)
                lineTo(12.4648f, 14.457f)
                curveTo(12.6678f, 13.983f, 13.3688f, 13.8661f, 13.7148f, 14.2441f)
                lineTo(16.1484f, 18.2324f)
                lineTo(16.2207f, 18.3359f)
                curveTo(16.5357f, 18.7289f, 17.0058f, 18.971f, 17.5078f, 18.998f)
                curveTo(18.0188f, 19.024f, 18.5024f, 18.8365f, 18.8574f, 18.4805f)
                lineTo(22.7793f, 13.6289f)
                lineTo(21.2227f, 12.3711f)
                lineTo(17.6309f, 16.8223f)
                lineTo(15.3809f, 13.1367f)
                lineTo(15.3086f, 13.0332f)
                curveTo(14.7826f, 12.3762f, 13.9972f, 12.0f, 13.1563f, 12.0f)
                close()
            }
        }
        .build()
        return _praySolid!!
    }

private var _praySolid: ImageVector? = null
