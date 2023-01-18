package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.ColorLineAccent: ImageVector
    get() {
        if (_colorLineAccent != null) {
            return _colorLineAccent!!
        }
        _colorLineAccent = Builder(name = "ColorLineAccent", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0043f, 15.6313f)
                curveTo(4.0142f, 15.7809f, 4.0409f, 15.9297f, 4.0844f, 16.0748f)
                curveTo(4.402f, 17.1328f, 5.517f, 17.733f, 6.575f, 17.4154f)
                lineTo(10.868f, 16.1268f)
                curveTo(11.294f, 15.9989f, 11.6883f, 15.7852f, 12.027f, 15.5f)
                horizontalLineTo(19.5f)
                curveTo(20.0523f, 15.5f, 20.5f, 15.9477f, 20.5f, 16.5f)
                verticalLineTo(19.5f)
                curveTo(20.5f, 20.0523f, 20.0523f, 20.5f, 19.5f, 20.5f)
                horizontalLineTo(4.5f)
                curveTo(3.9477f, 20.5f, 3.5f, 20.0523f, 3.5f, 19.5f)
                verticalLineTo(16.5f)
                curveTo(3.5f, 16.1281f, 3.703f, 15.8036f, 4.0043f, 15.6313f)
                close()
            }
        }
        .build()
        return _colorLineAccent!!
    }

private var _colorLineAccent: ImageVector? = null
