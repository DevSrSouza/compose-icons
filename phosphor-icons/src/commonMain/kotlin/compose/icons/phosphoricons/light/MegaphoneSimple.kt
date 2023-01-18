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

public val LightGroup.MegaphoneSimple: ImageVector
    get() {
        if (_megaphoneSimple != null) {
            return _megaphoneSimple!!
        }
        _megaphoneSimple = Builder(name = "MegaphoneSimple", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.9f, 88.6f)
                lineToRelative(-82.1f, -24.0f)
                horizontalLineToRelative(0.0f)
                lineTo(43.9f, 37.2f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -12.3f, 2.3f)
                arcTo(13.6f, 13.6f, 0.0f, false, false, 26.0f, 50.7f)
                lineTo(26.0f, 189.3f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                arcToRelative(13.1f, 13.1f, 0.0f, false, false, 3.9f, -0.5f)
                lineTo(130.0f, 177.7f)
                lineTo(130.0f, 192.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(190.0f, 160.2f)
                lineToRelative(29.9f, -8.8f)
                arcTo(13.9f, 13.9f, 0.0f, false, false, 230.0f, 138.0f)
                lineTo(230.0f, 102.0f)
                arcTo(13.9f, 13.9f, 0.0f, false, false, 219.9f, 88.6f)
                close()
                moveTo(40.6f, 191.3f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, -2.6f, -2.0f)
                lineTo(38.0f, 50.7f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 0.8f, -1.6f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, true, 1.2f, -0.4f)
                horizontalLineToRelative(0.6f)
                lineTo(130.0f, 74.8f)
                verticalLineToRelative(90.4f)
                close()
                moveTo(178.0f, 192.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(144.0f, 194.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(142.0f, 174.2f)
                lineToRelative(36.0f, -10.5f)
                close()
                moveTo(218.0f, 138.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.4f, 1.9f)
                lineToRelative(-34.4f, 10.0f)
                horizontalLineToRelative(0.0f)
                lineTo(142.0f, 161.7f)
                lineTo(142.0f, 78.3f)
                lineToRelative(74.6f, 21.8f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 218.0f, 102.0f)
                close()
            }
        }
        .build()
        return _megaphoneSimple!!
    }

private var _megaphoneSimple: ImageVector? = null
