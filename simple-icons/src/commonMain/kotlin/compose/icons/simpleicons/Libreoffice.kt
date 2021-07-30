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

public val SimpleIcons.Libreoffice: ImageVector
    get() {
        if (_libreoffice != null) {
            return _libreoffice!!
        }
        _libreoffice = Builder(name = "Libreoffice", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.365f, 0.0f)
                arcToRelative(0.597f, 0.597f, 0.0f, false, false, -0.555f, 0.352f)
                arcToRelative(0.582f, 0.582f, 0.0f, false, false, 0.128f, 0.635f)
                lineToRelative(4.985f, 4.996f)
                arcToRelative(0.605f, 0.605f, 0.0f, false, false, 0.635f, 0.133f)
                arcToRelative(0.59f, 0.59f, 0.0f, false, false, 0.363f, -0.53f)
                lineTo(21.921f, 0.577f)
                arcTo(0.605f, 0.605f, 0.0f, false, false, 21.335f, 0.0f)
                close()
                moveTo(2.661f, 0.0f)
                arcToRelative(0.59f, 0.59f, 0.0f, false, false, -0.582f, 0.59f)
                verticalLineToRelative(22.82f)
                arcToRelative(0.59f, 0.59f, 0.0f, false, false, 0.582f, 0.59f)
                horizontalLineToRelative(18.67f)
                arcToRelative(0.59f, 0.59f, 0.0f, false, false, 0.59f, -0.59f)
                lineTo(21.921f, 8.716f)
                arcToRelative(0.59f, 0.59f, 0.0f, false, false, -0.17f, -0.42f)
                lineTo(13.674f, 0.182f)
                arcToRelative(0.59f, 0.59f, 0.0f, false, false, -0.42f, -0.181f)
                close()
                moveTo(3.251f, 1.184f)
                horizontalLineToRelative(9.754f)
                lineToRelative(7.733f, 7.77f)
                verticalLineToRelative(13.863f)
                lineTo(3.251f, 22.817f)
                close()
            }
        }
        .build()
        return _libreoffice!!
    }

private var _libreoffice: ImageVector? = null
