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

public val MaterialDesignIcons.MessageBulleted: ImageVector
    get() {
        if (_messageBulleted != null) {
            return _messageBulleted!!
        }
        _messageBulleted = Builder(name = "MessageBulleted", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 4.0f)
                verticalLineTo(22.0f)
                lineTo(6.0f, 18.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 16.0f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 2.0f)
                moveTo(8.0f, 14.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(14.0f)
                moveTo(8.0f, 11.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.0f)
                moveTo(8.0f, 8.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(8.0f)
                moveTo(15.0f, 14.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(14.0f)
                moveTo(18.0f, 11.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(11.0f)
                moveTo(18.0f, 8.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _messageBulleted!!
    }

private var _messageBulleted: ImageVector? = null
