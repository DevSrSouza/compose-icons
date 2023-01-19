package compose.icons.lineaicons.basic

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
import compose.icons.lineaicons.BasicGroup

public val BasicGroup.Geolocalize05: ImageVector
    get() {
        if (_geolocalize05 != null) {
            return _geolocalize05!!
        }
        _geolocalize05 = Builder(name = "Geolocalize05", defaultWidth = 64.0.dp, defaultHeight =
                64.0.dp, viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 19.001f)
                moveToRelative(-4.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(45.0f, 21.023f)
                curveTo(44.968f, 13.276f, 39.181f, 7.0f, 32.0f, 7.0f)
                reflectiveCurveToRelative(-13.0f, 6.276f, -13.0f, 14.023f)
                curveTo(19.0f, 31.046f, 31.979f, 47.0f, 31.979f, 47.0f)
                reflectiveCurveTo(45.043f, 31.046f, 45.0f, 21.023f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 37.0f)
                lineToRelative(-9.0f, 0.0f)
                lineToRelative(-11.0f, 20.0f)
                lineToRelative(31.0f, 0.0f)
                lineToRelative(31.0f, 0.0f)
                lineToRelative(-11.0f, -20.0f)
                lineToRelative(-9.0f, 0.0f)
            }
        }
        .build()
        return _geolocalize05!!
    }

private var _geolocalize05: ImageVector? = null
