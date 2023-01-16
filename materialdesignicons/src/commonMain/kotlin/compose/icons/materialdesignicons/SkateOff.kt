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

public val MaterialDesignIcons.SkateOff: ImageVector
    get() {
        if (_skateOff != null) {
            return _skateOff!!
        }
        _skateOff = Builder(name = "SkateOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 15.81f)
                lineTo(13.36f, 10.16f)
                curveTo(15.22f, 10.62f, 17.63f, 11.05f, 18.53f, 12.95f)
                curveTo(18.95f, 13.57f, 19.0f, 14.71f, 19.0f, 15.81f)
                moveTo(20.95f, 17.0f)
                curveTo(20.92f, 17.21f, 20.87f, 17.41f, 20.8f, 17.6f)
                lineTo(22.32f, 19.12f)
                curveTo(22.68f, 18.5f, 22.92f, 17.77f, 23.0f, 17.0f)
                horizontalLineTo(20.95f)
                moveTo(10.5f, 7.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.2f)
                lineTo(10.2f, 7.0f)
                horizontalLineTo(10.5f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(19.66f, 21.55f)
                curveTo(19.0f, 21.83f, 18.27f, 22.0f, 17.5f, 22.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(2.03f)
                verticalLineTo(3.92f)
                lineTo(1.11f, 3.0f)
                lineTo(2.03f, 2.09f)
                verticalLineTo(2.0f)
                horizontalLineTo(2.12f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(14.0f, 18.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(18.0f)
                moveTo(18.06f, 19.95f)
                lineTo(16.11f, 18.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.5f)
                curveTo(17.69f, 20.0f, 17.88f, 20.0f, 18.06f, 19.95f)
                moveTo(10.5f, 5.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(5.2f)
                lineTo(8.2f, 5.0f)
                horizontalLineTo(10.5f)
                close()
            }
        }
        .build()
        return _skateOff!!
    }

private var _skateOff: ImageVector? = null
