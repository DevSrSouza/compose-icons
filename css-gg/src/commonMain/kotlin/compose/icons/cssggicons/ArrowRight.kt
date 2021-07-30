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

public val CssGgIcons.ArrowRight: ImageVector
    get() {
        if (_arrowRight != null) {
            return _arrowRight!!
        }
        _arrowRight = Builder(name = "ArrowRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0378f, 6.3432f)
                lineTo(13.6269f, 7.7607f)
                lineTo(16.8972f, 11.0157f)
                lineTo(3.2921f, 11.0293f)
                lineTo(3.2941f, 13.0293f)
                lineTo(16.8619f, 13.0157f)
                lineTo(13.6467f, 16.2459f)
                lineTo(15.0643f, 17.6568f)
                lineTo(20.7079f, 11.9868f)
                lineTo(15.0378f, 6.3432f)
                close()
            }
        }
        .build()
        return _arrowRight!!
    }

private var _arrowRight: ImageVector? = null
