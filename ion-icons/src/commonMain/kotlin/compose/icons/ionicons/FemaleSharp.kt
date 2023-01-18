package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.FemaleSharp: ImageVector
    get() {
        if (_femaleSharp != null) {
            return _femaleSharp!!
        }
        _femaleSharp = Builder(name = "FemaleSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(430.0f, 190.0f)
                curveToRelative(0.0f, -95.94f, -78.06f, -174.0f, -174.0f, -174.0f)
                reflectiveCurveTo(82.0f, 94.06f, 82.0f, 190.0f)
                curveToRelative(0.0f, 88.49f, 66.4f, 161.77f, 152.0f, 172.61f)
                lineTo(234.0f, 394.0f)
                lineTo(176.0f, 394.0f)
                verticalLineToRelative(44.0f)
                horizontalLineToRelative(58.0f)
                verticalLineToRelative(58.0f)
                horizontalLineToRelative(44.0f)
                lineTo(278.0f, 438.0f)
                horizontalLineToRelative(58.0f)
                lineTo(336.0f, 394.0f)
                lineTo(278.0f, 394.0f)
                lineTo(278.0f, 362.61f)
                curveTo(363.6f, 351.77f, 430.0f, 278.49f, 430.0f, 190.0f)
                close()
                moveTo(126.0f, 190.0f)
                curveToRelative(0.0f, -71.68f, 58.32f, -130.0f, 130.0f, -130.0f)
                reflectiveCurveToRelative(130.0f, 58.32f, 130.0f, 130.0f)
                reflectiveCurveTo(327.68f, 320.0f, 256.0f, 320.0f)
                reflectiveCurveTo(126.0f, 261.68f, 126.0f, 190.0f)
                close()
            }
        }
        .build()
        return _femaleSharp!!
    }

private var _femaleSharp: ImageVector? = null
