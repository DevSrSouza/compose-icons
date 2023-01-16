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

public val MaterialDesignIcons.Bathtub: ImageVector
    get() {
        if (_bathtub != null) {
            return _bathtub!!
        }
        _bathtub = Builder(name = "Bathtub", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 5.0f)
                curveTo(8.11f, 5.0f, 9.0f, 5.9f, 9.0f, 7.0f)
                reflectiveCurveTo(8.11f, 9.0f, 7.0f, 9.0f)
                reflectiveCurveTo(5.0f, 8.11f, 5.0f, 7.0f)
                reflectiveCurveTo(5.9f, 5.0f, 7.0f, 5.0f)
                moveTo(20.0f, 13.0f)
                verticalLineTo(4.83f)
                curveTo(20.0f, 3.27f, 18.73f, 2.0f, 17.17f, 2.0f)
                curveTo(16.42f, 2.0f, 15.7f, 2.3f, 15.17f, 2.83f)
                lineTo(13.92f, 4.08f)
                curveTo(13.76f, 4.03f, 13.59f, 4.0f, 13.41f, 4.0f)
                curveTo(13.0f, 4.0f, 12.64f, 4.12f, 12.33f, 4.32f)
                lineTo(15.09f, 7.08f)
                curveTo(15.29f, 6.77f, 15.41f, 6.4f, 15.41f, 6.0f)
                curveTo(15.41f, 5.82f, 15.38f, 5.66f, 15.34f, 5.5f)
                lineTo(16.59f, 4.24f)
                curveTo(16.74f, 4.09f, 16.95f, 4.0f, 17.17f, 4.0f)
                curveTo(17.63f, 4.0f, 18.0f, 4.37f, 18.0f, 4.83f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.15f)
                curveTo(10.85f, 12.79f, 10.58f, 12.55f, 10.33f, 12.28f)
                lineTo(8.93f, 10.73f)
                curveTo(8.74f, 10.5f, 8.5f, 10.35f, 8.24f, 10.23f)
                curveTo(7.93f, 10.08f, 7.59f, 10.0f, 7.24f, 10.0f)
                curveTo(6.0f, 10.0f, 5.0f, 11.0f, 5.0f, 12.25f)
                verticalLineTo(13.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(19.0f)
                curveTo(2.0f, 20.1f, 2.9f, 21.0f, 4.0f, 21.0f)
                curveTo(4.0f, 21.55f, 4.45f, 22.0f, 5.0f, 22.0f)
                horizontalLineTo(19.0f)
                curveTo(19.55f, 22.0f, 20.0f, 21.55f, 20.0f, 21.0f)
                curveTo(21.1f, 21.0f, 22.0f, 20.1f, 22.0f, 19.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _bathtub!!
    }

private var _bathtub: ImageVector? = null
