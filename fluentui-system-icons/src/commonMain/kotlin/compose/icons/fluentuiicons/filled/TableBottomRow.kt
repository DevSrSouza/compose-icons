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

public val FilledGroup.TableBottomRow: ImageVector
    get() {
        if (_tableBottomRow != null) {
            return _tableBottomRow!!
        }
        _tableBottomRow = Builder(name = "TableBottomRow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.25f, 3.0f)
                curveTo(4.4551f, 3.0f, 3.0f, 4.4551f, 3.0f, 6.25f)
                verticalLineTo(14.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(6.25f)
                curveTo(4.5f, 5.2835f, 5.2835f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(17.75f)
                curveTo(18.7165f, 4.5f, 19.5f, 5.2835f, 19.5f, 6.25f)
                verticalLineTo(14.5f)
                horizontalLineTo(21.0f)
                verticalLineTo(6.25f)
                curveTo(21.0f, 4.4551f, 19.5449f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(6.25f)
                close()
                moveTo(4.5f, 20.4891f)
                curveTo(3.8003f, 20.0411f, 3.2836f, 19.3324f, 3.087f, 18.5f)
                curveTo(3.0301f, 18.2592f, 3.0f, 18.0081f, 3.0f, 17.75f)
                verticalLineTo(16.0f)
                horizontalLineTo(8.0f)
                lineTo(8.0f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(5.6057f, 21.0f, 5.0051f, 20.8125f, 4.5f, 20.4891f)
                close()
                moveTo(20.913f, 18.5f)
                curveTo(20.9699f, 18.2592f, 21.0f, 18.0081f, 21.0f, 17.75f)
                verticalLineTo(16.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(17.75f)
                curveTo(18.3943f, 21.0f, 18.9949f, 20.8125f, 19.5f, 20.4891f)
                curveTo(20.1997f, 20.0411f, 20.7164f, 19.3324f, 20.913f, 18.5f)
                close()
                moveTo(14.5f, 21.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(9.5f)
                lineTo(9.5f, 21.0f)
                horizontalLineTo(14.5f)
                close()
            }
        }
        .build()
        return _tableBottomRow!!
    }

private var _tableBottomRow: ImageVector? = null
