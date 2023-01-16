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

public val MaterialDesignIcons.FocusAuto: ImageVector
    get() {
        if (_focusAuto != null) {
            return _focusAuto!!
        }
        _focusAuto = Builder(name = "FocusAuto", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1f, 21.0f, 21.0f, 20.1f, 21.0f, 19.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(19.0f)
                moveTo(19.0f, 3.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f)
                moveTo(5.0f, 5.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.0f)
                moveTo(5.0f, 15.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.1f, 3.9f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(15.0f)
                moveTo(8.0f, 7.0f)
                curveTo(6.9f, 7.0f, 6.0f, 7.9f, 6.0f, 9.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(9.0f)
                curveTo(12.0f, 7.9f, 11.1f, 7.0f, 10.0f, 7.0f)
                horizontalLineTo(8.0f)
                moveTo(8.0f, 9.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.0f)
                moveTo(13.0f, 7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _focusAuto!!
    }

private var _focusAuto: ImageVector? = null
