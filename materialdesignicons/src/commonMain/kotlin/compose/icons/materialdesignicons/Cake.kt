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

public val MaterialDesignIcons.Cake: ImageVector
    get() {
        if (_cake != null) {
            return _cake!!
        }
        _cake = Builder(name = "Cake", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 0.5f)
                curveTo(12.0f, 0.75f, 13.0f, 2.4f, 13.0f, 3.5f)
                curveTo(13.0f, 4.6f, 12.33f, 5.0f, 11.5f, 5.0f)
                curveTo(10.67f, 5.0f, 10.0f, 4.85f, 10.0f, 3.75f)
                curveTo(10.0f, 2.65f, 11.0f, 2.0f, 11.5f, 0.5f)
                moveTo(18.5f, 9.0f)
                curveTo(21.0f, 9.0f, 23.0f, 11.0f, 23.0f, 13.5f)
                curveTo(23.0f, 15.06f, 22.21f, 16.43f, 21.0f, 17.24f)
                verticalLineTo(23.0f)
                horizontalLineTo(12.0f)
                lineTo(3.0f, 23.0f)
                verticalLineTo(17.24f)
                curveTo(1.79f, 16.43f, 1.0f, 15.06f, 1.0f, 13.5f)
                curveTo(1.0f, 11.0f, 3.0f, 9.0f, 5.5f, 9.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.5f)
                moveTo(12.0f, 16.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 14.5f, 13.5f)
                horizontalLineTo(16.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.5f, 16.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 21.0f, 13.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.5f, 11.0f)
                horizontalLineTo(5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 3.0f, 13.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 5.5f, 16.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 8.0f, 13.5f)
                horizontalLineTo(9.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 12.0f, 16.0f)
                close()
            }
        }
        .build()
        return _cake!!
    }

private var _cake: ImageVector? = null
