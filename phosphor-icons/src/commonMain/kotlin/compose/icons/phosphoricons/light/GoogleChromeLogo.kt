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

public val LightGroup.GoogleChromeLogo: ImageVector
    get() {
        if (_googleChromeLogo != null) {
            return _googleChromeLogo!!
        }
        _googleChromeLogo = Builder(name = "GoogleChromeLogo", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.2f, 102.2f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(128.0f, 38.0f)
                arcToRelative(90.1f, 90.1f, 0.0f, false, true, 79.6f, 48.0f)
                lineTo(128.0f, 86.0f)
                arcToRelative(42.2f, 42.2f, 0.0f, false, false, -40.7f, 31.5f)
                lineTo(59.6f, 69.6f)
                arcTo(89.9f, 89.9f, 0.0f, false, true, 128.0f, 38.0f)
                close()
                moveTo(158.0f, 128.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, true, -30.0f, -30.0f)
                arcTo(30.1f, 30.1f, 0.0f, false, true, 158.0f, 128.0f)
                close()
                moveTo(38.0f, 128.0f)
                arcTo(90.0f, 90.0f, 0.0f, false, true, 51.8f, 80.1f)
                lineTo(91.6f, 149.0f)
                lineToRelative(0.2f, 0.2f)
                arcTo(41.8f, 41.8f, 0.0f, false, false, 128.0f, 170.0f)
                arcToRelative(38.6f, 38.6f, 0.0f, false, false, 11.3f, -1.6f)
                lineToRelative(-27.7f, 48.1f)
                arcTo(90.2f, 90.2f, 0.0f, false, true, 38.0f, 128.0f)
                close()
                moveTo(128.0f, 218.0f)
                horizontalLineToRelative(-3.4f)
                lineTo(164.4f, 149.0f)
                lineToRelative(0.2f, -0.4f)
                arcTo(42.0f, 42.0f, 0.0f, false, false, 157.4f, 98.0f)
                horizontalLineToRelative(55.5f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 128.0f, 218.0f)
                close()
            }
        }
        .build()
        return _googleChromeLogo!!
    }

private var _googleChromeLogo: ImageVector? = null
