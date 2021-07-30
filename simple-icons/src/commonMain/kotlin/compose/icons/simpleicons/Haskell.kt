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

public val SimpleIcons.Haskell: ImageVector
    get() {
        if (_haskell != null) {
            return _haskell!!
        }
        _haskell = Builder(name = "Haskell", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 3.535f)
                lineTo(5.647f, 12.0f)
                lineTo(0.0f, 20.465f)
                horizontalLineToRelative(4.235f)
                lineTo(9.883f, 12.0f)
                lineTo(4.235f, 3.535f)
                close()
                moveTo(5.647f, 3.535f)
                lineTo(11.294f, 12.0f)
                lineToRelative(-5.647f, 8.465f)
                horizontalLineToRelative(4.235f)
                lineToRelative(3.53f, -5.29f)
                lineToRelative(3.53f, 5.29f)
                horizontalLineToRelative(4.234f)
                lineTo(9.883f, 3.535f)
                close()
                moveTo(14.588f, 8.473f)
                lineToRelative(1.883f, 2.822f)
                lineTo(24.0f, 11.295f)
                lineTo(24.0f, 8.473f)
                close()
                moveTo(17.412f, 12.705f)
                lineToRelative(1.882f, 2.822f)
                lineTo(24.0f, 15.527f)
                verticalLineToRelative(-2.822f)
                close()
            }
        }
        .build()
        return _haskell!!
    }

private var _haskell: ImageVector? = null
