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

public val SimpleIcons.Purism: ImageVector
    get() {
        if (_purism != null) {
            return _purism!!
        }
        _purism = Builder(name = "Purism", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 19.588f)
                horizontalLineTo(0.0f)
                verticalLineTo(4.412f)
                horizontalLineToRelative(24.0f)
                close()
                moveTo(2.824f, 16.765f)
                horizontalLineToRelative(18.352f)
                verticalLineToRelative(-9.53f)
                horizontalLineTo(2.824f)
                close()
            }
        }
        .build()
        return _purism!!
    }

private var _purism: ImageVector? = null
