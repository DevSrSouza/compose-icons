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

public val SolidGroup.HillAvalanche: ImageVector
    get() {
        if (_hillAvalanche != null) {
            return _hillAvalanche!!
        }
        _hillAvalanche = Builder(name = "HillAvalanche", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(439.7f, 401.9f)
                curveToRelative(34.2f, 23.1f, 81.1f, 19.5f, 111.4f, -10.8f)
                curveToRelative(34.4f, -34.4f, 34.4f, -90.1f, 0.0f, -124.4f)
                curveToRelative(-27.8f, -27.8f, -69.5f, -33.1f, -102.6f, -16.0f)
                curveToRelative(-11.8f, 6.1f, -16.4f, 20.6f, -10.3f, 32.3f)
                reflectiveCurveToRelative(20.6f, 16.4f, 32.3f, 10.3f)
                curveToRelative(15.1f, -7.8f, 34.0f, -5.3f, 46.6f, 7.3f)
                curveToRelative(15.6f, 15.6f, 15.6f, 40.9f, 0.0f, 56.6f)
                reflectiveCurveToRelative(-40.9f, 15.6f, -56.6f, 0.0f)
                lineToRelative(-81.7f, -81.7f)
                curveTo(401.2f, 261.3f, 416.0f, 236.4f, 416.0f, 208.0f)
                curveToRelative(0.0f, -33.9f, -21.1f, -62.9f, -50.9f, -74.5f)
                curveToRelative(1.9f, -6.8f, 2.9f, -14.0f, 2.9f, -21.5f)
                curveToRelative(0.0f, -44.2f, -35.8f, -80.0f, -80.0f, -80.0f)
                curveToRelative(-27.3f, 0.0f, -51.5f, 13.7f, -65.9f, 34.6f)
                curveTo(216.3f, 46.6f, 197.9f, 32.0f, 176.0f, 32.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                curveToRelative(0.0f, 4.0f, 0.5f, 7.9f, 1.4f, 11.6f)
                lineTo(439.7f, 401.9f)
                close()
                moveTo(480.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 64.0f, 0.0f)
                close()
                moveTo(480.0f, 192.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, 64.0f)
                close()
                moveTo(68.3f, 87.0f)
                curveTo(43.1f, 61.8f, 0.0f, 79.7f, 0.0f, 115.3f)
                lineTo(0.0f, 432.0f)
                curveToRelative(0.0f, 44.2f, 35.8f, 80.0f, 80.0f, 80.0f)
                lineTo(396.7f, 512.0f)
                curveToRelative(35.6f, 0.0f, 53.5f, -43.1f, 28.3f, -68.3f)
                lineTo(68.3f, 87.0f)
                close()
            }
        }
        .build()
        return _hillAvalanche!!
    }

private var _hillAvalanche: ImageVector? = null
