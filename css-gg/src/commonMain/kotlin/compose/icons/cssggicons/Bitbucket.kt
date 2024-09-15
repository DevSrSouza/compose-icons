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

public val CssGgIcons.Bitbucket: ImageVector
    get() {
        if (_bitbucket != null) {
            return _bitbucket!!
        }
        _bitbucket = Builder(name = "Bitbucket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.583f, 4.635f)
                curveTo(4.031f, 4.635f, 3.668f, 5.075f, 3.772f, 5.617f)
                lineTo(6.228f, 18.383f)
                curveTo(6.332f, 18.925f, 6.865f, 19.365f, 7.417f, 19.365f)
                horizontalLineTo(16.583f)
                curveTo(17.135f, 19.365f, 17.668f, 18.925f, 17.772f, 18.383f)
                lineTo(20.228f, 5.617f)
                curveTo(20.332f, 5.075f, 19.969f, 4.635f, 19.417f, 4.635f)
                horizontalLineTo(4.583f)
                close()
                moveTo(13.545f, 14.365f)
                lineTo(14.455f, 9.635f)
                horizontalLineTo(9.545f)
                lineTo(10.455f, 14.365f)
                horizontalLineTo(13.545f)
                close()
            }
        }
        .build()
        return _bitbucket!!
    }

private var _bitbucket: ImageVector? = null
