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

public val RoundGroup.JoinFull: ImageVector
    get() {
        if (_joinFull != null) {
            return _joinFull!!
        }
        _joinFull = Builder(name = "JoinFull", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.68f, 6.8f)
                curveToRelative(-0.39f, -0.35f, -0.98f, -0.35f, -1.37f, 0.0f)
                curveTo(9.35f, 8.56f, 9.0f, 10.84f, 9.0f, 12.0f)
                curveToRelative(0.0f, 1.15f, 0.35f, 3.44f, 2.32f, 5.2f)
                curveToRelative(0.39f, 0.35f, 0.98f, 0.35f, 1.37f, 0.0f)
                curveTo(14.65f, 15.44f, 15.0f, 13.16f, 15.0f, 12.0f)
                curveTo(15.0f, 10.85f, 14.65f, 8.56f, 12.68f, 6.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 12.0f)
                curveToRelative(0.0f, -0.97f, 0.23f, -4.16f, 3.03f, -6.5f)
                curveTo(9.75f, 5.19f, 8.9f, 5.0f, 8.0f, 5.0f)
                curveToRelative(-3.86f, 0.0f, -7.0f, 3.14f, -7.0f, 7.0f)
                reflectiveCurveToRelative(3.14f, 7.0f, 7.0f, 7.0f)
                curveToRelative(0.9f, 0.0f, 1.75f, -0.19f, 2.53f, -0.5f)
                curveTo(7.73f, 16.16f, 7.5f, 12.97f, 7.5f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 5.0f)
                curveToRelative(-0.9f, 0.0f, -1.75f, 0.19f, -2.53f, 0.5f)
                curveToRelative(2.8f, 2.34f, 3.03f, 5.53f, 3.03f, 6.5f)
                curveToRelative(0.0f, 0.97f, -0.23f, 4.16f, -3.03f, 6.5f)
                curveTo(14.25f, 18.81f, 15.1f, 19.0f, 16.0f, 19.0f)
                curveToRelative(3.86f, 0.0f, 7.0f, -3.14f, 7.0f, -7.0f)
                reflectiveCurveTo(19.86f, 5.0f, 16.0f, 5.0f)
                close()
            }
        }
        .build()
        return _joinFull!!
    }

private var _joinFull: ImageVector? = null
