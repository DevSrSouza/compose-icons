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

public val RoundGroup.NotAccessible: ImageVector
    get() {
        if (_notAccessible != null) {
            return _notAccessible!!
        }
        _notAccessible = Builder(name = "NotAccessible", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveTo(10.9f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(10.0f, 20.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f)
                curveToRelative(0.0f, -1.31f, 0.84f, -2.41f, 2.0f, -2.83f)
                verticalLineTo(12.1f)
                curveToRelative(-2.28f, 0.46f, -4.0f, 2.48f, -4.0f, 4.9f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                curveToRelative(2.42f, 0.0f, 4.44f, -1.72f, 4.9f, -4.0f)
                horizontalLineToRelative(-2.07f)
                curveTo(12.42f, 19.16f, 11.31f, 20.0f, 10.0f, 20.0f)
                close()
                moveTo(20.49f, 20.49f)
                lineTo(3.51f, 3.51f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(7.9f, 7.9f)
                verticalLineTo(15.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(2.17f)
                lineToRelative(4.9f, 4.9f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                curveTo(20.88f, 21.51f, 20.88f, 20.88f, 20.49f, 20.49f)
                close()
                moveTo(18.16f, 10.93f)
                curveToRelative(-1.25f, -0.21f, -2.43f, -0.88f, -3.23f, -1.76f)
                lineToRelative(-1.29f, -1.43f)
                curveTo(13.4f, 7.5f, 13.2f, 7.38f, 13.01f, 7.28f)
                curveToRelative(-0.36f, -0.19f, -0.72f, -0.3f, -1.2f, -0.26f)
                curveToRelative(-0.49f, 0.04f, -0.91f, 0.27f, -1.23f, 0.61f)
                lineTo(14.0f, 11.05f)
                curveToRelative(1.0f, 0.83f, 2.4f, 1.54f, 3.8f, 1.82f)
                curveTo(18.42f, 13.0f, 19.0f, 12.53f, 19.0f, 11.9f)
                curveTo(19.0f, 11.42f, 18.64f, 11.01f, 18.16f, 10.93f)
                close()
            }
        }
        .build()
        return _notAccessible!!
    }

private var _notAccessible: ImageVector? = null
