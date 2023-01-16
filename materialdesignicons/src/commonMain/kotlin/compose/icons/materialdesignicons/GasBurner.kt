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

public val MaterialDesignIcons.GasBurner: ImageVector
    get() {
        if (_gasBurner != null) {
            return _gasBurner!!
        }
        _gasBurner = Builder(name = "GasBurner", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.14f, 8.79f)
                lineTo(16.12f, 8.8f)
                curveTo(16.35f, 9.07f, 16.55f, 9.39f, 16.7f, 9.72f)
                lineTo(16.79f, 9.91f)
                curveTo(17.5f, 11.6f, 17.0f, 13.55f, 15.69f, 14.77f)
                curveTo(14.5f, 15.86f, 12.84f, 16.15f, 11.3f, 15.95f)
                curveTo(9.84f, 15.77f, 8.5f, 14.85f, 7.73f, 13.58f)
                curveTo(7.5f, 13.19f, 7.3f, 12.75f, 7.2f, 12.3f)
                curveTo(7.07f, 11.93f, 7.03f, 11.57f, 7.0f, 11.2f)
                curveTo(6.91f, 9.6f, 7.55f, 7.9f, 8.76f, 6.9f)
                curveTo(8.21f, 8.11f, 8.34f, 9.62f, 9.15f, 10.67f)
                lineTo(9.26f, 10.8f)
                curveTo(9.4f, 10.92f, 9.57f, 10.96f, 9.73f, 10.89f)
                curveTo(9.88f, 10.83f, 10.0f, 10.68f, 10.0f, 10.5f)
                lineTo(9.93f, 10.28f)
                curveTo(9.05f, 7.96f, 9.79f, 5.25f, 11.66f, 3.72f)
                curveTo(12.17f, 3.3f, 12.8f, 2.92f, 13.46f, 2.75f)
                curveTo(12.78f, 4.11f, 13.0f, 5.89f, 14.09f, 6.96f)
                curveTo(14.55f, 7.43f, 15.1f, 7.74f, 15.58f, 8.18f)
                lineTo(16.14f, 8.79f)
                moveTo(13.86f, 13.43f)
                lineTo(13.85f, 13.42f)
                curveTo(14.3f, 13.03f, 14.55f, 12.36f, 14.53f, 11.76f)
                lineTo(14.5f, 11.44f)
                curveTo(14.3f, 10.44f, 13.43f, 10.11f, 12.87f, 9.38f)
                curveTo(12.7f, 9.16f, 12.55f, 8.88f, 12.44f, 8.6f)
                curveTo(12.22f, 9.1f, 12.2f, 9.57f, 12.29f, 10.11f)
                curveTo(12.39f, 10.68f, 12.62f, 11.17f, 12.5f, 11.76f)
                curveTo(12.34f, 12.41f, 11.83f, 13.06f, 10.94f, 13.27f)
                curveTo(11.44f, 13.76f, 12.25f, 14.15f, 13.06f, 13.87f)
                curveTo(13.32f, 13.8f, 13.65f, 13.61f, 13.86f, 13.43f)
                moveTo(11.0f, 18.0f)
                verticalLineTo(19.0f)
                curveTo(11.0f, 19.55f, 11.45f, 20.0f, 12.0f, 20.0f)
                curveTo(12.55f, 20.0f, 13.0f, 19.55f, 13.0f, 19.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(19.0f)
                curveTo(15.0f, 19.55f, 15.45f, 20.0f, 16.0f, 20.0f)
                curveTo(16.55f, 20.0f, 17.0f, 19.55f, 17.0f, 19.0f)
                verticalLineTo(18.0f)
                curveTo(18.11f, 18.0f, 20.0f, 18.9f, 20.0f, 20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 18.9f, 5.9f, 18.0f, 7.0f, 18.0f)
                verticalLineTo(19.0f)
                curveTo(7.0f, 19.55f, 7.45f, 20.0f, 8.0f, 20.0f)
                curveTo(8.55f, 20.0f, 9.0f, 19.55f, 9.0f, 19.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _gasBurner!!
    }

private var _gasBurner: ImageVector? = null
