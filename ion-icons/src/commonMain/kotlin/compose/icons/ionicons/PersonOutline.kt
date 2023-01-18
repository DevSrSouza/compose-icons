package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.PersonOutline: ImageVector
    get() {
        if (_personOutline != null) {
            return _personOutline!!
        }
        _personOutline = Builder(name = "PersonOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(344.0f, 144.0f)
                curveToRelative(-3.92f, 52.87f, -44.0f, 96.0f, -88.0f, 96.0f)
                reflectiveCurveToRelative(-84.15f, -43.12f, -88.0f, -96.0f)
                curveToRelative(-4.0f, -55.0f, 35.0f, -96.0f, 88.0f, -96.0f)
                reflectiveCurveTo(348.0f, 90.0f, 344.0f, 144.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 304.0f)
                curveToRelative(-87.0f, 0.0f, -175.3f, 48.0f, -191.64f, 138.6f)
                curveTo(62.39f, 453.52f, 68.57f, 464.0f, 80.0f, 464.0f)
                horizontalLineTo(432.0f)
                curveToRelative(11.44f, 0.0f, 17.62f, -10.48f, 15.65f, -21.4f)
                curveTo(431.3f, 352.0f, 343.0f, 304.0f, 256.0f, 304.0f)
                close()
            }
        }
        .build()
        return _personOutline!!
    }

private var _personOutline: ImageVector? = null
