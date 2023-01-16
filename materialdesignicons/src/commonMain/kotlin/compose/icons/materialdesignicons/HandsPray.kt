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

public val MaterialDesignIcons.HandsPray: ImageVector
    get() {
        if (_handsPray != null) {
            return _handsPray!!
        }
        _handsPray = Builder(name = "HandsPray", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.43f, 9.67f)
                curveTo(11.47f, 9.78f, 11.5f, 9.88f, 11.5f, 10.0f)
                verticalLineTo(15.22f)
                curveTo(11.5f, 15.72f, 11.31f, 16.2f, 10.97f, 16.57f)
                lineTo(8.18f, 19.62f)
                lineTo(4.78f, 16.22f)
                lineTo(6.0f, 15.0f)
                lineTo(8.8f, 2.86f)
                curveTo(8.92f, 2.36f, 9.37f, 2.0f, 9.89f, 2.0f)
                curveTo(10.5f, 2.0f, 11.0f, 2.5f, 11.0f, 3.11f)
                verticalLineTo(8.07f)
                curveTo(10.84f, 8.03f, 10.67f, 8.0f, 10.5f, 8.0f)
                curveTo(9.4f, 8.0f, 8.5f, 8.9f, 8.5f, 10.0f)
                verticalLineTo(13.0f)
                curveTo(8.5f, 13.28f, 8.72f, 13.5f, 9.0f, 13.5f)
                reflectiveCurveTo(9.5f, 13.28f, 9.5f, 13.0f)
                verticalLineTo(10.0f)
                curveTo(9.5f, 9.45f, 9.95f, 9.0f, 10.5f, 9.0f)
                curveTo(10.69f, 9.0f, 10.85f, 9.07f, 11.0f, 9.16f)
                curveTo(11.12f, 9.23f, 11.21f, 9.32f, 11.3f, 9.42f)
                curveTo(11.33f, 9.46f, 11.36f, 9.5f, 11.38f, 9.55f)
                curveTo(11.4f, 9.59f, 11.42f, 9.63f, 11.43f, 9.67f)
                moveTo(2.0f, 19.0f)
                lineTo(6.0f, 22.0f)
                lineTo(7.17f, 20.73f)
                lineTo(3.72f, 17.28f)
                lineTo(2.0f, 19.0f)
                moveTo(18.0f, 15.0f)
                lineTo(15.2f, 2.86f)
                curveTo(15.08f, 2.36f, 14.63f, 2.0f, 14.11f, 2.0f)
                curveTo(13.5f, 2.0f, 13.0f, 2.5f, 13.0f, 3.11f)
                verticalLineTo(8.07f)
                curveTo(13.16f, 8.03f, 13.33f, 8.0f, 13.5f, 8.0f)
                curveTo(14.6f, 8.0f, 15.5f, 8.9f, 15.5f, 10.0f)
                verticalLineTo(13.0f)
                curveTo(15.5f, 13.28f, 15.28f, 13.5f, 15.0f, 13.5f)
                reflectiveCurveTo(14.5f, 13.28f, 14.5f, 13.0f)
                verticalLineTo(10.0f)
                curveTo(14.5f, 9.45f, 14.05f, 9.0f, 13.5f, 9.0f)
                curveTo(13.31f, 9.0f, 13.15f, 9.07f, 13.0f, 9.16f)
                curveTo(12.88f, 9.23f, 12.79f, 9.32f, 12.71f, 9.42f)
                curveTo(12.68f, 9.46f, 12.64f, 9.5f, 12.62f, 9.55f)
                curveTo(12.6f, 9.59f, 12.58f, 9.63f, 12.57f, 9.67f)
                curveTo(12.53f, 9.78f, 12.5f, 9.88f, 12.5f, 10.0f)
                verticalLineTo(15.22f)
                curveTo(12.5f, 15.72f, 12.69f, 16.2f, 13.03f, 16.57f)
                lineTo(15.82f, 19.62f)
                lineTo(19.22f, 16.22f)
                lineTo(18.0f, 15.0f)
                moveTo(20.28f, 17.28f)
                lineTo(16.83f, 20.73f)
                lineTo(18.0f, 22.0f)
                lineTo(22.0f, 19.0f)
                lineTo(20.28f, 17.28f)
                close()
            }
        }
        .build()
        return _handsPray!!
    }

private var _handsPray: ImageVector? = null
