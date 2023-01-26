package compose.icons.studioicons.round

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
import compose.icons.studioicons.RoundGroup

public val RoundGroup.GolfCourse: ImageVector
    get() {
        if (_golfCourse != null) {
            return _golfCourse!!
        }
        _golfCourse = Builder(name = "GolfCourse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 19.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 18.03f)
                verticalLineTo(8.98f)
                lineToRelative(4.22f, -2.15f)
                curveToRelative(0.73f, -0.37f, 0.73f, -1.43f, -0.01f, -1.79f)
                lineToRelative(-4.76f, -2.33f)
                curveTo(9.78f, 2.38f, 9.0f, 2.86f, 9.0f, 3.6f)
                verticalLineTo(19.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-0.73f)
                curveToRelative(-1.79f, 0.35f, -3.0f, 0.99f, -3.0f, 1.73f)
                curveToRelative(0.0f, 1.1f, 2.69f, 2.0f, 6.0f, 2.0f)
                reflectiveCurveToRelative(6.0f, -0.9f, 6.0f, -2.0f)
                curveToRelative(0.0f, -0.99f, -2.16f, -1.81f, -5.0f, -1.97f)
                close()
            }
        }
        .build()
        return _golfCourse!!
    }

private var _golfCourse: ImageVector? = null
