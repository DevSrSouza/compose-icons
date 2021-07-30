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

public val CssGgIcons.ArrowLongRight: ImageVector
    get() {
        if (_arrowLongRight != null) {
            return _arrowLongRight!!
        }
        _arrowLongRight = Builder(name = "ArrowLongRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0677f, 11.9929f)
                lineTo(18.818f, 7.7574f)
                lineTo(17.4061f, 9.174f)
                lineTo(19.2415f, 11.0032f)
                lineTo(0.9325f, 11.0012f)
                lineTo(0.9323f, 13.0012f)
                lineTo(19.2369f, 13.0032f)
                lineTo(17.4155f, 14.8308f)
                lineTo(18.8321f, 16.2426f)
                lineTo(23.0677f, 11.9929f)
                close()
            }
        }
        .build()
        return _arrowLongRight!!
    }

private var _arrowLongRight: ImageVector? = null
