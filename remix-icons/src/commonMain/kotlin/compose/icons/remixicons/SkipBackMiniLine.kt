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

public val RemixIcons.SkipBackMiniLine: ImageVector
    get() {
        if (_skipBackMiniLine != null) {
            return _skipBackMiniLine!!
        }
        _skipBackMiniLine = Builder(name = "SkipBackMiniLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                lineTo(6.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(15.0f, 14.14f)
                lineTo(15.0f, 9.86f)
                lineTo(11.968f, 12.0f)
                lineTo(15.0f, 14.14f)
                close()
                moveTo(9.079f, 12.408f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -0.816f)
                lineToRelative(7.133f, -5.036f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.788f, 0.409f)
                verticalLineToRelative(10.07f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.788f, 0.409f)
                lineToRelative(-7.133f, -5.036f)
                close()
            }
        }
        .build()
        return _skipBackMiniLine!!
    }

private var _skipBackMiniLine: ImageVector? = null
