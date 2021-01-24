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

public val SolidGroup.KissBeam: ImageVector
    get() {
        if (_kissBeam != null) {
            return _kissBeam!!
        }
        _kissBeam = Builder(name = "KissBeam", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 8.0f)
                curveTo(111.0f, 8.0f, 0.0f, 119.0f, 0.0f, 256.0f)
                reflectiveCurveToRelative(111.0f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.0f, 248.0f, -248.0f)
                reflectiveCurveTo(385.0f, 8.0f, 248.0f, 8.0f)
                close()
                moveTo(209.0f, 227.9f)
                lineToRelative(-9.5f, -17.0f)
                curveToRelative(-7.7f, -13.7f, -19.2f, -21.6f, -31.5f, -21.6f)
                reflectiveCurveToRelative(-23.8f, 7.9f, -31.5f, 21.6f)
                lineToRelative(-9.5f, 17.0f)
                curveToRelative(-4.2f, 7.4f, -15.6f, 4.0f, -14.9f, -4.5f)
                curveToRelative(3.3f, -42.1f, 32.2f, -71.4f, 56.0f, -71.4f)
                reflectiveCurveToRelative(52.7f, 29.3f, 56.0f, 71.4f)
                curveToRelative(0.5f, 8.5f, -10.9f, 12.0f, -15.1f, 4.5f)
                close()
                moveTo(304.0f, 396.0f)
                curveToRelative(0.0f, 19.2f, -28.7f, 41.5f, -71.5f, 44.0f)
                curveToRelative(-8.5f, 0.8f, -12.1f, -11.8f, -3.6f, -15.4f)
                lineToRelative(17.0f, -7.2f)
                curveToRelative(13.0f, -5.5f, 20.8f, -13.5f, 20.8f, -21.5f)
                reflectiveCurveToRelative(-7.8f, -16.0f, -20.8f, -21.5f)
                lineToRelative(-17.0f, -7.2f)
                curveToRelative(-6.0f, -2.5f, -6.1f, -12.2f, 0.0f, -14.8f)
                lineToRelative(17.0f, -7.2f)
                curveToRelative(13.0f, -5.5f, 20.8f, -13.5f, 20.8f, -21.5f)
                reflectiveCurveToRelative(-7.8f, -16.0f, -20.8f, -21.5f)
                lineToRelative(-17.0f, -7.2f)
                curveToRelative(-8.6f, -3.6f, -4.8f, -16.5f, 3.6f, -15.4f)
                curveToRelative(42.8f, 2.5f, 71.5f, 24.8f, 71.5f, 44.0f)
                curveToRelative(0.0f, 13.0f, -13.4f, 27.3f, -35.2f, 36.0f)
                curveTo(290.6f, 368.7f, 304.0f, 383.0f, 304.0f, 396.0f)
                close()
                moveTo(369.0f, 227.9f)
                lineToRelative(-9.5f, -17.0f)
                curveToRelative(-7.7f, -13.7f, -19.2f, -21.6f, -31.5f, -21.6f)
                reflectiveCurveToRelative(-23.8f, 7.9f, -31.5f, 21.6f)
                lineToRelative(-9.5f, 17.0f)
                curveToRelative(-4.1f, 7.3f, -15.6f, 4.0f, -14.9f, -4.5f)
                curveToRelative(3.3f, -42.1f, 32.2f, -71.4f, 56.0f, -71.4f)
                reflectiveCurveToRelative(52.7f, 29.3f, 56.0f, 71.4f)
                curveToRelative(0.5f, 8.5f, -10.9f, 12.0f, -15.1f, 4.5f)
                close()
            }
        }
        .build()
        return _kissBeam!!
    }

private var _kissBeam: ImageVector? = null
