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

public val RegularGroup.CaretDownRight: ImageVector
    get() {
        if (_caretDownRight != null) {
            return _caretDownRight!!
        }
        _caretDownRight = Builder(name = "CaretDownRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5005f, 7.8111f)
                lineTo(7.8111f, 16.5005f)
                horizontalLineTo(16.2505f)
                curveTo(16.3885f, 16.5005f, 16.5005f, 16.3885f, 16.5005f, 16.2505f)
                verticalLineTo(7.8111f)
                close()
                moveTo(15.8666f, 6.3237f)
                curveTo(16.6541f, 5.5362f, 18.0005f, 6.094f, 18.0005f, 7.2076f)
                verticalLineTo(16.2505f)
                curveTo(18.0005f, 17.217f, 17.217f, 18.0005f, 16.2505f, 18.0005f)
                horizontalLineTo(7.2076f)
                curveTo(6.0939f, 18.0005f, 5.5362f, 16.654f, 6.3237f, 15.8666f)
                lineTo(15.8666f, 6.3237f)
                close()
            }
        }
        .build()
        return _caretDownRight!!
    }

private var _caretDownRight: ImageVector? = null
