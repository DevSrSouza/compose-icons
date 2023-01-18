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

public val RemixIcons.SpeedMiniFill: ImageVector
    get() {
        if (_speedMiniFill != null) {
            return _speedMiniFill!!
        }
        _speedMiniFill = Builder(name = "SpeedMiniFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.788f, 17.444f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 4.0f, 17.035f)
                verticalLineTo(6.965f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.788f, -0.409f)
                lineToRelative(7.133f, 5.036f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.816f)
                lineToRelative(-7.133f, 5.036f)
                close()
                moveTo(13.0f, 6.965f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.788f, -0.409f)
                lineToRelative(7.133f, 5.036f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.816f)
                lineToRelative(-7.133f, 5.036f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.788f, -0.409f)
                verticalLineTo(6.965f)
                close()
            }
        }
        .build()
        return _speedMiniFill!!
    }

private var _speedMiniFill: ImageVector? = null
