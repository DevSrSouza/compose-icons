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

public val IonIcons.ColorFillSharp: ImageVector
    get() {
        if (_colorFillSharp != null) {
            return _colorFillSharp!!
        }
        _colorFillSharp = Builder(name = "ColorFillSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.0f, 320.0f)
                reflectiveCurveToRelative(-64.0f, 48.0f, -64.0f, 99.84f)
                curveToRelative(0.0f, 33.28f, 28.67f, 60.16f, 64.0f, 60.16f)
                reflectiveCurveToRelative(64.0f, -27.0f, 64.0f, -60.16f)
                curveTo(480.0f, 368.0f, 416.0f, 320.0f, 416.0f, 320.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 32.0f)
                lineTo(68.0f, 108.0f)
                lineToRelative(70.0f, 70.0f)
                lineTo(32.0f, 280.0f)
                lineTo(208.0f, 464.0f)
                lineTo(360.8f, 315.7f)
                lineTo(416.0f, 304.0f)
                close()
                moveTo(168.0f, 148.0f)
                lineTo(128.4f, 107.0f)
                lineTo(144.28f, 91.11f)
                lineTo(184.0f, 132.0f)
                close()
            }
        }
        .build()
        return _colorFillSharp!!
    }

private var _colorFillSharp: ImageVector? = null
