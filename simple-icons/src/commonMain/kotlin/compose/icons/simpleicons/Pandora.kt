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

public val SimpleIcons.Pandora: ImageVector
    get() {
        if (_pandora != null) {
            return _pandora!!
        }
        _pandora = Builder(name = "Pandora", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.882f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineTo(8.32f)
                arcToRelative(1.085f, 1.085f, 0.0f, false, false, 1.085f, -1.085f)
                verticalLineToRelative(-4.61f)
                horizontalLineToRelative(1.612f)
                curveToRelative(7.88f, 0.0f, 11.103f, -4.442f, 11.103f, -9.636f)
                curveTo(22.119f, 2.257f, 17.247f, 0.0f, 12.662f, 0.0f)
                horizontalLineTo(1.882f)
                close()
            }
        }
        .build()
        return _pandora!!
    }

private var _pandora: ImageVector? = null
