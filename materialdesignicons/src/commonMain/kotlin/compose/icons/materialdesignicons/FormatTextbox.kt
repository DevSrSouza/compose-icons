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

public val MaterialDesignIcons.FormatTextbox: ImageVector
    get() {
        if (_formatTextbox != null) {
            return _formatTextbox!!
        }
        _formatTextbox = Builder(name = "FormatTextbox", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 7.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(21.0f)
                moveTo(18.0f, 4.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(4.0f)
                moveTo(4.0f, 4.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                moveTo(6.0f, 20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.0f)
                moveTo(20.0f, 20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                moveTo(18.0f, 17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(17.0f)
                moveTo(16.0f, 8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _formatTextbox!!
    }

private var _formatTextbox: ImageVector? = null
