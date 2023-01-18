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

public val RegularGroup.TextParagraph: ImageVector
    get() {
        if (_textParagraph != null) {
            return _textParagraph!!
        }
        _textParagraph = Builder(name = "TextParagraph", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 8.0f)
                curveTo(14.1528f, 8.0f, 12.25f, 9.9028f, 12.25f, 12.25f)
                curveTo(12.25f, 14.5972f, 14.1528f, 16.5f, 16.5f, 16.5f)
                horizontalLineTo(17.0f)
                verticalLineTo(21.25f)
                curveTo(17.0f, 21.6642f, 17.3358f, 22.0f, 17.75f, 22.0f)
                curveTo(18.1642f, 22.0f, 18.5f, 21.6642f, 18.5f, 21.25f)
                verticalLineTo(9.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(21.25f)
                curveTo(19.5f, 21.6642f, 19.8358f, 22.0f, 20.25f, 22.0f)
                curveTo(20.6642f, 22.0f, 21.0f, 21.6642f, 21.0f, 21.25f)
                verticalLineTo(9.5f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 9.5f, 22.0f, 9.1642f, 22.0f, 8.75f)
                curveTo(22.0f, 8.3358f, 21.6642f, 8.0f, 21.25f, 8.0f)
                horizontalLineTo(16.5f)
                close()
                moveTo(16.5f, 9.5f)
                horizontalLineTo(17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(16.5f)
                curveTo(14.9812f, 15.0f, 13.75f, 13.7688f, 13.75f, 12.25f)
                curveTo(13.75f, 10.7312f, 14.9812f, 9.5f, 16.5f, 9.5f)
                close()
                moveTo(2.75f, 5.0f)
                curveTo(2.3358f, 5.0f, 2.0f, 5.3358f, 2.0f, 5.75f)
                curveTo(2.0f, 6.1642f, 2.3358f, 6.5f, 2.75f, 6.5f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 6.5f, 22.0f, 6.1642f, 22.0f, 5.75f)
                curveTo(22.0f, 5.3358f, 21.6642f, 5.0f, 21.25f, 5.0f)
                horizontalLineTo(2.75f)
                close()
                moveTo(2.75f, 10.0f)
                curveTo(2.3358f, 10.0f, 2.0f, 10.3358f, 2.0f, 10.75f)
                curveTo(2.0f, 11.1642f, 2.3358f, 11.5f, 2.75f, 11.5f)
                horizontalLineTo(11.3032f)
                curveTo(11.3789f, 10.9704f, 11.5337f, 10.4663f, 11.7552f, 10.0f)
                horizontalLineTo(2.75f)
                close()
                moveTo(12.027f, 15.0f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 15.0f, 2.0f, 15.3358f, 2.0f, 15.75f)
                curveTo(2.0f, 16.1642f, 2.3358f, 16.5f, 2.75f, 16.5f)
                horizontalLineTo(13.4172f)
                curveTo(12.8616f, 16.0963f, 12.3883f, 15.5864f, 12.027f, 15.0f)
                close()
            }
        }
        .build()
        return _textParagraph!!
    }

private var _textParagraph: ImageVector? = null
