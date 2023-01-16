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

public val MaterialDesignIcons.Zend: ImageVector
    get() {
        if (_zend != null) {
            return _zend!!
        }
        _zend = Builder(name = "Zend", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.28f, 9.81f)
                curveTo(11.28f, 9.81f, 11.28f, 7.0f, 14.09f, 7.0f)
                horizontalLineTo(22.5f)
                curveTo(22.5f, 7.0f, 22.5f, 9.81f, 19.71f, 9.81f)
                horizontalLineTo(11.28f)
                moveTo(11.28f, 13.41f)
                curveTo(11.28f, 13.41f, 11.28f, 10.6f, 14.09f, 10.6f)
                horizontalLineTo(18.31f)
                curveTo(18.31f, 10.6f, 18.31f, 13.41f, 15.5f, 13.41f)
                horizontalLineTo(11.28f)
                moveTo(11.28f, 17.0f)
                curveTo(11.28f, 17.0f, 11.28f, 14.19f, 14.09f, 14.19f)
                horizontalLineTo(15.5f)
                curveTo(15.5f, 14.19f, 15.5f, 17.0f, 12.68f, 17.0f)
                horizontalLineTo(11.28f)
                moveTo(10.46f, 14.8f)
                verticalLineTo(17.0f)
                horizontalLineTo(1.58f)
                lineTo(7.3f, 9.21f)
                horizontalLineTo(2.4f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.66f)
                lineTo(5.96f, 14.8f)
                horizontalLineTo(10.46f)
                close()
            }
        }
        .build()
        return _zend!!
    }

private var _zend: ImageVector? = null
