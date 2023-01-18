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

public val IonIcons.PersonCircle: ImageVector
    get() {
        if (_personCircle != null) {
            return _personCircle!!
        }
        _personCircle = Builder(name = "PersonCircle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                curveTo(141.31f, 48.0f, 48.0f, 141.31f, 48.0f, 256.0f)
                reflectiveCurveToRelative(93.31f, 208.0f, 208.0f, 208.0f)
                reflectiveCurveToRelative(208.0f, -93.31f, 208.0f, -208.0f)
                reflectiveCurveTo(370.69f, 48.0f, 256.0f, 48.0f)
                close()
                moveTo(205.78f, 164.82f)
                curveTo(218.45f, 151.39f, 236.28f, 144.0f, 256.0f, 144.0f)
                reflectiveCurveToRelative(37.39f, 7.44f, 50.11f, 20.94f)
                curveTo(319.0f, 178.62f, 325.27f, 197.0f, 323.79f, 216.76f)
                curveTo(320.83f, 256.0f, 290.43f, 288.0f, 256.0f, 288.0f)
                reflectiveCurveToRelative(-64.89f, -32.0f, -67.79f, -71.25f)
                curveTo(186.74f, 196.83f, 193.0f, 178.39f, 205.78f, 164.82f)
                close()
                moveTo(256.0f, 432.0f)
                arcToRelative(175.49f, 175.49f, 0.0f, false, true, -126.0f, -53.22f)
                arcToRelative(122.91f, 122.91f, 0.0f, false, true, 35.14f, -33.44f)
                curveTo(190.63f, 329.0f, 222.89f, 320.0f, 256.0f, 320.0f)
                reflectiveCurveToRelative(65.37f, 9.0f, 90.83f, 25.34f)
                arcTo(122.87f, 122.87f, 0.0f, false, true, 382.0f, 378.78f)
                arcTo(175.45f, 175.45f, 0.0f, false, true, 256.0f, 432.0f)
                close()
            }
        }
        .build()
        return _personCircle!!
    }

private var _personCircle: ImageVector? = null
