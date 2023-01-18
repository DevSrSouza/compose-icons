package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.Square: ImageVector
    get() {
        if (_square != null) {
            return _square!!
        }
        _square = Builder(name = "Square", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.0f, 464.0f)
                horizontalLineTo(96.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, true, -48.0f, -48.0f)
                verticalLineTo(96.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, true, 96.0f, 48.0f)
                horizontalLineTo(416.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, true, 48.0f, 48.0f)
                verticalLineTo(416.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, true, 416.0f, 464.0f)
                close()
            }
        }
        .build()
        return _square!!
    }

private var _square: ImageVector? = null
