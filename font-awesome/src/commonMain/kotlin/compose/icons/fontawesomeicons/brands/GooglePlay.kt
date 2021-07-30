package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.GooglePlay: ImageVector
    get() {
        if (_googlePlay != null) {
            return _googlePlay!!
        }
        _googlePlay = Builder(name = "GooglePlay", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(325.3f, 234.3f)
                lineTo(104.6f, 13.0f)
                lineToRelative(280.8f, 161.2f)
                lineToRelative(-60.1f, 60.1f)
                close()
                moveTo(47.0f, 0.0f)
                curveTo(34.0f, 6.8f, 25.3f, 19.2f, 25.3f, 35.3f)
                verticalLineToRelative(441.3f)
                curveToRelative(0.0f, 16.1f, 8.7f, 28.5f, 21.7f, 35.3f)
                lineToRelative(256.6f, -256.0f)
                lineTo(47.0f, 0.0f)
                close()
                moveTo(472.2f, 225.6f)
                lineToRelative(-58.9f, -34.1f)
                lineToRelative(-65.7f, 64.5f)
                lineToRelative(65.7f, 64.5f)
                lineToRelative(60.1f, -34.1f)
                curveToRelative(18.0f, -14.3f, 18.0f, -46.5f, -1.2f, -60.8f)
                close()
                moveTo(104.6f, 499.0f)
                lineToRelative(280.8f, -161.2f)
                lineToRelative(-60.1f, -60.1f)
                lineTo(104.6f, 499.0f)
                close()
            }
        }
        .build()
        return _googlePlay!!
    }

private var _googlePlay: ImageVector? = null
