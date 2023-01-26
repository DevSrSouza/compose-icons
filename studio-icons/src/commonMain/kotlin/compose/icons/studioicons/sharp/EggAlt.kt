package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.EggAlt: ImageVector
    get() {
        if (_eggAlt != null) {
            return _eggAlt!!
        }
        _eggAlt = Builder(name = "EggAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 9.0f)
                curveTo(17.0f, 7.0f, 15.99f, 2.0f, 9.97f, 2.0f)
                curveTo(4.95f, 2.0f, 1.94f, 6.0f, 2.0f, 11.52f)
                curveTo(2.06f, 17.04f, 6.96f, 19.0f, 9.97f, 19.0f)
                curveToRelative(2.01f, 0.0f, 2.01f, 3.0f, 6.02f, 3.0f)
                curveTo(19.0f, 22.0f, 22.0f, 19.0f, 22.0f, 15.02f)
                curveTo(22.0f, 12.0f, 21.01f, 11.0f, 19.0f, 9.0f)
                close()
                moveTo(12.0f, 15.5f)
                curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveTo(13.93f, 15.5f, 12.0f, 15.5f)
                close()
            }
        }
        .build()
        return _eggAlt!!
    }

private var _eggAlt: ImageVector? = null
