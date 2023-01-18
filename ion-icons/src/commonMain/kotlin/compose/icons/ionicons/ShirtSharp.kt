package compose.icons.ionicons

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
import compose.icons.IonIcons

public val IonIcons.ShirtSharp: ImageVector
    get() {
        if (_shirtSharp != null) {
            return _shirtSharp!!
        }
        _shirtSharp = Builder(name = "ShirtSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 42.0f)
                curveToRelative(-33.88f, 0.0f, -64.0f, -10.0f, -64.0f, -10.0f)
                lineToRelative(0.0f, 2.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 320.0f, 34.0f)
                lineToRelative(0.0f, -2.0f)
                reflectiveCurveTo(289.88f, 42.0f, 256.0f, 42.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.0f, 44.0f)
                curveToRelative(-5.49f, 47.76f, -46.79f, 85.0f, -96.0f, 85.0f)
                reflectiveCurveToRelative(-90.51f, -37.24f, -96.0f, -85.0f)
                lineTo(16.0f, 94.0f)
                lineTo(34.0f, 208.0f)
                lineToRelative(61.71f, 7.42f)
                curveToRelative(7.08f, 0.9f, 7.1f, 0.9f, 7.1f, 8.19f)
                lineTo(96.0f, 480.0f)
                horizontalLineTo(416.0f)
                lineToRelative(-6.81f, -256.39f)
                curveToRelative(-0.21f, -7.0f, -0.21f, -7.0f, 7.1f, -8.19f)
                lineTo(478.0f, 208.0f)
                lineTo(496.0f, 94.0f)
                close()
            }
        }
        .build()
        return _shirtSharp!!
    }

private var _shirtSharp: ImageVector? = null
