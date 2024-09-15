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

public val CssGgIcons.Slack: ImageVector
    get() {
        if (_slack != null) {
            return _slack!!
        }
        _slack = Builder(name = "Slack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.0f, 10.0f)
                curveTo(13.0f, 11.105f, 13.895f, 12.0f, 15.0f, 12.0f)
                curveTo(16.105f, 12.0f, 17.0f, 11.105f, 17.0f, 10.0f)
                verticalLineTo(5.0f)
                curveTo(17.0f, 3.895f, 16.105f, 3.0f, 15.0f, 3.0f)
                curveTo(13.895f, 3.0f, 13.0f, 3.895f, 13.0f, 5.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(5.0f, 8.0f)
                curveTo(3.895f, 8.0f, 3.0f, 8.895f, 3.0f, 10.0f)
                curveTo(3.0f, 11.105f, 3.895f, 12.0f, 5.0f, 12.0f)
                horizontalLineTo(10.0f)
                curveTo(11.105f, 12.0f, 12.0f, 11.105f, 12.0f, 10.0f)
                curveTo(12.0f, 8.895f, 11.105f, 8.0f, 10.0f, 8.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(15.0f, 13.0f)
                curveTo(13.895f, 13.0f, 13.0f, 13.895f, 13.0f, 15.0f)
                curveTo(13.0f, 16.105f, 13.895f, 17.0f, 15.0f, 17.0f)
                horizontalLineTo(20.0f)
                curveTo(21.105f, 17.0f, 22.0f, 16.105f, 22.0f, 15.0f)
                curveTo(22.0f, 13.895f, 21.105f, 13.0f, 20.0f, 13.0f)
                horizontalLineTo(15.0f)
                close()
                moveTo(10.0f, 22.0f)
                curveTo(8.895f, 22.0f, 8.0f, 21.105f, 8.0f, 20.0f)
                lineTo(8.0f, 15.0f)
                curveTo(8.0f, 13.895f, 8.895f, 13.0f, 10.0f, 13.0f)
                curveTo(11.105f, 13.0f, 12.0f, 13.895f, 12.0f, 15.0f)
                verticalLineTo(20.0f)
                curveTo(12.0f, 21.105f, 11.105f, 22.0f, 10.0f, 22.0f)
                close()
                moveTo(8.0f, 5.0f)
                curveTo(8.0f, 3.895f, 8.895f, 3.0f, 10.0f, 3.0f)
                curveTo(11.105f, 3.0f, 12.0f, 3.895f, 12.0f, 5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(10.0f)
                curveTo(8.895f, 7.0f, 8.0f, 6.105f, 8.0f, 5.0f)
                close()
                moveTo(3.0f, 15.0f)
                curveTo(3.0f, 16.105f, 3.895f, 17.0f, 5.0f, 17.0f)
                curveTo(6.105f, 17.0f, 7.0f, 16.105f, 7.0f, 15.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.0f)
                curveTo(3.895f, 13.0f, 3.0f, 13.895f, 3.0f, 15.0f)
                close()
                moveTo(17.0f, 20.0f)
                curveTo(17.0f, 21.105f, 16.105f, 22.0f, 15.0f, 22.0f)
                curveTo(13.895f, 22.0f, 13.0f, 21.105f, 13.0f, 20.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.0f)
                curveTo(16.105f, 18.0f, 17.0f, 18.895f, 17.0f, 20.0f)
                close()
                moveTo(22.0f, 10.0f)
                curveTo(22.0f, 8.895f, 21.105f, 8.0f, 20.0f, 8.0f)
                curveTo(18.895f, 8.0f, 18.0f, 8.895f, 18.0f, 10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(20.0f)
                curveTo(21.105f, 12.0f, 22.0f, 11.105f, 22.0f, 10.0f)
                close()
            }
        }
        .build()
        return _slack!!
    }

private var _slack: ImageVector? = null
