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

public val RoundGroup.SelfImprovement: ImageVector
    get() {
        if (_selfImprovement != null) {
            return _selfImprovement!!
        }
        _selfImprovement = Builder(name = "SelfImprovement", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 14.94f)
                lineTo(21.0f, 14.94f)
                curveToRelative(0.0f, -0.5f, -0.36f, -0.93f, -0.85f, -0.98f)
                curveToRelative(-1.88f, -0.21f, -3.49f, -1.13f, -4.75f, -2.63f)
                lineToRelative(-1.34f, -1.6f)
                curveTo(13.68f, 9.26f, 13.12f, 9.0f, 12.53f, 9.0f)
                horizontalLineToRelative(-1.05f)
                curveToRelative(-0.59f, 0.0f, -1.15f, 0.26f, -1.53f, 0.72f)
                lineToRelative(-1.34f, 1.6f)
                curveToRelative(-1.25f, 1.5f, -2.87f, 2.42f, -4.75f, 2.63f)
                curveTo(3.36f, 14.01f, 3.0f, 14.44f, 3.0f, 14.94f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.6f, 0.53f, 1.07f, 1.13f, 1.0f)
                curveToRelative(2.3f, -0.27f, 4.32f, -1.39f, 5.87f, -3.19f)
                verticalLineTo(15.0f)
                lineToRelative(-3.76f, 1.5f)
                curveToRelative(-0.65f, 0.26f, -1.16f, 0.83f, -1.23f, 1.53f)
                curveTo(4.91f, 19.1f, 5.74f, 20.0f, 6.79f, 20.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveTo(14.78f, 18.0f, 14.5f, 18.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineTo(20.0f)
                lineToRelative(7.1f, 0.0f)
                curveToRelative(0.85f, 0.0f, 1.65f, -0.54f, 1.85f, -1.37f)
                curveToRelative(0.21f, -0.89f, -0.27f, -1.76f, -1.08f, -2.08f)
                lineTo(14.0f, 15.0f)
                verticalLineToRelative(-2.25f)
                curveToRelative(1.56f, 1.8f, 3.57f, 2.91f, 5.87f, 3.19f)
                curveTo(20.47f, 16.0f, 21.0f, 15.54f, 21.0f, 14.94f)
                close()
            }
        }
        .build()
        return _selfImprovement!!
    }

private var _selfImprovement: ImageVector? = null
