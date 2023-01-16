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

public val MaterialDesignIcons.FridgeIndustrialOff: ImageVector
    get() {
        if (_fridgeIndustrialOff != null) {
            return _fridgeIndustrialOff!!
        }
        _fridgeIndustrialOff = Builder(name = "FridgeIndustrialOff", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 15.8f)
                lineTo(5.7f, 2.5f)
                curveTo(6.05f, 2.19f, 6.5f, 2.0f, 7.0f, 2.0f)
                horizontalLineTo(17.0f)
                curveTo(18.11f, 2.0f, 19.0f, 2.9f, 19.0f, 4.0f)
                verticalLineTo(15.8f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(18.46f, 20.35f)
                curveTo(18.1f, 20.75f, 17.58f, 21.0f, 17.0f, 21.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(21.0f)
                curveTo(5.9f, 21.0f, 5.0f, 20.11f, 5.0f, 19.0f)
                verticalLineTo(6.89f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(10.0f, 11.89f)
                lineTo(8.11f, 10.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(11.89f)
                close()
            }
        }
        .build()
        return _fridgeIndustrialOff!!
    }

private var _fridgeIndustrialOff: ImageVector? = null
