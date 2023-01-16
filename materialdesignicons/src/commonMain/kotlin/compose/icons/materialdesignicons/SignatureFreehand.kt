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

public val MaterialDesignIcons.SignatureFreehand: ImageVector
    get() {
        if (_signatureFreehand != null) {
            return _signatureFreehand!!
        }
        _signatureFreehand = Builder(name = "SignatureFreehand", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(22.0f)
                moveTo(6.2f, 17.3f)
                lineTo(5.5f, 18.0f)
                lineTo(4.1f, 16.6f)
                lineTo(2.7f, 18.0f)
                lineTo(2.0f, 17.3f)
                lineTo(3.4f, 15.9f)
                lineTo(2.0f, 14.5f)
                lineTo(2.7f, 13.8f)
                lineTo(4.1f, 15.2f)
                lineTo(5.5f, 13.8f)
                lineTo(6.2f, 14.5f)
                lineTo(4.8f, 15.9f)
                lineTo(6.2f, 17.3f)
                moveTo(16.22f, 14.43f)
                curveTo(16.22f, 13.85f, 15.5f, 13.2f, 14.06f, 12.46f)
                curveTo(12.23f, 11.54f, 11.0f, 10.79f, 10.36f, 10.24f)
                curveTo(9.71f, 9.68f, 9.39f, 9.06f, 9.39f, 8.37f)
                curveTo(9.39f, 6.59f, 10.3f, 5.12f, 12.12f, 3.95f)
                curveTo(13.94f, 2.78f, 15.43f, 2.19f, 16.57f, 2.19f)
                curveTo(17.31f, 2.19f, 17.85f, 2.32f, 18.18f, 2.58f)
                curveTo(18.5f, 2.83f, 18.68f, 3.27f, 18.68f, 3.9f)
                curveTo(18.68f, 4.18f, 18.56f, 4.42f, 18.31f, 4.63f)
                curveTo(18.07f, 4.83f, 17.87f, 4.93f, 17.74f, 4.93f)
                curveTo(17.63f, 4.93f, 17.43f, 4.83f, 17.13f, 4.64f)
                lineTo(16.55f, 4.38f)
                curveTo(16.08f, 4.38f, 15.14f, 4.71f, 13.71f, 5.38f)
                curveTo(12.29f, 6.04f, 11.58f, 6.79f, 11.58f, 7.63f)
                curveTo(11.58f, 8.14f, 11.82f, 8.6f, 12.32f, 9.0f)
                curveTo(12.82f, 9.42f, 13.71f, 9.93f, 15.0f, 10.53f)
                curveTo(16.03f, 11.0f, 16.86f, 11.5f, 17.5f, 12.07f)
                curveTo(18.1f, 12.61f, 18.41f, 13.25f, 18.41f, 14.0f)
                curveTo(18.41f, 15.34f, 17.47f, 16.41f, 15.58f, 17.17f)
                curveTo(13.7f, 17.94f, 11.9f, 18.32f, 10.19f, 18.32f)
                curveTo(8.75f, 18.32f, 8.0f, 17.83f, 8.0f, 16.86f)
                curveTo(8.0f, 16.5f, 8.19f, 16.27f, 8.5f, 16.11f)
                curveTo(8.83f, 15.95f, 9.16f, 15.87f, 9.5f, 15.87f)
                lineTo(10.25f, 16.0f)
                lineTo(10.97f, 16.13f)
                curveTo(11.95f, 16.13f, 13.0f, 15.97f, 14.13f, 15.64f)
                curveTo(15.26f, 15.32f, 15.96f, 14.91f, 16.22f, 14.43f)
                close()
            }
        }
        .build()
        return _signatureFreehand!!
    }

private var _signatureFreehand: ImageVector? = null
