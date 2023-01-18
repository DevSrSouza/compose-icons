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

public val ThinGroup.HandbagSimple: ImageVector
    get() {
        if (_handbagSimple != null) {
            return _handbagSimple!!
        }
        _handbagSimple = Builder(name = "HandbagSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.0f, 206.7f)
                lineToRelative(-14.2f, -128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -10.7f)
                horizontalLineToRelative(-37.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -87.6f, 0.0f)
                horizontalLineToRelative(-37.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 10.7f)
                lineTo(21.0f, 206.7f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, 3.0f, 9.3f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 8.9f, 4.0f)
                lineTo(223.1f, 220.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 8.9f, -4.0f)
                arcTo(11.7f, 11.7f, 0.0f, false, false, 235.0f, 206.7f)
                close()
                moveTo(128.0f, 36.0f)
                arcToRelative(36.1f, 36.1f, 0.0f, false, true, 35.8f, 32.0f)
                lineTo(92.2f, 68.0f)
                arcTo(36.1f, 36.1f, 0.0f, false, true, 128.0f, 36.0f)
                close()
                moveTo(226.0f, 210.7f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.9f, 1.3f)
                lineTo(32.9f, 212.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.9f, -1.3f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, -1.0f, -3.1f)
                lineToRelative(14.2f, -128.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 4.0f, -3.6f)
                lineTo(208.8f, 76.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 4.0f, 3.6f)
                lineToRelative(14.2f, 128.0f)
                arcTo(3.7f, 3.7f, 0.0f, false, true, 226.0f, 210.7f)
                close()
            }
        }
        .build()
        return _handbagSimple!!
    }

private var _handbagSimple: ImageVector? = null
