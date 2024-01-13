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

public val SimpleIcons.Polestar: ImageVector
    get() {
        if (_polestar != null) {
            return _polestar!!
        }
        _polestar = Builder(name = "Polestar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.549f, 0.0f)
                lineToRelative(-0.457f, 0.555f)
                verticalLineToRelative(11.191f)
                horizontalLineToRelative(11.19f)
                lineToRelative(0.554f, -0.457f)
                lineToRelative(-9.4f, -1.89f)
                close()
                moveTo(0.719f, 12.26f)
                lineToRelative(-0.555f, 0.457f)
                lineTo(9.563f, 14.6f)
                lineToRelative(1.886f, 9.4f)
                lineToRelative(0.457f, -0.555f)
                verticalLineTo(12.26f)
                close()
            }
        }
        .build()
        return _polestar!!
    }

private var _polestar: ImageVector? = null
