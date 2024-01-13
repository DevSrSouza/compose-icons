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

public val SimpleIcons.Mubi: ImageVector
    get() {
        if (_mubi != null) {
            return _mubi!!
        }
        _mubi = Builder(name = "Mubi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.357f, 0.033f)
                arcTo(3.357f, 3.357f, 0.0f, false, false, 0.0f, 3.39f)
                arcToRelative(3.357f, 3.357f, 0.0f, false, false, 3.357f, 3.357f)
                arcTo(3.357f, 3.357f, 0.0f, false, false, 6.713f, 3.39f)
                arcTo(3.357f, 3.357f, 0.0f, false, false, 3.357f, 0.033f)
                close()
                moveTo(12.0f, 0.033f)
                arcTo(3.357f, 3.357f, 0.0f, false, false, 8.645f, 3.39f)
                arcTo(3.357f, 3.357f, 0.0f, false, false, 12.0f, 6.746f)
                arcToRelative(3.357f, 3.357f, 0.0f, false, false, 3.357f, -3.357f)
                arcTo(3.357f, 3.357f, 0.0f, false, false, 12.0f, 0.033f)
                close()
                moveTo(3.357f, 8.643f)
                arcTo(3.357f, 3.357f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(3.357f, 3.357f, 0.0f, false, false, 3.357f, 3.355f)
                arcTo(3.357f, 3.357f, 0.0f, false, false, 6.713f, 12.0f)
                arcToRelative(3.357f, 3.357f, 0.0f, false, false, -3.356f, -3.357f)
                close()
                moveTo(12.0f, 8.643f)
                arcTo(3.357f, 3.357f, 0.0f, false, false, 8.645f, 12.0f)
                arcTo(3.357f, 3.357f, 0.0f, false, false, 12.0f, 15.355f)
                arcTo(3.357f, 3.357f, 0.0f, false, false, 15.357f, 12.0f)
                arcTo(3.357f, 3.357f, 0.0f, false, false, 12.0f, 8.643f)
                close()
                moveTo(20.643f, 8.643f)
                arcTo(3.357f, 3.357f, 0.0f, false, false, 17.287f, 12.0f)
                arcToRelative(3.357f, 3.357f, 0.0f, false, false, 3.356f, 3.355f)
                arcTo(3.357f, 3.357f, 0.0f, false, false, 24.0f, 12.0f)
                arcToRelative(3.357f, 3.357f, 0.0f, false, false, -3.357f, -3.357f)
                close()
                moveTo(3.357f, 17.253f)
                arcTo(3.357f, 3.357f, 0.0f, false, false, 0.0f, 20.612f)
                arcToRelative(3.357f, 3.357f, 0.0f, false, false, 3.357f, 3.356f)
                arcToRelative(3.357f, 3.357f, 0.0f, false, false, 3.356f, -3.356f)
                arcToRelative(3.357f, 3.357f, 0.0f, false, false, -3.356f, -3.357f)
                close()
                moveTo(12.0f, 17.253f)
                arcToRelative(3.357f, 3.357f, 0.0f, false, false, -3.355f, 3.358f)
                arcTo(3.357f, 3.357f, 0.0f, false, false, 12.0f, 23.967f)
                arcToRelative(3.357f, 3.357f, 0.0f, false, false, 3.357f, -3.356f)
                arcTo(3.357f, 3.357f, 0.0f, false, false, 12.0f, 17.254f)
                close()
            }
        }
        .build()
        return _mubi!!
    }

private var _mubi: ImageVector? = null
