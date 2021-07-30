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

public val BrandsGroup.Artstation: ImageVector
    get() {
        if (_artstation != null) {
            return _artstation!!
        }
        _artstation = Builder(name = "Artstation", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 377.4f)
                lineToRelative(43.0f, 74.3f)
                arcTo(51.35f, 51.35f, 0.0f, false, false, 90.9f, 480.0f)
                horizontalLineToRelative(285.4f)
                lineToRelative(-59.2f, -102.6f)
                close()
                moveTo(501.8f, 350.0f)
                lineTo(335.6f, 59.3f)
                arcTo(51.38f, 51.38f, 0.0f, false, false, 290.2f, 32.0f)
                horizontalLineToRelative(-88.4f)
                lineToRelative(257.3f, 447.6f)
                lineToRelative(40.7f, -70.5f)
                curveToRelative(1.9f, -3.2f, 21.0f, -29.7f, 2.0f, -59.1f)
                close()
                moveTo(275.0f, 304.5f)
                lineToRelative(-115.5f, -200.0f)
                lineTo(44.0f, 304.5f)
                close()
            }
        }
        .build()
        return _artstation!!
    }

private var _artstation: ImageVector? = null
