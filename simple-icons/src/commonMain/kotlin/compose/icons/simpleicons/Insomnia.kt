package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
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
                moveTo(12.0f, 0.0f)
                curveTo(5.417f, 0.0f, 0.0f, 5.417f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.417f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.417f, 12.0f, -12.0f)
                reflectiveCurveTo(18.583f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 2.478f)
                curveToRelative(5.256f, 0.0f, 9.522f, 4.266f, 9.522f, 9.522f)
                reflectiveCurveTo(17.256f, 21.522f, 12.0f, 21.522f)
                reflectiveCurveTo(2.478f, 17.256f, 2.478f, 12.0f)
                curveToRelative(0.0f, -0.885f, 0.12f, -1.741f, 0.347f, -2.554f)
                arcToRelative(4.76f, 4.76f, 0.0f, false, false, 3.925f, 2.066f)
                arcToRelative(4.764f, 4.764f, 0.0f, false, false, 4.762f, -4.762f)
                arcToRelative(4.758f, 4.758f, 0.0f, false, false, -2.067f, -3.925f)
                arcTo(9.526f, 9.526f, 0.0f, false, true, 12.0f, 2.478f)
                close()
            }
        }
        .build()
        return _insomnia!!
    }

private var _insomnia: ImageVector? = null
