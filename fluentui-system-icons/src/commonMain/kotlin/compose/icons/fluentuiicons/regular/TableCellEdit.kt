package compose.icons.fluentuiicons.regular

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
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.TableCellEdit: ImageVector
    get() {
        if (_tableCellEdit != null) {
            return _tableCellEdit!!
        }
        _tableCellEdit = Builder(name = "TableCellEdit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 8.75f)
                curveTo(3.0f, 7.5074f, 4.0074f, 6.5f, 5.25f, 6.5f)
                horizontalLineTo(18.75f)
                curveTo(19.7311f, 6.5f, 20.5656f, 7.128f, 20.8733f, 8.0039f)
                curveTo(20.8206f, 8.0013f, 20.7679f, 8.0f, 20.7151f, 8.0f)
                horizontalLineTo(20.713f)
                curveTo(20.2473f, 8.0002f, 19.7806f, 8.0992f, 19.3477f, 8.2969f)
                curveTo(19.2108f, 8.1165f, 18.994f, 8.0f, 18.75f, 8.0f)
                horizontalLineTo(15.5f)
                lineTo(15.5f, 11.8531f)
                lineTo(14.0f, 13.3531f)
                lineTo(14.0f, 8.0f)
                horizontalLineTo(10.0f)
                lineTo(10.0f, 14.0f)
                horizontalLineTo(13.3531f)
                lineTo(12.4883f, 14.8648f)
                curveTo(12.2951f, 15.058f, 12.1249f, 15.2712f, 11.9801f, 15.5f)
                horizontalLineTo(5.25f)
                curveTo(4.0074f, 15.5f, 3.0f, 14.4926f, 3.0f, 13.25f)
                verticalLineTo(8.75f)
                close()
                moveTo(5.25f, 8.0f)
                curveTo(4.8358f, 8.0f, 4.5f, 8.3358f, 4.5f, 8.75f)
                verticalLineTo(13.25f)
                curveTo(4.5f, 13.6642f, 4.8358f, 14.0f, 5.25f, 14.0f)
                horizontalLineTo(8.5f)
                lineTo(8.5f, 8.0f)
                horizontalLineTo(5.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.7152f, 9.0f)
                horizontalLineTo(20.7131f)
                curveTo(20.1285f, 9.0003f, 19.5439f, 9.2234f, 19.0979f, 9.6695f)
                lineTo(13.1955f, 15.5719f)
                curveTo(12.8513f, 15.916f, 12.6072f, 16.3472f, 12.4892f, 16.8194f)
                lineTo(12.0315f, 18.6501f)
                curveTo(11.8325f, 19.4462f, 12.5536f, 20.1674f, 13.3497f, 19.9683f)
                lineTo(15.1804f, 19.5106f)
                curveTo(15.6526f, 19.3926f, 16.0838f, 19.1485f, 16.4279f, 18.8043f)
                lineTo(22.3303f, 12.9019f)
                curveTo(23.223f, 12.0093f, 23.223f, 10.5621f, 22.3303f, 9.6695f)
                curveTo(21.8843f, 9.2234f, 21.2998f, 9.0003f, 20.7152f, 9.0f)
                close()
            }
        }
        .build()
        return _tableCellEdit!!
    }

private var _tableCellEdit: ImageVector? = null
