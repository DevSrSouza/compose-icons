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

public val MaterialDesignIcons.ZodiacAries: ImageVector
    get() {
        if (_zodiacAries != null) {
            return _zodiacAries!!
        }
        _zodiacAries = Builder(name = "ZodiacAries", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                curveTo(14.95f, 2.0f, 13.91f, 2.27f, 13.0f, 2.81f)
                curveTo(12.64f, 3.0f, 12.3f, 3.26f, 12.0f, 3.54f)
                curveTo(11.7f, 3.26f, 11.36f, 3.0f, 11.0f, 2.81f)
                curveTo(10.09f, 2.27f, 9.05f, 2.0f, 8.0f, 2.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 2.0f, 8.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 8.0f, 14.0f)
                verticalLineTo(12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 4.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.0f, 4.0f)
                curveTo(9.0f, 4.0f, 10.0f, 4.39f, 10.75f, 5.1f)
                curveTo(10.84f, 5.18f, 10.92f, 5.27f, 11.0f, 5.36f)
                verticalLineTo(22.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.36f)
                curveTo(13.08f, 5.27f, 13.16f, 5.18f, 13.25f, 5.1f)
                curveTo(14.85f, 3.58f, 17.38f, 3.64f, 18.91f, 5.25f)
                curveTo(20.43f, 6.85f, 20.36f, 9.38f, 18.76f, 10.9f)
                curveTo(18.0f, 11.61f, 17.03f, 12.0f, 16.0f, 12.0f)
                verticalLineTo(14.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 22.0f, 8.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 16.0f, 2.0f)
                close()
            }
        }
        .build()
        return _zodiacAries!!
    }

private var _zodiacAries: ImageVector? = null
