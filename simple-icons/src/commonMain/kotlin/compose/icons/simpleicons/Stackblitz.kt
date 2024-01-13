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

public val SimpleIcons.Stackblitz: ImageVector
    get() {
        if (_stackblitz != null) {
            return _stackblitz!!
        }
        _stackblitz = Builder(name = "Stackblitz", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.797f, 14.182f)
                horizontalLineTo(3.635f)
                lineTo(16.728f, 0.0f)
                lineToRelative(-3.525f, 9.818f)
                horizontalLineToRelative(7.162f)
                lineTo(7.272f, 24.0f)
                lineToRelative(3.524f, -9.818f)
                close()
            }
        }
        .build()
        return _stackblitz!!
    }

private var _stackblitz: ImageVector? = null
