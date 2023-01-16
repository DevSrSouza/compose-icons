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

public val MaterialDesignIcons.Twitch: ImageVector
    get() {
        if (_twitch != null) {
            return _twitch!!
        }
        _twitch = Builder(name = "Twitch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.64f, 5.93f)
                horizontalLineTo(13.07f)
                verticalLineTo(10.21f)
                horizontalLineTo(11.64f)
                moveTo(15.57f, 5.93f)
                horizontalLineTo(17.0f)
                verticalLineTo(10.21f)
                horizontalLineTo(15.57f)
                moveTo(7.0f, 2.0f)
                lineTo(3.43f, 5.57f)
                verticalLineTo(18.43f)
                horizontalLineTo(7.71f)
                verticalLineTo(22.0f)
                lineTo(11.29f, 18.43f)
                horizontalLineTo(14.14f)
                lineTo(20.57f, 12.0f)
                verticalLineTo(2.0f)
                moveTo(19.14f, 11.29f)
                lineTo(16.29f, 14.14f)
                horizontalLineTo(13.43f)
                lineTo(10.93f, 16.64f)
                verticalLineTo(14.14f)
                horizontalLineTo(7.71f)
                verticalLineTo(3.43f)
                horizontalLineTo(19.14f)
                close()
            }
        }
        .build()
        return _twitch!!
    }

private var _twitch: ImageVector? = null
