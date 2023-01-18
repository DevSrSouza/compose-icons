package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.TextUnderline: ImageVector
    get() {
        if (_textUnderline != null) {
            return _textUnderline!!
        }
        _textUnderline = Builder(name = "TextUnderline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 4.75f)
                curveTo(17.0f, 4.3358f, 16.6642f, 4.0f, 16.25f, 4.0f)
                horizontalLineTo(7.75f)
                curveTo(7.3358f, 4.0f, 7.0f, 4.3358f, 7.0f, 4.75f)
                lineTo(7.0f, 15.75f)
                curveTo(7.0f, 16.1642f, 7.3358f, 16.5f, 7.75f, 16.5f)
                curveTo(8.1642f, 16.5f, 8.5f, 16.1642f, 8.5f, 15.75f)
                lineTo(8.5f, 5.5f)
                lineTo(15.5f, 5.5f)
                verticalLineTo(15.75f)
                curveTo(15.5f, 16.1642f, 15.8358f, 16.5f, 16.25f, 16.5f)
                curveTo(16.6642f, 16.5f, 17.0f, 16.1642f, 17.0f, 15.75f)
                verticalLineTo(4.75f)
                close()
                moveTo(17.3f, 18.5f)
                horizontalLineTo(6.6f)
                curveTo(6.3f, 18.5f, 6.0f, 18.8f, 6.0f, 19.2f)
                curveTo(6.0f, 19.7f, 6.4f, 20.0f, 6.8f, 20.0f)
                horizontalLineTo(17.5f)
                curveTo(17.8f, 20.0f, 18.1f, 19.7f, 18.1f, 19.3f)
                curveTo(18.1f, 18.8f, 17.7f, 18.5f, 17.3f, 18.5f)
                close()
            }
        }
        .build()
        return _textUnderline!!
    }

private var _textUnderline: ImageVector? = null
