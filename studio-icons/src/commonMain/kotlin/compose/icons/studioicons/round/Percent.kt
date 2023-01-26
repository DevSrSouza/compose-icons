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

public val RoundGroup.Percent: ImageVector
    get() {
        if (_percent != null) {
            return _percent!!
        }
        _percent = Builder(name = "Percent", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 4.0f)
                curveTo(5.57f, 4.0f, 4.0f, 5.57f, 4.0f, 7.5f)
                reflectiveCurveTo(5.57f, 11.0f, 7.5f, 11.0f)
                reflectiveCurveTo(11.0f, 9.43f, 11.0f, 7.5f)
                reflectiveCurveTo(9.43f, 4.0f, 7.5f, 4.0f)
                close()
                moveTo(7.5f, 9.0f)
                curveTo(6.67f, 9.0f, 6.0f, 8.33f, 6.0f, 7.5f)
                reflectiveCurveTo(6.67f, 6.0f, 7.5f, 6.0f)
                reflectiveCurveTo(9.0f, 6.67f, 9.0f, 7.5f)
                reflectiveCurveTo(8.33f, 9.0f, 7.5f, 9.0f)
                close()
                moveTo(16.5f, 13.0f)
                curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveTo(18.43f, 13.0f, 16.5f, 13.0f)
                close()
                moveTo(16.5f, 18.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(17.33f, 18.0f, 16.5f, 18.0f)
                close()
                moveTo(19.29f, 4.71f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f)
                lineTo(6.12f, 19.29f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f)
                reflectiveCurveToRelative(-0.39f, -1.02f, 0.0f, -1.41f)
                lineTo(17.88f, 4.71f)
                curveTo(18.27f, 4.32f, 18.9f, 4.32f, 19.29f, 4.71f)
                close()
            }
        }
        .build()
        return _percent!!
    }

private var _percent: ImageVector? = null
