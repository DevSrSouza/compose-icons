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

public val LineAwesomeIcons.User: ImageVector
    get() {
        if (_user != null) {
            return _user!!
        }
        _user = Builder(name = "User", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 5.0f)
                curveTo(12.145f, 5.0f, 9.0f, 8.145f, 9.0f, 12.0f)
                curveTo(9.0f, 14.41f, 10.23f, 16.551f, 12.094f, 17.813f)
                curveTo(8.527f, 19.344f, 6.0f, 22.883f, 6.0f, 27.0f)
                lineTo(8.0f, 27.0f)
                curveTo(8.0f, 22.57f, 11.57f, 19.0f, 16.0f, 19.0f)
                curveTo(20.43f, 19.0f, 24.0f, 22.57f, 24.0f, 27.0f)
                lineTo(26.0f, 27.0f)
                curveTo(26.0f, 22.883f, 23.473f, 19.344f, 19.906f, 17.813f)
                curveTo(21.77f, 16.551f, 23.0f, 14.41f, 23.0f, 12.0f)
                curveTo(23.0f, 8.145f, 19.855f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(16.0f, 7.0f)
                curveTo(18.773f, 7.0f, 21.0f, 9.227f, 21.0f, 12.0f)
                curveTo(21.0f, 14.773f, 18.773f, 17.0f, 16.0f, 17.0f)
                curveTo(13.227f, 17.0f, 11.0f, 14.773f, 11.0f, 12.0f)
                curveTo(11.0f, 9.227f, 13.227f, 7.0f, 16.0f, 7.0f)
                close()
            }
        }
        .build()
        return _user!!
    }

private var _user: ImageVector? = null
