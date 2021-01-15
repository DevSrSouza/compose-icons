package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Farfetch: ImageVector
    get() {
        if (_farfetch != null) {
            return _farfetch!!
        }
        _farfetch = Builder(name = "Farfetch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.635f, 0.0f)
                lineTo(4.883f, 4.811f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(4.752f)
                verticalLineToRelative(-9.593f)
                horizontalLineToRelative(7.119f)
                verticalLineTo(9.6f)
                horizontalLineTo(9.635f)
                verticalLineTo(4.811f)
                horizontalLineToRelative(9.482f)
                verticalLineTo(0.0f)
                close()
            }
        }
        .build()
        return _farfetch!!
    }

private var _farfetch: ImageVector? = null
