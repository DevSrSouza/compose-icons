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

public val IonIcons.PersonCircleSharp: ImageVector
    get() {
        if (_personCircleSharp != null) {
            return _personCircleSharp!!
        }
        _personCircleSharp = Builder(name = "PersonCircleSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                curveTo(141.31f, 48.0f, 48.0f, 141.31f, 48.0f, 256.0f)
                reflectiveCurveToRelative(93.31f, 208.0f, 208.0f, 208.0f)
                reflectiveCurveToRelative(208.0f, -93.31f, 208.0f, -208.0f)
                reflectiveCurveTo(370.69f, 48.0f, 256.0f, 48.0f)
                close()
                moveTo(258.0f, 144.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, true, -72.0f, 72.0f)
                arcTo(72.0f, 72.0f, 0.0f, false, true, 258.0f, 144.0f)
                close()
                moveTo(256.0f, 432.0f)
                arcToRelative(175.55f, 175.55f, 0.0f, false, true, -129.18f, -56.6f)
                curveTo(135.66f, 329.62f, 215.06f, 320.0f, 256.0f, 320.0f)
                reflectiveCurveToRelative(120.34f, 9.62f, 129.18f, 55.39f)
                arcTo(175.52f, 175.52f, 0.0f, false, true, 256.0f, 432.0f)
                close()
            }
        }
        .build()
        return _personCircleSharp!!
    }

private var _personCircleSharp: ImageVector? = null
