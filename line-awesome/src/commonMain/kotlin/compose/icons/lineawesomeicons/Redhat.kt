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

public val LineAwesomeIcons.Redhat: ImageVector
    get() {
        if (_redhat != null) {
            return _redhat!!
        }
        _redhat = Builder(name = "Redhat", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.389f, 6.002f)
                curveTo(15.612f, 6.002f, 15.385f, 7.082f, 14.451f, 7.082f)
                curveTo(13.546f, 7.082f, 12.889f, 6.271f, 12.043f, 6.271f)
                curveTo(11.236f, 6.271f, 10.714f, 6.864f, 10.311f, 8.082f)
                curveTo(8.934f, 12.245f, 8.994f, 12.068f, 9.004f, 12.287f)
                curveTo(9.004f, 13.619f, 13.881f, 17.99f, 20.41f, 17.99f)
                lineTo(20.41f, 18.0f)
                curveTo(22.091f, 18.0f, 24.52f, 17.625f, 24.52f, 15.471f)
                curveTo(24.54f, 15.107f, 24.57f, 15.378f, 23.479f, 10.301f)
                curveTo(23.253f, 9.27f, 23.045f, 8.801f, 21.373f, 7.906f)
                curveTo(20.065f, 7.187f, 17.225f, 6.002f, 16.389f, 6.002f)
                close()
                moveTo(8.27f, 13.039f)
                curveTo(5.97f, 13.149f, 3.0f, 13.57f, 3.0f, 16.24f)
                curveTo(3.0f, 20.61f, 13.19f, 26.0f, 21.26f, 26.0f)
                curveTo(27.44f, 26.0f, 29.0f, 23.16f, 29.0f, 20.91f)
                curveTo(29.0f, 19.14f, 27.499f, 17.139f, 24.789f, 15.939f)
                curveTo(25.02f, 17.177f, 25.0f, 17.559f, 25.0f, 17.721f)
                curveTo(25.0f, 19.828f, 22.845f, 21.0f, 20.008f, 21.0f)
                curveTo(13.613f, 21.011f, 8.0f, 16.873f, 8.0f, 14.148f)
                curveTo(8.0f, 13.768f, 8.13f, 13.387f, 8.27f, 13.039f)
                close()
            }
        }
        .build()
        return _redhat!!
    }

private var _redhat: ImageVector? = null
