package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.TextBold: ImageVector
    get() {
        if (_textBold != null) {
            return _textBold!!
        }
        _textBold = Builder(name = "TextBold", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.25f, 5.5f)
                curveTo(9.25f, 4.5335f, 8.4665f, 3.75f, 7.5f, 3.75f)
                curveTo(6.5335f, 3.75f, 5.75f, 4.5335f, 5.75f, 5.5f)
                verticalLineTo(9.8869f)
                curveTo(5.75f, 13.2456f, 8.8601f, 15.7404f, 12.1388f, 15.0119f)
                lineTo(13.5f, 14.7094f)
                verticalLineTo(18.25f)
                curveTo(13.5f, 19.2165f, 14.2835f, 20.0f, 15.25f, 20.0f)
                curveTo(16.2165f, 20.0f, 17.0f, 19.2165f, 17.0f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(17.0f, 4.7835f, 16.2165f, 4.0f, 15.25f, 4.0f)
                curveTo(14.2835f, 4.0f, 13.5f, 4.7835f, 13.5f, 5.75f)
                verticalLineTo(11.1241f)
                lineTo(11.3796f, 11.5952f)
                curveTo(10.2867f, 11.8381f, 9.25f, 11.0065f, 9.25f, 9.8869f)
                verticalLineTo(5.5f)
                close()
            }
        }
        .build()
        return _textBold!!
    }

private var _textBold: ImageVector? = null
