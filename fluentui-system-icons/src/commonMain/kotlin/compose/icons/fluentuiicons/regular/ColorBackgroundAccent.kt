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

public val RegularGroup.ColorBackgroundAccent: ImageVector
    get() {
        if (_colorBackgroundAccent != null) {
            return _colorBackgroundAccent!!
        }
        _colorBackgroundAccent = Builder(name = "ColorBackgroundAccent", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 17.5f)
                verticalLineTo(13.4117f)
                lineTo(4.488f, 14.8997f)
                curveTo(5.6596f, 16.0713f, 7.5591f, 16.0713f, 8.7306f, 14.8997f)
                lineTo(10.1007f, 13.5296f)
                curveTo(10.039f, 13.7951f, 10.0f, 14.0791f, 10.0f, 14.375f)
                curveTo(10.0f, 16.2315f, 11.3942f, 18.0f, 13.5f, 18.0f)
                curveTo(15.6058f, 18.0f, 17.0f, 16.2315f, 17.0f, 14.375f)
                curveTo(17.0f, 13.6821f, 16.7863f, 13.0543f, 16.567f, 12.5766f)
                curveTo(16.3409f, 12.084f, 16.0554f, 11.6368f, 15.7966f, 11.2763f)
                curveTo(15.5344f, 10.9112f, 15.2761f, 10.6025f, 15.0844f, 10.3857f)
                lineTo(15.0764f, 10.3766f)
                lineTo(14.7505f, 10.0257f)
                lineTo(14.7374f, 10.0126f)
                curveTo(14.4441f, 9.7192f, 14.0726f, 9.5518f, 13.6899f, 9.5103f)
                curveTo(14.0495f, 8.4608f, 13.8106f, 7.2517f, 12.9733f, 6.4144f)
                lineTo(11.5589f, 5.0f)
                horizontalLineTo(19.5f)
                curveTo(20.3284f, 5.0f, 21.0f, 5.6716f, 21.0f, 6.5f)
                verticalLineTo(17.5f)
                curveTo(21.0f, 18.3284f, 20.3284f, 19.0f, 19.5f, 19.0f)
                horizontalLineTo(4.5f)
                curveTo(3.6716f, 19.0f, 3.0f, 18.3284f, 3.0f, 17.5f)
                close()
            }
        }
        .build()
        return _colorBackgroundAccent!!
    }

private var _colorBackgroundAccent: ImageVector? = null
