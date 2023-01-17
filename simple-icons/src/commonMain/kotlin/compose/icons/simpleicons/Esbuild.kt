package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Esbuild: ImageVector
    get() {
        if (_esbuild != null) {
            return _esbuild!!
        }
        _esbuild = Builder(name = "Esbuild", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(6.718f, 5.282f)
                lineTo(13.436f, 12.0f)
                lineToRelative(-6.718f, 6.718f)
                lineToRelative(-2.036f, -2.036f)
                lineTo(9.364f, 12.0f)
                lineTo(4.682f, 7.318f)
                close()
                moveTo(13.918f, 5.282f)
                lineTo(20.636f, 12.0f)
                lineToRelative(-6.718f, 6.718f)
                lineToRelative(-2.036f, -2.036f)
                lineTo(16.564f, 12.0f)
                lineToRelative(-4.682f, -4.682f)
                close()
            }
        }
        .build()
        return _esbuild!!
    }

private var _esbuild: ImageVector? = null
