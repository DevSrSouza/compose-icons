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

public val LineAwesomeIcons.FacebookF: ImageVector
    get() {
        if (_facebookF != null) {
            return _facebookF!!
        }
        _facebookF = Builder(name = "FacebookF", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.254f, 2.0f)
                curveTo(15.312f, 2.0f, 13.0f, 4.082f, 13.0f, 8.826f)
                lineTo(13.0f, 13.0f)
                lineTo(8.0f, 13.0f)
                lineTo(8.0f, 18.0f)
                lineTo(13.0f, 18.0f)
                lineTo(13.0f, 30.0f)
                lineTo(18.0f, 30.0f)
                lineTo(18.0f, 18.0f)
                lineTo(22.0f, 18.0f)
                lineTo(23.0f, 13.0f)
                lineTo(18.0f, 13.0f)
                lineTo(18.0f, 9.672f)
                curveTo(18.0f, 7.885f, 18.583f, 7.0f, 20.26f, 7.0f)
                lineTo(23.0f, 7.0f)
                lineTo(23.0f, 2.205f)
                curveTo(22.526f, 2.141f, 21.145f, 2.0f, 19.254f, 2.0f)
                close()
            }
        }
        .build()
        return _facebookF!!
    }

private var _facebookF: ImageVector? = null
