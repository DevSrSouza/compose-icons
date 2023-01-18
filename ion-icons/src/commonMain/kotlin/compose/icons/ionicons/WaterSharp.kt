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

public val IonIcons.WaterSharp: ImageVector
    get() {
        if (_waterSharp != null) {
            return _waterSharp!!
        }
        _waterSharp = Builder(name = "WaterSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 43.91f)
                reflectiveCurveToRelative(-144.0f, 158.3f, -144.0f, 270.3f)
                curveToRelative(0.0f, 88.36f, 55.64f, 144.0f, 144.0f, 144.0f)
                reflectiveCurveToRelative(144.0f, -55.64f, 144.0f, -144.0f)
                curveTo(400.0f, 202.21f, 256.0f, 43.91f, 256.0f, 43.91f)
                close()
                moveTo(272.0f, 406.21f)
                verticalLineToRelative(-24.0f)
                arcToRelative(60.07f, 60.07f, 0.0f, false, false, 60.0f, -60.0f)
                horizontalLineToRelative(24.0f)
                arcTo(84.09f, 84.09f, 0.0f, false, true, 272.0f, 406.21f)
                close()
            }
        }
        .build()
        return _waterSharp!!
    }

private var _waterSharp: ImageVector? = null
