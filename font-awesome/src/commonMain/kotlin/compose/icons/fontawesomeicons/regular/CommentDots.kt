package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.CommentDots: ImageVector
    get() {
        if (_commentDots != null) {
            return _commentDots!!
        }
        _commentDots = Builder(name = "CommentDots", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 208.0f)
                curveTo(126.3f, 208.0f, 112.0f, 222.2f, 112.0f, 239.1f)
                curveTo(112.0f, 257.7f, 126.3f, 272.0f, 144.0f, 272.0f)
                reflectiveCurveToRelative(31.1f, -14.25f, 31.1f, -32.0f)
                reflectiveCurveTo(161.8f, 208.0f, 144.0f, 208.0f)
                close()
                moveTo(256.0f, 207.1f)
                curveToRelative(-17.75f, 0.0f, -31.1f, 14.25f, -31.1f, 32.0f)
                reflectiveCurveToRelative(14.25f, 31.1f, 31.1f, 31.1f)
                reflectiveCurveToRelative(31.1f, -14.25f, 31.1f, -31.1f)
                reflectiveCurveTo(273.8f, 207.1f, 256.0f, 207.1f)
                close()
                moveTo(368.0f, 208.0f)
                curveToRelative(-17.75f, 0.0f, -31.1f, 14.25f, -31.1f, 32.0f)
                reflectiveCurveToRelative(14.25f, 32.0f, 31.1f, 32.0f)
                curveToRelative(17.75f, 0.0f, 31.99f, -14.25f, 31.99f, -32.0f)
                curveTo(400.0f, 222.2f, 385.8f, 208.0f, 368.0f, 208.0f)
                close()
                moveTo(256.0f, 31.1f)
                curveToRelative(-141.4f, 0.0f, -255.1f, 93.12f, -255.1f, 208.0f)
                curveToRelative(0.0f, 47.62f, 19.91f, 91.25f, 52.91f, 126.3f)
                curveToRelative(-14.87f, 39.5f, -45.87f, 72.88f, -46.37f, 73.25f)
                curveToRelative(-6.624f, 7.0f, -8.373f, 17.25f, -4.624f, 26.0f)
                curveTo(5.818f, 474.2f, 14.38f, 480.0f, 24.0f, 480.0f)
                curveToRelative(61.49f, 0.0f, 109.1f, -25.75f, 139.1f, -46.25f)
                curveToRelative(28.87f, 9.0f, 60.16f, 14.25f, 92.9f, 14.25f)
                curveToRelative(141.4f, 0.0f, 255.1f, -93.13f, 255.1f, -207.1f)
                reflectiveCurveTo(397.4f, 31.1f, 256.0f, 31.1f)
                close()
                moveTo(256.0f, 400.0f)
                curveToRelative(-26.75f, 0.0f, -53.12f, -4.125f, -78.36f, -12.12f)
                lineToRelative(-22.75f, -7.125f)
                lineTo(135.4f, 394.5f)
                curveToRelative(-14.25f, 10.12f, -33.87f, 21.38f, -57.49f, 29.0f)
                curveToRelative(7.374f, -12.12f, 14.37f, -25.75f, 19.87f, -40.25f)
                lineToRelative(10.62f, -28.0f)
                lineToRelative(-20.62f, -21.87f)
                curveTo(69.81f, 314.1f, 48.06f, 282.2f, 48.06f, 240.0f)
                curveToRelative(0.0f, -88.25f, 93.24f, -160.0f, 207.1f, -160.0f)
                reflectiveCurveToRelative(207.1f, 71.75f, 207.1f, 160.0f)
                reflectiveCurveTo(370.8f, 400.0f, 256.0f, 400.0f)
                close()
            }
        }
        .build()
        return _commentDots!!
    }

private var _commentDots: ImageVector? = null
