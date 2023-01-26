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

public val RoundGroup.Functions: ImageVector
    get() {
        if (_functions != null) {
            return _functions!!
        }
        _functions = Builder(name = "Functions", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 4.0f)
                horizontalLineTo(7.56f)
                curveTo(6.7f, 4.0f, 6.0f, 4.7f, 6.0f, 5.56f)
                curveToRelative(0.0f, 0.28f, 0.12f, 0.55f, 0.32f, 0.74f)
                lineTo(12.5f, 12.0f)
                lineToRelative(-6.18f, 5.7f)
                curveToRelative(-0.2f, 0.19f, -0.32f, 0.46f, -0.32f, 0.74f)
                curveTo(6.0f, 19.3f, 6.7f, 20.0f, 7.56f, 20.0f)
                horizontalLineToRelative(8.94f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineTo(11.0f)
                lineToRelative(3.59f, -3.59f)
                curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f)
                lineTo(11.0f, 7.0f)
                horizontalLineToRelative(5.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveTo(17.33f, 4.0f, 16.5f, 4.0f)
                close()
            }
        }
        .build()
        return _functions!!
    }

private var _functions: ImageVector? = null
