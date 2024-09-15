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

public val LineAwesomeIcons.Autoprefixer: ImageVector
    get() {
        if (_autoprefixer != null) {
            return _autoprefixer!!
        }
        _autoprefixer = Builder(name = "Autoprefixer", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.928f, 5.0f)
                lineTo(8.668f, 27.0f)
                lineTo(12.164f, 27.0f)
                lineTo(13.4f, 23.0f)
                lineTo(18.605f, 23.0f)
                lineTo(19.838f, 27.0f)
                lineTo(23.334f, 27.0f)
                lineTo(15.928f, 5.0f)
                close()
                moveTo(15.969f, 14.689f)
                lineTo(16.041f, 14.689f)
                lineTo(17.986f, 21.0f)
                lineTo(14.018f, 21.0f)
                lineTo(15.969f, 14.689f)
                close()
                moveTo(9.266f, 21.0f)
                lineTo(1.471f, 21.559f)
                lineTo(1.0f, 22.668f)
                lineTo(8.559f, 23.0f)
                lineTo(9.266f, 21.0f)
                close()
                moveTo(22.697f, 21.0f)
                lineTo(23.418f, 23.0f)
                lineTo(31.0f, 22.668f)
                lineTo(30.529f, 21.559f)
                lineTo(22.697f, 21.0f)
                close()
            }
        }
        .build()
        return _autoprefixer!!
    }

private var _autoprefixer: ImageVector? = null
