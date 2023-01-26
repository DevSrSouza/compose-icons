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

public val RoundGroup.SwitchLeft: ImageVector
    get() {
        if (_switchLeft != null) {
            return _switchLeft!!
        }
        _switchLeft = Builder(name = "SwitchLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 8.62f)
                verticalLineToRelative(6.76f)
                lineTo(5.12f, 12.0f)
                lineTo(8.5f, 8.62f)
                moveTo(3.71f, 11.29f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(4.59f, 4.59f)
                curveTo(8.92f, 17.92f, 10.0f, 17.48f, 10.0f, 16.59f)
                verticalLineTo(7.41f)
                curveToRelative(0.0f, -0.89f, -1.08f, -1.34f, -1.71f, -0.71f)
                lineTo(3.71f, 11.29f)
                close()
                moveTo(14.0f, 7.41f)
                verticalLineToRelative(9.17f)
                curveToRelative(0.0f, 0.89f, 1.08f, 1.34f, 1.71f, 0.71f)
                lineToRelative(4.59f, -4.59f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(-4.59f, -4.59f)
                curveTo(15.08f, 6.08f, 14.0f, 6.52f, 14.0f, 7.41f)
                close()
            }
        }
        .build()
        return _switchLeft!!
    }

private var _switchLeft: ImageVector? = null
