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

public val SimpleIcons.Adonisjs: ImageVector
    get() {
        if (_adonisjs != null) {
            return _adonisjs!!
        }
        _adonisjs = Builder(name = "Adonisjs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.333f, 1.333f)
                lineToRelative(-0.596f, 1.193f)
                lineToRelative(-2.404f, 4.807f)
                lineTo(8.0f, 2.667f)
                lineToRelative(-8.0f, 16.0f)
                horizontalLineToRelative(4.667f)
                lineToRelative(-2.0f, 4.0f)
                lineTo(24.0f, 22.667f)
                close()
                moveTo(13.333f, 4.315f)
                lineToRelative(8.51f, 17.018f)
                lineTo(4.823f, 21.333f)
                lineToRelative(1.334f, -2.666f)
                lineTo(16.0f, 18.667f)
                lineToRelative(-4.922f, -9.843f)
                close()
            }
        }
        .build()
        return _adonisjs!!
    }

private var _adonisjs: ImageVector? = null
