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

public val MaterialDesignIcons.ZodiacCapricorn: ImageVector
    get() {
        if (_zodiacCapricorn != null) {
            return _zodiacCapricorn!!
        }
        _zodiacCapricorn = Builder(name = "ZodiacCapricorn", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 13.0f)
                curveTo(14.3f, 13.0f, 13.61f, 13.19f, 13.0f, 13.55f)
                verticalLineTo(6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 10.0f, 3.0f)
                curveTo(9.25f, 3.0f, 8.55f, 3.29f, 8.0f, 3.78f)
                curveTo(7.45f, 3.28f, 6.74f, 3.0f, 6.0f, 3.0f)
                verticalLineTo(5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 6.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 6.0f)
                verticalLineTo(17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 9.0f, 19.0f)
                verticalLineTo(21.0f)
                curveTo(10.15f, 21.0f, 11.25f, 20.5f, 12.0f, 19.62f)
                curveTo(13.45f, 21.29f, 15.97f, 21.47f, 17.64f, 20.0f)
                curveTo(19.31f, 18.58f, 19.5f, 16.05f, 18.04f, 14.38f)
                curveTo(17.28f, 13.5f, 16.17f, 13.0f, 15.0f, 13.0f)
                moveTo(15.0f, 19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.0f, 17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 15.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 17.0f, 17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 15.0f, 19.0f)
                close()
            }
        }
        .build()
        return _zodiacCapricorn!!
    }

private var _zodiacCapricorn: ImageVector? = null
