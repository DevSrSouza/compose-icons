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

public val BrandsGroup.Trello: ImageVector
    get() {
        if (_trello != null) {
            return _trello!!
        }
        _trello = Builder(name = "Trello", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(392.3f, 32.0f)
                lineTo(56.1f, 32.0f)
                curveTo(25.1f, 32.0f, 0.0f, 57.1f, 0.0f, 88.0f)
                curveToRelative(-0.1f, 0.0f, 0.0f, -4.0f, 0.0f, 336.0f)
                curveToRelative(0.0f, 30.9f, 25.1f, 56.0f, 56.0f, 56.0f)
                horizontalLineToRelative(336.2f)
                curveToRelative(30.8f, -0.2f, 55.7f, -25.2f, 55.7f, -56.0f)
                lineTo(447.9f, 88.0f)
                curveToRelative(0.1f, -30.8f, -24.8f, -55.8f, -55.6f, -56.0f)
                close()
                moveTo(197.0f, 371.3f)
                curveToRelative(-0.2f, 14.7f, -12.1f, 26.6f, -26.9f, 26.6f)
                lineTo(87.4f, 397.9f)
                curveToRelative(-14.8f, 0.1f, -26.9f, -11.8f, -27.0f, -26.6f)
                lineTo(60.4f, 117.1f)
                curveToRelative(0.0f, -14.8f, 12.0f, -26.9f, 26.9f, -26.9f)
                horizontalLineToRelative(82.9f)
                curveToRelative(14.8f, 0.0f, 26.9f, 12.0f, 26.9f, 26.9f)
                verticalLineToRelative(254.2f)
                close()
                moveTo(390.1f, 259.3f)
                curveToRelative(0.0f, 14.8f, -12.0f, 26.9f, -26.9f, 26.9f)
                horizontalLineToRelative(-81.0f)
                curveToRelative(-14.8f, 0.0f, -26.9f, -12.0f, -26.9f, -26.9f)
                lineTo(255.3f, 117.2f)
                curveToRelative(0.0f, -14.8f, 12.0f, -26.9f, 26.8f, -26.9f)
                horizontalLineToRelative(81.1f)
                curveToRelative(14.8f, 0.0f, 26.9f, 12.0f, 26.9f, 26.9f)
                verticalLineToRelative(142.1f)
                close()
            }
        }
        .build()
        return _trello!!
    }

private var _trello: ImageVector? = null
