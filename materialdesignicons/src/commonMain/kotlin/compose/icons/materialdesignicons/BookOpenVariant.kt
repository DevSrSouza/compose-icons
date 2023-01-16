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

public val MaterialDesignIcons.BookOpenVariant: ImageVector
    get() {
        if (_bookOpenVariant != null) {
            return _bookOpenVariant!!
        }
        _bookOpenVariant = Builder(name = "BookOpenVariant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 14.33f)
                curveTo(18.29f, 14.33f, 19.13f, 14.41f, 20.0f, 14.57f)
                verticalLineTo(16.07f)
                curveTo(19.38f, 15.91f, 18.54f, 15.83f, 17.5f, 15.83f)
                curveTo(15.6f, 15.83f, 14.11f, 16.16f, 13.0f, 16.82f)
                verticalLineTo(15.13f)
                curveTo(14.17f, 14.6f, 15.67f, 14.33f, 17.5f, 14.33f)
                moveTo(13.0f, 12.46f)
                curveTo(14.29f, 11.93f, 15.79f, 11.67f, 17.5f, 11.67f)
                curveTo(18.29f, 11.67f, 19.13f, 11.74f, 20.0f, 11.9f)
                verticalLineTo(13.4f)
                curveTo(19.38f, 13.24f, 18.54f, 13.16f, 17.5f, 13.16f)
                curveTo(15.6f, 13.16f, 14.11f, 13.5f, 13.0f, 14.15f)
                moveTo(17.5f, 10.5f)
                curveTo(15.6f, 10.5f, 14.11f, 10.82f, 13.0f, 11.5f)
                verticalLineTo(9.84f)
                curveTo(14.23f, 9.28f, 15.73f, 9.0f, 17.5f, 9.0f)
                curveTo(18.29f, 9.0f, 19.13f, 9.08f, 20.0f, 9.23f)
                verticalLineTo(10.78f)
                curveTo(19.26f, 10.59f, 18.41f, 10.5f, 17.5f, 10.5f)
                moveTo(21.0f, 18.5f)
                verticalLineTo(7.0f)
                curveTo(19.96f, 6.67f, 18.79f, 6.5f, 17.5f, 6.5f)
                curveTo(15.45f, 6.5f, 13.62f, 7.0f, 12.0f, 8.0f)
                verticalLineTo(19.5f)
                curveTo(13.62f, 18.5f, 15.45f, 18.0f, 17.5f, 18.0f)
                curveTo(18.69f, 18.0f, 19.86f, 18.16f, 21.0f, 18.5f)
                moveTo(17.5f, 4.5f)
                curveTo(19.85f, 4.5f, 21.69f, 5.0f, 23.0f, 6.0f)
                verticalLineTo(20.56f)
                curveTo(23.0f, 20.68f, 22.95f, 20.8f, 22.84f, 20.91f)
                curveTo(22.73f, 21.0f, 22.61f, 21.08f, 22.5f, 21.08f)
                curveTo(22.39f, 21.08f, 22.31f, 21.06f, 22.25f, 21.03f)
                curveTo(20.97f, 20.34f, 19.38f, 20.0f, 17.5f, 20.0f)
                curveTo(15.45f, 20.0f, 13.62f, 20.5f, 12.0f, 21.5f)
                curveTo(10.66f, 20.5f, 8.83f, 20.0f, 6.5f, 20.0f)
                curveTo(4.84f, 20.0f, 3.25f, 20.36f, 1.75f, 21.07f)
                curveTo(1.72f, 21.08f, 1.68f, 21.08f, 1.63f, 21.1f)
                curveTo(1.59f, 21.11f, 1.55f, 21.12f, 1.5f, 21.12f)
                curveTo(1.39f, 21.12f, 1.27f, 21.08f, 1.16f, 21.0f)
                curveTo(1.05f, 20.89f, 1.0f, 20.78f, 1.0f, 20.65f)
                verticalLineTo(6.0f)
                curveTo(2.34f, 5.0f, 4.18f, 4.5f, 6.5f, 4.5f)
                curveTo(8.83f, 4.5f, 10.66f, 5.0f, 12.0f, 6.0f)
                curveTo(13.34f, 5.0f, 15.17f, 4.5f, 17.5f, 4.5f)
                close()
            }
        }
        .build()
        return _bookOpenVariant!!
    }

private var _bookOpenVariant: ImageVector? = null
