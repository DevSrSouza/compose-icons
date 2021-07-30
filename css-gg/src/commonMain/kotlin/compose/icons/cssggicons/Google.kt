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
                curveTo(6.0f, 15.3137f, 8.6863f, 18.0f, 12.0f, 18.0f)
                curveTo(14.6124f, 18.0f, 16.8349f, 16.3304f, 17.6586f, 14.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(21.8047f)
                verticalLineTo(14.0f)
                horizontalLineTo(21.8f)
                curveTo(20.8734f, 18.5645f, 16.8379f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(15.445f, 2.0f, 18.4831f, 3.742f, 20.2815f, 6.3932f)
                lineTo(17.0039f, 8.6882f)
                curveTo(15.9296f, 7.0681f, 14.0895f, 6.0f, 12.0f, 6.0f)
                curveTo(8.6863f, 6.0f, 6.0f, 8.6863f, 6.0f, 12.0f)
                close()
            }
        }
        .build()
        return _google!!
    }

private var _google: ImageVector? = null
