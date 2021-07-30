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
                moveTo(19.2539f, 2.0f)
                curveTo(15.3119f, 2.0f, 13.0f, 4.0822f, 13.0f, 8.8262f)
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
                lineTo(18.0f, 9.6719f)
                curveTo(18.0f, 7.8849f, 18.5828f, 7.0f, 20.2598f, 7.0f)
                lineTo(23.0f, 7.0f)
                lineTo(23.0f, 2.2051f)
                curveTo(22.526f, 2.1411f, 21.1449f, 2.0f, 19.2539f, 2.0f)
                close()
            }
        }
        .build()
        return _facebookF!!
    }

private var _facebookF: ImageVector? = null
