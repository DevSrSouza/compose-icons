package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.BodySharp: ImageVector
    get() {
        if (_bodySharp != null) {
            return _bodySharp!!
        }
        _bodySharp = Builder(name = "BodySharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 56.0f)
                moveToRelative(-56.0f, 0.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 112.0f, 0.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, -112.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.0f, 128.0f)
                lineToRelative(-416.0f, 0.0f)
                lineToRelative(0.0f, 52.0f)
                lineToRelative(144.0f, 0.0f)
                lineToRelative(-32.0f, 325.13f)
                lineToRelative(51.0f, 6.87f)
                lineToRelative(21.65f, -192.0f)
                lineToRelative(47.02f, 0.0f)
                lineToRelative(21.33f, 192.0f)
                lineToRelative(51.0f, -6.98f)
                lineToRelative(-32.0f, -325.02f)
                lineToRelative(144.0f, 0.0f)
                lineToRelative(0.0f, -52.0f)
                close()
            }
        }
        .build()
        return _bodySharp!!
    }

private var _bodySharp: ImageVector? = null
