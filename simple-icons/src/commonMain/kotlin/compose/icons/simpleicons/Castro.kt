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

public val SimpleIcons.Castro: ImageVector
    get() {
        if (_castro != null) {
            return _castro!!
        }
        _castro = Builder(name = "Castro", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.372f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.372f, 12.0f, 12.0f, 12.0f)
                curveToRelative(6.627f, 0.0f, 12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(11.998f, 13.991f)
                arcToRelative(2.052f, 2.052f, 0.0f, true, true, 0.0f, -4.105f)
                arcToRelative(2.052f, 2.052f, 0.0f, false, true, 0.0f, 4.105f)
                close()
                moveTo(16.993f, 18.844f)
                lineToRelative(-2.012f, -2.791f)
                arcToRelative(5.084f, 5.084f, 0.0f, true, false, -5.982f, 0.012f)
                lineToRelative(-2.014f, 2.793f)
                arcTo(8.526f, 8.526f, 0.0f, false, true, 11.979f, 3.42f)
                arcToRelative(8.526f, 8.526f, 0.0f, false, true, 8.526f, 8.526f)
                arcToRelative(8.511f, 8.511f, 0.0f, false, true, -3.512f, 6.898f)
                close()
            }
        }
        .build()
        return _castro!!
    }

private var _castro: ImageVector? = null
