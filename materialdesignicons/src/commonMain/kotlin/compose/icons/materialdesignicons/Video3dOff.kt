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

public val MaterialDesignIcons.Video3dOff: ImageVector
    get() {
        if (_video3dOff != null) {
            return _video3dOff!!
        }
        _video3dOff = Builder(name = "Video3dOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.61f, 2.0f)
                lineTo(21.35f, 20.74f)
                lineTo(19.94f, 22.15f)
                lineTo(14.8f, 17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.2f)
                lineTo(11.0f, 13.23f)
                verticalLineTo(15.21f)
                curveTo(10.93f, 15.68f, 10.74f, 16.08f, 10.41f, 16.41f)
                curveTo(10.08f, 16.73f, 9.68f, 16.93f, 9.21f, 17.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.8f)
                lineTo(6.79f, 9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.23f)
                lineTo(1.2f, 3.41f)
                lineTo(2.61f, 2.0f)
                moveTo(16.0f, 7.0f)
                horizontalLineTo(16.22f)
                curveTo(17.0f, 7.07f, 17.63f, 7.36f, 18.14f, 7.88f)
                curveTo(18.65f, 8.39f, 18.93f, 9.0f, 19.0f, 9.76f)
                verticalLineTo(14.24f)
                curveTo(18.95f, 14.63f, 18.87f, 15.0f, 18.72f, 15.3f)
                lineTo(17.0f, 13.6f)
                verticalLineTo(9.85f)
                curveTo(16.95f, 9.63f, 16.84f, 9.44f, 16.69f, 9.28f)
                curveTo(16.53f, 9.13f, 16.34f, 9.03f, 16.12f, 9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(11.59f)
                lineTo(13.0f, 9.57f)
                verticalLineTo(7.0f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _video3dOff!!
    }

private var _video3dOff: ImageVector? = null
