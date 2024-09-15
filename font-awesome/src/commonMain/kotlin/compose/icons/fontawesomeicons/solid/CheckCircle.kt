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

public val SolidGroup.CheckCircle: ImageVector
    get() {
        if (_checkCircle != null) {
            return _checkCircle!!
        }
        _checkCircle = Builder(name = "CheckCircle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(504.0f, 256.0f)
                curveToRelative(0.0f, 136.97f, -111.03f, 248.0f, -248.0f, 248.0f)
                reflectiveCurveTo(8.0f, 392.97f, 8.0f, 256.0f)
                reflectiveCurveTo(119.03f, 8.0f, 256.0f, 8.0f)
                reflectiveCurveToRelative(248.0f, 111.03f, 248.0f, 248.0f)
                close()
                moveTo(227.31f, 387.31f)
                lineToRelative(184.0f, -184.0f)
                curveToRelative(6.25f, -6.25f, 6.25f, -16.38f, 0.0f, -22.63f)
                lineToRelative(-22.63f, -22.63f)
                curveToRelative(-6.25f, -6.25f, -16.38f, -6.25f, -22.63f, 0.0f)
                lineTo(216.0f, 308.12f)
                lineToRelative(-70.06f, -70.06f)
                curveToRelative(-6.25f, -6.25f, -16.38f, -6.25f, -22.63f, 0.0f)
                lineToRelative(-22.63f, 22.63f)
                curveToRelative(-6.25f, 6.25f, -6.25f, 16.38f, 0.0f, 22.63f)
                lineToRelative(104.0f, 104.0f)
                curveToRelative(6.25f, 6.25f, 16.38f, 6.25f, 22.63f, 0.0f)
                close()
            }
        }
        .build()
        return _checkCircle!!
    }

private var _checkCircle: ImageVector? = null
