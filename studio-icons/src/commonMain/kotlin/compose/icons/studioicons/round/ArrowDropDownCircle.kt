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

public val RoundGroup.ArrowDropDownCircle: ImageVector
    get() {
        if (_arrowDropDownCircle != null) {
            return _arrowDropDownCircle!!
        }
        _arrowDropDownCircle = Builder(name = "ArrowDropDownCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f)
                reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(11.65f, 14.65f)
                lineToRelative(-2.79f, -2.79f)
                curveToRelative(-0.32f, -0.32f, -0.1f, -0.86f, 0.35f, -0.86f)
                horizontalLineToRelative(5.59f)
                curveToRelative(0.45f, 0.0f, 0.67f, 0.54f, 0.35f, 0.85f)
                lineToRelative(-2.79f, 2.79f)
                curveToRelative(-0.2f, 0.2f, -0.52f, 0.2f, -0.71f, 0.01f)
                close()
            }
        }
        .build()
        return _arrowDropDownCircle!!
    }

private var _arrowDropDownCircle: ImageVector? = null
