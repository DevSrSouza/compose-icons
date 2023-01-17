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

public val SolidGroup.Neuter: ImageVector
    get() {
        if (_neuter != null) {
            return _neuter!!
        }
        _neuter = Builder(name = "Neuter", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(304.0f, 176.0f)
                curveToRelative(0.0f, 61.9f, -50.1f, 112.0f, -112.0f, 112.0f)
                reflectiveCurveToRelative(-112.0f, -50.1f, -112.0f, -112.0f)
                reflectiveCurveToRelative(50.1f, -112.0f, 112.0f, -112.0f)
                reflectiveCurveToRelative(112.0f, 50.1f, 112.0f, 112.0f)
                close()
                moveTo(224.0f, 349.1f)
                curveToRelative(81.9f, -15.0f, 144.0f, -86.8f, 144.0f, -173.1f)
                curveTo(368.0f, 78.8f, 289.2f, 0.0f, 192.0f, 0.0f)
                reflectiveCurveTo(16.0f, 78.8f, 16.0f, 176.0f)
                curveToRelative(0.0f, 86.3f, 62.1f, 158.1f, 144.0f, 173.1f)
                verticalLineTo(480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineTo(349.1f)
                close()
            }
        }
        .build()
        return _neuter!!
    }

private var _neuter: ImageVector? = null
