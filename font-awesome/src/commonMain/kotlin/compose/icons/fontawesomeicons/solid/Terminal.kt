package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Terminal: ImageVector
    get() {
        if (_terminal != null) {
            return _terminal!!
        }
        _terminal = Builder(name = "Terminal", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(257.98f, 272.97f)
                lineTo(63.64f, 467.31f)
                curveToRelative(-9.37f, 9.37f, -24.57f, 9.37f, -33.94f, 0.0f)
                lineTo(7.03f, 444.65f)
                curveToRelative(-9.36f, -9.36f, -9.38f, -24.52f, -0.04f, -33.9f)
                lineTo(161.01f, 256.0f)
                lineTo(6.99f, 101.25f)
                curveToRelative(-9.34f, -9.38f, -9.32f, -24.54f, 0.04f, -33.9f)
                lineToRelative(22.67f, -22.67f)
                curveToRelative(9.37f, -9.37f, 24.57f, -9.37f, 33.94f, 0.0f)
                lineTo(257.98f, 239.03f)
                curveToRelative(9.37f, 9.37f, 9.37f, 24.57f, 0.0f, 33.94f)
                close()
                moveTo(640.0f, 456.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -13.26f, -10.74f, -24.0f, -24.0f, -24.0f)
                horizontalLineTo(312.0f)
                curveToRelative(-13.26f, 0.0f, -24.0f, 10.74f, -24.0f, 24.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 13.26f, 10.74f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(304.0f)
                curveToRelative(13.26f, 0.0f, 24.0f, -10.74f, 24.0f, -24.0f)
                close()
            }
        }
        .build()
        return _terminal!!
    }

private var _terminal: ImageVector? = null
