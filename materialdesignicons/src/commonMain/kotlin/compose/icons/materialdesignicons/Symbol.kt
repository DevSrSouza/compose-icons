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

public val MaterialDesignIcons.Symbol: ImageVector
    get() {
        if (_symbol != null) {
            return _symbol!!
        }
        _symbol = Builder(name = "Symbol", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 7.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(2.0f)
                moveTo(6.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.0f)
                curveTo(11.11f, 13.0f, 12.0f, 12.11f, 12.0f, 11.0f)
                verticalLineTo(9.0f)
                curveTo(12.0f, 7.89f, 11.11f, 7.0f, 10.0f, 7.0f)
                horizontalLineTo(6.0f)
                moveTo(15.8f, 7.0f)
                lineTo(15.6f, 9.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(15.4f)
                lineTo(15.2f, 13.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(15.0f)
                lineTo(14.8f, 17.0f)
                horizontalLineTo(16.8f)
                lineTo(17.0f, 15.0f)
                horizontalLineTo(18.4f)
                lineTo(18.2f, 17.0f)
                horizontalLineTo(20.2f)
                lineTo(20.4f, 15.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.6f)
                lineTo(20.8f, 11.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(21.0f)
                lineTo(21.2f, 7.0f)
                horizontalLineTo(19.2f)
                lineTo(19.0f, 9.0f)
                horizontalLineTo(17.6f)
                lineTo(17.8f, 7.0f)
                horizontalLineTo(15.8f)
                moveTo(17.4f, 11.0f)
                horizontalLineTo(18.8f)
                lineTo(18.6f, 13.0f)
                horizontalLineTo(17.2f)
                lineTo(17.4f, 11.0f)
                moveTo(2.0f, 15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(2.0f)
                moveTo(8.0f, 15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _symbol!!
    }

private var _symbol: ImageVector? = null
