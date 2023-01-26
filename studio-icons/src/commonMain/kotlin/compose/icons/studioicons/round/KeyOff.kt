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

public val RoundGroup.KeyOff: ImageVector
    get() {
        if (_keyOff != null) {
            return _keyOff!!
        }
        _keyOff = Builder(name = "KeyOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.83f, 10.0f)
                lineToRelative(4.09f, 4.09f)
                lineTo(17.0f, 14.0f)
                lineToRelative(1.29f, 1.29f)
                curveToRelative(0.39f, 0.39f, 1.03f, 0.39f, 1.42f, 0.0f)
                lineToRelative(2.59f, -2.61f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, -0.01f, -1.42f)
                lineToRelative(-0.99f, -0.97f)
                curveTo(21.1f, 10.1f, 20.85f, 10.0f, 20.59f, 10.0f)
                horizontalLineTo(12.83f)
                close()
                moveTo(19.07f, 21.9f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                reflectiveCurveToRelative(0.39f, -1.02f, 0.0f, -1.41f)
                lineTo(3.51f, 3.51f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(1.88f, 1.88f)
                curveTo(2.2f, 7.85f, 1.0f, 9.79f, 1.0f, 12.0f)
                curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f)
                curveToRelative(2.21f, 0.0f, 4.15f, -1.2f, 5.18f, -2.99f)
                lineTo(19.07f, 21.9f)
                close()
                moveTo(9.91f, 12.74f)
                curveTo(9.58f, 14.03f, 8.4f, 15.0f, 7.0f, 15.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                curveToRelative(0.0f, -1.4f, 0.97f, -2.58f, 2.26f, -2.91f)
                lineTo(9.91f, 12.74f)
                close()
            }
        }
        .build()
        return _keyOff!!
    }

private var _keyOff: ImageVector? = null
