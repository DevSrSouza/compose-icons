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

public val SimpleIcons.Interactjs: ImageVector
    get() {
        if (_interactjs != null) {
            return _interactjs!!
        }
        _interactjs = Builder(name = "Interactjs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.382f, 0.01f)
                curveTo(12.255f, 0.006f, 12.128f, 0.0f, 12.0f, 0.0f)
                arcTo(11.999f, 11.999f, 0.0f, false, false, 1.804f, 18.327f)
                lineToRelative(9.911f, -17.17f)
                close()
                moveTo(19.479f, 19.696f)
                lineTo(11.201f, 5.121f)
                lineTo(2.788f, 19.689f)
                lineToRelative(0.007f, 0.007f)
                horizontalLineToRelative(16.684f)
                close()
                moveTo(19.663f, 21.234f)
                lineTo(4.337f, 21.234f)
                arcToRelative(11.998f, 11.998f, 0.0f, false, false, 15.326f, 0.0f)
                close()
                moveTo(22.58f, 17.666f)
                arcTo(11.999f, 11.999f, 0.0f, false, false, 12.382f, 0.01f)
                lineToRelative(0.667f, 1.148f)
                close()
                moveTo(12.383f, 0.009f)
                lineToRelative(-0.001f, 0.001f)
                horizontalLineToRelative(0.001f)
                lineTo(12.383f, 0.009f)
                close()
            }
        }
        .build()
        return _interactjs!!
    }

private var _interactjs: ImageVector? = null
