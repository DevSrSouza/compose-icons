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

public val IonIcons.Copy: ImageVector
    get() {
        if (_copy != null) {
            return _copy!!
        }
        _copy = Builder(name = "Copy", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(408.0f, 480.0f)
                horizontalLineTo(184.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, true, -72.0f, -72.0f)
                verticalLineTo(184.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, true, 72.0f, -72.0f)
                horizontalLineTo(408.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, true, 72.0f, 72.0f)
                verticalLineTo(408.0f)
                arcTo(72.0f, 72.0f, 0.0f, false, true, 408.0f, 480.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 80.0f)
                horizontalLineTo(395.88f)
                arcTo(72.12f, 72.12f, 0.0f, false, false, 328.0f, 32.0f)
                horizontalLineTo(104.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, -72.0f, 72.0f)
                verticalLineTo(328.0f)
                arcToRelative(72.12f, 72.12f, 0.0f, false, false, 48.0f, 67.88f)
                verticalLineTo(160.0f)
                arcTo(80.0f, 80.0f, 0.0f, false, true, 160.0f, 80.0f)
                close()
            }
        }
        .build()
        return _copy!!
    }

private var _copy: ImageVector? = null
