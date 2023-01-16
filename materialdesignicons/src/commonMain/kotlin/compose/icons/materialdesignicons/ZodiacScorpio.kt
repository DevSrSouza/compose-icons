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

public val MaterialDesignIcons.ZodiacScorpio: ImageVector
    get() {
        if (_zodiacScorpio != null) {
            return _zodiacScorpio!!
        }
        _zodiacScorpio = Builder(name = "ZodiacScorpio", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.71f, 15.29f)
                lineTo(16.29f, 16.71f)
                lineTo(17.59f, 18.0f)
                horizontalLineTo(16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 16.0f)
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
                verticalLineTo(16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 16.0f, 20.0f)
                horizontalLineTo(17.59f)
                lineTo(16.29f, 21.29f)
                lineTo(17.71f, 22.71f)
                lineTo(21.41f, 19.0f)
                lineTo(17.71f, 15.29f)
                close()
            }
        }
        .build()
        return _zodiacScorpio!!
    }

private var _zodiacScorpio: ImageVector? = null
