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

public val SimpleIcons.Lodash: ImageVector
    get() {
        if (_lodash != null) {
            return _lodash!!
        }
        _lodash = Builder(name = "Lodash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.0f, 20.253f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(2.542f)
                horizontalLineToRelative(-24.0f)
                close()
                moveTo(18.061f, 5.212f)
                lineTo(18.284f, 5.243f)
                curveToRelative(1.933f, -0.071f, 3.885f, 1.006f, 4.882f, 2.674f)
                curveToRelative(0.844f, 1.566f, 0.976f, 3.458f, 0.712f, 5.187f)
                curveToRelative(-0.204f, 1.657f, -1.149f, 3.234f, -2.644f, 4.027f)
                curveToRelative(-2.177f, 1.139f, -5.085f, 1.017f, -7.017f, -0.59f)
                curveToRelative(-1.994f, -1.942f, -2.461f, -5.136f, -1.444f, -7.678f)
                curveToRelative(0.711f, -2.207f, 3.0f, -3.661f, 5.288f, -3.63f)
                close()
                moveTo(18.295f, 7.012f)
                horizontalLineToRelative(-0.183f)
                curveToRelative(-1.424f, -0.03f, -2.777f, 0.915f, -3.285f, 2.237f)
                curveToRelative(-0.732f, 1.831f, -0.732f, 4.17f, 0.691f, 5.695f)
                curveToRelative(1.17f, 1.434f, 3.458f, 1.597f, 4.882f, 0.438f)
                curveToRelative(1.525f, -1.312f, 1.83f, -3.59f, 1.322f, -5.451f)
                curveToRelative(-0.275f, -1.648f, -1.78f, -2.929f, -3.458f, -2.929f)
                close()
                moveTo(0.0f, 1.205f)
                horizontalLineToRelative(2.237f)
                verticalLineToRelative(14.847f)
                horizontalLineToRelative(8.848f)
                verticalLineToRelative(1.831f)
                horizontalLineToRelative(-11.085f)
                close()
            }
        }
        .build()
        return _lodash!!
    }

private var _lodash: ImageVector? = null
