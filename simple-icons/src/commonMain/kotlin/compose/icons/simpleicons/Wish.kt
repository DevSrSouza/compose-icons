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

public val SimpleIcons.Wish: ImageVector
    get() {
        if (_wish != null) {
            return _wish!!
        }
        _wish = Builder(name = "Wish", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.864f, 19.826f)
                horizontalLineToRelative(-4.107f)
                lineToRelative(-3.227f, -9.393f)
                lineToRelative(-2.28f, 9.39f)
                horizontalLineTo(5.143f)
                lineTo(0.0f, 4.65f)
                horizontalLineToRelative(4.217f)
                lineToRelative(4.354f, 13.128f)
                curveToRelative(1.558f, -4.4f, 2.534f, -8.5f, 1.021f, -13.128f)
                horizontalLineTo(13.7f)
                close()
                moveTo(20.57f, 4.174f)
                arcToRelative(15.705f, 15.705f, 0.0f, false, true, -3.425f, 4.171f)
                arcToRelative(17.095f, 17.095f, 0.0f, false, true, 3.425f, 5.56f)
                arcTo(17.116f, 17.116f, 0.0f, false, true, 24.0f, 8.345f)
                arcToRelative(15.734f, 15.734f, 0.0f, false, true, -3.43f, -4.17f)
                close()
            }
        }
        .build()
        return _wish!!
    }

private var _wish: ImageVector? = null
