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

public val SimpleIcons.Dedge: ImageVector
    get() {
        if (_dedge != null) {
            return _dedge!!
        }
        _dedge = Builder(name = "Dedge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.986f, 0.0f)
                verticalLineToRelative(8.338f)
                curveTo(16.09f, 2.93f, 7.61f, 2.8f, 3.74f, 8.733f)
                curveTo(-0.523f, 15.27f, 4.191f, 23.99f, 11.996f, 24.0f)
                horizontalLineToRelative(0.001f)
                curveToRelative(5.447f, -0.003f, 9.872f, -4.43f, 9.87f, -9.877f)
                lineTo(21.867f, 0.0f)
                close()
                moveTo(11.996f, 6.14f)
                arcToRelative(8.004f, 8.004f, 0.0f, false, true, 7.99f, 7.988f)
                arcToRelative(7.986f, 7.986f, 0.0f, false, true, -4.93f, 7.381f)
                arcToRelative(7.986f, 7.986f, 0.0f, false, true, -8.707f, -1.73f)
                arcToRelative(7.985f, 7.985f, 0.0f, false, true, -1.733f, -8.707f)
                arcToRelative(7.986f, 7.986f, 0.0f, false, true, 7.38f, -4.932f)
                close()
            }
        }
        .build()
        return _dedge!!
    }

private var _dedge: ImageVector? = null
