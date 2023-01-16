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

public val MaterialDesignIcons.FridgeVariantOff: ImageVector
    get() {
        if (_fridgeVariantOff != null) {
            return _fridgeVariantOff!!
        }
        _fridgeVariantOff = Builder(name = "FridgeVariantOff", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(5.0f, 6.89f)
                verticalLineTo(19.0f)
                curveTo(5.0f, 20.11f, 5.9f, 21.0f, 7.0f, 21.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(11.5f)
                verticalLineTo(13.39f)
                lineTo(12.5f, 14.39f)
                verticalLineTo(21.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(21.0f)
                curveTo(17.58f, 21.0f, 18.1f, 20.75f, 18.46f, 20.35f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                moveTo(10.0f, 14.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.11f)
                lineTo(10.0f, 11.89f)
                verticalLineTo(14.0f)
                moveTo(19.0f, 15.8f)
                lineTo(12.5f, 9.3f)
                verticalLineTo(2.0f)
                horizontalLineTo(17.0f)
                curveTo(18.11f, 2.0f, 19.0f, 2.9f, 19.0f, 4.0f)
                verticalLineTo(15.8f)
                moveTo(11.5f, 8.3f)
                lineTo(5.7f, 2.5f)
                curveTo(6.05f, 2.19f, 6.5f, 2.0f, 7.0f, 2.0f)
                horizontalLineTo(11.5f)
                verticalLineTo(8.3f)
                close()
            }
        }
        .build()
        return _fridgeVariantOff!!
    }

private var _fridgeVariantOff: ImageVector? = null
