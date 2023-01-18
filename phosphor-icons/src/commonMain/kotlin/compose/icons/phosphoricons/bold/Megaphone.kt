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

public val BoldGroup.Megaphone: ImageVector
    get() {
        if (_megaphone != null) {
            return _megaphone!!
        }
        _megaphone = Builder(name = "Megaphone", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 120.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, -52.0f, -52.0f)
                lineTo(152.0f, 68.0f)
                curveToRelative(-0.5f, 0.0f, -51.0f, -0.8f, -99.1f, -41.1f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 42.2f)
                lineTo(20.0f, 197.8f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, false, 11.5f, 18.1f)
                arcToRelative(20.3f, 20.3f, 0.0f, false, false, 8.5f, 2.0f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, false, 12.9f, -4.8f)
                arcTo(180.1f, 180.1f, 0.0f, false, true, 132.0f, 174.6f)
                verticalLineToRelative(28.5f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, false, 11.1f, 17.8f)
                lineToRelative(18.6f, 9.4f)
                arcToRelative(20.2f, 20.2f, 0.0f, false, false, 17.3f, 0.3f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, 11.1f, -13.4f)
                lineToRelative(11.5f, -46.1f)
                arcTo(52.1f, 52.1f, 0.0f, false, false, 244.0f, 120.0f)
                close()
                moveTo(44.0f, 189.5f)
                lineTo(44.0f, 50.5f)
                arcToRelative(200.9f, 200.9f, 0.0f, false, false, 88.0f, 39.4f)
                verticalLineToRelative(60.2f)
                arcTo(200.9f, 200.9f, 0.0f, false, false, 44.0f, 189.5f)
                close()
                moveTo(168.0f, 206.6f)
                lineTo(156.0f, 200.6f)
                lineTo(156.0f, 172.0f)
                horizontalLineToRelative(20.6f)
                close()
                moveTo(192.0f, 148.0f)
                lineTo(156.0f, 148.0f)
                lineTo(156.0f, 92.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 0.0f, 56.0f)
                close()
            }
        }
        .build()
        return _megaphone!!
    }

private var _megaphone: ImageVector? = null
