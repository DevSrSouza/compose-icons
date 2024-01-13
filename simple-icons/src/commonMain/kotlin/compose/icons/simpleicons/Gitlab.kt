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

public val SimpleIcons.Gitlab: ImageVector
    get() {
        if (_gitlab != null) {
            return _gitlab!!
        }
        _gitlab = Builder(name = "Gitlab", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(23.6004f, 9.5927f)
                lineToRelative(-0.0337f, -0.0862f)
                lineTo(20.3f, 0.9814f)
                arcToRelative(0.851f, 0.851f, 0.0f, false, false, -0.3362f, -0.405f)
                arcToRelative(0.8748f, 0.8748f, 0.0f, false, false, -0.9997f, 0.0539f)
                arcToRelative(0.8748f, 0.8748f, 0.0f, false, false, -0.29f, 0.4399f)
                lineToRelative(-2.2055f, 6.748f)
                horizontalLineTo(7.5375f)
                lineToRelative(-2.2057f, -6.748f)
                arcToRelative(0.8573f, 0.8573f, 0.0f, false, false, -0.29f, -0.4412f)
                arcToRelative(0.8748f, 0.8748f, 0.0f, false, false, -0.9997f, -0.0537f)
                arcToRelative(0.8585f, 0.8585f, 0.0f, false, false, -0.3362f, 0.4049f)
                lineTo(0.4332f, 9.5015f)
                lineToRelative(-0.0325f, 0.0862f)
                arcToRelative(6.0657f, 6.0657f, 0.0f, false, false, 2.0119f, 7.0105f)
                lineToRelative(0.0113f, 0.0087f)
                lineToRelative(0.03f, 0.0213f)
                lineToRelative(4.976f, 3.7264f)
                lineToRelative(2.462f, 1.8633f)
                lineToRelative(1.4995f, 1.1321f)
                arcToRelative(1.0085f, 1.0085f, 0.0f, false, false, 1.2197f, 0.0f)
                lineToRelative(1.4995f, -1.1321f)
                lineToRelative(2.4619f, -1.8633f)
                lineToRelative(5.006f, -3.7489f)
                lineToRelative(0.0125f, -0.01f)
                arcToRelative(6.0682f, 6.0682f, 0.0f, false, false, 2.0094f, -7.003f)
                close()
            }
        }
        .build()
        return _gitlab!!
    }

private var _gitlab: ImageVector? = null
