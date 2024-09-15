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

public val CssGgIcons.Oculus: ImageVector
    get() {
        if (_oculus != null) {
            return _oculus!!
        }
        _oculus = Builder(name = "Oculus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.0f, 10.0f)
                horizontalLineTo(8.0f)
                curveTo(6.895f, 10.0f, 6.0f, 10.895f, 6.0f, 12.0f)
                curveTo(6.0f, 13.105f, 6.895f, 14.0f, 8.0f, 14.0f)
                horizontalLineTo(16.0f)
                curveTo(17.105f, 14.0f, 18.0f, 13.105f, 18.0f, 12.0f)
                curveTo(18.0f, 10.895f, 17.105f, 10.0f, 16.0f, 10.0f)
                close()
                moveTo(8.0f, 6.0f)
                curveTo(4.686f, 6.0f, 2.0f, 8.686f, 2.0f, 12.0f)
                curveTo(2.0f, 15.314f, 4.686f, 18.0f, 8.0f, 18.0f)
                horizontalLineTo(16.0f)
                curveTo(19.314f, 18.0f, 22.0f, 15.314f, 22.0f, 12.0f)
                curveTo(22.0f, 8.686f, 19.314f, 6.0f, 16.0f, 6.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _oculus!!
    }

private var _oculus: ImageVector? = null
