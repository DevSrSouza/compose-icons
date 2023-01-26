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

public val RoundGroup.Stadium: ImageVector
    get() {
        if (_stadium != null) {
            return _stadium!!
        }
        _stadium = Builder(name = "Stadium", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.11f, 5.45f)
                lineTo(3.72f, 6.64f)
                curveTo(3.39f, 6.8f, 3.0f, 6.56f, 3.0f, 6.19f)
                verticalLineTo(3.81f)
                curveTo(3.0f, 3.44f, 3.39f, 3.2f, 3.72f, 3.36f)
                lineToRelative(2.38f, 1.19f)
                curveTo(6.47f, 4.74f, 6.47f, 5.26f, 6.11f, 5.45f)
                close()
                moveTo(18.0f, 3.81f)
                verticalLineToRelative(2.38f)
                curveToRelative(0.0f, 0.37f, 0.39f, 0.61f, 0.72f, 0.45f)
                lineToRelative(2.38f, -1.19f)
                curveToRelative(0.37f, -0.18f, 0.37f, -0.71f, 0.0f, -0.89f)
                lineToRelative(-2.38f, -1.19f)
                curveTo(18.39f, 3.2f, 18.0f, 3.44f, 18.0f, 3.81f)
                close()
                moveTo(11.0f, 2.81f)
                verticalLineToRelative(2.38f)
                curveToRelative(0.0f, 0.37f, 0.39f, 0.61f, 0.72f, 0.45f)
                lineToRelative(2.38f, -1.19f)
                curveToRelative(0.37f, -0.18f, 0.37f, -0.71f, 0.0f, -0.89f)
                lineToRelative(-2.38f, -1.19f)
                curveTo(11.39f, 2.2f, 11.0f, 2.44f, 11.0f, 2.81f)
                close()
                moveTo(5.0f, 10.04f)
                curveTo(6.38f, 10.53f, 8.77f, 11.0f, 12.0f, 11.0f)
                reflectiveCurveToRelative(5.62f, -0.47f, 7.0f, -0.96f)
                curveTo(19.0f, 9.86f, 16.22f, 9.0f, 12.0f, 9.0f)
                reflectiveCurveTo(5.0f, 9.86f, 5.0f, 10.04f)
                close()
                moveTo(14.0f, 17.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                lineToRelative(0.0f, 3.88f)
                curveTo(4.94f, 21.49f, 2.0f, 20.34f, 2.0f, 19.0f)
                verticalLineToRelative(-9.0f)
                curveToRelative(0.0f, -1.66f, 4.48f, -3.0f, 10.0f, -3.0f)
                reflectiveCurveToRelative(10.0f, 1.34f, 10.0f, 3.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.34f, -2.94f, 2.48f, -7.0f, 2.87f)
                lineTo(15.0f, 18.0f)
                curveTo(15.0f, 17.45f, 14.55f, 17.0f, 14.0f, 17.0f)
                close()
            }
        }
        .build()
        return _stadium!!
    }

private var _stadium: ImageVector? = null
