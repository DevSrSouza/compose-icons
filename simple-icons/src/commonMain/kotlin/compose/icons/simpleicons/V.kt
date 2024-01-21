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

public val SimpleIcons.V: ImageVector
    get() {
        if (_v != null) {
            return _v!!
        }
        _v = Builder(name = "V", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.583f, 23.4965f)
                curveToRelative(0.0673f, 0.1924f, -0.0435f, 0.3484f, -0.2472f, 0.3484f)
                horizontalLineToRelative(-6.262f)
                curveToRelative(-0.4075f, 0.0f, -0.8502f, -0.3113f, -0.9881f, -0.6947f)
                lineTo(0.0426f, 0.7837f)
                curveTo(-0.105f, 0.3925f, 0.149f, 0.1152f, 0.5276f, 0.1599f)
                lineToRelative(6.393f, 0.6158f)
                curveToRelative(0.4056f, 0.0391f, 0.8441f, 0.383f, 0.9787f, 0.7675f)
                lineToRelative(7.6837f, 21.9533f)
                close()
                moveTo(23.4736f, 0.1599f)
                lineToRelative(-6.393f, 0.6159f)
                curveToRelative(-0.4055f, 0.0391f, -0.8436f, 0.3832f, -0.9775f, 0.7678f)
                lineToRelative(-3.8275f, 10.9895f)
                lineToRelative(3.6784f, 10.5098f)
                lineTo(23.9586f, 0.7837f)
                curveToRelative(0.1378f, -0.3834f, -0.0795f, -0.663f, -0.485f, -0.6238f)
                close()
            }
        }
        .build()
        return _v!!
    }

private var _v: ImageVector? = null
