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

public val SolidGroup.TriangleExclamation: ImageVector
    get() {
        if (_triangleExclamation != null) {
            return _triangleExclamation!!
        }
        _triangleExclamation = Builder(name = "TriangleExclamation", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 32.0f)
                curveToRelative(14.2f, 0.0f, 27.3f, 7.5f, 34.5f, 19.8f)
                lineToRelative(216.0f, 368.0f)
                curveToRelative(7.3f, 12.4f, 7.3f, 27.7f, 0.2f, 40.1f)
                reflectiveCurveTo(486.3f, 480.0f, 472.0f, 480.0f)
                lineTo(40.0f, 480.0f)
                curveToRelative(-14.3f, 0.0f, -27.6f, -7.7f, -34.7f, -20.1f)
                reflectiveCurveToRelative(-7.0f, -27.8f, 0.2f, -40.1f)
                lineToRelative(216.0f, -368.0f)
                curveTo(228.7f, 39.5f, 241.8f, 32.0f, 256.0f, 32.0f)
                close()
                moveTo(256.0f, 160.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                lineTo(232.0f, 296.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                lineTo(280.0f, 184.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                close()
                moveTo(288.0f, 384.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 64.0f, 0.0f)
                close()
            }
        }
        .build()
        return _triangleExclamation!!
    }

private var _triangleExclamation: ImageVector? = null
