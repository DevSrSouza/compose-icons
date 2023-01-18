package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.Help: ImageVector
    get() {
        if (_help != null) {
            return _help!!
        }
        _help = Builder(name = "Help", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 40.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(160.0f, 164.0f)
                reflectiveCurveToRelative(1.44f, -33.0f, 33.54f, -59.46f)
                curveTo(212.6f, 88.83f, 235.49f, 84.28f, 256.0f, 84.0f)
                curveToRelative(18.73f, -0.23f, 35.47f, 2.94f, 45.48f, 7.82f)
                curveTo(318.59f, 100.2f, 352.0f, 120.6f, 352.0f, 164.0f)
                curveToRelative(0.0f, 45.67f, -29.18f, 66.37f, -62.35f, 89.18f)
                reflectiveCurveTo(248.0f, 298.36f, 248.0f, 324.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 399.99f)
                moveToRelative(-32.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
            }
        }
        .build()
        return _help!!
    }

private var _help: ImageVector? = null
