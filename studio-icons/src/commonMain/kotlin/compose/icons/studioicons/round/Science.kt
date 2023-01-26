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

public val RoundGroup.Science: ImageVector
    get() {
        if (_science != null) {
            return _science!!
        }
        _science = Builder(name = "Science", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.54f, 17.73f)
                lineTo(15.0f, 11.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(8.0f)
                curveTo(7.45f, 3.0f, 7.0f, 3.45f, 7.0f, 4.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(6.0f)
                lineToRelative(-5.54f, 6.73f)
                curveTo(3.14f, 18.12f, 3.0f, 18.56f, 3.0f, 19.0f)
                curveToRelative(0.01f, 1.03f, 0.82f, 2.0f, 2.0f, 2.0f)
                horizontalLineTo(19.0f)
                curveToRelative(1.19f, 0.0f, 2.0f, -0.97f, 2.0f, -2.0f)
                curveTo(21.0f, 18.56f, 20.86f, 18.12f, 20.54f, 17.73f)
                close()
            }
        }
        .build()
        return _science!!
    }

private var _science: ImageVector? = null
