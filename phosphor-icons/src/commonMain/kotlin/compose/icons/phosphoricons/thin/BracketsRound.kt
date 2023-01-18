package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.BracketsRound: ImageVector
    get() {
        if (_bracketsRound != null) {
            return _bracketsRound!!
        }
        _bracketsRound = Builder(name = "BracketsRound", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(55.0f, 62.7f)
                curveTo(46.3f, 74.9f, 36.0f, 96.2f, 36.0f, 128.0f)
                reflectiveCurveToRelative(10.3f, 53.1f, 19.0f, 65.3f)
                reflectiveCurveToRelative(19.0f, 19.2f, 19.1f, 19.3f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 1.3f, 5.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 72.0f, 220.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -2.1f, -0.6f)
                curveTo(68.2f, 218.4f, 28.0f, 193.5f, 28.0f, 128.0f)
                reflectiveCurveTo(68.2f, 37.6f, 69.9f, 36.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 4.2f, 6.8f)
                curveTo(74.0f, 43.5f, 64.4f, 49.4f, 55.0f, 62.7f)
                close()
                moveTo(186.1f, 36.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -4.2f, 6.8f)
                curveToRelative(0.1f, 0.1f, 9.7f, 6.0f, 19.1f, 19.3f)
                reflectiveCurveToRelative(19.0f, 33.5f, 19.0f, 65.3f)
                reflectiveCurveToRelative(-10.3f, 53.1f, -19.0f, 65.3f)
                reflectiveCurveToRelative(-19.0f, 19.2f, -19.1f, 19.3f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 184.0f, 220.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 2.1f, -0.6f)
                curveToRelative(1.7f, -1.0f, 41.9f, -25.9f, 41.9f, -91.4f)
                reflectiveCurveTo(187.8f, 37.6f, 186.1f, 36.6f)
                close()
            }
        }
        .build()
        return _bracketsRound!!
    }

private var _bracketsRound: ImageVector? = null
