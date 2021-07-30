package compose.icons.lineaicons.basic

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Bevel
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.lineaicons.BasicGroup

public val BasicGroup.Clubs: ImageVector
    get() {
        if (_clubs != null) {
            return _clubs!!
        }
        _clubs = Builder(name = "Clubs", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(30.0f, 38.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.0f, 0.0f, 19.0f, -7.0f, 19.0f)
                horizontalLineToRelative(9.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 63.0f)
                horizontalLineToRelative(9.0f)
                curveToRelative(-7.0f, 0.0f, -7.0f, -19.0f, -7.0f, -19.0f)
                verticalLineToRelative(-6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Bevel,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(34.0f, 38.0f)
                curveToRelative(0.0f, 7.457f, 8.044f, 12.125f, 15.5f, 12.125f)
                curveToRelative(7.455f, 0.0f, 13.5f, -6.043f, 13.5f, -13.5f)
                reflectiveCurveToRelative(-6.045f, -13.5f, -13.5f, -13.5f)
                curveToRelative(-2.678f, 0.0f, -5.168f, 0.789f, -7.267f, 2.135f)
                curveToRelative(1.995f, -2.345f, 3.204f, -5.378f, 3.204f, -8.697f)
                curveToRelative(0.0f, -7.422f, -6.017f, -13.438f, -13.438f, -13.438f)
                reflectiveCurveTo(18.562f, 9.141f, 18.562f, 16.562f)
                curveToRelative(0.0f, 3.32f, 1.21f, 6.353f, 3.205f, 8.697f)
                curveToRelative(-2.1f, -1.345f, -4.59f, -2.135f, -7.268f, -2.135f)
                curveToRelative(-7.456f, 0.0f, -13.5f, 6.043f, -13.5f, 13.5f)
                reflectiveCurveToRelative(6.044f, 13.5f, 13.5f, 13.5f)
                curveTo(21.955f, 50.125f, 30.0f, 45.457f, 30.0f, 38.0f)
            }
        }
        .build()
        return _clubs!!
    }

private var _clubs: ImageVector? = null
