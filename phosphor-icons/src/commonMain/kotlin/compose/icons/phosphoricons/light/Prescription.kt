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

public val LightGroup.Prescription: ImageVector
    get() {
        if (_prescription != null) {
            return _prescription!!
        }
        _prescription = Builder(name = "Prescription", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.5f, 188.0f)
                lineToRelative(23.7f, -23.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -8.4f, -8.4f)
                lineTo(172.0f, 179.5f)
                lineToRelative(-45.9f, -45.9f)
                arcTo(50.0f, 50.0f, 0.0f, false, false, 120.0f, 34.0f)
                horizontalLineTo(72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineTo(192.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(134.0f)
                horizontalLineToRelative(31.5f)
                lineToRelative(54.0f, 54.0f)
                lineToRelative(-23.7f, 23.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, false, 8.4f, 8.4f)
                lineTo(172.0f, 196.5f)
                lineToRelative(23.8f, 23.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 8.4f, -8.4f)
                close()
                moveTo(78.0f, 46.0f)
                horizontalLineToRelative(42.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, true, 0.0f, 76.0f)
                horizontalLineTo(78.0f)
                close()
            }
        }
        .build()
        return _prescription!!
    }

private var _prescription: ImageVector? = null
