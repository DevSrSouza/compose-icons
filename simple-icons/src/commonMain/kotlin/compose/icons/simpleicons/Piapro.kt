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

public val SimpleIcons.Piapro: ImageVector
    get() {
        if (_piapro != null) {
            return _piapro!!
        }
        _piapro = Builder(name = "Piapro", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.988f, 0.0f)
                curveToRelative(-4.705f, 0.0f, -8.7f, 3.492f, -9.351f, 8.168f)
                curveToRelative(-0.06f, 0.207f, -0.09f, 0.444f, -0.09f, 0.68f)
                verticalLineTo(24.0f)
                lineToRelative(5.21f, -3.403f)
                verticalLineTo(9.44f)
                curveToRelative(0.0f, -2.338f, 1.893f, -4.261f, 4.231f, -4.261f)
                reflectiveCurveToRelative(4.261f, 1.894f, 4.261f, 4.232f)
                curveToRelative(0.0f, 2.337f, -1.894f, 4.261f, -4.231f, 4.261f)
                curveToRelative(-0.77f, 0.0f, -1.54f, -0.207f, -2.22f, -0.621f)
                verticalLineToRelative(5.563f)
                arcTo(9.45f, 9.45f, 0.0f, false, false, 21.191f, 11.6f)
                curveTo(22.405f, 6.51f, 19.268f, 1.45f, 14.207f, 0.266f)
                arcTo(9.48f, 9.48f, 0.0f, false, false, 11.988f, 0.0f)
                close()
            }
        }
        .build()
        return _piapro!!
    }

private var _piapro: ImageVector? = null
