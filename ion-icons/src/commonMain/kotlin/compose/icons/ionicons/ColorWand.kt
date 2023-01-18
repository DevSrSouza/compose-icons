package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.ColorWand: ImageVector
    get() {
        if (_colorWand != null) {
            return _colorWand!!
        }
        _colorWand = Builder(name = "ColorWand", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 208.0f)
                horizontalLineTo(48.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.2f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                reflectiveCurveTo(104.8f, 208.0f, 96.0f, 208.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(124.1f, 140.1f)
                curveToRelative(-4.2f, 0.0f, -8.3f, -1.7f, -11.3f, -4.7f)
                lineToRelative(-33.9f, -33.9f)
                curveToRelative(-6.2f, -6.2f, -6.2f, -16.4f, 0.0f, -22.6f)
                reflectiveCurveToRelative(16.4f, -6.2f, 22.6f, 0.0f)
                lineToRelative(33.9f, 33.9f)
                curveToRelative(6.3f, 6.2f, 6.3f, 16.4f, 0.0f, 22.6f)
                curveTo(132.4f, 138.4f, 128.4f, 140.1f, 124.1f, 140.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 112.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                verticalLineTo(48.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.2f, 16.0f, 16.0f)
                verticalLineToRelative(48.0f)
                curveTo(208.0f, 104.8f, 200.8f, 112.0f, 192.0f, 112.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(259.9f, 140.1f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                curveToRelative(0.0f, -4.2f, 1.7f, -8.3f, 4.7f, -11.3f)
                lineToRelative(33.9f, -33.9f)
                curveToRelative(6.2f, -6.2f, 16.4f, -6.2f, 22.6f, 0.0f)
                curveToRelative(6.2f, 6.2f, 6.2f, 16.4f, 0.0f, 22.6f)
                lineToRelative(-33.9f, 33.9f)
                curveTo(268.2f, 138.4f, 264.1f, 140.1f, 259.9f, 140.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(90.2f, 309.8f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                curveToRelative(0.0f, -4.2f, 1.7f, -8.3f, 4.7f, -11.3f)
                lineToRelative(33.9f, -33.9f)
                curveToRelative(6.2f, -6.2f, 16.4f, -6.2f, 22.6f, 0.0f)
                reflectiveCurveToRelative(6.2f, 16.4f, 0.0f, 22.6f)
                lineToRelative(-33.9f, 33.9f)
                curveTo(98.5f, 308.1f, 94.4f, 309.8f, 90.2f, 309.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.2f, 167.0f)
                curveToRelative(-18.4f, -18.7f, -48.5f, -19.0f, -67.2f, -0.7f)
                reflectiveCurveToRelative(-19.0f, 48.5f, -0.7f, 67.2f)
                curveToRelative(0.2f, 0.2f, 0.5f, 0.5f, 0.7f, 0.7f)
                lineToRelative(39.5f, 39.5f)
                curveToRelative(3.1f, 3.1f, 8.2f, 3.1f, 11.3f, 0.0f)
                lineToRelative(55.9f, -55.9f)
                curveToRelative(3.1f, -3.1f, 3.1f, -8.2f, 0.0f, -11.3f)
                lineTo(234.2f, 167.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(457.0f, 389.8f)
                lineTo(307.6f, 240.4f)
                curveToRelative(-3.1f, -3.1f, -8.2f, -3.1f, -11.3f, 0.0f)
                lineToRelative(-55.9f, 55.9f)
                curveToRelative(-3.1f, 3.1f, -3.1f, 8.2f, 0.0f, 11.3f)
                lineTo(389.8f, 457.0f)
                curveToRelative(18.4f, 18.7f, 48.5f, 19.0f, 67.2f, 0.7f)
                curveToRelative(18.7f, -18.4f, 19.0f, -48.5f, 0.7f, -67.2f)
                curveTo(457.5f, 390.3f, 457.3f, 390.0f, 457.0f, 389.8f)
                lineTo(457.0f, 389.8f)
                close()
            }
        }
        .build()
        return _colorWand!!
    }

private var _colorWand: ImageVector? = null
