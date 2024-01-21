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

public val SolidGroup.Certificate: ImageVector
    get() {
        if (_certificate != null) {
            return _certificate!!
        }
        _certificate = Builder(name = "Certificate", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(211.0f, 7.3f)
                curveTo(205.0f, 1.0f, 196.0f, -1.4f, 187.6f, 0.8f)
                reflectiveCurveToRelative(-14.9f, 8.9f, -17.1f, 17.3f)
                lineTo(154.7f, 80.6f)
                lineToRelative(-62.0f, -17.5f)
                curveToRelative(-8.4f, -2.4f, -17.4f, 0.0f, -23.5f, 6.1f)
                reflectiveCurveToRelative(-8.5f, 15.1f, -6.1f, 23.5f)
                lineToRelative(17.5f, 62.0f)
                lineTo(18.1f, 170.6f)
                curveToRelative(-8.4f, 2.1f, -15.0f, 8.7f, -17.3f, 17.1f)
                reflectiveCurveTo(1.0f, 205.0f, 7.3f, 211.0f)
                lineToRelative(46.2f, 45.0f)
                lineTo(7.3f, 301.0f)
                curveTo(1.0f, 307.0f, -1.4f, 316.0f, 0.8f, 324.4f)
                reflectiveCurveToRelative(8.9f, 14.9f, 17.3f, 17.1f)
                lineToRelative(62.5f, 15.8f)
                lineToRelative(-17.5f, 62.0f)
                curveToRelative(-2.4f, 8.4f, 0.0f, 17.4f, 6.1f, 23.5f)
                reflectiveCurveToRelative(15.1f, 8.5f, 23.5f, 6.1f)
                lineToRelative(62.0f, -17.5f)
                lineToRelative(15.8f, 62.5f)
                curveToRelative(2.1f, 8.4f, 8.7f, 15.0f, 17.1f, 17.3f)
                reflectiveCurveToRelative(17.3f, -0.2f, 23.4f, -6.4f)
                lineToRelative(45.0f, -46.2f)
                lineToRelative(45.0f, 46.2f)
                curveToRelative(6.1f, 6.2f, 15.0f, 8.7f, 23.4f, 6.4f)
                reflectiveCurveToRelative(14.9f, -8.9f, 17.1f, -17.3f)
                lineToRelative(15.8f, -62.5f)
                lineToRelative(62.0f, 17.5f)
                curveToRelative(8.4f, 2.4f, 17.4f, 0.0f, 23.5f, -6.1f)
                reflectiveCurveToRelative(8.5f, -15.1f, 6.1f, -23.5f)
                lineToRelative(-17.5f, -62.0f)
                lineToRelative(62.5f, -15.8f)
                curveToRelative(8.4f, -2.1f, 15.0f, -8.7f, 17.3f, -17.1f)
                reflectiveCurveToRelative(-0.2f, -17.4f, -6.4f, -23.4f)
                lineToRelative(-46.2f, -45.0f)
                lineToRelative(46.2f, -45.0f)
                curveToRelative(6.2f, -6.1f, 8.7f, -15.0f, 6.4f, -23.4f)
                reflectiveCurveToRelative(-8.9f, -14.9f, -17.3f, -17.1f)
                lineToRelative(-62.5f, -15.8f)
                lineToRelative(17.5f, -62.0f)
                curveToRelative(2.4f, -8.4f, 0.0f, -17.4f, -6.1f, -23.5f)
                reflectiveCurveToRelative(-15.1f, -8.5f, -23.5f, -6.1f)
                lineToRelative(-62.0f, 17.5f)
                lineTo(341.4f, 18.1f)
                curveToRelative(-2.1f, -8.4f, -8.7f, -15.0f, -17.1f, -17.3f)
                reflectiveCurveTo(307.0f, 1.0f, 301.0f, 7.3f)
                lineTo(256.0f, 53.5f)
                lineTo(211.0f, 7.3f)
                close()
            }
        }
        .build()
        return _certificate!!
    }

private var _certificate: ImageVector? = null
