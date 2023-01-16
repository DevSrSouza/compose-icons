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

public val MaterialDesignIcons.BookArrowDown: ImageVector
    get() {
        if (_bookArrowDown != null) {
            return _bookArrowDown!!
        }
        _bookArrowDown = Builder(name = "BookArrowDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 19.0f)
                curveTo(13.0f, 20.1f, 13.3f, 21.12f, 13.81f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(4.89f, 22.0f, 4.0f, 21.11f, 4.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(4.0f, 2.9f, 4.89f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.0f)
                lineTo(9.5f, 7.5f)
                lineTo(12.0f, 9.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(18.0f)
                curveTo(19.1f, 2.0f, 20.0f, 2.89f, 20.0f, 4.0f)
                verticalLineTo(13.09f)
                curveTo(19.67f, 13.04f, 19.34f, 13.0f, 19.0f, 13.0f)
                curveTo(15.69f, 13.0f, 13.0f, 15.69f, 13.0f, 19.0f)
                moveTo(20.0f, 20.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(16.0f)
                lineTo(19.0f, 23.0f)
                lineTo(22.0f, 20.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _bookArrowDown!!
    }

private var _bookArrowDown: ImageVector? = null
