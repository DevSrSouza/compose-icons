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

public val MaterialDesignIcons.LinuxMint: ImageVector
    get() {
        if (_linuxMint != null) {
            return _linuxMint!!
        }
        _linuxMint = Builder(name = "LinuxMint", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 3.23f)
                verticalLineTo(6.8f)
                horizontalLineTo(3.5f)
                curveTo(4.59f, 6.8f, 4.78f, 7.53f, 4.78f, 8.55f)
                verticalLineTo(14.86f)
                curveTo(4.78f, 18.12f, 7.65f, 20.77f, 11.18f, 20.77f)
                horizontalLineTo(19.9f)
                curveTo(21.0f, 20.77f, 22.0f, 20.07f, 22.0f, 19.0f)
                verticalLineTo(9.2f)
                curveTo(22.0f, 5.93f, 19.13f, 3.28f, 15.6f, 3.28f)
                horizontalLineTo(11.93f)
                verticalLineTo(3.27f)
                lineTo(2.0f, 3.23f)
                verticalLineTo(3.23f)
                moveTo(6.62f, 5.46f)
                horizontalLineTo(8.37f)
                verticalLineTo(14.45f)
                curveTo(8.37f, 15.65f, 9.19f, 16.59f, 10.16f, 16.59f)
                lineTo(16.13f, 16.61f)
                curveTo(17.38f, 16.61f, 18.35f, 15.75f, 18.35f, 14.73f)
                lineTo(18.34f, 9.96f)
                curveTo(18.34f, 9.65f, 18.24f, 9.41f, 18.0f, 9.19f)
                curveTo(17.79f, 8.96f, 17.56f, 8.86f, 17.25f, 8.86f)
                curveTo(16.94f, 8.86f, 16.71f, 8.96f, 16.5f, 9.19f)
                curveTo(16.27f, 9.41f, 16.16f, 9.65f, 16.16f, 9.96f)
                verticalLineTo(14.05f)
                horizontalLineTo(14.31f)
                verticalLineTo(9.96f)
                curveTo(14.31f, 9.65f, 14.21f, 9.41f, 14.0f, 9.19f)
                curveTo(13.77f, 8.96f, 13.54f, 8.86f, 13.22f, 8.86f)
                curveTo(12.92f, 8.86f, 12.68f, 8.96f, 12.46f, 9.19f)
                curveTo(12.24f, 9.41f, 12.14f, 9.65f, 12.14f, 9.96f)
                verticalLineTo(14.05f)
                horizontalLineTo(10.29f)
                verticalLineTo(9.96f)
                curveTo(10.29f, 9.15f, 10.58f, 8.44f, 11.15f, 7.86f)
                curveTo(11.72f, 7.29f, 12.43f, 7.0f, 13.22f, 7.0f)
                curveTo(14.0f, 7.0f, 14.68f, 7.28f, 15.24f, 7.82f)
                curveTo(15.79f, 7.28f, 16.47f, 7.0f, 17.25f, 7.0f)
                curveTo(18.05f, 7.0f, 18.76f, 7.29f, 19.32f, 7.86f)
                curveTo(19.89f, 8.44f, 20.19f, 9.15f, 20.19f, 9.96f)
                lineTo(20.2f, 15.06f)
                curveTo(20.11f, 15.91f, 19.75f, 16.67f, 19.13f, 17.31f)
                verticalLineTo(17.31f)
                curveTo(18.4f, 18.04f, 17.5f, 18.42f, 16.5f, 18.42f)
                horizontalLineTo(9.83f)
                curveTo(9.0f, 18.34f, 8.29f, 17.95f, 7.69f, 17.36f)
                curveTo(7.0f, 16.65f, 6.62f, 15.79f, 6.62f, 14.79f)
                verticalLineTo(5.46f)
                horizontalLineTo(6.62f)
                close()
            }
        }
        .build()
        return _linuxMint!!
    }

private var _linuxMint: ImageVector? = null
