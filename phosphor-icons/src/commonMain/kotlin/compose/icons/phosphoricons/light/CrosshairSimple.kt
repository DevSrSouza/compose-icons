package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.CrosshairSimple: ImageVector
    get() {
        if (_crosshairSimple != null) {
            return _crosshairSimple!!
        }
        _crosshairSimple = Builder(name = "CrosshairSimple", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 30.0f)
                arcToRelative(98.0f, 98.0f, 0.0f, true, false, 98.0f, 98.0f)
                arcTo(98.2f, 98.2f, 0.0f, false, false, 128.0f, 30.0f)
                close()
                moveTo(134.0f, 213.8f)
                lineTo(134.0f, 180.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(33.8f)
                arcTo(86.3f, 86.3f, 0.0f, false, true, 42.2f, 134.0f)
                lineTo(76.0f, 134.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(42.2f, 122.0f)
                arcTo(86.3f, 86.3f, 0.0f, false, true, 122.0f, 42.2f)
                lineTo(122.0f, 76.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(134.0f, 42.2f)
                arcTo(86.3f, 86.3f, 0.0f, false, true, 213.8f, 122.0f)
                lineTo(180.0f, 122.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(33.8f)
                arcTo(86.3f, 86.3f, 0.0f, false, true, 134.0f, 213.8f)
                close()
            }
        }
        .build()
        return _crosshairSimple!!
    }

private var _crosshairSimple: ImageVector? = null
