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

public val SimpleIcons.Codesandbox: ImageVector
    get() {
        if (_codesandbox != null) {
            return _codesandbox!!
        }
        _codesandbox = Builder(name = "Codesandbox", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 24.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(2.4546f)
                horizontalLineTo(21.5455f)
                verticalLineTo(21.5455f)
                horizontalLineTo(2.4546f)
                verticalLineTo(0.0f)
                horizontalLineTo(0.0f)
                close()
            }
        }
        .build()
        return _codesandbox!!
    }

private var _codesandbox: ImageVector? = null
