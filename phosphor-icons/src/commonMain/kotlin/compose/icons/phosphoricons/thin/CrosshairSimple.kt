package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.CrosshairSimple: ImageVector
    get() {
        if (_crosshairSimple != null) {
            return _crosshairSimple!!
        }
        _crosshairSimple = Builder(name = "CrosshairSimple", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 32.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, false, 96.0f, 96.0f)
                arcTo(96.2f, 96.2f, 0.0f, false, false, 128.0f, 32.0f)
                close()
                moveTo(132.0f, 215.9f)
                lineTo(132.0f, 180.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(35.9f)
                arcTo(88.1f, 88.1f, 0.0f, false, true, 40.1f, 132.0f)
                lineTo(76.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(40.1f, 124.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, true, 124.0f, 40.1f)
                lineTo(124.0f, 76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(132.0f, 40.1f)
                arcTo(88.1f, 88.1f, 0.0f, false, true, 215.9f, 124.0f)
                lineTo(180.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(35.9f)
                arcTo(88.1f, 88.1f, 0.0f, false, true, 132.0f, 215.9f)
                close()
            }
        }
        .build()
        return _crosshairSimple!!
    }

private var _crosshairSimple: ImageVector? = null
