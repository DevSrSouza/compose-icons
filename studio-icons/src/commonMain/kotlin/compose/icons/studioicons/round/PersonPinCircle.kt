package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.PersonPinCircle: ImageVector
    get() {
        if (_personPinCircle != null) {
            return _personPinCircle!!
        }
        _personPinCircle = Builder(name = "PersonPinCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(-4.2f, 0.0f, -8.0f, 3.22f, -8.0f, 8.2f)
                curveToRelative(0.0f, 3.18f, 2.45f, 6.92f, 7.34f, 11.22f)
                curveToRelative(0.36f, 0.32f, 0.97f, 0.32f, 1.33f, 0.0f)
                curveTo(17.55f, 17.12f, 20.0f, 13.38f, 20.0f, 10.2f)
                curveTo(20.0f, 5.22f, 16.2f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(7.69f, 12.49f)
                curveTo(8.88f, 11.56f, 10.37f, 11.0f, 12.0f, 11.0f)
                reflectiveCurveToRelative(3.12f, 0.56f, 4.31f, 1.49f)
                curveTo(15.45f, 13.98f, 13.85f, 15.0f, 12.0f, 15.0f)
                reflectiveCurveTo(8.55f, 13.98f, 7.69f, 12.49f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                curveTo(10.0f, 6.9f, 10.9f, 6.0f, 12.0f, 6.0f)
                close()
            }
        }
        .build()
        return _personPinCircle!!
    }

private var _personPinCircle: ImageVector? = null
