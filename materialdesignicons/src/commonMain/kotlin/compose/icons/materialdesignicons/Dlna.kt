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

public val MaterialDesignIcons.Dlna: ImageVector
    get() {
        if (_dlna != null) {
            return _dlna!!
        }
        _dlna = Builder(name = "Dlna", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.38f, 12.56f)
                horizontalLineTo(12.85f)
                curveTo(11.97f, 12.56f, 11.1f, 12.96f, 10.61f, 13.61f)
                verticalLineTo(13.6f)
                curveTo(10.12f, 14.28f, 9.32f, 14.72f, 8.41f, 14.72f)
                curveTo(6.92f, 14.72f, 5.71f, 13.5f, 5.71f, 12.0f)
                curveTo(5.71f, 10.5f, 6.92f, 9.31f, 8.41f, 9.31f)
                curveTo(9.32f, 9.31f, 10.12f, 9.75f, 10.61f, 10.43f)
                verticalLineTo(10.42f)
                curveTo(11.1f, 11.07f, 11.97f, 11.5f, 12.85f, 11.5f)
                horizontalLineTo(21.29f)
                curveTo(21.45f, 11.5f, 22.0f, 11.4f, 22.0f, 10.67f)
                curveTo(21.26f, 6.43f, 17.1f, 3.18f, 12.06f, 3.18f)
                curveTo(8.96f, 3.18f, 6.19f, 4.41f, 4.34f, 6.35f)
                curveTo(4.05f, 6.79f, 4.35f, 6.92f, 4.63f, 6.96f)
                horizontalLineTo(10.14f)
                curveTo(11.0f, 6.96f, 11.89f, 6.54f, 12.38f, 5.89f)
                verticalLineTo(5.91f)
                curveTo(12.88f, 5.23f, 13.67f, 4.78f, 14.58f, 4.78f)
                curveTo(16.07f, 4.78f, 17.28f, 6.0f, 17.28f, 7.5f)
                curveTo(17.28f, 9.0f, 16.07f, 10.2f, 14.58f, 10.2f)
                curveTo(13.67f, 10.2f, 12.88f, 9.75f, 12.38f, 9.07f)
                verticalLineTo(9.08f)
                curveTo(11.89f, 8.44f, 11.0f, 8.03f, 10.14f, 8.03f)
                horizontalLineTo(4.13f)
                lineTo(4.15f, 8.03f)
                curveTo(4.15f, 8.03f, 3.26f, 8.0f, 2.72f, 8.75f)
                curveTo(2.3f, 9.42f, 2.0f, 10.85f, 2.0f, 12.0f)
                curveTo(2.0f, 13.16f, 2.17f, 14.21f, 2.72f, 15.27f)
                curveTo(3.19f, 16.03f, 4.15f, 16.0f, 4.15f, 16.0f)
                horizontalLineTo(4.11f)
                lineTo(10.14f, 16.0f)
                curveTo(11.0f, 16.0f, 11.89f, 15.58f, 12.38f, 14.93f)
                verticalLineTo(14.94f)
                curveTo(12.88f, 14.26f, 13.67f, 13.81f, 14.58f, 13.81f)
                curveTo(16.07f, 13.81f, 17.28f, 15.03f, 17.28f, 16.5f)
                curveTo(17.28f, 18.0f, 16.07f, 19.23f, 14.58f, 19.23f)
                curveTo(13.67f, 19.23f, 12.88f, 18.78f, 12.38f, 18.1f)
                verticalLineTo(18.12f)
                curveTo(11.89f, 17.47f, 11.0f, 17.05f, 10.14f, 17.05f)
                horizontalLineTo(4.64f)
                curveTo(4.36f, 17.09f, 4.06f, 17.22f, 4.32f, 17.64f)
                curveTo(6.17f, 19.58f, 8.95f, 20.82f, 12.06f, 20.82f)
                curveTo(17.11f, 20.82f, 21.28f, 17.57f, 22.0f, 13.31f)
                curveTo(22.0f, 12.72f, 21.59f, 12.58f, 21.38f, 12.56f)
            }
        }
        .build()
        return _dlna!!
    }

private var _dlna: ImageVector? = null
