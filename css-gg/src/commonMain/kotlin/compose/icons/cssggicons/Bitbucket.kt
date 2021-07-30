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
                moveTo(4.5831f, 4.6351f)
                curveTo(4.0308f, 4.6351f, 3.6677f, 5.0747f, 3.772f, 5.6171f)
                lineTo(6.228f, 18.383f)
                curveTo(6.3324f, 18.9253f, 6.8647f, 19.3649f, 7.417f, 19.3649f)
                horizontalLineTo(16.583f)
                curveTo(17.1353f, 19.3649f, 17.6676f, 18.9253f, 17.7719f, 18.383f)
                lineTo(20.2279f, 5.6171f)
                curveTo(20.3323f, 5.0747f, 19.9691f, 4.6351f, 19.4168f, 4.6351f)
                horizontalLineTo(4.5831f)
                close()
                moveTo(13.5449f, 14.3649f)
                lineTo(14.4549f, 9.6351f)
                horizontalLineTo(9.545f)
                lineTo(10.455f, 14.3649f)
                horizontalLineTo(13.5449f)
                close()
            }
        }
        .build()
        return _bitbucket!!
    }

private var _bitbucket: ImageVector? = null
