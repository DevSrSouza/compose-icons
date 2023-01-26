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

public val RoundGroup.Toll: ImageVector
    get() {
        if (_toll != null) {
            return _toll!!
        }
        _toll = Builder(name = "Toll", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 4.0f)
                curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f)
                reflectiveCurveToRelative(3.58f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f)
                reflectiveCurveToRelative(-3.58f, -8.0f, -8.0f, -8.0f)
                close()
                moveTo(15.0f, 18.0f)
                curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.69f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.69f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.69f, 6.0f, -6.0f, 6.0f)
                close()
                moveTo(3.0f, 12.0f)
                curveToRelative(0.0f, -2.39f, 1.4f, -4.46f, 3.43f, -5.42f)
                curveToRelative(0.34f, -0.16f, 0.57f, -0.47f, 0.57f, -0.84f)
                verticalLineToRelative(-0.19f)
                curveToRelative(0.0f, -0.68f, -0.71f, -1.11f, -1.32f, -0.82f)
                curveTo(2.92f, 5.99f, 1.0f, 8.77f, 1.0f, 12.0f)
                reflectiveCurveToRelative(1.92f, 6.01f, 4.68f, 7.27f)
                curveToRelative(0.61f, 0.28f, 1.32f, -0.14f, 1.32f, -0.82f)
                verticalLineToRelative(-0.18f)
                curveToRelative(0.0f, -0.37f, -0.23f, -0.69f, -0.57f, -0.85f)
                curveTo(4.4f, 16.46f, 3.0f, 14.39f, 3.0f, 12.0f)
                close()
            }
        }
        .build()
        return _toll!!
    }

private var _toll: ImageVector? = null
