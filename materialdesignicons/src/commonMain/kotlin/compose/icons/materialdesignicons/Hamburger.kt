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

public val MaterialDesignIcons.Hamburger: ImageVector
    get() {
        if (_hamburger != null) {
            return _hamburger!!
        }
        _hamburger = Builder(name = "Hamburger", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 13.0f)
                curveTo(22.0f, 14.11f, 21.11f, 15.0f, 20.0f, 15.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 15.0f, 2.0f, 14.11f, 2.0f, 13.0f)
                reflectiveCurveTo(2.9f, 11.0f, 4.0f, 11.0f)
                horizontalLineTo(13.0f)
                lineTo(15.5f, 13.0f)
                lineTo(18.0f, 11.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 11.0f, 22.0f, 11.9f, 22.0f, 13.0f)
                moveTo(12.0f, 3.0f)
                curveTo(3.0f, 3.0f, 3.0f, 9.0f, 3.0f, 9.0f)
                horizontalLineTo(21.0f)
                curveTo(21.0f, 9.0f, 21.0f, 3.0f, 12.0f, 3.0f)
                moveTo(3.0f, 18.0f)
                curveTo(3.0f, 19.66f, 4.34f, 21.0f, 6.0f, 21.0f)
                horizontalLineTo(18.0f)
                curveTo(19.66f, 21.0f, 21.0f, 19.66f, 21.0f, 18.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _hamburger!!
    }

private var _hamburger: ImageVector? = null
