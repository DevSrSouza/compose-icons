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

public val RoundGroup.Person4: ImageVector
    get() {
        if (_person4 != null) {
            return _person4!!
        }
        _person4 = Builder(name = "Person4", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.39f, 14.56f)
                curveTo(16.71f, 13.7f, 14.53f, 13.0f, 12.0f, 13.0f)
                curveToRelative(-2.53f, 0.0f, -4.71f, 0.7f, -6.39f, 1.56f)
                curveTo(4.61f, 15.07f, 4.0f, 16.1f, 4.0f, 17.22f)
                lineTo(4.0f, 18.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineToRelative(0.0f, -0.78f)
                curveTo(20.0f, 16.1f, 19.39f, 15.07f, 18.39f, 14.56f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f)
                curveToRelative(0.0f, -1.37f, 0.0f, -3.5f, 0.0f, -3.5f)
                curveTo(16.0f, 3.67f, 15.33f, 3.0f, 14.5f, 3.0f)
                curveToRelative(-0.52f, 0.0f, -0.98f, 0.27f, -1.25f, 0.67f)
                curveTo(12.98f, 3.27f, 12.52f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveToRelative(-0.98f, 0.27f, -1.25f, 0.67f)
                curveTo(10.48f, 3.27f, 10.02f, 3.0f, 9.5f, 3.0f)
                curveTo(8.67f, 3.0f, 8.0f, 3.67f, 8.0f, 4.5f)
                curveToRelative(0.0f, 0.0f, 0.0f, 2.12f, 0.0f, 3.5f)
                curveTo(8.0f, 10.21f, 9.79f, 12.0f, 12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _person4!!
    }

private var _person4: ImageVector? = null
