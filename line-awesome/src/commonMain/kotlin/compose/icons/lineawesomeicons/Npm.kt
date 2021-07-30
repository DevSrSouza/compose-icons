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

public val LineAwesomeIcons.Npm: ImageVector
    get() {
        if (_npm != null) {
            return _npm!!
        }
        _npm = Builder(name = "Npm", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 10.0f)
                lineTo(0.0f, 21.0f)
                lineTo(9.0f, 21.0f)
                lineTo(9.0f, 23.0f)
                lineTo(16.0f, 23.0f)
                lineTo(16.0f, 21.0f)
                lineTo(32.0f, 21.0f)
                lineTo(32.0f, 10.0f)
                lineTo(0.0f, 10.0f)
                close()
                moveTo(1.7773f, 11.7773f)
                lineTo(8.8887f, 11.7773f)
                lineTo(8.8906f, 11.7773f)
                lineTo(8.8906f, 19.4453f)
                lineTo(7.1113f, 19.4453f)
                lineTo(7.1113f, 13.5566f)
                lineTo(5.334f, 13.5566f)
                lineTo(5.334f, 19.4453f)
                lineTo(1.7773f, 19.4453f)
                lineTo(1.7773f, 11.7773f)
                close()
                moveTo(10.668f, 11.7773f)
                lineTo(17.7773f, 11.7773f)
                lineTo(17.7793f, 11.7773f)
                lineTo(17.7793f, 19.4434f)
                lineTo(14.2227f, 19.4434f)
                lineTo(14.2227f, 21.2227f)
                lineTo(10.668f, 21.2227f)
                lineTo(10.668f, 11.7773f)
                close()
                moveTo(19.5566f, 11.7773f)
                lineTo(30.2227f, 11.7773f)
                lineTo(30.2246f, 11.7773f)
                lineTo(30.2246f, 19.4453f)
                lineTo(28.4453f, 19.4453f)
                lineTo(28.4453f, 13.5566f)
                lineTo(26.668f, 13.5566f)
                lineTo(26.668f, 19.4453f)
                lineTo(24.8906f, 19.4453f)
                lineTo(24.8906f, 13.5566f)
                lineTo(23.1113f, 13.5566f)
                lineTo(23.1113f, 19.4453f)
                lineTo(19.5566f, 19.4453f)
                lineTo(19.5566f, 11.7773f)
                close()
                moveTo(14.2227f, 13.5566f)
                lineTo(14.2227f, 17.668f)
                lineTo(16.0f, 17.668f)
                lineTo(16.0f, 13.5566f)
                lineTo(14.2227f, 13.5566f)
                close()
            }
        }
        .build()
        return _npm!!
    }

private var _npm: ImageVector? = null
