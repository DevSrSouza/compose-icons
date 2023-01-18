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

public val LightGroup.Bandaids: ImageVector
    get() {
        if (_bandaids != null) {
            return _bandaids!!
        }
        _bandaids = Builder(name = "Bandaids", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(181.7f, 128.0f)
                lineToRelative(29.2f, -29.1f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, -53.8f, -53.8f)
                horizontalLineToRelative(0.0f)
                lineTo(128.0f, 74.3f)
                lineTo(98.9f, 45.1f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 45.1f, 98.9f)
                lineTo(74.3f, 128.0f)
                lineTo(45.1f, 157.1f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 53.8f, 53.8f)
                lineTo(128.0f, 181.7f)
                lineToRelative(29.1f, 29.2f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 53.8f, -53.8f)
                close()
                moveTo(165.6f, 53.6f)
                horizontalLineToRelative(0.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 36.8f, 36.8f)
                lineToRelative(-29.1f, 29.1f)
                lineTo(136.5f, 82.7f)
                close()
                moveTo(164.8f, 128.0f)
                lineTo(128.0f, 164.8f)
                lineTo(91.2f, 128.0f)
                lineTo(128.0f, 91.2f)
                close()
                moveTo(53.6f, 90.4f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 90.4f, 53.6f)
                lineToRelative(29.1f, 29.1f)
                lineTo(82.7f, 119.5f)
                close()
                moveTo(90.4f, 202.4f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -36.8f, -36.8f)
                lineToRelative(29.1f, -29.1f)
                lineToRelative(36.8f, 36.8f)
                close()
                moveTo(202.4f, 202.4f)
                arcToRelative(26.1f, 26.1f, 0.0f, false, true, -36.8f, 0.0f)
                lineToRelative(-29.1f, -29.1f)
                lineToRelative(36.8f, -36.8f)
                lineToRelative(29.1f, 29.1f)
                arcToRelative(26.1f, 26.1f, 0.0f, false, true, 0.0f, 36.8f)
                close()
                moveTo(118.0f, 128.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 118.0f, 128.0f)
                close()
            }
        }
        .build()
        return _bandaids!!
    }

private var _bandaids: ImageVector? = null
