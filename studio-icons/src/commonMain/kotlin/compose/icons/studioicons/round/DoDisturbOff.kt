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

public val RoundGroup.DoDisturbOff: ImageVector
    get() {
        if (_doDisturbOff != null) {
            return _doDisturbOff!!
        }
        _doDisturbOff = Builder(name = "DoDisturbOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-0.88f)
                lineToRelative(4.33f, 4.33f)
                curveTo(21.43f, 15.79f, 22.0f, 13.96f, 22.0f, 12.0f)
                curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f)
                curveToRelative(-1.96f, 0.0f, -3.79f, 0.57f, -5.33f, 1.55f)
                lineTo(14.12f, 11.0f)
                lineTo(17.0f, 11.0f)
                close()
                moveTo(21.17f, 20.88f)
                lineTo(3.12f, 2.83f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(2.07f, 2.07f)
                curveTo(2.66f, 7.93f, 2.0f, 9.89f, 2.0f, 12.0f)
                curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f)
                curveToRelative(2.11f, 0.0f, 4.07f, -0.66f, 5.68f, -1.78f)
                lineToRelative(2.07f, 2.07f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                curveToRelative(0.4f, -0.39f, 0.4f, -1.02f, 0.01f, -1.41f)
                close()
                moveTo(7.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.46f)
                lineToRelative(2.0f, 2.0f)
                lineTo(7.0f, 13.0f)
                close()
            }
        }
        .build()
        return _doDisturbOff!!
    }

private var _doDisturbOff: ImageVector? = null
