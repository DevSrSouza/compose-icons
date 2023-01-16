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

public val MaterialDesignIcons.SendLock: ImageVector
    get() {
        if (_sendLock != null) {
            return _sendLock!!
        }
        _sendLock = Builder(name = "SendLock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 18.0f)
                verticalLineTo(17.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 20.5f, 15.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.0f, 17.5f)
                verticalLineTo(18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 19.0f)
                verticalLineTo(23.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 24.0f)
                horizontalLineTo(23.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 24.0f, 23.0f)
                verticalLineTo(19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.0f, 18.0f)
                moveTo(22.0f, 18.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.5f, 16.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 22.0f, 17.5f)
                verticalLineTo(18.0f)
                moveTo(23.0f, 12.0f)
                lineTo(2.0f, 21.0f)
                verticalLineTo(14.0f)
                lineTo(17.0f, 12.0f)
                lineTo(2.0f, 10.0f)
                verticalLineTo(3.0f)
                lineTo(23.0f, 12.0f)
                close()
            }
        }
        .build()
        return _sendLock!!
    }

private var _sendLock: ImageVector? = null
