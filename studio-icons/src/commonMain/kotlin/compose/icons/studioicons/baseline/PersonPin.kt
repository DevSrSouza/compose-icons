package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.PersonPin: ImageVector
    get() {
        if (_personPin != null) {
            return _personPin!!
        }
        _personPin = Builder(name = "PersonPin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f)
                curveToRelative(0.0f, 4.17f, 2.84f, 7.67f, 6.69f, 8.69f)
                lineTo(12.0f, 22.0f)
                lineToRelative(2.31f, -2.31f)
                curveTo(18.16f, 18.67f, 21.0f, 15.17f, 21.0f, 11.0f)
                curveToRelative(0.0f, -4.97f, -4.03f, -9.0f, -9.0f, -9.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.34f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.34f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(12.0f, 18.3f)
                curveToRelative(-2.5f, 0.0f, -4.71f, -1.28f, -6.0f, -3.22f)
                curveToRelative(0.03f, -1.99f, 4.0f, -3.08f, 6.0f, -3.08f)
                curveToRelative(1.99f, 0.0f, 5.97f, 1.09f, 6.0f, 3.08f)
                curveToRelative(-1.29f, 1.94f, -3.5f, 3.22f, -6.0f, 3.22f)
                close()
            }
        }
        .build()
        return _personPin!!
    }

private var _personPin: ImageVector? = null
