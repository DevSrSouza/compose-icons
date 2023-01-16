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

public val MaterialDesignIcons.Pool: ImageVector
    get() {
        if (_pool != null) {
            return _pool!!
        }
        _pool = Builder(name = "Pool", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 15.0f)
                curveTo(3.67f, 14.25f, 5.33f, 13.5f, 7.0f, 13.17f)
                verticalLineTo(5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 10.0f, 2.0f)
                curveTo(11.31f, 2.0f, 12.42f, 2.83f, 12.83f, 4.0f)
                horizontalLineTo(10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 5.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 17.0f, 2.0f)
                curveTo(18.31f, 2.0f, 19.42f, 2.83f, 19.83f, 4.0f)
                horizontalLineTo(17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 5.0f)
                verticalLineTo(14.94f)
                curveTo(18.0f, 14.62f, 20.0f, 13.0f, 22.0f, 13.0f)
                verticalLineTo(15.0f)
                curveTo(19.78f, 15.0f, 17.56f, 17.0f, 15.33f, 17.0f)
                curveTo(13.11f, 17.0f, 10.89f, 15.0f, 8.67f, 15.0f)
                curveTo(6.44f, 15.0f, 4.22f, 16.0f, 2.0f, 17.0f)
                verticalLineTo(15.0f)
                moveTo(14.0f, 8.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(8.0f)
                moveTo(14.0f, 12.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(13.0f)
                curveTo(10.67f, 13.16f, 12.33f, 14.31f, 14.0f, 14.79f)
                verticalLineTo(12.0f)
                moveTo(2.0f, 19.0f)
                curveTo(4.22f, 18.0f, 6.44f, 17.0f, 8.67f, 17.0f)
                curveTo(10.89f, 17.0f, 13.11f, 19.0f, 15.33f, 19.0f)
                curveTo(17.56f, 19.0f, 19.78f, 17.0f, 22.0f, 17.0f)
                verticalLineTo(19.0f)
                curveTo(19.78f, 19.0f, 17.56f, 21.0f, 15.33f, 21.0f)
                curveTo(13.11f, 21.0f, 10.89f, 19.0f, 8.67f, 19.0f)
                curveTo(6.44f, 19.0f, 4.22f, 20.0f, 2.0f, 21.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _pool!!
    }

private var _pool: ImageVector? = null
