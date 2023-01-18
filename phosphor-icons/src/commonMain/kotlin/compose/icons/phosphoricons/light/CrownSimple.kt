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

public val LightGroup.CrownSimple: ImageVector
    get() {
        if (_crownSimple != null) {
            return _crownSimple!!
        }
        _crownSimple = Builder(name = "CrownSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.5f, 75.1f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, -14.7f, -2.0f)
                lineTo(172.3f, 95.5f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -2.6f, -0.8f)
                lineToRelative(-29.5f, -53.0f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, -24.4f, 0.0f)
                lineToRelative(-29.5f, 53.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -2.6f, 0.8f)
                lineTo(33.2f, 73.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.4f, 16.0f)
                lineTo(39.3f, 197.4f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 6.5f, 8.8f)
                arcToRelative(13.6f, 13.6f, 0.0f, false, false, 7.1f, 2.0f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, false, 3.8f, -0.5f)
                arcToRelative(267.9f, 267.9f, 0.0f, false, true, 142.5f, -0.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 17.5f, -10.2f)
                lineTo(242.1f, 89.1f)
                arcTo(13.8f, 13.8f, 0.0f, false, false, 237.5f, 75.1f)
                close()
                moveTo(230.5f, 86.3f)
                lineTo(205.0f, 194.6f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, true, -0.9f, 1.3f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -1.6f, 0.2f)
                arcToRelative(279.8f, 279.8f, 0.0f, false, false, -149.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.5f, -1.5f)
                horizontalLineToRelative(0.0f)
                lineTo(25.5f, 86.3f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, 2.0f, -2.5f)
                lineToRelative(0.8f, 0.2f)
                lineToRelative(50.6f, 22.5f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 17.9f, -6.0f)
                lineToRelative(29.5f, -53.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 3.4f, 0.0f)
                lineToRelative(29.5f, 53.0f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 17.9f, 6.0f)
                lineTo(227.7f, 84.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.1f, 0.3f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 230.5f, 86.3f)
                close()
            }
        }
        .build()
        return _crownSimple!!
    }

private var _crownSimple: ImageVector? = null
