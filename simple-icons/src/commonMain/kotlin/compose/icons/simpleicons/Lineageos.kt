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

public val SimpleIcons.Lineageos: ImageVector
    get() {
        if (_lineageos != null) {
            return _lineageos!!
        }
        _lineageos = Builder(name = "Lineageos", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.6453f, 12.0574f)
                arcToRelative(2.4039f, 2.4039f, 0.0f, false, false, -1.8029f, 0.7993f)
                lineToRelative(-0.1382f, -0.0541f)
                arcToRelative(17.801f, 17.801f, 0.0f, false, false, -2.8667f, -0.8594f)
                arcToRelative(4.8078f, 4.8078f, 0.0f, false, false, -9.6157f, 0.0f)
                horizontalLineToRelative(-0.1322f)
                arcToRelative(17.7469f, 17.7469f, 0.0f, false, false, -2.7645f, 0.8354f)
                lineToRelative(-0.1382f, 0.0541f)
                arcToRelative(2.4039f, 2.4039f, 0.0f, true, false, 0.5589f, 1.0697f)
                arcToRelative(16.599f, 16.599f, 0.0f, false, true, 2.5782f, -0.7753f)
                arcToRelative(4.8078f, 4.8078f, 0.0f, false, false, 9.3572f, 0.0f)
                arcToRelative(16.5569f, 16.5569f, 0.0f, false, true, 2.5782f, 0.7692f)
                arcToRelative(2.4039f, 2.4039f, 0.0f, true, false, 2.3859f, -1.839f)
                close()
                moveTo(2.414f, 15.6632f)
                arcToRelative(1.202f, 1.202f, 0.0f, true, true, 1.202f, -1.2019f)
                arcToRelative(1.202f, 1.202f, 0.0f, false, true, -1.202f, 1.2019f)
                close()
                moveTo(12.0296f, 15.6632f)
                arcToRelative(3.6059f, 3.6059f, 0.0f, true, true, 3.6059f, -3.6059f)
                arcToRelative(3.6059f, 3.6059f, 0.0f, false, true, -3.6059f, 3.6059f)
                close()
                moveTo(21.6453f, 15.6632f)
                arcToRelative(1.202f, 1.202f, 0.0f, true, true, 1.202f, -1.2019f)
                arcToRelative(1.202f, 1.202f, 0.0f, false, true, -1.202f, 1.2019f)
                close()
                moveTo(13.8326f, 12.0573f)
                arcToRelative(1.8029f, 1.8029f, 0.0f, true, true, -1.8029f, -1.8029f)
                arcToRelative(1.8029f, 1.8029f, 0.0f, false, true, 1.8029f, 1.8029f)
                close()
            }
        }
        .build()
        return _lineageos!!
    }

private var _lineageos: ImageVector? = null
