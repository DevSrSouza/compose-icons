package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.FormMultiple: ImageVector
    get() {
        if (_formMultiple != null) {
            return _formMultiple!!
        }
        _formMultiple = Builder(name = "FormMultiple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.25f, 11.5f)
                curveTo(6.8358f, 11.5f, 6.5f, 11.8358f, 6.5f, 12.25f)
                curveTo(6.5f, 12.6642f, 6.8358f, 13.0f, 7.25f, 13.0f)
                curveTo(7.6642f, 13.0f, 8.0f, 12.6642f, 8.0f, 12.25f)
                curveTo(8.0f, 11.8358f, 7.6642f, 11.5f, 7.25f, 11.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.25f, 3.0f)
                curveTo(4.4551f, 3.0f, 3.0f, 4.4551f, 3.0f, 6.25f)
                verticalLineTo(15.25f)
                curveTo(3.0f, 17.0449f, 4.4551f, 18.5f, 6.25f, 18.5f)
                horizontalLineTo(15.25f)
                curveTo(17.0449f, 18.5f, 18.5f, 17.0449f, 18.5f, 15.25f)
                verticalLineTo(6.25f)
                curveTo(18.5f, 4.4551f, 17.0449f, 3.0f, 15.25f, 3.0f)
                horizontalLineTo(6.25f)
                close()
                moveTo(5.0f, 12.25f)
                curveTo(5.0f, 11.0074f, 6.0074f, 10.0f, 7.25f, 10.0f)
                curveTo(8.4926f, 10.0f, 9.5f, 11.0074f, 9.5f, 12.25f)
                curveTo(9.5f, 13.4926f, 8.4926f, 14.5f, 7.25f, 14.5f)
                curveTo(6.0074f, 14.5f, 5.0f, 13.4926f, 5.0f, 12.25f)
                close()
                moveTo(10.5f, 12.25f)
                curveTo(10.5f, 11.8358f, 10.8358f, 11.5f, 11.25f, 11.5f)
                horizontalLineTo(15.75f)
                curveTo(16.1642f, 11.5f, 16.5f, 11.8358f, 16.5f, 12.25f)
                curveTo(16.5f, 12.6642f, 16.1642f, 13.0f, 15.75f, 13.0f)
                horizontalLineTo(11.25f)
                curveTo(10.8358f, 13.0f, 10.5f, 12.6642f, 10.5f, 12.25f)
                close()
                moveTo(5.0f, 7.75f)
                curveTo(5.0f, 7.3358f, 5.3358f, 7.0f, 5.75f, 7.0f)
                horizontalLineTo(15.75f)
                curveTo(16.1642f, 7.0f, 16.5f, 7.3358f, 16.5f, 7.75f)
                curveTo(16.5f, 8.1642f, 16.1642f, 8.5f, 15.75f, 8.5f)
                horizontalLineTo(5.75f)
                curveTo(5.3358f, 8.5f, 5.0f, 8.1642f, 5.0f, 7.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.75f, 21.0002f)
                curveTo(7.5993f, 21.0002f, 6.5883f, 20.4022f, 6.0107f, 19.5f)
                horizontalLineTo(8.7244f)
                lineTo(8.75f, 19.5002f)
                horizontalLineTo(15.7499f)
                curveTo(17.821f, 19.5002f, 19.5f, 17.8212f, 19.5f, 15.7502f)
                verticalLineTo(6.0111f)
                curveTo(20.402f, 6.5886f, 21.0f, 7.5996f, 21.0f, 8.7502f)
                verticalLineTo(15.7502f)
                curveTo(21.0f, 18.6497f, 18.6494f, 21.0002f, 15.7499f, 21.0002f)
                horizontalLineTo(8.75f)
                close()
            }
        }
        .build()
        return _formMultiple!!
    }

private var _formMultiple: ImageVector? = null
