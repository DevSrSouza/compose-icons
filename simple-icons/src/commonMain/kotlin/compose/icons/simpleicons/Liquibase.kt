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

public val SimpleIcons.Liquibase: ImageVector
    get() {
        if (_liquibase != null) {
            return _liquibase!!
        }
        _liquibase = Builder(name = "Liquibase", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0188f, 0.0f)
                curveTo(6.65f, 0.0f, 2.9656f, 1.9225f, 2.9648f, 3.6456f)
                curveToRelative(0.0f, 1.7231f, 3.7271f, 3.6456f, 9.0557f, 3.6456f)
                curveToRelative(5.3278f, 0.0f, 9.0541f, -1.9225f, 9.0541f, -3.6456f)
                reflectiveCurveTo(17.3475f, 0.0f, 12.0189f, 0.0f)
                close()
                moveTo(21.0745f, 6.4506f)
                curveToRelative(-1.6023f, 1.2827f, -3.4858f, 1.7225f, -7.332f, 2.6445f)
                curveToRelative(-5.3286f, 1.2415f, -10.817f, 2.5238f, -10.817f, 7.5319f)
                verticalLineToRelative(0.5604f)
                curveToRelative(2.003f, -1.7228f, 5.6082f, -2.5234f, 9.1343f, -3.3244f)
                horizontalLineToRelative(0.0016f)
                curveToRelative(4.407f, -1.0015f, 9.0131f, -2.044f, 9.0131f, -4.6073f)
                close()
                moveTo(21.0745f, 12.2998f)
                curveToRelative(-1.9227f, 1.5628f, -5.328f, 2.3243f, -8.6936f, 3.0852f)
                curveToRelative(-4.6474f, 1.0419f, -9.4555f, 2.123f, -9.4555f, 5.0071f)
                curveToRelative(0.0f, 0.6417f, 0.5214f, 1.3229f, 1.4828f, 1.9235f)
                curveToRelative(1.9236f, -1.2818f, 4.928f, -2.0026f, 7.8121f, -2.6838f)
                curveToRelative(4.3672f, -1.0411f, 8.8542f, -2.1228f, 8.8542f, -4.8072f)
                close()
                moveTo(21.0745f, 17.9492f)
                curveToRelative(-1.8833f, 1.6023f, -5.2489f, 2.4046f, -8.4937f, 3.1655f)
                curveToRelative(-2.364f, 0.5621f, -4.7678f, 1.1223f, -6.4506f, 1.9629f)
                curveTo(7.6528f, 23.6396f, 9.6959f, 24.0f, 12.0205f, 24.0f)
                curveToRelative(5.2883f, 0.0f, 9.0541f, -1.8847f, 9.0541f, -3.6472f)
                close()
            }
        }
        .build()
        return _liquibase!!
    }

private var _liquibase: ImageVector? = null
