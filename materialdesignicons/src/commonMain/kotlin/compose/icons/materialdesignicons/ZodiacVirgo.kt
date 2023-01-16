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

public val MaterialDesignIcons.ZodiacVirgo: ImageVector
    get() {
        if (_zodiacVirgo != null) {
            return _zodiacVirgo!!
        }
        _zodiacVirgo = Builder(name = "ZodiacVirgo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 19.13f)
                curveTo(20.0f, 17.77f, 20.0f, 15.18f, 20.0f, 14.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 16.0f, 10.0f)
                curveTo(15.3f, 10.0f, 14.6f, 10.2f, 14.0f, 10.56f)
                verticalLineTo(6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 11.0f, 3.0f)
                curveTo(10.25f, 3.0f, 9.55f, 3.29f, 9.0f, 3.78f)
                curveTo(7.86f, 2.76f, 6.14f, 2.76f, 5.0f, 3.78f)
                curveTo(4.45f, 3.28f, 3.74f, 3.0f, 3.0f, 3.0f)
                verticalLineTo(5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 6.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 6.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 6.0f)
                verticalLineTo(14.0f)
                curveTo(12.0f, 15.18f, 12.0f, 17.77f, 13.5f, 19.13f)
                curveTo(12.72f, 19.54f, 11.88f, 19.84f, 11.0f, 20.0f)
                verticalLineTo(22.0f)
                curveTo(12.29f, 22.0f, 14.84f, 20.74f, 16.0f, 20.13f)
                curveTo(17.16f, 20.74f, 19.71f, 22.0f, 21.0f, 22.0f)
                verticalLineTo(20.0f)
                curveTo(20.12f, 19.84f, 19.28f, 19.54f, 18.5f, 19.13f)
                moveTo(16.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 14.0f)
                curveTo(18.0f, 16.92f, 17.46f, 18.0f, 16.0f, 18.0f)
                curveTo(14.54f, 18.0f, 14.0f, 16.92f, 14.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.0f, 12.0f)
                close()
            }
        }
        .build()
        return _zodiacVirgo!!
    }

private var _zodiacVirgo: ImageVector? = null
