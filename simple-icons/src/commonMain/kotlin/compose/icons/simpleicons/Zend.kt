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

public val SimpleIcons.Zend: ImageVector
    get() {
        if (_zend != null) {
            return _zend!!
        }
        _zend = Builder(name = "Zend", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 0.467f)
                lineTo(9.01f, 20.217f)
                horizontalLineTo(20.54f)
                arcTo(3.46f, 3.46f, 0.0f, false, false, 24.0f, 16.757f)
                verticalLineTo(0.468f)
                close()
                moveTo(3.459f, 3.783f)
                curveTo(1.585f, 3.783f, 0.0f, 5.153f, 0.0f, 7.1f)
                verticalLineToRelative(16.433f)
                lineToRelative(15.063f, -19.75f)
                horizontalLineTo(3.459f)
                close()
            }
        }
        .build()
        return _zend!!
    }

private var _zend: ImageVector? = null
