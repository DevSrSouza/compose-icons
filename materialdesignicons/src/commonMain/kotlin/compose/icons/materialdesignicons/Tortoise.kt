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

public val MaterialDesignIcons.Tortoise: ImageVector
    get() {
        if (_tortoise != null) {
            return _tortoise!!
        }
        _tortoise = Builder(name = "Tortoise", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.31f, 5.6f)
                curveTo(18.09f, 5.56f, 16.88f, 6.5f, 16.5f, 8.0f)
                curveTo(16.0f, 10.0f, 16.0f, 10.0f, 15.0f, 11.0f)
                curveTo(13.0f, 13.0f, 10.0f, 14.0f, 4.0f, 15.0f)
                curveTo(3.0f, 15.16f, 2.5f, 15.5f, 2.0f, 16.0f)
                curveTo(4.0f, 16.0f, 6.0f, 16.0f, 4.5f, 17.5f)
                lineTo(3.0f, 19.0f)
                horizontalLineTo(6.0f)
                lineTo(8.0f, 17.0f)
                curveTo(10.0f, 18.0f, 11.33f, 18.0f, 13.33f, 17.0f)
                lineTo(14.0f, 19.0f)
                horizontalLineTo(17.0f)
                lineTo(16.0f, 16.0f)
                curveTo(16.0f, 16.0f, 17.0f, 12.0f, 18.0f, 11.0f)
                curveTo(19.0f, 10.0f, 19.0f, 11.0f, 20.0f, 11.0f)
                curveTo(21.0f, 11.0f, 22.0f, 10.0f, 22.0f, 8.5f)
                curveTo(22.0f, 8.0f, 22.0f, 7.0f, 20.5f, 6.0f)
                curveTo(20.15f, 5.76f, 19.74f, 5.62f, 19.31f, 5.6f)
                moveTo(9.0f, 6.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 3.0f, 12.0f)
                curveTo(3.0f, 12.6f, 3.13f, 13.08f, 3.23f, 13.6f)
                curveTo(9.15f, 12.62f, 12.29f, 11.59f, 13.93f, 9.94f)
                lineTo(14.43f, 9.44f)
                curveTo(13.44f, 7.34f, 11.32f, 6.0f, 9.0f, 6.0f)
                close()
            }
        }
        .build()
        return _tortoise!!
    }

private var _tortoise: ImageVector? = null
