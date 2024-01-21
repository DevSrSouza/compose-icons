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

public val SimpleIcons.Ruff: ImageVector
    get() {
        if (_ruff != null) {
            return _ruff!!
        }
        _ruff = Builder(name = "Ruff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.683f, 11.593f)
                lineToRelative(-8.51f, -2.14f)
                lineToRelative(8.34f, -9.066f)
                arcToRelative(0.23f, 0.23f, 0.0f, false, false, -0.29f, -0.352f)
                lineTo(2.252f, 11.62f)
                arcToRelative(0.227f, 0.227f, 0.0f, false, false, -0.108f, 0.226f)
                arcToRelative(0.23f, 0.23f, 0.0f, false, false, 0.164f, 0.19f)
                lineToRelative(8.497f, 2.497f)
                lineToRelative(-8.35f, 9.08f)
                arcToRelative(0.228f, 0.228f, 0.0f, false, false, -0.007f, 0.303f)
                arcToRelative(0.227f, 0.227f, 0.0f, false, false, 0.3f, 0.047f)
                lineToRelative(19.0f, -11.953f)
                arcToRelative(0.228f, 0.228f, 0.0f, false, false, 0.105f, -0.23f)
                arcToRelative(0.225f, 0.225f, 0.0f, false, false, -0.172f, -0.187f)
                close()
            }
        }
        .build()
        return _ruff!!
    }

private var _ruff: ImageVector? = null
