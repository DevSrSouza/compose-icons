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

public val MaterialDesignIcons.FireAlert: ImageVector
    get() {
        if (_fireAlert != null) {
            return _fireAlert!!
        }
        _fireAlert = Builder(name = "FireAlert", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.66f, 11.2f)
                curveTo(15.43f, 10.9f, 15.15f, 10.64f, 14.89f, 10.38f)
                curveTo(14.22f, 9.78f, 13.46f, 9.35f, 12.82f, 8.72f)
                curveTo(11.33f, 7.26f, 11.0f, 4.85f, 11.95f, 3.0f)
                curveTo(11.0f, 3.23f, 10.17f, 3.75f, 9.46f, 4.32f)
                curveTo(6.87f, 6.4f, 5.85f, 10.07f, 7.07f, 13.22f)
                curveTo(7.11f, 13.32f, 7.15f, 13.42f, 7.15f, 13.55f)
                curveTo(7.15f, 13.77f, 7.0f, 13.97f, 6.8f, 14.05f)
                curveTo(6.57f, 14.15f, 6.33f, 14.09f, 6.14f, 13.93f)
                curveTo(6.08f, 13.88f, 6.04f, 13.83f, 6.0f, 13.76f)
                curveTo(4.87f, 12.33f, 4.69f, 10.28f, 5.45f, 8.64f)
                curveTo(3.78f, 10.0f, 2.87f, 12.3f, 3.0f, 14.47f)
                curveTo(3.06f, 14.97f, 3.12f, 15.47f, 3.29f, 15.97f)
                curveTo(3.43f, 16.57f, 3.7f, 17.17f, 4.0f, 17.7f)
                curveTo(5.08f, 19.43f, 6.95f, 20.67f, 8.96f, 20.92f)
                curveTo(11.1f, 21.19f, 13.39f, 20.8f, 15.03f, 19.32f)
                curveTo(16.86f, 17.66f, 17.5f, 15.0f, 16.56f, 12.72f)
                lineTo(16.43f, 12.46f)
                curveTo(16.22f, 12.0f, 15.66f, 11.2f, 15.66f, 11.2f)
                moveTo(12.5f, 17.5f)
                curveTo(12.22f, 17.74f, 11.76f, 18.0f, 11.4f, 18.1f)
                curveTo(10.28f, 18.5f, 9.16f, 17.94f, 8.5f, 17.28f)
                curveTo(9.69f, 17.0f, 10.4f, 16.12f, 10.61f, 15.23f)
                curveTo(10.78f, 14.43f, 10.46f, 13.77f, 10.33f, 13.0f)
                curveTo(10.21f, 12.26f, 10.23f, 11.63f, 10.5f, 10.94f)
                curveTo(10.69f, 11.32f, 10.89f, 11.7f, 11.13f, 12.0f)
                curveTo(11.9f, 13.0f, 13.11f, 13.44f, 13.37f, 14.8f)
                curveTo(13.41f, 14.94f, 13.43f, 15.08f, 13.43f, 15.23f)
                curveTo(13.46f, 16.05f, 13.1f, 16.95f, 12.5f, 17.5f)
                horizontalLineTo(12.5f)
                moveTo(21.0f, 13.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.0f)
                moveTo(21.0f, 17.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _fireAlert!!
    }

private var _fireAlert: ImageVector? = null
