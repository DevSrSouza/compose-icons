package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.Loyalty: ImageVector
    get() {
        if (_loyalty != null) {
            return _loyalty!!
        }
        _loyalty = Builder(name = "Loyalty", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.83f, 2.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(9.83f)
                lineToRelative(10.99f, 11.0f)
                reflectiveCurveToRelative(1.05f, -1.05f, 1.41f, -1.42f)
                lineTo(22.82f, 13.0f)
                lineTo(11.83f, 2.0f)
                close()
                moveTo(5.5f, 7.0f)
                curveTo(4.67f, 7.0f, 4.0f, 6.33f, 4.0f, 5.5f)
                reflectiveCurveTo(4.67f, 4.0f, 5.5f, 4.0f)
                reflectiveCurveTo(7.0f, 4.67f, 7.0f, 5.5f)
                reflectiveCurveTo(6.33f, 7.0f, 5.5f, 7.0f)
                close()
                moveTo(13.0f, 19.54f)
                lineToRelative(-4.27f, -4.27f)
                curveTo(8.28f, 14.81f, 8.0f, 14.19f, 8.0f, 13.5f)
                curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                curveToRelative(0.69f, 0.0f, 1.32f, 0.28f, 1.77f, 0.74f)
                lineToRelative(0.73f, 0.72f)
                lineToRelative(0.73f, -0.73f)
                curveToRelative(0.45f, -0.45f, 1.08f, -0.73f, 1.77f, -0.73f)
                curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f)
                curveToRelative(0.0f, 0.69f, -0.28f, 1.32f, -0.73f, 1.77f)
                lineTo(13.0f, 19.54f)
                close()
            }
        }
        .build()
        return _loyalty!!
    }

private var _loyalty: ImageVector? = null
