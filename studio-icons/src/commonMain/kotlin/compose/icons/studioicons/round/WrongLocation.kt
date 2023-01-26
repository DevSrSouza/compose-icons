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

public val RoundGroup.WrongLocation: ImageVector
    get() {
        if (_wrongLocation != null) {
            return _wrongLocation!!
        }
        _wrongLocation = Builder(name = "WrongLocation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.42f, 4.5f)
                lineToRelative(1.38f, -1.38f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                lineTo(19.0f, 3.08f)
                lineToRelative(-1.38f, -1.38f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                reflectiveCurveToRelative(-0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(1.38f, 1.38f)
                lineToRelative(-1.38f, 1.38f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineTo(19.0f, 5.92f)
                lineToRelative(1.38f, 1.38f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineTo(20.42f, 4.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.67f, 8.0f)
                lineTo(19.0f, 7.33f)
                lineToRelative(-0.59f, 0.59f)
                curveToRelative(-0.7f, 0.7f, -1.84f, 0.88f, -2.65f, 0.3f)
                curveToRelative(-1.03f, -0.74f, -1.12f, -2.19f, -0.26f, -3.05f)
                lineToRelative(0.67f, -0.67f)
                lineTo(15.5f, 3.83f)
                curveToRelative(-0.36f, -0.36f, -0.54f, -0.81f, -0.57f, -1.28f)
                curveTo(14.01f, 2.19f, 13.02f, 2.0f, 12.0f, 2.0f)
                curveToRelative(-4.2f, 0.0f, -8.0f, 3.22f, -8.0f, 8.2f)
                curveToRelative(0.0f, 3.18f, 2.45f, 6.92f, 7.34f, 11.23f)
                curveToRelative(0.38f, 0.33f, 0.95f, 0.33f, 1.33f, 0.0f)
                curveTo(17.55f, 17.12f, 20.0f, 13.38f, 20.0f, 10.2f)
                curveToRelative(0.0f, -0.76f, -0.1f, -1.47f, -0.26f, -2.14f)
                curveTo(19.72f, 8.04f, 19.69f, 8.02f, 19.67f, 8.0f)
                close()
                moveTo(12.0f, 12.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveTo(13.1f, 12.0f, 12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _wrongLocation!!
    }

private var _wrongLocation: ImageVector? = null
