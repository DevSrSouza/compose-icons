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

public val MaterialDesignIcons.BoxingGlove: ImageVector
    get() {
        if (_boxingGlove != null) {
            return _boxingGlove!!
        }
        _boxingGlove = Builder(name = "BoxingGlove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 16.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(19.0f)
                moveTo(12.0f, 4.0f)
                curveTo(8.0f, 4.0f, 7.0f, 4.0f, 7.0f, 4.0f)
                curveTo(7.0f, 4.0f, 2.0f, 4.0f, 2.0f, 8.0f)
                verticalLineTo(14.0f)
                curveTo(2.0f, 15.77f, 3.0f, 16.76f, 4.07f, 17.31f)
                curveTo(4.4f, 15.43f, 6.03f, 14.0f, 8.0f, 14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 18.0f)
                curveTo(6.0f, 19.11f, 6.9f, 20.0f, 8.0f, 20.0f)
                horizontalLineTo(13.0f)
                curveTo(17.0f, 20.0f, 17.0f, 16.0f, 17.0f, 16.0f)
                verticalLineTo(6.0f)
                curveTo(17.0f, 6.0f, 16.0f, 4.0f, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _boxingGlove!!
    }

private var _boxingGlove: ImageVector? = null
