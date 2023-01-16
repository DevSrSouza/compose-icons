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

public val MaterialDesignIcons.Fireplace: ImageVector
    get() {
        if (_fireplace != null) {
            return _fireplace!!
        }
        _fireplace = Builder(name = "Fireplace", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(22.0f)
                moveTo(22.0f, 6.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(6.0f)
                moveTo(20.0f, 7.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(11.0f)
                curveTo(17.0f, 11.0f, 14.5f, 10.0f, 12.0f, 10.0f)
                curveTo(9.5f, 10.0f, 7.0f, 11.0f, 7.0f, 11.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(20.0f)
                moveTo(14.5f, 14.67f)
                horizontalLineTo(14.47f)
                lineTo(14.81f, 15.22f)
                lineTo(14.87f, 15.34f)
                curveTo(15.29f, 16.35f, 15.0f, 17.5f, 14.21f, 18.24f)
                curveTo(13.5f, 18.9f, 12.5f, 19.07f, 11.58f, 18.95f)
                curveTo(10.71f, 18.84f, 9.9f, 18.29f, 9.45f, 17.53f)
                curveTo(9.3f, 17.3f, 9.19f, 17.03f, 9.13f, 16.77f)
                lineTo(9.0f, 16.11f)
                curveTo(8.96f, 15.15f, 9.34f, 14.14f, 10.06f, 13.54f)
                curveTo(9.73f, 14.26f, 9.81f, 15.16f, 10.3f, 15.79f)
                lineTo(10.36f, 15.87f)
                curveTo(10.44f, 15.94f, 10.55f, 15.97f, 10.64f, 15.92f)
                curveTo(10.73f, 15.89f, 10.8f, 15.8f, 10.8f, 15.7f)
                lineTo(10.76f, 15.56f)
                curveTo(10.23f, 14.17f, 10.68f, 12.55f, 11.79f, 11.63f)
                curveTo(12.1f, 11.38f, 12.5f, 11.15f, 12.87f, 11.05f)
                curveTo(12.46f, 11.87f, 12.61f, 12.93f, 13.25f, 13.57f)
                lineTo(14.14f, 14.3f)
                lineTo(14.5f, 14.67f)
                moveTo(13.11f, 17.44f)
                verticalLineTo(17.44f)
                curveTo(13.37f, 17.2f, 13.53f, 16.8f, 13.5f, 16.44f)
                verticalLineTo(16.25f)
                curveTo(13.38f, 15.65f, 12.85f, 15.46f, 12.5f, 15.0f)
                lineTo(12.26f, 14.55f)
                curveTo(12.13f, 14.85f, 12.12f, 15.13f, 12.17f, 15.46f)
                curveTo(12.23f, 15.8f, 12.37f, 16.09f, 12.29f, 16.44f)
                curveTo(12.2f, 16.83f, 11.9f, 17.22f, 11.37f, 17.35f)
                curveTo(11.67f, 17.64f, 12.15f, 17.87f, 12.64f, 17.71f)
                lineTo(13.11f, 17.44f)
                close()
            }
        }
        .build()
        return _fireplace!!
    }

private var _fireplace: ImageVector? = null
