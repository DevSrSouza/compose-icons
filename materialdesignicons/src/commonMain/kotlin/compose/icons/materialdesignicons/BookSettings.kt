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

public val MaterialDesignIcons.BookSettings: ImageVector
    get() {
        if (_bookSettings != null) {
            return _bookSettings!!
        }
        _bookSettings = Builder(name = "BookSettings", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                verticalLineTo(18.0f)
                curveTo(20.0f, 19.11f, 19.11f, 20.0f, 18.0f, 20.0f)
                horizontalLineTo(6.0f)
                curveTo(4.89f, 20.0f, 4.0f, 19.11f, 4.0f, 18.0f)
                verticalLineTo(2.0f)
                curveTo(4.0f, 0.895f, 4.89f, 0.0f, 6.0f, 0.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(7.0f)
                lineTo(9.5f, 5.5f)
                lineTo(12.0f, 7.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(18.0f)
                curveTo(19.1f, 0.0f, 20.0f, 0.89f, 20.0f, 2.0f)
                moveTo(7.0f, 24.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(24.0f)
                moveTo(15.0f, 24.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(24.0f)
                moveTo(11.0f, 24.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(24.0f)
                close()
            }
        }
        .build()
        return _bookSettings!!
    }

private var _bookSettings: ImageVector? = null
