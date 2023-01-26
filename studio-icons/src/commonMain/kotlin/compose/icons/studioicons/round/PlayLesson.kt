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

public val RoundGroup.PlayLesson: ImageVector
    get() {
        if (_playLesson != null) {
            return _playLesson!!
        }
        _playLesson = Builder(name = "PlayLesson", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 11.0f)
                curveToRelative(0.34f, 0.0f, 0.67f, 0.03f, 1.0f, 0.08f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 2.0f, 3.0f, 2.9f, 3.0f, 4.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(7.26f)
                curveTo(11.47f, 20.87f, 11.0f, 19.49f, 11.0f, 18.0f)
                curveTo(11.0f, 14.13f, 14.13f, 11.0f, 18.0f, 11.0f)
                close()
                moveTo(7.76f, 10.55f)
                curveTo(7.42f, 10.75f, 7.0f, 10.51f, 7.0f, 10.12f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(6.12f)
                curveToRelative(0.0f, 0.39f, -0.42f, 0.63f, -0.76f, 0.43f)
                lineTo(9.5f, 9.5f)
                lineTo(7.76f, 10.55f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 13.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f)
                reflectiveCurveTo(20.76f, 13.0f, 18.0f, 13.0f)
                close()
                moveTo(16.75f, 19.6f)
                verticalLineToRelative(-3.2f)
                curveToRelative(0.0f, -0.39f, 0.43f, -0.63f, 0.76f, -0.42f)
                lineToRelative(2.56f, 1.6f)
                curveToRelative(0.31f, 0.2f, 0.31f, 0.65f, 0.0f, 0.85f)
                lineToRelative(-2.56f, 1.6f)
                curveTo(17.18f, 20.23f, 16.75f, 19.99f, 16.75f, 19.6f)
                close()
            }
        }
        .build()
        return _playLesson!!
    }

private var _playLesson: ImageVector? = null
