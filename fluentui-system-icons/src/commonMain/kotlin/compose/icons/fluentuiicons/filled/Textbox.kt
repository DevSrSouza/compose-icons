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

public val FilledGroup.Textbox: ImageVector
    get() {
        if (_textbox != null) {
            return _textbox!!
        }
        _textbox = Builder(name = "Textbox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 5.75f)
                curveTo(21.0f, 4.2312f, 19.7688f, 3.0f, 18.25f, 3.0f)
                horizontalLineTo(5.75f)
                curveTo(4.2312f, 3.0f, 3.0f, 4.2312f, 3.0f, 5.75f)
                verticalLineTo(18.25f)
                curveTo(3.0f, 19.7688f, 4.2312f, 21.0f, 5.75f, 21.0f)
                horizontalLineTo(18.25f)
                curveTo(19.7688f, 21.0f, 21.0f, 19.7688f, 21.0f, 18.25f)
                verticalLineTo(5.75f)
                close()
                moveTo(14.25f, 11.5f)
                curveTo(14.6642f, 11.5f, 15.0f, 11.8358f, 15.0f, 12.25f)
                curveTo(15.0f, 12.6297f, 14.7178f, 12.9435f, 14.3518f, 12.9932f)
                lineTo(14.25f, 13.0f)
                horizontalLineTo(6.75f)
                curveTo(6.3358f, 13.0f, 6.0f, 12.6642f, 6.0f, 12.25f)
                curveTo(6.0f, 11.8703f, 6.2821f, 11.5565f, 6.6482f, 11.5068f)
                lineTo(6.75f, 11.5f)
                horizontalLineTo(14.25f)
                close()
                moveTo(6.75f, 15.5f)
                horizontalLineTo(17.25f)
                curveTo(17.6642f, 15.5f, 18.0f, 15.8358f, 18.0f, 16.25f)
                curveTo(18.0f, 16.6297f, 17.7178f, 16.9435f, 17.3518f, 16.9932f)
                lineTo(17.25f, 17.0f)
                horizontalLineTo(6.75f)
                curveTo(6.3358f, 17.0f, 6.0f, 16.6642f, 6.0f, 16.25f)
                curveTo(6.0f, 15.8703f, 6.2821f, 15.5565f, 6.6482f, 15.5068f)
                lineTo(6.75f, 15.5f)
                close()
                moveTo(17.25f, 7.5f)
                curveTo(17.6642f, 7.5f, 18.0f, 7.8358f, 18.0f, 8.25f)
                curveTo(18.0f, 8.6297f, 17.7178f, 8.9435f, 17.3518f, 8.9931f)
                lineTo(17.25f, 9.0f)
                horizontalLineTo(6.75f)
                curveTo(6.3358f, 9.0f, 6.0f, 8.6642f, 6.0f, 8.25f)
                curveTo(6.0f, 7.8703f, 6.2821f, 7.5565f, 6.6482f, 7.5068f)
                lineTo(6.75f, 7.5f)
                horizontalLineTo(17.25f)
                close()
            }
        }
        .build()
        return _textbox!!
    }

private var _textbox: ImageVector? = null
