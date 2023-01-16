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

public val MaterialDesignIcons.Unicode: ImageVector
    get() {
        if (_unicode != null) {
            return _unicode!!
        }
        _unicode = Builder(name = "Unicode", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 6.0f)
                arcTo(1.46f, 1.46f, 0.0f, false, true, 20.54f, 7.44f)
                arcTo(1.46f, 1.46f, 0.0f, false, true, 19.09f, 6.0f)
                arcTo(1.46f, 1.46f, 0.0f, false, true, 20.54f, 4.5f)
                arcTo(1.46f, 1.46f, 0.0f, false, true, 22.0f, 6.0f)
                moveTo(21.56f, 8.86f)
                horizontalLineTo(19.53f)
                curveTo(19.4f, 8.85f, 19.34f, 8.91f, 19.34f, 9.0f)
                verticalLineTo(12.59f)
                curveTo(19.34f, 13.08f, 19.34f, 13.5f, 19.35f, 13.86f)
                lineTo(19.37f, 14.76f)
                curveTo(19.38f, 15.0f, 19.39f, 15.21f, 19.39f, 15.39f)
                curveTo(19.4f, 15.56f, 19.4f, 15.72f, 19.4f, 15.86f)
                horizontalLineTo(19.38f)
                curveTo(19.26f, 15.6f, 19.07f, 15.22f, 18.82f, 14.74f)
                curveTo(18.58f, 14.27f, 18.29f, 13.72f, 17.97f, 13.11f)
                curveTo(17.64f, 12.5f, 17.29f, 11.84f, 16.92f, 11.15f)
                curveTo(16.55f, 10.47f, 16.18f, 9.78f, 15.81f, 9.11f)
                curveTo(15.45f, 8.43f, 15.09f, 7.78f, 14.75f, 7.16f)
                curveTo(14.4f, 6.54f, 14.1f, 6.0f, 13.85f, 5.54f)
                curveTo(13.82f, 5.5f, 13.79f, 5.44f, 13.77f, 5.42f)
                curveTo(13.74f, 5.4f, 13.68f, 5.39f, 13.6f, 5.39f)
                horizontalLineTo(10.62f)
                curveTo(10.5f, 5.39f, 10.47f, 5.44f, 10.47f, 5.54f)
                horizontalLineTo(10.5f)
                curveTo(10.47f, 5.56f, 10.47f, 5.57f, 10.47f, 5.58f)
                verticalLineTo(13.84f)
                curveTo(10.47f, 14.5f, 10.4f, 15.0f, 10.25f, 15.45f)
                curveTo(10.1f, 15.88f, 9.9f, 16.23f, 9.64f, 16.5f)
                curveTo(9.38f, 16.75f, 9.07f, 16.93f, 8.72f, 17.05f)
                curveTo(8.36f, 17.16f, 8.0f, 17.22f, 7.56f, 17.22f)
                curveTo(6.54f, 17.22f, 5.79f, 16.91f, 5.3f, 16.31f)
                curveTo(4.8f, 15.7f, 4.56f, 14.89f, 4.56f, 13.88f)
                verticalLineTo(5.56f)
                curveTo(4.56f, 5.45f, 4.5f, 5.39f, 4.39f, 5.39f)
                horizontalLineTo(2.17f)
                curveTo(2.06f, 5.39f, 2.0f, 5.45f, 2.0f, 5.58f)
                verticalLineTo(14.07f)
                curveTo(2.0f, 15.0f, 2.13f, 15.78f, 2.38f, 16.46f)
                curveTo(2.63f, 17.13f, 3.0f, 17.69f, 3.5f, 18.14f)
                curveTo(3.96f, 18.58f, 4.53f, 18.92f, 5.21f, 19.14f)
                curveTo(5.89f, 19.36f, 6.64f, 19.5f, 7.47f, 19.5f)
                curveTo(8.24f, 19.5f, 8.97f, 19.38f, 9.65f, 19.17f)
                curveTo(10.34f, 18.97f, 10.93f, 18.64f, 11.42f, 18.2f)
                curveTo(11.91f, 17.75f, 12.3f, 17.18f, 12.59f, 16.5f)
                curveTo(12.88f, 15.79f, 13.03f, 14.95f, 13.03f, 13.96f)
                verticalLineTo(8.62f)
                curveTo(13.14f, 8.86f, 13.28f, 9.15f, 13.44f, 9.47f)
                curveTo(13.73f, 10.05f, 14.05f, 10.68f, 14.42f, 11.38f)
                curveTo(14.79f, 12.08f, 15.17f, 12.8f, 15.58f, 13.56f)
                curveTo(16.0f, 14.32f, 16.39f, 15.06f, 16.77f, 15.76f)
                curveTo(17.16f, 16.46f, 17.5f, 17.11f, 17.83f, 17.7f)
                curveTo(18.15f, 18.29f, 18.4f, 18.76f, 18.58f, 19.12f)
                curveTo(18.63f, 19.22f, 18.73f, 19.27f, 18.85f, 19.27f)
                horizontalLineTo(21.54f)
                curveTo(21.68f, 19.27f, 21.75f, 19.2f, 21.75f, 19.08f)
                verticalLineTo(9.05f)
                curveTo(21.75f, 8.92f, 21.68f, 8.85f, 21.56f, 8.85f)
                close()
            }
        }
        .build()
        return _unicode!!
    }

private var _unicode: ImageVector? = null
