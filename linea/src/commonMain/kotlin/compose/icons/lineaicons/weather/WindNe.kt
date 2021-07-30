package compose.icons.lineaicons.weather

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
import compose.icons.lineaicons.WeatherGroup

public val WeatherGroup.WindNe: ImageVector
    get() {
        if (_windNe != null) {
            return _windNe!!
        }
        _windNe = Builder(name = "WindNe", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 32.0f)
                moveToRelative(-31.0f, 0.0f)
                arcToRelative(31.0f, 31.0f, 0.0f, true, true, 62.0f, 0.0f)
                arcToRelative(31.0f, 31.0f, 0.0f, true, true, -62.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 32.0f)
                moveToRelative(-4.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(40.485f, 40.484f)
                curveTo(45.172f, 35.798f, 49.0f, 15.0f, 49.0f, 15.0f)
                reflectiveCurveToRelative(-20.799f, 3.827f, -25.485f, 8.514f)
                curveToRelative(-4.687f, 4.688f, -4.686f, 12.285f, 0.0f, 16.971f)
                curveTo(28.2f, 45.171f, 35.799f, 45.172f, 40.485f, 40.484f)
                close()
            }
        }
        .build()
        return _windNe!!
    }

private var _windNe: ImageVector? = null
