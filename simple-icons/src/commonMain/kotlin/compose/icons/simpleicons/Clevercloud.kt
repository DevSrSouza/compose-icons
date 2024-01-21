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

public val SimpleIcons.Clevercloud: ImageVector
    get() {
        if (_clevercloud != null) {
            return _clevercloud!!
        }
        _clevercloud = Builder(name = "Clevercloud", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 12.862f)
                lineTo(0.416f, 18.431f)
                lineTo(11.168f, 24.0f)
                close()
                moveTo(12.831f, 0.0f)
                lineTo(20.0f, 11.139f)
                lineToRelative(3.584f, -5.57f)
                close()
                moveTo(12.83f, 24.0f)
                lineTo(23.583f, 18.431f)
                lineTo(20.0f, 12.862f)
                close()
                moveTo(23.999f, 17.353f)
                lineTo(23.999f, 6.648f)
                lineTo(20.554f, 12.0f)
                close()
                moveTo(12.0f, 0.43f)
                lineTo(4.832f, 11.568f)
                horizontalLineToRelative(14.336f)
                close()
                moveTo(12.0f, 23.569f)
                lineTo(19.168f, 12.43f)
                lineTo(4.832f, 12.43f)
                close()
                moveTo(4.0f, 11.139f)
                lineTo(11.168f, 0.0f)
                lineTo(0.416f, 5.569f)
                close()
                moveTo(0.0f, 6.647f)
                verticalLineToRelative(10.707f)
                lineTo(3.445f, 12.0f)
                close()
            }
        }
        .build()
        return _clevercloud!!
    }

private var _clevercloud: ImageVector? = null
