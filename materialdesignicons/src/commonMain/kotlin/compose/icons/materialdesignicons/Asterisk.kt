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

public val MaterialDesignIcons.Asterisk: ImageVector
    get() {
        if (_asterisk != null) {
            return _asterisk!!
        }
        _asterisk = Builder(name = "Asterisk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 13.0f)
                horizontalLineTo(14.4f)
                lineTo(19.1f, 17.7f)
                lineTo(17.7f, 19.1f)
                lineTo(13.0f, 14.4f)
                verticalLineTo(21.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(14.3f)
                lineTo(6.3f, 19.0f)
                lineTo(4.9f, 17.6f)
                lineTo(9.4f, 13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.6f)
                lineTo(4.9f, 6.3f)
                lineTo(6.3f, 4.9f)
                lineTo(11.0f, 9.6f)
                verticalLineTo(3.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.4f)
                lineTo(17.6f, 4.8f)
                lineTo(19.0f, 6.3f)
                lineTo(14.3f, 11.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _asterisk!!
    }

private var _asterisk: ImageVector? = null
