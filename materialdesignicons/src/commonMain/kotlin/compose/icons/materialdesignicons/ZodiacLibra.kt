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

public val MaterialDesignIcons.ZodiacLibra: ImageVector
    get() {
        if (_zodiacLibra != null) {
            return _zodiacLibra!!
        }
        _zodiacLibra = Builder(name = "ZodiacLibra", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.91f)
                curveTo(16.0f, 15.36f, 17.96f, 12.5f, 17.41f, 9.5f)
                curveTo(16.86f, 6.5f, 14.0f, 4.54f, 11.0f, 5.09f)
                curveTo(8.0f, 5.65f, 6.04f, 8.5f, 6.59f, 11.5f)
                curveTo(7.0f, 13.74f, 8.76f, 15.5f, 11.0f, 15.91f)
                verticalLineTo(18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(6.92f)
                curveTo(5.37f, 14.59f, 4.5f, 12.59f, 4.5f, 10.5f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 12.0f, 3.0f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 19.5f, 10.5f)
                curveTo(19.5f, 12.59f, 18.63f, 14.59f, 17.08f, 16.0f)
                horizontalLineTo(20.0f)
                moveTo(20.0f, 19.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _zodiacLibra!!
    }

private var _zodiacLibra: ImageVector? = null
