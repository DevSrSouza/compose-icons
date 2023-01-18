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

public val IonIcons.Laptop: ImageVector
    get() {
        if (_laptop != null) {
            return _laptop!!
        }
        _laptop = Builder(name = "Laptop", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(496.0f, 400.0f)
                horizontalLineTo(467.66f)
                arcTo(47.92f, 47.92f, 0.0f, false, false, 480.0f, 367.86f)
                verticalLineTo(128.14f)
                arcTo(48.2f, 48.2f, 0.0f, false, false, 431.86f, 80.0f)
                horizontalLineTo(80.14f)
                arcTo(48.2f, 48.2f, 0.0f, false, false, 32.0f, 128.14f)
                verticalLineTo(367.86f)
                arcTo(47.92f, 47.92f, 0.0f, false, false, 44.34f, 400.0f)
                horizontalLineTo(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 32.0f)
                horizontalLineTo(496.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -32.0f)
                close()
            }
        }
        .build()
        return _laptop!!
    }

private var _laptop: ImageVector? = null
