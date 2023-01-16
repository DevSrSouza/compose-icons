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

public val MaterialDesignIcons.MessageBulletedOff: ImageVector
    get() {
        if (_messageBulletedOff != null) {
            return _messageBulletedOff!!
        }
        _messageBulletedOff = Builder(name = "MessageBulletedOff", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.27f, 1.73f)
                lineTo(0.0f, 3.0f)
                lineTo(2.0f, 5.0f)
                verticalLineTo(22.0f)
                lineTo(6.0f, 18.0f)
                horizontalLineTo(15.0f)
                lineTo(20.73f, 23.73f)
                lineTo(22.0f, 22.46f)
                lineTo(1.27f, 1.73f)
                moveTo(8.0f, 14.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(14.0f)
                moveTo(6.0f, 11.0f)
                verticalLineTo(9.0f)
                lineTo(8.0f, 11.0f)
                horizontalLineTo(6.0f)
                moveTo(20.0f, 2.0f)
                horizontalLineTo(4.08f)
                lineTo(10.0f, 7.92f)
                verticalLineTo(6.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(10.08f)
                lineTo(11.08f, 9.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.08f)
                lineTo(20.07f, 18.0f)
                curveTo(21.14f, 17.95f, 22.0f, 17.08f, 22.0f, 16.0f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 2.0f)
                close()
            }
        }
        .build()
        return _messageBulletedOff!!
    }

private var _messageBulletedOff: ImageVector? = null
