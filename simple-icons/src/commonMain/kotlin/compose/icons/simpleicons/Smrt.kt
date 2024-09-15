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

public val SimpleIcons.Smrt: ImageVector
    get() {
        if (_smrt != null) {
            return _smrt!!
        }
        _smrt = Builder(name = "Smrt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.654f, 13.753f)
                curveToRelative(0.81f, 4.437f, 4.677f, 7.811f, 9.339f, 7.811f)
                curveToRelative(4.677f, 0.0f, 8.617f, -4.088f, 9.397f, -8.542f)
                horizontalLineToRelative(-2.563f)
                curveToRelative(-0.75f, 3.06f, -3.551f, 6.038f, -6.833f, 6.038f)
                curveToRelative(-2.369f, 0.0f, -4.453f, -1.198f, -5.727f, -2.999f)
                horizontalLineToRelative(5.292f)
                curveToRelative(0.435f, 0.0f, 0.854f, -0.23f, 1.214f, -0.703f)
                lineToRelative(1.289f, -1.858f)
                curveToRelative(0.121f, -0.23f, 0.345f, -0.36f, 0.614f, -0.36f)
                horizontalLineToRelative(7.54f)
                lineTo(24.0f, 10.832f)
                lineTo(13.612f, 10.832f)
                curveToRelative(-0.254f, 0.0f, -0.48f, 0.144f, -0.615f, 0.328f)
                lineToRelative(-1.709f, 2.293f)
                curveToRelative(-0.104f, 0.173f, -0.285f, 0.288f, -0.495f, 0.288f)
                close()
                moveTo(21.332f, 10.247f)
                curveToRelative(-0.81f, -4.44f, -4.647f, -7.81f, -9.324f, -7.81f)
                curveToRelative(-4.677f, 0.0f, -8.499f, 3.976f, -9.279f, 8.43f)
                horizontalLineToRelative(2.563f)
                curveToRelative(0.75f, -3.06f, 3.432f, -5.926f, 6.73f, -5.926f)
                curveToRelative(2.369f, 0.0f, 4.452f, 1.199f, 5.726f, 2.996f)
                horizontalLineToRelative(-5.306f)
                curveToRelative(-0.435f, 0.0f, -0.854f, 0.23f, -1.214f, 0.706f)
                lineToRelative(-1.289f, 1.858f)
                curveToRelative(-0.121f, 0.23f, -0.345f, 0.36f, -0.615f, 0.36f)
                horizontalLineToRelative(-7.54f)
                lineTo(0.0f, 13.137f)
                horizontalLineToRelative(10.388f)
                curveToRelative(0.254f, 0.0f, 0.48f, -0.144f, 0.615f, -0.328f)
                lineToRelative(1.709f, -2.311f)
                curveToRelative(0.104f, -0.173f, 0.285f, -0.288f, 0.495f, -0.288f)
                close()
            }
        }
        .build()
        return _smrt!!
    }

private var _smrt: ImageVector? = null
