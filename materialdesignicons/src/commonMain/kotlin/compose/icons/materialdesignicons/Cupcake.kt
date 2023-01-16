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

public val MaterialDesignIcons.Cupcake: ImageVector
    get() {
        if (_cupcake != null) {
            return _cupcake!!
        }
        _cupcake = Builder(name = "Cupcake", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 14.5f, 4.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 12.0f, 6.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 9.5f, 4.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 12.0f, 1.5f)
                moveTo(15.87f, 5.0f)
                curveTo(18.0f, 5.0f, 20.0f, 7.0f, 20.0f, 9.0f)
                curveTo(22.7f, 9.0f, 22.7f, 13.0f, 20.0f, 13.0f)
                horizontalLineTo(4.0f)
                curveTo(1.3f, 13.0f, 1.3f, 9.0f, 4.0f, 9.0f)
                curveTo(4.0f, 7.0f, 6.0f, 5.0f, 8.13f, 5.0f)
                curveTo(8.57f, 6.73f, 10.14f, 8.0f, 12.0f, 8.0f)
                curveTo(13.86f, 8.0f, 15.43f, 6.73f, 15.87f, 5.0f)
                moveTo(5.0f, 15.0f)
                horizontalLineTo(8.0f)
                lineTo(9.0f, 22.0f)
                horizontalLineTo(7.0f)
                lineTo(5.0f, 15.0f)
                moveTo(10.0f, 15.0f)
                horizontalLineTo(14.0f)
                lineTo(13.0f, 22.0f)
                horizontalLineTo(11.0f)
                lineTo(10.0f, 15.0f)
                moveTo(16.0f, 15.0f)
                horizontalLineTo(19.0f)
                lineTo(17.0f, 22.0f)
                horizontalLineTo(15.0f)
                lineTo(16.0f, 15.0f)
                close()
            }
        }
        .build()
        return _cupcake!!
    }

private var _cupcake: ImageVector? = null
