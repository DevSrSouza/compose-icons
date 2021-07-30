package compose.icons.lineaicons.weather

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
import compose.icons.lineaicons.WeatherGroup

public val WeatherGroup.MoonsetHalf: ImageVector
    get() {
        if (_moonsetHalf != null) {
            return _moonsetHalf!!
        }
        _moonsetHalf = Builder(name = "MoonsetHalf", defaultWidth = 64.0.dp, defaultHeight =
                64.0.dp, viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF010101)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 47.0f)
                lineTo(64.0f, 47.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF010101)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Bevel,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(25.0f, 53.0f)
                lineToRelative(7.0f, 7.0f)
                lineToRelative(7.0f, -7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF010101)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(48.158f, 47.0f)
                curveTo(49.96f, 44.096f, 51.0f, 40.669f, 51.0f, 37.0f)
                curveToRelative(0.0f, -10.493f, -8.506f, -19.0f, -19.0f, -19.0f)
                curveToRelative(-0.059f, 0.0f, -0.115f, 0.008f, -0.175f, 0.009f)
                curveTo(32.574f, 19.688f, 33.0f, 21.543f, 33.0f, 23.5f)
                curveTo(33.0f, 30.956f, 26.956f, 37.0f, 19.5f, 37.0f)
                curveToRelative(-2.323f, 0.0f, -4.51f, -0.588f, -6.418f, -1.621f)
                curveTo(13.037f, 35.914f, 13.0f, 36.453f, 13.0f, 37.0f)
                curveToRelative(0.0f, 3.668f, 1.039f, 7.094f, 2.841f, 9.998f)
            }
        }
        .build()
        return _moonsetHalf!!
    }

private var _moonsetHalf: ImageVector? = null
