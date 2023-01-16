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

public val MaterialDesignIcons.RotateOrbit: ImageVector
    get() {
        if (_rotateOrbit != null) {
            return _rotateOrbit!!
        }
        _rotateOrbit = Builder(name = "RotateOrbit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 14.25f)
                lineTo(4.75f, 11.0f)
                horizontalLineTo(7.0f)
                curveTo(7.25f, 5.39f, 9.39f, 1.0f, 12.0f, 1.0f)
                curveTo(14.0f, 1.0f, 15.77f, 3.64f, 16.55f, 7.45f)
                curveTo(20.36f, 8.23f, 23.0f, 10.0f, 23.0f, 12.0f)
                curveTo(23.0f, 13.83f, 20.83f, 15.43f, 17.6f, 16.3f)
                lineTo(17.89f, 14.27f)
                curveTo(19.8f, 13.72f, 21.0f, 12.91f, 21.0f, 12.0f)
                curveTo(21.0f, 10.94f, 19.35f, 10.0f, 16.87f, 9.5f)
                curveTo(16.95f, 10.29f, 17.0f, 11.13f, 17.0f, 12.0f)
                curveTo(17.0f, 18.08f, 14.76f, 23.0f, 12.0f, 23.0f)
                curveTo(10.17f, 23.0f, 8.57f, 20.83f, 7.7f, 17.6f)
                lineTo(9.73f, 17.89f)
                curveTo(10.28f, 19.8f, 11.09f, 21.0f, 12.0f, 21.0f)
                curveTo(13.66f, 21.0f, 15.0f, 16.97f, 15.0f, 12.0f)
                curveTo(15.0f, 11.0f, 14.95f, 10.05f, 14.85f, 9.15f)
                curveTo(13.95f, 9.05f, 13.0f, 9.0f, 12.0f, 9.0f)
                lineTo(10.14f, 9.06f)
                lineTo(10.43f, 7.05f)
                lineTo(12.0f, 7.0f)
                curveTo(12.87f, 7.0f, 13.71f, 7.05f, 14.5f, 7.13f)
                curveTo(14.0f, 4.65f, 13.06f, 3.0f, 12.0f, 3.0f)
                curveTo(10.46f, 3.0f, 9.18f, 6.5f, 9.0f, 11.0f)
                horizontalLineTo(11.25f)
                lineTo(8.0f, 14.25f)
                moveTo(14.25f, 16.0f)
                lineTo(11.0f, 19.25f)
                verticalLineTo(17.0f)
                curveTo(5.39f, 16.75f, 1.0f, 14.61f, 1.0f, 12.0f)
                curveTo(1.0f, 10.17f, 3.17f, 8.57f, 6.4f, 7.7f)
                lineTo(6.11f, 9.73f)
                curveTo(4.2f, 10.28f, 3.0f, 11.09f, 3.0f, 12.0f)
                curveTo(3.0f, 13.54f, 6.5f, 14.82f, 11.0f, 15.0f)
                verticalLineTo(12.75f)
                lineTo(14.25f, 16.0f)
                close()
            }
        }
        .build()
        return _rotateOrbit!!
    }

private var _rotateOrbit: ImageVector? = null
