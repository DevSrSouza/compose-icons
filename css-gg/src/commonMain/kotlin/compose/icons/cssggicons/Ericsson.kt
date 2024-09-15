package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Ericsson: ImageVector
    get() {
        if (_ericsson != null) {
            return _ericsson!!
        }
        _ericsson = Builder(name = "Ericsson", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.717f, 5.723f)
                curveTo(6.716f, 6.19f, 6.283f, 7.38f, 6.75f, 8.381f)
                curveTo(7.216f, 9.382f, 8.406f, 9.815f, 9.407f, 9.348f)
                lineTo(20.283f, 4.277f)
                curveTo(21.284f, 3.81f, 21.717f, 2.62f, 21.25f, 1.619f)
                curveTo(20.784f, 0.618f, 19.594f, 0.185f, 18.593f, 0.652f)
                lineTo(7.717f, 5.723f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.75f, 15.381f)
                curveTo(4.283f, 14.38f, 4.716f, 13.19f, 5.717f, 12.723f)
                lineTo(16.593f, 7.652f)
                curveTo(17.594f, 7.185f, 18.784f, 7.618f, 19.25f, 8.619f)
                curveTo(19.717f, 9.62f, 19.284f, 10.81f, 18.283f, 11.277f)
                lineTo(7.407f, 16.348f)
                curveTo(6.406f, 16.815f, 5.216f, 16.382f, 4.75f, 15.381f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.75f, 22.381f)
                curveTo(2.283f, 21.38f, 2.716f, 20.19f, 3.717f, 19.723f)
                lineTo(14.593f, 14.652f)
                curveTo(15.594f, 14.185f, 16.784f, 14.618f, 17.25f, 15.619f)
                curveTo(17.717f, 16.62f, 17.284f, 17.81f, 16.283f, 18.277f)
                lineTo(5.407f, 23.348f)
                curveTo(4.406f, 23.815f, 3.216f, 23.382f, 2.75f, 22.381f)
                close()
            }
        }
        .build()
        return _ericsson!!
    }

private var _ericsson: ImageVector? = null
