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

public val SimpleIcons.Steinberg: ImageVector
    get() {
        if (_steinberg != null) {
            return _steinberg!!
        }
        _steinberg = Builder(name = "Steinberg", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.4807f, 12.6291f)
                curveToRelative(0.6422f, -0.371f, 0.6422f, -1.0092f, 0.0f, -1.3792f)
                lineTo(14.711f, 8.4954f)
                curveToRelative(-0.6422f, -0.371f, -1.1952f, -0.052f, -1.1952f, 0.6901f)
                verticalLineToRelative(5.508f)
                curveToRelative(0.0f, 0.741f, 0.553f, 1.0601f, 1.1952f, 0.69f)
                close()
                moveTo(11.9995f, 2.7255f)
                curveToRelative(5.1219f, 0.0f, 9.2745f, 4.1526f, 9.2745f, 9.2745f)
                reflectiveCurveToRelative(-4.1526f, 9.2745f, -9.2745f, 9.2745f)
                reflectiveCurveTo(2.726f, 17.122f, 2.726f, 12.0f)
                reflectiveCurveToRelative(4.1516f, -9.2745f, 9.2735f, -9.2745f)
                moveToRelative(0.0f, -2.7255f)
                curveTo(5.3834f, 0.0f, 5.0E-4f, 5.3829f, 5.0E-4f, 12.0f)
                reflectiveCurveToRelative(5.3829f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(11.999f, -5.3829f, 11.999f, -12.0f)
                reflectiveCurveToRelative(-5.3829f, -12.0f, -12.0f, -12.0f)
                close()
            }
        }
        .build()
        return _steinberg!!
    }

private var _steinberg: ImageVector? = null
