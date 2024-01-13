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

public val SimpleIcons.Wellfound: ImageVector
    get() {
        if (_wellfound != null) {
            return _wellfound!!
        }
        _wellfound = Builder(name = "Wellfound", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.998f, 8.128f)
                curveToRelative(0.063f, -1.379f, -1.612f, -2.376f, -2.795f, -1.664f)
                curveToRelative(-1.23f, 0.598f, -1.322f, 2.52f, -0.156f, 3.234f)
                curveToRelative(1.2f, 0.862f, 2.995f, -0.09f, 2.951f, -1.57f)
                close()
                moveTo(23.998f, 15.876f)
                curveToRelative(0.063f, -1.38f, -1.612f, -2.377f, -2.795f, -1.665f)
                curveToRelative(-1.23f, 0.598f, -1.322f, 2.52f, -0.156f, 3.234f)
                curveToRelative(1.2f, 0.863f, 2.995f, -0.09f, 2.951f, -1.57f)
                close()
                moveTo(3.498f, 17.638f)
                lineTo(0.0f, 6.364f)
                horizontalLineToRelative(3.257f)
                lineToRelative(2.066f, 8.106f)
                lineToRelative(2.245f, -8.106f)
                horizontalLineToRelative(3.267f)
                lineToRelative(2.244f, 8.106f)
                lineToRelative(2.065f, -8.106f)
                horizontalLineToRelative(3.257f)
                lineToRelative(-3.54f, 11.274f)
                lineTo(11.39f, 17.638f)
                curveToRelative(-0.73f, -2.713f, -1.46f, -5.426f, -2.188f, -8.14f)
                lineToRelative(-2.233f, 8.14f)
                lineTo(3.5f, 17.638f)
                close()
            }
        }
        .build()
        return _wellfound!!
    }

private var _wellfound: ImageVector? = null
