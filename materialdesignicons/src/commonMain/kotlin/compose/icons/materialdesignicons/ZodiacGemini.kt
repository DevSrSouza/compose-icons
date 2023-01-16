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

public val MaterialDesignIcons.ZodiacGemini: ImageVector
    get() {
        if (_zodiacGemini != null) {
            return _zodiacGemini!!
        }
        _zodiacGemini = Builder(name = "ZodiacGemini", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 5.3f)
                curveTo(19.35f, 4.97f, 20.66f, 4.54f, 21.94f, 4.0f)
                lineTo(21.18f, 2.14f)
                curveTo(18.27f, 3.36f, 15.15f, 4.0f, 12.0f, 4.0f)
                curveTo(8.85f, 4.0f, 5.73f, 3.38f, 2.82f, 2.17f)
                lineTo(2.06f, 4.0f)
                curveTo(3.34f, 4.54f, 4.65f, 4.97f, 6.0f, 5.3f)
                verticalLineTo(18.7f)
                curveTo(4.65f, 19.03f, 3.34f, 19.46f, 2.06f, 20.0f)
                lineTo(2.82f, 21.86f)
                curveTo(8.7f, 19.42f, 15.3f, 19.42f, 21.18f, 21.86f)
                lineTo(21.94f, 20.0f)
                curveTo(20.66f, 19.46f, 19.35f, 19.03f, 18.0f, 18.7f)
                verticalLineTo(5.3f)
                moveTo(8.0f, 18.3f)
                verticalLineTo(5.69f)
                curveTo(9.32f, 5.89f, 10.66f, 6.0f, 12.0f, 6.0f)
                curveTo(13.34f, 6.0f, 14.68f, 5.89f, 16.0f, 5.69f)
                verticalLineTo(18.31f)
                curveTo(13.35f, 17.9f, 10.65f, 17.9f, 8.0f, 18.31f)
                verticalLineTo(18.3f)
                close()
            }
        }
        .build()
        return _zodiacGemini!!
    }

private var _zodiacGemini: ImageVector? = null
