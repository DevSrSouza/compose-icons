package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.CrownSimple: ImageVector
    get() {
        if (_crownSimple != null) {
            return _crownSimple!!
        }
        _crownSimple = Builder(name = "CrownSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(241.3f, 70.5f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, -20.9f, -2.9f)
                lineToRelative(-47.2f, 21.0f)
                lineTo(145.5f, 38.8f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -35.0f, 0.0f)
                lineTo(82.8f, 88.6f)
                lineToRelative(-47.2f, -21.0f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 8.0f, 90.4f)
                lineTo(33.4f, 198.8f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 53.0f, 214.2f)
                arcToRelative(18.9f, 18.9f, 0.0f, false, false, 5.3f, -0.8f)
                arcToRelative(262.7f, 262.7f, 0.0f, false, true, 139.3f, 0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 24.9f, -14.6f)
                lineTo(248.0f, 90.4f)
                arcTo(19.8f, 19.8f, 0.0f, false, false, 241.3f, 70.5f)
                close()
                moveTo(56.8f, 193.3f)
                close()
                moveTo(200.1f, 189.2f)
                arcToRelative(287.1f, 287.1f, 0.0f, false, false, -144.2f, 0.0f)
                lineTo(33.2f, 92.8f)
                lineTo(76.4f, 112.0f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, 25.6f, -8.6f)
                lineToRelative(26.0f, -46.7f)
                lineToRelative(26.0f, 46.7f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, 25.6f, 8.6f)
                lineToRelative(43.2f, -19.2f)
                close()
            }
        }
        .build()
        return _crownSimple!!
    }

private var _crownSimple: ImageVector? = null
