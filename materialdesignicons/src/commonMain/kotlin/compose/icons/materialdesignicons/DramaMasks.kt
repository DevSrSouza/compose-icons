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

public val MaterialDesignIcons.DramaMasks: ImageVector
    get() {
        if (_dramaMasks != null) {
            return _dramaMasks!!
        }
        _dramaMasks = Builder(name = "DramaMasks", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.11f, 19.45f)
                curveTo(5.94f, 18.65f, 4.22f, 16.78f, 3.71f, 14.35f)
                lineTo(2.05f, 6.54f)
                curveTo(1.81f, 5.46f, 2.5f, 4.4f, 3.58f, 4.17f)
                lineTo(13.35f, 2.1f)
                lineTo(13.38f, 2.09f)
                curveTo(14.45f, 1.88f, 15.5f, 2.57f, 15.72f, 3.63f)
                lineTo(16.07f, 5.3f)
                lineTo(20.42f, 6.23f)
                horizontalLineTo(20.45f)
                curveTo(21.5f, 6.47f, 22.18f, 7.53f, 21.96f, 8.59f)
                lineTo(20.3f, 16.41f)
                curveTo(19.5f, 20.18f, 15.78f, 22.6f, 12.0f, 21.79f)
                curveTo(10.42f, 21.46f, 9.08f, 20.61f, 8.11f, 19.45f)
                verticalLineTo(19.45f)
                moveTo(20.0f, 8.18f)
                lineTo(10.23f, 6.1f)
                lineTo(8.57f, 13.92f)
                verticalLineTo(13.95f)
                curveTo(8.0f, 16.63f, 9.73f, 19.27f, 12.42f, 19.84f)
                curveTo(15.11f, 20.41f, 17.77f, 18.69f, 18.34f, 16.0f)
                lineTo(20.0f, 8.18f)
                moveTo(16.0f, 16.5f)
                curveTo(15.37f, 17.57f, 14.11f, 18.16f, 12.83f, 17.89f)
                curveTo(11.56f, 17.62f, 10.65f, 16.57f, 10.5f, 15.34f)
                lineTo(16.0f, 16.5f)
                moveTo(8.47f, 5.17f)
                lineTo(4.0f, 6.13f)
                lineTo(5.66f, 13.94f)
                lineTo(5.67f, 13.97f)
                curveTo(5.82f, 14.68f, 6.12f, 15.32f, 6.53f, 15.87f)
                curveTo(6.43f, 15.1f, 6.45f, 14.3f, 6.62f, 13.5f)
                lineTo(7.05f, 11.5f)
                curveTo(6.6f, 11.42f, 6.21f, 11.17f, 6.0f, 10.81f)
                curveTo(6.06f, 10.2f, 6.56f, 9.66f, 7.25f, 9.5f)
                curveTo(7.33f, 9.5f, 7.4f, 9.5f, 7.5f, 9.5f)
                lineTo(8.28f, 5.69f)
                curveTo(8.32f, 5.5f, 8.38f, 5.33f, 8.47f, 5.17f)
                moveTo(15.03f, 12.23f)
                curveTo(15.35f, 11.7f, 16.03f, 11.42f, 16.72f, 11.57f)
                curveTo(17.41f, 11.71f, 17.91f, 12.24f, 18.0f, 12.86f)
                curveTo(17.67f, 13.38f, 17.0f, 13.66f, 16.3f, 13.5f)
                curveTo(15.61f, 13.37f, 15.11f, 12.84f, 15.03f, 12.23f)
                moveTo(10.15f, 11.19f)
                curveTo(10.47f, 10.66f, 11.14f, 10.38f, 11.83f, 10.53f)
                curveTo(12.5f, 10.67f, 13.03f, 11.21f, 13.11f, 11.82f)
                curveTo(12.78f, 12.34f, 12.11f, 12.63f, 11.42f, 12.5f)
                curveTo(10.73f, 12.33f, 10.23f, 11.8f, 10.15f, 11.19f)
                moveTo(11.97f, 4.43f)
                lineTo(13.93f, 4.85f)
                lineTo(13.77f, 4.05f)
                lineTo(11.97f, 4.43f)
                close()
            }
        }
        .build()
        return _dramaMasks!!
    }

private var _dramaMasks: ImageVector? = null
