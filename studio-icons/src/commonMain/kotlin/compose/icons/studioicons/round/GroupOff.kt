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

public val RoundGroup.GroupOff: ImageVector
    get() {
        if (_groupOff != null) {
            return _groupOff!!
        }
        _groupOff = Builder(name = "GroupOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 8.0f)
                curveToRelative(0.0f, -1.42f, -0.5f, -2.73f, -1.33f, -3.76f)
                curveTo(14.09f, 4.1f, 14.53f, 4.0f, 15.0f, 4.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.79f, 4.0f, -4.0f, 4.0f)
                curveToRelative(-0.06f, 0.0f, -0.12f, 0.0f, -0.18f, 0.0f)
                lineToRelative(-0.77f, -0.77f)
                curveTo(14.65f, 10.29f, 15.0f, 9.18f, 15.0f, 8.0f)
                close()
                moveTo(7.24f, 4.41f)
                curveTo(7.77f, 4.15f, 8.37f, 4.0f, 9.0f, 4.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f)
                curveToRelative(0.0f, 0.63f, -0.15f, 1.23f, -0.41f, 1.76f)
                lineTo(7.24f, 4.41f)
                close()
                moveTo(21.19f, 21.19f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f)
                reflectiveCurveToRelative(-1.02f, 0.39f, -1.41f, 0.0f)
                lineToRelative(-2.99f, -2.99f)
                curveTo(16.6f, 19.85f, 16.32f, 20.0f, 16.0f, 20.0f)
                horizontalLineTo(2.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.66f, 5.33f, -4.0f, 8.0f, -4.0f)
                curveToRelative(0.37f, 0.0f, 0.8f, 0.03f, 1.25f, 0.08f)
                lineTo(9.17f, 12.0f)
                curveTo(9.11f, 12.0f, 9.06f, 12.0f, 9.0f, 12.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f)
                curveToRelative(0.0f, -0.06f, 0.0f, -0.11f, 0.0f, -0.17f)
                lineTo(1.39f, 4.22f)
                curveTo(1.0f, 3.83f, 1.0f, 3.2f, 1.39f, 2.81f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0.0f)
                lineTo(21.19f, 21.19f)
                close()
                moveTo(18.89f, 16.07f)
                curveToRelative(-0.29f, -1.22f, -1.13f, -2.19f, -2.23f, -2.94f)
                curveTo(19.42f, 13.53f, 23.0f, 14.82f, 23.0f, 17.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.32f, -0.15f, 0.6f, -0.38f, 0.79f)
                lineTo(18.89f, 16.07f)
                close()
            }
        }
        .build()
        return _groupOff!!
    }

private var _groupOff: ImageVector? = null
