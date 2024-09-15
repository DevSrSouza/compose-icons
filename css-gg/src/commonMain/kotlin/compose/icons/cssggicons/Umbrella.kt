package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Umbrella: ImageVector
    get() {
        if (_umbrella != null) {
            return _umbrella!!
        }
        _umbrella = Builder(name = "Umbrella", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 9.0f)
                curveTo(4.0f, 4.582f, 7.582f, 1.0f, 12.0f, 1.0f)
                curveTo(16.418f, 1.0f, 20.0f, 4.582f, 20.0f, 9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.019f)
                verticalLineTo(20.5f)
                curveTo(13.019f, 21.881f, 11.899f, 23.0f, 10.519f, 23.0f)
                curveTo(9.138f, 23.0f, 8.019f, 21.881f, 8.019f, 20.5f)
                verticalLineTo(17.857f)
                horizontalLineTo(10.019f)
                verticalLineTo(20.5f)
                curveTo(10.019f, 20.776f, 10.243f, 21.0f, 10.519f, 21.0f)
                curveTo(10.795f, 21.0f, 11.019f, 20.776f, 11.019f, 20.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveTo(15.314f, 3.0f, 18.0f, 5.686f, 18.0f, 9.0f)
                horizontalLineTo(6.0f)
                curveTo(6.0f, 5.686f, 8.686f, 3.0f, 12.0f, 3.0f)
                close()
            }
        }
        .build()
        return _umbrella!!
    }

private var _umbrella: ImageVector? = null
