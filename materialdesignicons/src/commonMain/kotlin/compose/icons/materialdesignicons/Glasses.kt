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

public val MaterialDesignIcons.Glasses: ImageVector
    get() {
        if (_glasses != null) {
            return _glasses!!
        }
        _glasses = Builder(name = "Glasses", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 10.0f)
                curveTo(2.76f, 10.0f, 2.55f, 10.09f, 2.41f, 10.25f)
                curveTo(2.27f, 10.4f, 2.21f, 10.62f, 2.24f, 10.86f)
                lineTo(2.74f, 13.85f)
                curveTo(2.82f, 14.5f, 3.4f, 15.0f, 4.0f, 15.0f)
                horizontalLineTo(7.0f)
                curveTo(7.64f, 15.0f, 8.36f, 14.44f, 8.5f, 13.82f)
                lineTo(9.56f, 10.63f)
                curveTo(9.6f, 10.5f, 9.57f, 10.31f, 9.5f, 10.19f)
                curveTo(9.39f, 10.07f, 9.22f, 10.0f, 9.0f, 10.0f)
                horizontalLineTo(3.0f)
                moveTo(7.0f, 17.0f)
                horizontalLineTo(4.0f)
                curveTo(2.38f, 17.0f, 0.96f, 15.74f, 0.76f, 14.14f)
                lineTo(0.26f, 11.15f)
                curveTo(0.15f, 10.3f, 0.39f, 9.5f, 0.91f, 8.92f)
                curveTo(1.43f, 8.34f, 2.19f, 8.0f, 3.0f, 8.0f)
                horizontalLineTo(9.0f)
                curveTo(9.83f, 8.0f, 10.58f, 8.35f, 11.06f, 8.96f)
                curveTo(11.17f, 9.11f, 11.27f, 9.27f, 11.35f, 9.45f)
                curveTo(11.78f, 9.36f, 12.22f, 9.36f, 12.64f, 9.45f)
                curveTo(12.72f, 9.27f, 12.82f, 9.11f, 12.94f, 8.96f)
                curveTo(13.41f, 8.35f, 14.16f, 8.0f, 15.0f, 8.0f)
                horizontalLineTo(21.0f)
                curveTo(21.81f, 8.0f, 22.57f, 8.34f, 23.09f, 8.92f)
                curveTo(23.6f, 9.5f, 23.84f, 10.3f, 23.74f, 11.11f)
                lineTo(23.23f, 14.18f)
                curveTo(23.04f, 15.74f, 21.61f, 17.0f, 20.0f, 17.0f)
                horizontalLineTo(17.0f)
                curveTo(15.44f, 17.0f, 13.92f, 15.81f, 13.54f, 14.3f)
                lineTo(12.64f, 11.59f)
                curveTo(12.26f, 11.31f, 11.73f, 11.31f, 11.35f, 11.59f)
                lineTo(10.43f, 14.37f)
                curveTo(10.07f, 15.82f, 8.56f, 17.0f, 7.0f, 17.0f)
                moveTo(15.0f, 10.0f)
                curveTo(14.78f, 10.0f, 14.61f, 10.07f, 14.5f, 10.19f)
                curveTo(14.42f, 10.31f, 14.4f, 10.5f, 14.45f, 10.7f)
                lineTo(15.46f, 13.75f)
                curveTo(15.64f, 14.44f, 16.36f, 15.0f, 17.0f, 15.0f)
                horizontalLineTo(20.0f)
                curveTo(20.59f, 15.0f, 21.18f, 14.5f, 21.25f, 13.89f)
                lineTo(21.76f, 10.82f)
                curveTo(21.79f, 10.62f, 21.73f, 10.4f, 21.59f, 10.25f)
                curveTo(21.45f, 10.09f, 21.24f, 10.0f, 21.0f, 10.0f)
                horizontalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _glasses!!
    }

private var _glasses: ImageVector? = null
