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

public val LineAwesomeIcons.Gitlab: ImageVector
    get() {
        if (_gitlab != null) {
            return _gitlab!!
        }
        _gitlab = Builder(name = "Gitlab", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.3828f, 1.9727f)
                lineTo(4.0781f, 13.4531f)
                lineTo(3.8359f, 14.1055f)
                lineTo(1.7969f, 19.543f)
                lineTo(16.0f, 29.875f)
                lineTo(30.2031f, 19.543f)
                lineTo(28.1641f, 14.1055f)
                lineTo(23.6133f, 1.9727f)
                lineTo(19.8828f, 13.4531f)
                lineTo(12.1172f, 13.4531f)
                close()
                moveTo(8.25f, 8.0273f)
                lineTo(10.0156f, 13.4531f)
                lineTo(6.2148f, 13.4531f)
                close()
                moveTo(23.75f, 8.0273f)
                lineTo(25.7852f, 13.4531f)
                lineTo(21.9844f, 13.4531f)
                close()
                moveTo(5.4648f, 15.4531f)
                lineTo(10.6641f, 15.4531f)
                lineTo(14.0938f, 26.0156f)
                lineTo(4.2031f, 18.8203f)
                close()
                moveTo(12.7656f, 15.4531f)
                lineTo(19.2344f, 15.4531f)
                lineTo(16.0f, 25.4023f)
                close()
                moveTo(21.3359f, 15.4531f)
                lineTo(26.5313f, 15.4531f)
                lineTo(27.7969f, 18.8203f)
                lineTo(17.9023f, 26.0156f)
                close()
            }
        }
        .build()
        return _gitlab!!
    }

private var _gitlab: ImageVector? = null
