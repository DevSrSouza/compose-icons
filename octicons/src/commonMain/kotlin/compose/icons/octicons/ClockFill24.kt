package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.ClockFill24: ImageVector
    get() {
        if (_clockFill24 != null) {
            return _clockFill24!!
        }
        _clockFill24 = Builder(name = "ClockFill24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 12.0f)
                curveTo(1.0f, 5.925f, 5.925f, 1.0f, 12.0f, 1.0f)
                reflectiveCurveToRelative(11.0f, 4.925f, 11.0f, 11.0f)
                reflectiveCurveToRelative(-4.925f, 11.0f, -11.0f, 11.0f)
                reflectiveCurveTo(1.0f, 18.075f, 1.0f, 12.0f)
                close()
                moveTo(12.575f, 7.25f)
                arcToRelative(0.825f, 0.825f, 0.0f, true, false, -1.65f, 0.0f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 0.296f, 0.159f, 0.57f, 0.416f, 0.716f)
                lineToRelative(3.5f, 2.0f)
                arcToRelative(0.825f, 0.825f, 0.0f, false, false, 0.818f, -1.432f)
                lineToRelative(-3.084f, -1.763f)
                close()
            }
        }
        .build()
        return _clockFill24!!
    }

private var _clockFill24: ImageVector? = null
