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

public val MaterialDesignIcons.Rabbit: ImageVector
    get() {
        if (_rabbit != null) {
            return _rabbit!!
        }
        _rabbit = Builder(name = "Rabbit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.05f, 21.0f)
                lineTo(15.32f, 16.26f)
                curveTo(15.32f, 14.53f, 14.25f, 13.42f, 12.95f, 13.42f)
                curveTo(12.05f, 13.42f, 11.27f, 13.92f, 10.87f, 14.66f)
                curveTo(11.2f, 14.47f, 11.59f, 14.37f, 12.0f, 14.37f)
                curveTo(13.3f, 14.37f, 14.36f, 15.43f, 14.36f, 16.73f)
                curveTo(14.36f, 18.04f, 13.31f, 19.11f, 12.0f, 19.11f)
                horizontalLineTo(15.3f)
                verticalLineTo(21.0f)
                horizontalLineTo(6.79f)
                curveTo(6.55f, 21.0f, 6.3f, 20.91f, 6.12f, 20.72f)
                curveTo(5.75f, 20.35f, 5.75f, 19.75f, 6.12f, 19.38f)
                verticalLineTo(19.38f)
                lineTo(6.62f, 18.88f)
                curveTo(6.28f, 18.73f, 6.0f, 18.5f, 5.72f, 18.26f)
                curveTo(5.5f, 18.76f, 5.0f, 19.11f, 4.42f, 19.11f)
                curveTo(3.64f, 19.11f, 3.0f, 18.47f, 3.0f, 17.68f)
                curveTo(3.0f, 16.9f, 3.64f, 16.26f, 4.42f, 16.26f)
                lineTo(4.89f, 16.34f)
                verticalLineTo(14.37f)
                curveTo(4.89f, 11.75f, 7.0f, 9.63f, 9.63f, 9.63f)
                horizontalLineTo(9.65f)
                curveTo(11.77f, 9.64f, 13.42f, 10.47f, 13.42f, 9.16f)
                curveTo(13.42f, 8.23f, 13.62f, 7.86f, 13.96f, 7.34f)
                curveTo(13.23f, 7.0f, 12.4f, 6.79f, 11.53f, 6.79f)
                curveTo(11.0f, 6.79f, 10.58f, 6.37f, 10.58f, 5.84f)
                curveTo(10.58f, 5.41f, 10.86f, 5.05f, 11.25f, 4.93f)
                lineTo(10.58f, 4.89f)
                curveTo(10.06f, 4.89f, 9.63f, 4.47f, 9.63f, 3.95f)
                curveTo(9.63f, 3.42f, 10.06f, 3.0f, 10.58f, 3.0f)
                horizontalLineTo(11.53f)
                curveTo(13.63f, 3.0f, 15.47f, 4.15f, 16.46f, 5.85f)
                lineTo(16.74f, 5.84f)
                curveTo(17.45f, 5.84f, 18.11f, 6.07f, 18.65f, 6.45f)
                lineTo(19.1f, 6.83f)
                curveTo(21.27f, 8.78f, 21.0f, 10.1f, 21.0f, 10.11f)
                curveTo(21.0f, 11.39f, 19.94f, 12.44f, 18.65f, 12.44f)
                lineTo(18.16f, 12.39f)
                verticalLineTo(12.47f)
                curveTo(18.16f, 13.58f, 17.68f, 14.57f, 16.93f, 15.27f)
                lineTo(20.24f, 21.0f)
                horizontalLineTo(18.05f)
                moveTo(18.16f, 7.74f)
                curveTo(17.63f, 7.74f, 17.21f, 8.16f, 17.21f, 8.68f)
                curveTo(17.21f, 9.21f, 17.63f, 9.63f, 18.16f, 9.63f)
                curveTo(18.68f, 9.63f, 19.11f, 9.21f, 19.11f, 8.68f)
                curveTo(19.11f, 8.16f, 18.68f, 7.74f, 18.16f, 7.74f)
                close()
            }
        }
        .build()
        return _rabbit!!
    }

private var _rabbit: ImageVector? = null
