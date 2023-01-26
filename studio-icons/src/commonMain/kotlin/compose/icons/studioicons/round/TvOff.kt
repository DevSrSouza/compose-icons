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

public val RoundGroup.TvOff: ImageVector
    get() {
        if (_tvOff != null) {
            return _tvOff!!
        }
        _tvOff = Builder(name = "TvOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 8.0f)
                verticalLineToRelative(9.88f)
                lineToRelative(1.85f, 1.85f)
                curveToRelative(0.1f, -0.22f, 0.15f, -0.47f, 0.15f, -0.73f)
                verticalLineTo(7.0f)
                curveToRelative(0.0f, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-7.59f)
                lineToRelative(2.94f, -2.94f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f)
                reflectiveCurveToRelative(-0.51f, -0.2f, -0.71f, 0.0f)
                lineTo(12.0f, 4.99f)
                lineTo(8.36f, 1.35f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0.0f)
                reflectiveCurveToRelative(-0.2f, 0.51f, 0.0f, 0.71f)
                lineTo(10.59f, 5.0f)
                horizontalLineTo(8.12f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineTo(20.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                close()
                moveTo(3.12f, 2.83f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(0.82f, 0.82f)
                curveTo(1.65f, 5.28f, 1.0f, 6.06f, 1.0f, 7.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(15.46f)
                lineToRelative(1.29f, 1.29f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                curveToRelative(0.36f, -0.36f, 0.37f, -0.92f, 0.07f, -1.31f)
                horizontalLineToRelative(0.03f)
                lineTo(3.12f, 2.83f)
                close()
                moveTo(3.0f, 18.0f)
                verticalLineTo(8.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(0.46f)
                lineToRelative(12.0f, 12.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _tvOff!!
    }

private var _tvOff: ImageVector? = null
