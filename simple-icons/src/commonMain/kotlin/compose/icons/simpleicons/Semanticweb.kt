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

public val SimpleIcons.Semanticweb: ImageVector
    get() {
        if (_semanticweb != null) {
            return _semanticweb!!
        }
        _semanticweb = Builder(name = "Semanticweb", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.602f, 0.0f)
                reflectiveCurveToRelative(-1.524f, 5.809f, -8.516f, 2.658f)
                curveToRelative(-0.776f, -0.35f, -0.954f, -0.444f, -0.982f, -0.469f)
                lineTo(2.074f, 6.301f)
                lineToRelative(10.043f, 4.896f)
                reflectiveCurveToRelative(0.776f, -0.326f, 2.026f, -0.933f)
                curveTo(20.273f, 7.287f, 21.602f, 0.0f, 21.602f, 0.0f)
                close()
                moveTo(1.59f, 8.486f)
                verticalLineToRelative(10.448f)
                lineTo(10.947f, 24.0f)
                lineTo(10.947f, 13.242f)
                lineTo(1.59f, 8.486f)
                close()
                moveTo(22.41f, 8.486f)
                lineToRelative(-9.357f, 4.756f)
                lineTo(13.053f, 24.0f)
                lineToRelative(9.357f, -5.066f)
                lineTo(22.41f, 8.486f)
                close()
            }
        }
        .build()
        return _semanticweb!!
    }

private var _semanticweb: ImageVector? = null
