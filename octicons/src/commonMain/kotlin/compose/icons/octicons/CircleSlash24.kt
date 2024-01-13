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

public val Octicons.CircleSlash24: ImageVector
    get() {
        if (_circleSlash24 != null) {
            return _circleSlash24!!
        }
        _circleSlash24 = Builder(name = "CircleSlash24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                curveToRelative(6.075f, 0.0f, 11.0f, 4.925f, 11.0f, 11.0f)
                reflectiveCurveToRelative(-4.925f, 11.0f, -11.0f, 11.0f)
                reflectiveCurveTo(1.0f, 18.075f, 1.0f, 12.0f)
                reflectiveCurveTo(5.925f, 1.0f, 12.0f, 1.0f)
                close()
                moveTo(5.834f, 19.227f)
                arcTo(9.464f, 9.464f, 0.0f, false, false, 12.0f, 21.5f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, 9.5f, -9.5f)
                arcToRelative(9.464f, 9.464f, 0.0f, false, false, -2.273f, -6.166f)
                close()
                moveTo(2.5f, 12.0f)
                arcToRelative(9.464f, 9.464f, 0.0f, false, false, 2.273f, 6.166f)
                lineTo(18.166f, 4.773f)
                arcTo(9.463f, 9.463f, 0.0f, false, false, 12.0f, 2.5f)
                arcTo(9.5f, 9.5f, 0.0f, false, false, 2.5f, 12.0f)
                close()
            }
        }
        .build()
        return _circleSlash24!!
    }

private var _circleSlash24: ImageVector? = null
