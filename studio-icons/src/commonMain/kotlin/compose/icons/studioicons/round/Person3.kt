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

public val RoundGroup.Person3: ImageVector
    get() {
        if (_person3 != null) {
            return _person3!!
        }
        _person3 = Builder(name = "Person3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(10.0f, 12.0f)
                curveToRelative(0.17f, 0.0f, 3.83f, 0.0f, 4.0f, 0.0f)
                curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f)
                curveToRelative(0.0f, -0.73f, -0.27f, -1.4f, -0.71f, -1.92f)
                curveTo(16.42f, 6.75f, 16.5f, 6.38f, 16.5f, 6.0f)
                curveToRelative(0.0f, -1.25f, -0.77f, -2.32f, -1.86f, -2.77f)
                curveTo(14.0f, 2.48f, 13.06f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, 0.48f, -2.64f, 1.23f)
                curveTo(8.27f, 3.68f, 7.5f, 4.75f, 7.5f, 6.0f)
                curveToRelative(0.0f, 0.38f, 0.08f, 0.75f, 0.21f, 1.08f)
                curveTo(7.27f, 7.6f, 7.0f, 8.27f, 7.0f, 9.0f)
                curveTo(7.0f, 10.66f, 8.34f, 12.0f, 10.0f, 12.0f)
                close()
            }
        }
        .build()
        return _person3!!
    }

private var _person3: ImageVector? = null
