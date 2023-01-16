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

public val MaterialDesignIcons.BookCheck: ImageVector
    get() {
        if (_bookCheck != null) {
            return _bookCheck!!
        }
        _bookCheck = Builder(name = "BookCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.75f, 22.16f)
                lineTo(14.0f, 19.16f)
                lineTo(15.16f, 18.0f)
                lineTo(16.75f, 19.59f)
                lineTo(20.34f, 16.0f)
                lineTo(21.5f, 17.41f)
                lineTo(16.75f, 22.16f)
                moveTo(6.0f, 22.0f)
                curveTo(4.89f, 22.0f, 4.0f, 21.1f, 4.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(4.0f, 2.89f, 4.89f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.0f)
                lineTo(9.5f, 7.5f)
                lineTo(12.0f, 9.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(18.0f)
                curveTo(19.1f, 2.0f, 20.0f, 2.89f, 20.0f, 4.0f)
                verticalLineTo(13.34f)
                curveTo(19.37f, 13.12f, 18.7f, 13.0f, 18.0f, 13.0f)
                curveTo(14.69f, 13.0f, 12.0f, 15.69f, 12.0f, 19.0f)
                curveTo(12.0f, 20.09f, 12.29f, 21.12f, 12.8f, 22.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _bookCheck!!
    }

private var _bookCheck: ImageVector? = null
