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

public val SimpleIcons.Nounproject: ImageVector
    get() {
        if (_nounproject != null) {
            return _nounproject!!
        }
        _nounproject = Builder(name = "Nounproject", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.672f, 8.846f)
                horizontalLineTo(24.0f)
                verticalLineToRelative(6.327f)
                horizontalLineToRelative(-6.328f)
                close()
                moveTo(6.328f, 11.99f)
                arcToRelative(3.164f, 3.164f, 0.0f, false, true, -3.164f, 3.163f)
                arcTo(3.164f, 3.164f, 0.0f, false, true, 0.0f, 11.991f)
                arcToRelative(3.164f, 3.164f, 0.0f, false, true, 3.164f, -3.164f)
                arcToRelative(3.164f, 3.164f, 0.0f, false, true, 3.164f, 3.164f)
                moveToRelative(5.504f, 1.142f)
                lineToRelative(2.04f, 2.021f)
                lineToRelative(1.142f, -1.16f)
                lineToRelative(-2.022f, -2.003f)
                lineToRelative(2.022f, -2.003f)
                lineToRelative(-1.142f, -1.142f)
                lineToRelative(-2.04f, 2.003f)
                lineTo(9.81f, 8.846f)
                lineTo(8.649f, 9.988f)
                lineToRelative(2.022f, 2.003f)
                lineToRelative(-2.022f, 2.003f)
                lineToRelative(1.16f, 1.16f)
                close()
            }
        }
        .build()
        return _nounproject!!
    }

private var _nounproject: ImageVector? = null
