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

public val SolidGroup.Capsules: ImageVector
    get() {
        if (_capsules != null) {
            return _capsules!!
        }
        _capsules = Builder(name = "Capsules", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 144.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                reflectiveCurveToRelative(48.0f, 21.5f, 48.0f, 48.0f)
                lineTo(160.0f, 256.0f)
                lineTo(64.0f, 256.0f)
                lineTo(64.0f, 144.0f)
                close()
                moveTo(0.0f, 144.0f)
                lineTo(0.0f, 368.0f)
                curveToRelative(0.0f, 61.9f, 50.1f, 112.0f, 112.0f, 112.0f)
                reflectiveCurveToRelative(112.0f, -50.1f, 112.0f, -112.0f)
                lineTo(224.0f, 189.6f)
                curveToRelative(1.8f, 19.1f, 8.2f, 38.0f, 19.8f, 54.8f)
                lineTo(372.3f, 431.7f)
                curveToRelative(35.5f, 51.7f, 105.3f, 64.3f, 156.0f, 28.1f)
                reflectiveCurveToRelative(63.0f, -107.5f, 27.5f, -159.2f)
                lineTo(427.3f, 113.3f)
                curveTo(391.8f, 61.5f, 321.9f, 49.0f, 271.3f, 85.2f)
                curveToRelative(-28.0f, 20.0f, -44.3f, 50.8f, -47.3f, 83.0f)
                lineTo(224.0f, 144.0f)
                curveToRelative(0.0f, -61.9f, -50.1f, -112.0f, -112.0f, -112.0f)
                reflectiveCurveTo(0.0f, 82.1f, 0.0f, 144.0f)
                close()
                moveTo(296.6f, 208.2f)
                curveToRelative(-16.0f, -23.3f, -10.0f, -55.3f, 11.9f, -71.0f)
                curveToRelative(21.2f, -15.1f, 50.5f, -10.3f, 66.0f, 12.2f)
                lineToRelative(67.0f, 97.6f)
                lineTo(361.6f, 303.0f)
                lineToRelative(-65.0f, -94.8f)
                close()
                moveTo(491.0f, 407.7f)
                curveToRelative(-0.8f, 0.6f, -1.6f, 1.1f, -2.4f, 1.6f)
                lineToRelative(4.0f, -2.8f)
                curveToRelative(-0.5f, 0.4f, -1.0f, 0.8f, -1.6f, 1.2f)
                close()
            }
        }
        .build()
        return _capsules!!
    }

private var _capsules: ImageVector? = null
