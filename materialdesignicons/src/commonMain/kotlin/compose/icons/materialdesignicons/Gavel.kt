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

public val MaterialDesignIcons.Gavel: ImageVector
    get() {
        if (_gavel != null) {
            return _gavel!!
        }
        _gavel = Builder(name = "Gavel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.3f, 20.28f)
                lineTo(11.9f, 10.68f)
                lineTo(10.5f, 9.26f)
                lineTo(9.78f, 9.97f)
                curveTo(9.39f, 10.36f, 8.76f, 10.36f, 8.37f, 9.97f)
                lineTo(7.66f, 9.26f)
                curveTo(7.27f, 8.87f, 7.27f, 8.24f, 7.66f, 7.85f)
                lineTo(13.32f, 2.19f)
                curveTo(13.71f, 1.8f, 14.34f, 1.8f, 14.73f, 2.19f)
                lineTo(15.44f, 2.9f)
                curveTo(15.83f, 3.29f, 15.83f, 3.92f, 15.44f, 4.31f)
                lineTo(14.73f, 5.0f)
                lineTo(16.15f, 6.43f)
                curveTo(16.54f, 6.04f, 17.17f, 6.04f, 17.56f, 6.43f)
                curveTo(17.95f, 6.82f, 17.95f, 7.46f, 17.56f, 7.85f)
                lineTo(18.97f, 9.26f)
                lineTo(19.68f, 8.55f)
                curveTo(20.07f, 8.16f, 20.71f, 8.16f, 21.1f, 8.55f)
                lineTo(21.8f, 9.26f)
                curveTo(22.19f, 9.65f, 22.19f, 10.29f, 21.8f, 10.68f)
                lineTo(16.15f, 16.33f)
                curveTo(15.76f, 16.72f, 15.12f, 16.72f, 14.73f, 16.33f)
                lineTo(14.03f, 15.63f)
                curveTo(13.63f, 15.24f, 13.63f, 14.6f, 14.03f, 14.21f)
                lineTo(14.73f, 13.5f)
                lineTo(13.32f, 12.09f)
                lineTo(3.71f, 21.7f)
                curveTo(3.32f, 22.09f, 2.69f, 22.09f, 2.3f, 21.7f)
                curveTo(1.91f, 21.31f, 1.91f, 20.67f, 2.3f, 20.28f)
                moveTo(20.0f, 19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 21.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 19.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _gavel!!
    }

private var _gavel: ImageVector? = null
