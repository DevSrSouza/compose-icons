package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.CircleSlash24: ImageVector
    get() {
        if (_circleSlash24 != null) {
            return _circleSlash24!!
        }
        _circleSlash24 = Builder(name = "CircleSlash24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 1.0f)
                curveTo(5.925f, 1.0f, 1.0f, 5.925f, 1.0f, 12.0f)
                reflectiveCurveToRelative(4.925f, 11.0f, 11.0f, 11.0f)
                reflectiveCurveToRelative(11.0f, -4.925f, 11.0f, -11.0f)
                reflectiveCurveTo(18.075f, 1.0f, 12.0f, 1.0f)
                close()
                moveTo(2.5f, 12.0f)
                arcTo(9.5f, 9.5f, 0.0f, false, true, 12.0f, 2.5f)
                curveToRelative(2.353f, 0.0f, 4.507f, 0.856f, 6.166f, 2.273f)
                lineTo(4.773f, 18.166f)
                arcTo(9.462f, 9.462f, 0.0f, false, true, 2.5f, 12.0f)
                close()
                moveTo(5.834f, 19.227f)
                arcTo(9.462f, 9.462f, 0.0f, false, false, 12.0f, 21.5f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, 9.5f, -9.5f)
                arcToRelative(9.462f, 9.462f, 0.0f, false, false, -2.273f, -6.166f)
                lineTo(5.834f, 19.227f)
                close()
            }
        }
        .build()
        return _circleSlash24!!
    }

private var _circleSlash24: ImageVector? = null
