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

public val RemixIcons.PlayMiniLine: ImageVector
    get() {
        if (_playMiniLine != null) {
            return _playMiniLine!!
        }
        _playMiniLine = Builder(name = "PlayMiniLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 8.482f)
                verticalLineToRelative(7.036f)
                lineTo(15.03f, 12.0f)
                lineTo(9.0f, 8.482f)
                close()
                moveTo(7.752f, 5.44f)
                lineToRelative(10.508f, 6.13f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.863f)
                lineToRelative(-10.508f, 6.13f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 7.0f, 18.128f)
                verticalLineTo(5.871f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.752f, -0.432f)
                close()
            }
        }
        .build()
        return _playMiniLine!!
    }

private var _playMiniLine: ImageVector? = null
