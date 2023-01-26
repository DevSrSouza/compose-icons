package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.KeyOff: ImageVector
    get() {
        if (_keyOff != null) {
            return _keyOff!!
        }
        _keyOff = Builder(name = "KeyOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.91f, 14.09f)
                lineTo(17.0f, 14.0f)
                lineToRelative(2.0f, 2.0f)
                lineToRelative(4.0f, -4.04f)
                lineTo(21.0f, 10.0f)
                horizontalLineToRelative(-8.17f)
                lineTo(16.91f, 14.09f)
                close()
                moveTo(3.98f, 6.81f)
                curveTo(2.2f, 7.85f, 1.0f, 9.79f, 1.0f, 12.0f)
                curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f)
                curveToRelative(2.21f, 0.0f, 4.15f, -1.2f, 5.18f, -2.99f)
                lineToRelative(7.59f, 7.59f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineTo(3.98f, 6.81f)
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
