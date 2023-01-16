package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.TableRow: ImageVector
    get() {
        if (_tableRow != null) {
            return _tableRow!!
        }
        _tableRow = Builder(name = "TableRow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 16.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 14.0f)
                verticalLineTo(10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 8.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 10.0f)
                verticalLineTo(14.0f)
                moveTo(4.0f, 14.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(14.0f)
                moveTo(10.0f, 14.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(14.0f)
                moveTo(16.0f, 14.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _tableRow!!
    }

private var _tableRow: ImageVector? = null
