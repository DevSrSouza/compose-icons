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

public val MaterialDesignIcons.UltraHighDefinition: ImageVector
    get() {
        if (_ultraHighDefinition != null) {
            return _ultraHighDefinition!!
        }
        _ultraHighDefinition = Builder(name = "UltraHighDefinition", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 7.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(7.0f)
                moveTo(17.0f, 7.0f)
                horizontalLineTo(20.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 23.0f, 10.0f)
                verticalLineTo(14.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 20.0f, 17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                moveTo(20.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 14.0f)
                verticalLineTo(10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.0f)
                moveTo(7.0f, 14.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 4.0f, 17.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 1.0f, 14.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 14.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _ultraHighDefinition!!
    }

private var _ultraHighDefinition: ImageVector? = null
