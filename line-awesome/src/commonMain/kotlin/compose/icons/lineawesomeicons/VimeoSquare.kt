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

public val LineAwesomeIcons.VimeoSquare: ImageVector
    get() {
        if (_vimeoSquare != null) {
            return _vimeoSquare!!
        }
        _vimeoSquare = Builder(name = "VimeoSquare", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
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
                moveTo(20.879f, 10.0f)
                curveTo(18.971f, 10.0f, 17.676f, 10.828f, 17.0f, 13.045f)
                curveTo(17.844f, 12.683f, 19.091f, 12.588f, 18.945f, 14.0f)
                curveTo(18.906f, 14.478f, 18.483f, 15.358f, 17.906f, 16.271f)
                curveTo(16.304f, 18.798f, 15.914f, 17.954f, 15.031f, 12.375f)
                curveTo(14.781f, 10.804f, 14.123f, 10.073f, 13.051f, 10.176f)
                curveTo(12.104f, 10.262f, 10.588f, 11.769f, 9.0f, 13.164f)
                lineTo(9.646f, 14.0f)
                curveTo(10.262f, 13.565f, 10.623f, 13.391f, 10.727f, 13.391f)
                curveTo(11.623f, 13.391f, 12.083f, 15.719f, 13.168f, 19.693f)
                curveTo(13.723f, 21.174f, 14.398f, 21.914f, 15.203f, 21.914f)
                curveTo(16.499f, 21.914f, 18.084f, 20.697f, 19.957f, 18.264f)
                curveTo(21.769f, 15.935f, 22.811f, 14.097f, 22.871f, 12.758f)
                curveTo(22.922f, 11.048f, 22.193f, 10.0f, 20.879f, 10.0f)
                close()
            }
        }
        .build()
        return _vimeoSquare!!
    }

private var _vimeoSquare: ImageVector? = null
