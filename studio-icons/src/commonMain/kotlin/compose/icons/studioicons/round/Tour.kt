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

public val RoundGroup.Tour: ImageVector
    get() {
        if (_tour != null) {
            return _tour!!
        }
        _tour = Builder(name = "Tour", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.45f, 5.37f)
                curveTo(20.71f, 4.71f, 20.23f, 4.0f, 19.52f, 4.0f)
                horizontalLineTo(13.0f)
                horizontalLineToRelative(-1.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveTo(5.45f, 2.0f, 5.0f, 2.45f, 5.0f, 3.0f)
                verticalLineToRelative(1.0f)
                verticalLineToRelative(10.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(4.0f)
                horizontalLineToRelative(1.0f)
                horizontalLineToRelative(7.52f)
                curveToRelative(0.71f, 0.0f, 1.19f, -0.71f, 0.93f, -1.37f)
                lineTo(19.0f, 9.0f)
                lineTo(20.45f, 5.37f)
                close()
                moveTo(15.0f, 9.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveTo(15.0f, 7.9f, 15.0f, 9.0f)
                close()
            }
        }
        .build()
        return _tour!!
    }

private var _tour: ImageVector? = null
