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

public val LineAwesomeIcons.Bimobject: ImageVector
    get() {
        if (_bimobject != null) {
            return _bimobject!!
        }
        _bimobject = Builder(name = "Bimobject", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
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
                moveTo(10.0f, 10.0f)
                lineTo(10.0f, 20.8125f)
                lineTo(12.9844f, 20.8125f)
                lineTo(12.9844f, 19.1934f)
                lineTo(13.0273f, 19.1934f)
                curveTo(13.4023f, 20.3004f, 14.2487f, 21.0f, 16.3047f, 21.0f)
                lineTo(17.0977f, 21.0f)
                curveTo(21.3977f, 21.0f, 21.9297f, 19.4544f, 21.9297f, 17.1484f)
                lineTo(21.9297f, 15.5215f)
                curveTo(21.9297f, 13.2145f, 21.3969f, 11.6797f, 17.0859f, 11.6797f)
                lineTo(16.2813f, 11.6797f)
                curveTo(14.8833f, 11.6797f, 13.2442f, 12.0654f, 13.0352f, 13.4844f)
                lineTo(12.9844f, 13.4844f)
                lineTo(12.9844f, 10.0f)
                lineTo(10.0f, 10.0f)
                close()
                moveTo(15.0508f, 14.2383f)
                lineTo(17.2852f, 14.2383f)
                curveTo(18.9132f, 14.2283f, 19.0703f, 14.7907f, 19.0703f, 15.8027f)
                lineTo(19.0703f, 16.8672f)
                curveTo(19.0703f, 17.8792f, 18.9132f, 18.4434f, 17.2852f, 18.4434f)
                lineTo(15.0508f, 18.4434f)
                curveTo(13.7048f, 18.4434f, 12.9941f, 18.1392f, 12.9941f, 16.7832f)
                lineTo(12.9941f, 15.8965f)
                curveTo(12.9941f, 14.5295f, 13.7048f, 14.2383f, 15.0508f, 14.2383f)
                close()
            }
        }
        .build()
        return _bimobject!!
    }

private var _bimobject: ImageVector? = null
