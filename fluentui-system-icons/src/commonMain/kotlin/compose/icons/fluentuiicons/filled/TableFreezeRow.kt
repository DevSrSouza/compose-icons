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

public val FilledGroup.TableFreezeRow: ImageVector
    get() {
        if (_tableFreezeRow != null) {
            return _tableFreezeRow!!
        }
        _tableFreezeRow = Builder(name = "TableFreezeRow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.25f, 3.0f)
                curveTo(4.4551f, 3.0f, 3.0f, 4.4551f, 3.0f, 6.25f)
                verticalLineTo(14.5f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(6.25f)
                curveTo(4.5f, 5.2835f, 5.2835f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(17.75f)
                curveTo(18.7165f, 4.5f, 19.5f, 5.2835f, 19.5f, 6.25f)
                verticalLineTo(9.5f)
                horizontalLineTo(16.0f)
                verticalLineTo(14.5f)
                horizontalLineTo(21.0f)
                verticalLineTo(6.25f)
                curveTo(21.0f, 4.4551f, 19.5449f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(6.25f)
                close()
                moveTo(21.0f, 16.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 21.0f, 21.0f, 19.5449f, 21.0f, 17.75f)
                verticalLineTo(16.0f)
                close()
                moveTo(14.5f, 14.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(14.5f)
                lineTo(14.5f, 14.5f)
                close()
                moveTo(9.5f, 16.0f)
                lineTo(14.5f, 16.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(16.0f)
                close()
                moveTo(8.0f, 16.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.5449f, 4.4551f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _tableFreezeRow!!
    }

private var _tableFreezeRow: ImageVector? = null
