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

public val MaterialDesignIcons.LinkOff: ImageVector
    get() {
        if (_linkOff != null) {
            return _linkOff!!
        }
        _linkOff = Builder(name = "LinkOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 7.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.9f)
                horizontalLineTo(17.0f)
                curveTo(18.71f, 8.9f, 20.1f, 10.29f, 20.1f, 12.0f)
                curveTo(20.1f, 13.43f, 19.12f, 14.63f, 17.79f, 15.0f)
                lineTo(19.25f, 16.44f)
                curveTo(20.88f, 15.61f, 22.0f, 13.95f, 22.0f, 12.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 17.0f, 7.0f)
                moveTo(16.0f, 11.0f)
                horizontalLineTo(13.81f)
                lineTo(15.81f, 13.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(11.0f)
                moveTo(2.0f, 4.27f)
                lineTo(5.11f, 7.38f)
                curveTo(3.29f, 8.12f, 2.0f, 9.91f, 2.0f, 12.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 7.0f, 17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.1f)
                horizontalLineTo(7.0f)
                curveTo(5.29f, 15.1f, 3.9f, 13.71f, 3.9f, 12.0f)
                curveTo(3.9f, 10.41f, 5.11f, 9.1f, 6.66f, 8.93f)
                lineTo(8.73f, 11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(10.73f)
                lineTo(13.0f, 15.27f)
                verticalLineTo(17.0f)
                horizontalLineTo(14.73f)
                lineTo(18.74f, 21.0f)
                lineTo(20.0f, 19.74f)
                lineTo(3.27f, 3.0f)
                lineTo(2.0f, 4.27f)
                close()
            }
        }
        .build()
        return _linkOff!!
    }

private var _linkOff: ImageVector? = null
