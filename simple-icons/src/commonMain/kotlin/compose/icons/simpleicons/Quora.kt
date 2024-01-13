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

public val SimpleIcons.Quora: ImageVector
    get() {
        if (_quora != null) {
            return _quora!!
        }
        _quora = Builder(name = "Quora", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.3799f, 0.9483f)
                arcTo(11.9628f, 11.9628f, 0.0f, false, true, 21.248f, 19.5397f)
                lineToRelative(2.4096f, 2.4225f)
                curveToRelative(0.7322f, 0.7362f, 0.21f, 1.9905f, -0.8272f, 1.9905f)
                lineToRelative(-10.7105f, 0.01f)
                arcToRelative(12.52f, 12.52f, 0.0f, false, true, -0.304f, 0.0f)
                horizontalLineToRelative(-0.02f)
                arcTo(11.9628f, 11.9628f, 0.0f, false, true, 7.3818f, 0.9503f)
                close()
                moveTo(14.7016f, 5.3763f)
                arcToRelative(7.1717f, 7.1717f, 0.0f, true, false, -5.4873f, 13.2512f)
                arcToRelative(7.1717f, 7.1717f, 0.0f, false, false, 5.4883f, -13.2511f)
                close()
            }
        }
        .build()
        return _quora!!
    }

private var _quora: ImageVector? = null
