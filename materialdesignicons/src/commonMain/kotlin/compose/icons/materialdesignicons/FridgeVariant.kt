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

public val MaterialDesignIcons.FridgeVariant: ImageVector
    get() {
        if (_fridgeVariant != null) {
            return _fridgeVariant!!
        }
        _fridgeVariant = Builder(name = "FridgeVariant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 4.0f)
                verticalLineTo(19.0f)
                curveTo(19.0f, 20.11f, 18.11f, 21.0f, 17.0f, 21.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(12.5f)
                verticalLineTo(2.0f)
                horizontalLineTo(17.0f)
                curveTo(18.11f, 2.0f, 19.0f, 2.9f, 19.0f, 4.0f)
                moveTo(7.0f, 2.0f)
                horizontalLineTo(11.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(21.0f)
                curveTo(5.9f, 21.0f, 5.0f, 20.11f, 5.0f, 19.0f)
                verticalLineTo(4.0f)
                curveTo(5.0f, 2.9f, 5.9f, 2.0f, 7.0f, 2.0f)
                moveTo(10.0f, 10.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _fridgeVariant!!
    }

private var _fridgeVariant: ImageVector? = null
