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

public val SimpleIcons.Payhip: ImageVector
    get() {
        if (_payhip != null) {
            return _payhip!!
        }
        _payhip = Builder(name = "Payhip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.695f, 0.0f)
                arcTo(3.696f, 3.696f, 0.0f, false, false, 0.0f, 3.695f)
                verticalLineToRelative(12.92f)
                arcTo(7.384f, 7.384f, 0.0f, false, false, 7.385f, 24.0f)
                horizontalLineToRelative(12.92f)
                arcTo(3.696f, 3.696f, 0.0f, false, false, 24.0f, 20.305f)
                lineTo(24.0f, 0.0f)
                lineTo(3.695f, 0.0f)
                close()
                moveTo(15.348f, 5.604f)
                arcToRelative(3.88f, 3.88f, 0.0f, false, true, 0.166f, 0.0f)
                arcToRelative(3.88f, 3.88f, 0.0f, false, true, 2.677f, 1.132f)
                arcToRelative(3.88f, 3.88f, 0.0f, false, true, 0.0f, 5.48f)
                lineToRelative(-0.36f, 0.356f)
                curveToRelative(-1.826f, -1.825f, -3.648f, -3.656f, -5.476f, -5.482f)
                lineToRelative(0.358f, -0.354f)
                arcToRelative(3.88f, 3.88f, 0.0f, false, true, 2.635f, -1.132f)
                close()
                moveTo(8.721f, 5.729f)
                arcToRelative(3.88f, 3.88f, 0.0f, false, true, 2.566f, 1.0f)
                curveToRelative(2.068f, 2.062f, 4.127f, 4.133f, 6.192f, 6.199f)
                lineToRelative(-5.481f, 5.482f)
                lineToRelative(-6.19f, -6.203f)
                curveTo(3.549f, 9.7f, 5.346f, 5.702f, 8.722f, 5.729f)
                close()
                moveTo(6.977f, 7.439f)
                arcToRelative(0.464f, 0.464f, 0.0f, false, false, -0.465f, 0.465f)
                verticalLineToRelative(1.817f)
                curveToRelative(0.0f, 0.256f, 0.208f, 0.463f, 0.465f, 0.463f)
                horizontalLineToRelative(1.816f)
                arcToRelative(0.464f, 0.464f, 0.0f, false, false, 0.463f, -0.463f)
                lineToRelative(0.008f, -1.817f)
                arcTo(0.464f, 0.464f, 0.0f, false, false, 8.8f, 7.44f)
                lineTo(6.977f, 7.44f)
                close()
            }
        }
        .build()
        return _payhip!!
    }

private var _payhip: ImageVector? = null
