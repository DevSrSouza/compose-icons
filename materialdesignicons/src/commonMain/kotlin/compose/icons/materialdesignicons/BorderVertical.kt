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

public val MaterialDesignIcons.BorderVertical: ImageVector
    get() {
        if (_borderVertical != null) {
            return _borderVertical!!
        }
        _borderVertical = Builder(name = "BorderVertical", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(15.0f)
                moveTo(15.0f, 21.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.0f)
                moveTo(15.0f, 5.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(15.0f)
                moveTo(19.0f, 9.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.0f)
                moveTo(19.0f, 5.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(19.0f)
                moveTo(19.0f, 13.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.0f)
                moveTo(19.0f, 21.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                moveTo(11.0f, 21.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(11.0f)
                moveTo(19.0f, 17.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(19.0f)
                moveTo(7.0f, 5.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(7.0f)
                moveTo(3.0f, 17.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(3.0f)
                moveTo(3.0f, 21.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(3.0f)
                moveTo(3.0f, 13.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(3.0f)
                moveTo(7.0f, 13.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.0f)
                moveTo(7.0f, 21.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(7.0f)
                moveTo(3.0f, 5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(3.0f)
                moveTo(3.0f, 9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _borderVertical!!
    }

private var _borderVertical: ImageVector? = null
