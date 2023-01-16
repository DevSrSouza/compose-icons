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

public val MaterialDesignIcons.CircularSaw: ImageVector
    get() {
        if (_circularSaw != null) {
            return _circularSaw!!
        }
        _circularSaw = Builder(name = "CircularSaw", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 11.0f)
                moveTo(7.86f, 6.25f)
                curveTo(9.14f, 4.87f, 10.97f, 4.0f, 13.0f, 4.0f)
                curveTo(16.5f, 4.0f, 19.44f, 6.61f, 19.93f, 10.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 13.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 10.0f, 12.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(2.05f)
                curveTo(2.25f, 7.73f, 3.14f, 5.66f, 4.5f, 4.0f)
                lineTo(7.86f, 6.25f)
                moveTo(6.73f, 7.89f)
                lineTo(5.06f, 6.77f)
                curveTo(4.53f, 7.75f, 4.18f, 8.84f, 4.06f, 10.0f)
                horizontalLineTo(6.07f)
                curveTo(6.18f, 9.25f, 6.4f, 8.54f, 6.73f, 7.89f)
                moveTo(7.4f, 15.4f)
                lineTo(6.0f, 14.0f)
                horizontalLineTo(11.79f)
                curveTo(12.03f, 14.42f, 12.5f, 14.7f, 13.0f, 14.7f)
                curveTo(13.5f, 14.7f, 13.97f, 14.42f, 14.21f, 14.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.4f)
                curveTo(18.39f, 14.42f, 18.46f, 15.75f, 18.46f, 15.75f)
                verticalLineTo(17.71f)
                lineTo(16.5f, 19.67f)
                curveTo(16.0f, 17.92f, 15.1f, 18.9f, 15.1f, 18.9f)
                lineTo(13.7f, 20.3f)
                horizontalLineTo(10.9f)
                curveTo(11.88f, 18.69f, 10.55f, 18.76f, 10.55f, 18.76f)
                horizontalLineTo(8.59f)
                lineTo(6.63f, 16.8f)
                curveTo(8.38f, 16.31f, 7.4f, 15.4f, 7.4f, 15.4f)
                close()
            }
        }
        .build()
        return _circularSaw!!
    }

private var _circularSaw: ImageVector? = null
