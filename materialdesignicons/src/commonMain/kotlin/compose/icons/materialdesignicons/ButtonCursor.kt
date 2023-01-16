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

public val MaterialDesignIcons.ButtonCursor: ImageVector
    get() {
        if (_buttonCursor != null) {
            return _buttonCursor!!
        }
        _buttonCursor = Builder(name = "ButtonCursor", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.1f, 15.3f)
                curveTo(18.0f, 15.4f, 17.8f, 15.5f, 17.7f, 15.6f)
                lineTo(15.3f, 16.0f)
                lineTo(17.0f, 19.6f)
                curveTo(17.2f, 20.0f, 17.0f, 20.4f, 16.6f, 20.6f)
                lineTo(13.8f, 21.9f)
                curveTo(13.7f, 22.0f, 13.6f, 22.0f, 13.5f, 22.0f)
                curveTo(13.2f, 22.0f, 12.9f, 21.8f, 12.8f, 21.6f)
                lineTo(11.2f, 18.0f)
                lineTo(9.3f, 19.5f)
                curveTo(9.2f, 19.6f, 9.0f, 19.7f, 8.8f, 19.7f)
                curveTo(8.4f, 19.7f, 8.0f, 19.4f, 8.0f, 18.9f)
                verticalLineTo(7.5f)
                curveTo(8.0f, 7.0f, 8.3f, 6.7f, 8.8f, 6.7f)
                curveTo(9.0f, 6.7f, 9.2f, 6.8f, 9.3f, 6.9f)
                lineTo(18.0f, 14.3f)
                curveTo(18.3f, 14.5f, 18.4f, 15.0f, 18.1f, 15.3f)
                moveTo(6.0f, 12.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(18.4f)
                lineTo(20.6f, 13.9f)
                curveTo(21.4f, 13.6f, 21.9f, 12.9f, 21.9f, 12.0f)
                verticalLineTo(4.0f)
                curveTo(21.9f, 2.9f, 21.0f, 2.0f, 19.9f, 2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f)
                verticalLineTo(12.0f)
                curveTo(2.0f, 13.1f, 2.9f, 14.0f, 4.0f, 14.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _buttonCursor!!
    }

private var _buttonCursor: ImageVector? = null
