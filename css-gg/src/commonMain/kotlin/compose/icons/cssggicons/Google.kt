package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Google: ImageVector
    get() {
        if (_google != null) {
            return _google!!
        }
        _google = Builder(name = "Google", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 12.0f)
                curveTo(6.0f, 15.314f, 8.686f, 18.0f, 12.0f, 18.0f)
                curveTo(14.612f, 18.0f, 16.835f, 16.33f, 17.659f, 14.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(21.805f)
                verticalLineTo(14.0f)
                horizontalLineTo(21.8f)
                curveTo(20.873f, 18.565f, 16.838f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(15.445f, 2.0f, 18.483f, 3.742f, 20.281f, 6.393f)
                lineTo(17.004f, 8.688f)
                curveTo(15.93f, 7.068f, 14.09f, 6.0f, 12.0f, 6.0f)
                curveTo(8.686f, 6.0f, 6.0f, 8.686f, 6.0f, 12.0f)
                close()
            }
        }
        .build()
        return _google!!
    }

private var _google: ImageVector? = null
