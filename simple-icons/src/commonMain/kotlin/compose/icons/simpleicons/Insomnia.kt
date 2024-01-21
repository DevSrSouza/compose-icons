package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Insomnia: ImageVector
    get() {
        if (_insomnia != null) {
            return _insomnia!!
        }
        _insomnia = Builder(name = "Insomnia", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.1356f, 3.4577f)
                curveToRelative(4.7179f, 0.0f, 8.5424f, 3.8245f, 8.5424f, 8.5424f)
                curveToRelative(0.0f, 4.7178f, -3.8245f, 8.5423f, -8.5424f, 8.5423f)
                curveToRelative(-4.7178f, 0.0f, -8.5423f, -3.8245f, -8.5423f, -8.5423f)
                curveToRelative(0.0f, -1.153f, 0.2284f, -2.2527f, 0.6425f, -3.2562f)
                curveToRelative(0.6046f, 0.8233f, 1.5796f, 1.3579f, 2.6795f, 1.3579f)
                curveToRelative(1.8347f, 0.0f, 3.322f, -1.4874f, 3.322f, -3.3221f)
                curveToRelative(0.0f, -1.0999f, -0.5345f, -2.0749f, -1.3579f, -2.6795f)
                curveToRelative(1.0036f, -0.414f, 2.1032f, -0.6425f, 3.2562f, -0.6425f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(5.3726f, 0.0f, 0.0f, 5.3726f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.3726f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.3726f, 12.0f, -12.0f)
                reflectiveCurveTo(18.6274f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 1.2203f)
                curveToRelative(5.9534f, 0.0f, 10.7797f, 4.8263f, 10.7797f, 10.7797f)
                reflectiveCurveTo(17.9534f, 22.7797f, 12.0f, 22.7797f)
                reflectiveCurveTo(1.2203f, 17.9534f, 1.2203f, 12.0f)
                reflectiveCurveTo(6.0466f, 1.2203f, 12.0f, 1.2203f)
                close()
            }
        }
        .build()
        return _insomnia!!
    }

private var _insomnia: ImageVector? = null
