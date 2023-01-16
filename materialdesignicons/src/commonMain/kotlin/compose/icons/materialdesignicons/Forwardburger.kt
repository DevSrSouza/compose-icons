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

public val MaterialDesignIcons.Forwardburger: ImageVector
    get() {
        if (_forwardburger != null) {
            return _forwardburger!!
        }
        _forwardburger = Builder(name = "Forwardburger", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.0f)
                lineTo(15.0f, 7.0f)
                lineTo(16.4f, 5.6f)
                lineTo(22.8f, 12.0f)
                lineTo(16.4f, 18.4f)
                lineTo(15.0f, 17.0f)
                lineTo(19.0f, 13.0f)
                moveTo(3.0f, 6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.0f)
                moveTo(13.0f, 16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _forwardburger!!
    }

private var _forwardburger: ImageVector? = null
