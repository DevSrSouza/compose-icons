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

public val RegularGroup.TextBold: ImageVector
    get() {
        if (_textBold != null) {
            return _textBold!!
        }
        _textBold = Builder(name = "TextBold", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 5.5f)
                curveTo(9.0f, 4.6716f, 8.3284f, 4.0f, 7.5f, 4.0f)
                curveTo(6.6716f, 4.0f, 6.0f, 4.6716f, 6.0f, 5.5f)
                verticalLineTo(9.8869f)
                curveTo(6.0f, 13.0856f, 8.962f, 15.4617f, 12.0846f, 14.7679f)
                lineTo(14.0f, 14.3422f)
                verticalLineTo(18.5f)
                curveTo(14.0f, 19.3284f, 14.6716f, 20.0f, 15.5f, 20.0f)
                curveTo(16.3284f, 20.0f, 17.0f, 19.3284f, 17.0f, 18.5f)
                lineTo(17.0f, 5.5f)
                curveTo(17.0f, 4.6716f, 16.3284f, 4.0f, 15.5f, 4.0f)
                curveTo(14.6716f, 4.0f, 14.0f, 4.6716f, 14.0f, 5.5f)
                verticalLineTo(11.2691f)
                lineTo(11.4338f, 11.8393f)
                curveTo(10.1848f, 12.1168f, 9.0f, 11.1664f, 9.0f, 9.8869f)
                verticalLineTo(5.5f)
                close()
            }
        }
        .build()
        return _textBold!!
    }

private var _textBold: ImageVector? = null
