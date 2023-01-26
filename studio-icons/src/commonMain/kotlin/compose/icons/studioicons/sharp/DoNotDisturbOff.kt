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

public val SharpGroup.DoNotDisturbOff: ImageVector
    get() {
        if (_doNotDisturbOff != null) {
            return _doNotDisturbOff!!
        }
        _doNotDisturbOff = Builder(name = "DoNotDisturbOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.17f)
                lineToRelative(4.51f, 4.51f)
                curveTo(21.39f, 15.93f, 22.0f, 14.04f, 22.0f, 12.0f)
                curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f)
                curveTo(9.96f, 2.0f, 8.07f, 2.61f, 6.49f, 3.66f)
                lineTo(13.83f, 11.0f)
                horizontalLineTo(17.0f)
                close()
                moveTo(1.39f, 4.22f)
                lineToRelative(2.27f, 2.27f)
                curveTo(2.61f, 8.07f, 2.0f, 9.96f, 2.0f, 12.0f)
                curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f)
                curveToRelative(2.04f, 0.0f, 3.93f, -0.61f, 5.51f, -1.66f)
                lineToRelative(2.27f, 2.27f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                close()
                moveTo(7.0f, 11.0f)
                horizontalLineToRelative(1.17f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _doNotDisturbOff!!
    }

private var _doNotDisturbOff: ImageVector? = null
