package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.TableCellsMerge: ImageVector
    get() {
        if (_tableCellsMerge != null) {
            return _tableCellsMerge!!
        }
        _tableCellsMerge = Builder(name = "TableCellsMerge", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.4551f, 4.4551f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 3.0f, 21.0f, 4.4551f, 21.0f, 6.25f)
                verticalLineTo(6.5f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.25f)
                close()
                moveTo(3.0f, 8.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(15.5799f, 11.25f)
                lineTo(14.6895f, 10.2483f)
                curveTo(14.4143f, 9.9387f, 14.4422f, 9.4646f, 14.7517f, 9.1895f)
                curveTo(15.0613f, 8.9143f, 15.5354f, 8.9422f, 15.8106f, 9.2517f)
                lineTo(17.8084f, 11.4993f)
                curveTo(17.9215f, 11.6254f, 17.9925f, 11.7899f, 17.9995f, 11.9709f)
                curveTo(18.0002f, 11.991f, 18.0002f, 12.0112f, 17.9994f, 12.0313f)
                curveTo(17.9923f, 12.2045f, 17.9264f, 12.3626f, 17.8211f, 12.4861f)
                lineTo(17.8106f, 12.4983f)
                lineTo(15.8106f, 14.7483f)
                curveTo(15.5354f, 15.0579f, 15.0613f, 15.0858f, 14.7517f, 14.8106f)
                curveTo(14.4422f, 14.5354f, 14.4143f, 14.0613f, 14.6895f, 13.7517f)
                lineTo(15.5799f, 12.75f)
                horizontalLineTo(8.4201f)
                lineTo(9.3106f, 13.7517f)
                curveTo(9.5857f, 14.0613f, 9.5579f, 14.5354f, 9.2483f, 14.8106f)
                curveTo(8.9387f, 15.0858f, 8.4646f, 15.0579f, 8.1894f, 14.7483f)
                lineTo(6.1894f, 12.4983f)
                curveTo(5.9369f, 12.2141f, 5.9369f, 11.7859f, 6.1894f, 11.5017f)
                lineTo(8.1894f, 9.2517f)
                curveTo(8.4646f, 8.9422f, 8.9387f, 8.9143f, 9.2483f, 9.1895f)
                curveTo(9.5579f, 9.4646f, 9.5857f, 9.9387f, 9.3106f, 10.2483f)
                lineTo(8.4201f, 11.25f)
                horizontalLineTo(15.5799f)
                close()
                moveTo(3.0f, 17.75f)
                verticalLineTo(17.5f)
                horizontalLineTo(21.0f)
                verticalLineTo(17.75f)
                curveTo(21.0f, 19.5449f, 19.5449f, 21.0f, 17.75f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 21.0f, 3.0f, 19.5449f, 3.0f, 17.75f)
                close()
            }
        }
        .build()
        return _tableCellsMerge!!
    }

private var _tableCellsMerge: ImageVector? = null
