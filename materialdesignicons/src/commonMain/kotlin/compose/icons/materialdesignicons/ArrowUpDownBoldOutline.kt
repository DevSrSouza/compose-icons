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

public val MaterialDesignIcons.ArrowUpDownBoldOutline: ImageVector
    get() {
        if (_arrowUpDownBoldOutline != null) {
            return _arrowUpDownBoldOutline!!
        }
        _arrowUpDownBoldOutline = Builder(name = "ArrowUpDownBoldOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 10.0f)
                horizontalLineTo(22.0f)
                lineTo(12.0f, 0.0f)
                lineTo(2.0f, 10.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(2.0f)
                lineTo(12.0f, 24.0f)
                lineTo(22.0f, 14.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(10.0f)
                moveTo(14.0f, 16.0f)
                horizontalLineTo(17.0f)
                lineTo(12.0f, 21.0f)
                lineTo(7.0f, 16.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(7.0f)
                lineTo(12.0f, 3.0f)
                lineTo(17.0f, 8.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _arrowUpDownBoldOutline!!
    }

private var _arrowUpDownBoldOutline: ImageVector? = null
