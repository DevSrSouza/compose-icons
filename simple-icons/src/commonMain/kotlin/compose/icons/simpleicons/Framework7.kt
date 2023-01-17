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

public val SimpleIcons.Framework7: ImageVector
    get() {
        if (_framework7 != null) {
            return _framework7!!
        }
        _framework7 = Builder(name = "Framework7", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 12.0f)
                arcToRelative(11.95f, 11.95f, 0.0f, false, true, 2.713f, -7.6f)
                horizontalLineToRelative(18.574f)
                lineTo(8.037f, 23.33f)
                curveTo(3.358f, 21.694f, 0.0f, 17.24f, 0.0f, 12.0f)
                close()
                moveTo(22.271f, 5.792f)
                arcTo(11.944f, 11.944f, 0.0f, false, true, 24.0f, 12.0f)
                curveToRelative(0.0f, 6.627f, -5.373f, 12.0f, -12.0f, 12.0f)
                curveToRelative(-0.794f, 0.0f, -1.57f, -0.077f, -2.32f, -0.224f)
                close()
                moveTo(4.295f, 2.8f)
                arcTo(11.952f, 11.952f, 0.0f, false, true, 12.0f, 0.0f)
                curveToRelative(2.933f, 0.0f, 5.62f, 1.052f, 7.705f, 2.8f)
                close()
            }
        }
        .build()
        return _framework7!!
    }

private var _framework7: ImageVector? = null
