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

public val SolidGroup.FeatherAlt: ImageVector
    get() {
        if (_featherAlt != null) {
            return _featherAlt!!
        }
        _featherAlt = Builder(name = "FeatherAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(512.0f, 0.0f)
                curveTo(460.22f, 3.56f, 96.44f, 38.2f, 71.01f, 287.61f)
                curveToRelative(-3.09f, 26.66f, -4.84f, 53.44f, -5.99f, 80.24f)
                lineToRelative(178.87f, -178.69f)
                curveToRelative(6.25f, -6.25f, 16.4f, -6.25f, 22.65f, 0.0f)
                reflectiveCurveToRelative(6.25f, 16.38f, 0.0f, 22.63f)
                lineTo(7.04f, 471.03f)
                curveToRelative(-9.38f, 9.37f, -9.38f, 24.57f, 0.0f, 33.94f)
                curveToRelative(9.38f, 9.37f, 24.59f, 9.37f, 33.98f, 0.0f)
                lineToRelative(57.13f, -57.07f)
                curveToRelative(42.09f, -0.14f, 84.15f, -2.53f, 125.96f, -7.36f)
                curveToRelative(53.48f, -5.44f, 97.02f, -26.47f, 132.58f, -56.54f)
                horizontalLineTo(255.74f)
                lineToRelative(146.79f, -48.88f)
                curveToRelative(11.25f, -14.89f, 21.37f, -30.71f, 30.45f, -47.12f)
                horizontalLineToRelative(-81.14f)
                lineToRelative(106.54f, -53.21f)
                curveTo(500.29f, 132.86f, 510.19f, 26.26f, 512.0f, 0.0f)
                close()
            }
        }
        .build()
        return _featherAlt!!
    }

private var _featherAlt: ImageVector? = null
