package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Sitepoint: ImageVector
    get() {
        if (_sitepoint != null) {
            return _sitepoint!!
        }
        _sitepoint = Builder(name = "Sitepoint", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.471f, 10.533f)
                lineToRelative(1.771f, 1.688f)
                lineToRelative(5.598f, 5.141f)
                lineToRelative(2.4f, -2.291f)
                curveToRelative(0.21f, -0.297f, 0.194f, -0.705f, -0.046f, -0.985f)
                lineTo(9.99f, 12.184f)
                lineToRelative(0.01f, -0.005f)
                lineToRelative(-2.371f, -2.266f)
                curveToRelative(-0.279f, -0.314f, -0.27f, -0.78f, 0.021f, -1.079f)
                lineToRelative(6.39f, -6.076f)
                lineTo(11.146f, 0.0f)
                lineTo(2.475f, 8.238f)
                curveToRelative(-0.664f, 0.633f, -0.664f, 1.66f, 0.0f, 2.295f)
                horizontalLineToRelative(-0.004f)
                close()
                moveTo(21.527f, 13.47f)
                lineToRelative(-1.77f, -1.691f)
                lineToRelative(-5.595f, -5.142f)
                lineToRelative(-2.411f, 2.291f)
                curveToRelative(-0.221f, 0.3f, -0.207f, 0.705f, 0.045f, 0.985f)
                lineToRelative(2.205f, 1.891f)
                horizontalLineToRelative(-0.006f)
                lineToRelative(2.369f, 2.265f)
                curveToRelative(0.27f, 0.314f, 0.27f, 0.766f, -0.029f, 1.064f)
                lineToRelative(-6.391f, 6.075f)
                lineTo(12.855f, 24.0f)
                lineToRelative(8.67f, -8.238f)
                curveToRelative(0.664f, -0.633f, 0.666f, -1.659f, 0.0f, -2.295f)
                lineToRelative(0.002f, 0.003f)
                close()
            }
        }
        .build()
        return _sitepoint!!
    }

private var _sitepoint: ImageVector? = null
