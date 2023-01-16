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

public val MaterialDesignIcons.CursorDefaultGesture: ImageVector
    get() {
        if (_cursorDefaultGesture != null) {
            return _cursorDefaultGesture!!
        }
        _cursorDefaultGesture = Builder(name = "CursorDefaultGesture", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.59f, 8.0f)
                curveTo(15.26f, 8.0f, 15.0f, 8.27f, 15.0f, 8.6f)
                verticalLineTo(17.57f)
                curveTo(15.0f, 17.9f, 15.26f, 18.17f, 15.59f, 18.17f)
                curveTo(15.74f, 18.17f, 15.86f, 18.12f, 15.96f, 18.04f)
                lineTo(17.45f, 16.83f)
                lineTo(18.74f, 19.66f)
                curveTo(18.84f, 19.88f, 19.05f, 20.0f, 19.27f, 20.0f)
                curveTo(19.36f, 20.0f, 19.44f, 20.0f, 19.53f, 19.94f)
                lineTo(21.67f, 18.93f)
                curveTo(21.97f, 18.79f, 22.11f, 18.43f, 21.95f, 18.14f)
                lineTo(20.66f, 15.3f)
                lineTo(22.53f, 14.94f)
                curveTo(22.65f, 14.91f, 22.77f, 14.85f, 22.86f, 14.74f)
                curveTo(23.07f, 14.5f, 23.04f, 14.12f, 22.77f, 13.89f)
                lineTo(16.0f, 8.13f)
                curveTo(15.88f, 8.05f, 15.74f, 8.0f, 15.59f, 8.0f)
                moveTo(12.5f, 6.73f)
                curveTo(12.72f, 6.66f, 13.17f, 7.19f, 13.59f, 7.76f)
                lineTo(15.0f, 6.71f)
                curveTo(14.87f, 6.5f, 14.69f, 6.25f, 14.47f, 5.96f)
                curveTo(14.31f, 5.75f, 13.59f, 4.93f, 12.66f, 4.8f)
                curveTo(12.04f, 4.72f, 10.81f, 5.06f, 10.6f, 6.61f)
                curveTo(10.47f, 7.58f, 10.76f, 8.19f, 11.21f, 9.08f)
                curveTo(11.46f, 9.6f, 12.04f, 10.96f, 12.18f, 11.78f)
                curveTo(12.33f, 12.59f, 12.06f, 13.16f, 11.74f, 13.12f)
                curveTo(11.44f, 13.08f, 11.2f, 12.65f, 11.03f, 12.41f)
                curveTo(10.89f, 12.22f, 10.0f, 10.82f, 9.67f, 10.23f)
                curveTo(9.22f, 9.5f, 8.04f, 7.96f, 6.44f, 7.74f)
                curveTo(4.35f, 7.46f, 3.44f, 9.2f, 3.18f, 10.36f)
                lineTo(1.0f, 10.06f)
                verticalLineTo(11.88f)
                lineTo(2.93f, 12.15f)
                curveTo(2.75f, 15.6f, 4.5f, 16.82f, 5.67f, 17.0f)
                curveTo(6.92f, 17.15f, 8.08f, 16.28f, 8.24f, 15.06f)
                curveTo(8.41f, 13.84f, 7.56f, 11.5f, 4.96f, 10.69f)
                curveTo(5.1f, 10.15f, 5.21f, 9.43f, 6.36f, 9.59f)
                curveTo(7.26f, 9.71f, 8.21f, 11.26f, 8.93f, 12.44f)
                curveTo(9.58f, 13.53f, 10.1f, 14.39f, 10.83f, 14.72f)
                curveTo(11.45f, 15.0f, 12.16f, 14.97f, 12.73f, 14.65f)
                curveTo(13.42f, 14.26f, 13.86f, 13.55f, 14.0f, 12.63f)
                curveTo(14.22f, 10.9f, 12.7f, 8.17f, 12.57f, 7.84f)
                curveTo(12.4f, 7.46f, 12.12f, 6.82f, 12.5f, 6.73f)
                moveTo(6.5f, 14.78f)
                curveTo(6.43f, 15.11f, 6.1f, 15.25f, 5.88f, 15.22f)
                curveTo(5.38f, 15.16f, 4.66f, 14.5f, 4.71f, 12.53f)
                curveTo(6.17f, 13.13f, 6.53f, 14.35f, 6.5f, 14.78f)
                close()
            }
        }
        .build()
        return _cursorDefaultGesture!!
    }

private var _cursorDefaultGesture: ImageVector? = null
