package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.HeartAddFill: ImageVector
    get() {
        if (_heartAddFill != null) {
            return _heartAddFill!!
        }
        _heartAddFill = Builder(name = "HeartAddFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 14.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(20.243f, 4.757f)
                curveToRelative(2.16f, 2.166f, 2.329f, 5.557f, 0.507f, 7.91f)
                curveTo(19.926f, 12.24f, 18.99f, 12.0f, 18.0f, 12.0f)
                curveToRelative(-3.314f, 0.0f, -6.0f, 2.686f, -6.0f, 6.0f)
                curveToRelative(0.0f, 1.009f, 0.249f, 1.96f, 0.689f, 2.794f)
                lineToRelative(-0.69f, 0.691f)
                lineToRelative(-8.478f, -8.492f)
                curveToRelative(-2.104f, -2.356f, -2.025f, -5.974f, 0.236f, -8.236f)
                curveToRelative(2.265f, -2.264f, 5.888f, -2.34f, 8.244f, -0.228f)
                curveToRelative(2.349f, -2.109f, 5.979f, -2.039f, 8.242f, 0.228f)
                close()
            }
        }
        .build()
        return _heartAddFill!!
    }

private var _heartAddFill: ImageVector? = null
