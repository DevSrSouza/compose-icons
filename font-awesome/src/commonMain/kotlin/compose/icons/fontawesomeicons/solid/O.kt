package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.O: ImageVector
    get() {
        if (_o != null) {
            return _o!!
        }
        _o = Builder(name = "O", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 96.0f)
                curveTo(135.6f, 96.0f, 64.0f, 167.6f, 64.0f, 256.0f)
                reflectiveCurveToRelative(71.6f, 160.0f, 160.0f, 160.0f)
                reflectiveCurveToRelative(160.0f, -71.6f, 160.0f, -160.0f)
                reflectiveCurveToRelative(-71.6f, -160.0f, -160.0f, -160.0f)
                close()
                moveTo(0.0f, 256.0f)
                curveTo(0.0f, 132.3f, 100.3f, 32.0f, 224.0f, 32.0f)
                reflectiveCurveToRelative(224.0f, 100.3f, 224.0f, 224.0f)
                reflectiveCurveToRelative(-100.3f, 224.0f, -224.0f, 224.0f)
                reflectiveCurveTo(0.0f, 379.7f, 0.0f, 256.0f)
                close()
            }
        }
        .build()
        return _o!!
    }

private var _o: ImageVector? = null
