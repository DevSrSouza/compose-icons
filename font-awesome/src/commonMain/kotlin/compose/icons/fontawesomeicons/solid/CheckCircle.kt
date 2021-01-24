package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
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
                curveToRelative(0.0f, 136.967f, -111.033f, 248.0f, -248.0f, 248.0f)
                reflectiveCurveTo(8.0f, 392.967f, 8.0f, 256.0f)
                reflectiveCurveTo(119.033f, 8.0f, 256.0f, 8.0f)
                reflectiveCurveToRelative(248.0f, 111.033f, 248.0f, 248.0f)
                close()
                moveTo(227.314f, 387.314f)
                lineToRelative(184.0f, -184.0f)
                curveToRelative(6.248f, -6.248f, 6.248f, -16.379f, 0.0f, -22.627f)
                lineToRelative(-22.627f, -22.627f)
                curveToRelative(-6.248f, -6.249f, -16.379f, -6.249f, -22.628f, 0.0f)
                lineTo(216.0f, 308.118f)
                lineToRelative(-70.059f, -70.059f)
                curveToRelative(-6.248f, -6.248f, -16.379f, -6.248f, -22.628f, 0.0f)
                lineToRelative(-22.627f, 22.627f)
                curveToRelative(-6.248f, 6.248f, -6.248f, 16.379f, 0.0f, 22.627f)
                lineToRelative(104.0f, 104.0f)
                curveToRelative(6.249f, 6.249f, 16.379f, 6.249f, 22.628f, 0.001f)
                close()
            }
        }
        .build()
        return _checkCircle!!
    }

private var _checkCircle: ImageVector? = null
