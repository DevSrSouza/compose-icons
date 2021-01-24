package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Gitlab: ImageVector
    get() {
        if (_gitlab != null) {
            return _gitlab!!
        }
        _gitlab = Builder(name = "Gitlab", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(105.2f, 24.9f)
                curveToRelative(-3.1f, -8.9f, -15.7f, -8.9f, -18.9f, 0.0f)
                lineTo(29.8f, 199.7f)
                horizontalLineToRelative(132.0f)
                curveToRelative(-0.1f, 0.0f, -56.6f, -174.8f, -56.6f, -174.8f)
                close()
                moveTo(0.9f, 287.7f)
                curveToRelative(-2.6f, 8.0f, 0.3f, 16.9f, 7.1f, 22.0f)
                lineToRelative(247.9f, 184.0f)
                lineToRelative(-226.2f, -294.0f)
                close()
                moveTo(161.7f, 199.7f)
                lineToRelative(94.3f, 294.0f)
                lineToRelative(94.3f, -294.0f)
                close()
                moveTo(511.1f, 287.7f)
                lineToRelative(-28.8f, -88.0f)
                lineToRelative(-226.3f, 294.0f)
                lineToRelative(247.9f, -184.0f)
                curveToRelative(6.9f, -5.1f, 9.7f, -14.0f, 7.2f, -22.0f)
                close()
                moveTo(425.7f, 24.9f)
                curveToRelative(-3.1f, -8.9f, -15.7f, -8.9f, -18.9f, 0.0f)
                lineToRelative(-56.6f, 174.8f)
                horizontalLineToRelative(132.0f)
                close()
            }
        }
        .build()
        return _gitlab!!
    }

private var _gitlab: ImageVector? = null
