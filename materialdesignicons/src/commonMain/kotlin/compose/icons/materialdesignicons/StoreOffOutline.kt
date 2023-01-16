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

public val MaterialDesignIcons.StoreOffOutline: ImageVector
    get() {
        if (_storeOffOutline != null) {
            return _storeOffOutline!!
        }
        _storeOffOutline = Builder(name = "StoreOffOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(5.11f, 7.0f)
                horizontalLineTo(4.0f)
                lineTo(3.0f, 12.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.89f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                moveTo(5.64f, 9.0f)
                horizontalLineTo(7.11f)
                lineTo(10.11f, 12.0f)
                horizontalLineTo(5.04f)
                lineTo(5.64f, 9.0f)
                moveTo(12.0f, 18.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(18.0f)
                moveTo(18.0f, 14.8f)
                verticalLineTo(14.0f)
                horizontalLineTo(17.2f)
                lineTo(15.2f, 12.0f)
                horizontalLineTo(18.96f)
                lineTo(18.36f, 9.0f)
                horizontalLineTo(12.2f)
                lineTo(10.2f, 7.0f)
                horizontalLineTo(20.0f)
                lineTo(21.0f, 12.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(16.8f)
                lineTo(18.0f, 14.8f)
                moveTo(9.2f, 6.0f)
                lineTo(7.2f, 4.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.2f)
                close()
            }
        }
        .build()
        return _storeOffOutline!!
    }

private var _storeOffOutline: ImageVector? = null
