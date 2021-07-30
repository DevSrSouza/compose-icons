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

public val BrandsGroup.Korvue: ImageVector
    get() {
        if (_korvue != null) {
            return _korvue!!
        }
        _korvue = Builder(name = "Korvue", defaultWidth = 446.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 446.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(386.5f, 34.0f)
                horizontalLineToRelative(-327.0f)
                curveTo(26.8f, 34.0f, 0.0f, 60.8f, 0.0f, 93.5f)
                verticalLineToRelative(327.1f)
                curveTo(0.0f, 453.2f, 26.8f, 480.0f, 59.5f, 480.0f)
                horizontalLineToRelative(327.1f)
                curveToRelative(33.0f, 0.0f, 59.5f, -26.8f, 59.5f, -59.5f)
                verticalLineToRelative(-327.0f)
                curveTo(446.0f, 60.8f, 419.2f, 34.0f, 386.5f, 34.0f)
                close()
                moveTo(87.1f, 120.8f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(116.0f)
                lineToRelative(61.8f, -116.0f)
                horizontalLineToRelative(110.9f)
                lineToRelative(-81.2f, 132.0f)
                lineTo(87.1f, 252.8f)
                verticalLineToRelative(-132.0f)
                close()
                moveTo(248.9f, 392.9f)
                lineToRelative(-65.7f, -113.6f)
                verticalLineToRelative(113.6f)
                horizontalLineToRelative(-96.0f)
                lineTo(87.2f, 262.1f)
                horizontalLineToRelative(191.5f)
                lineToRelative(88.6f, 130.8f)
                lineTo(248.9f, 392.9f)
                close()
            }
        }
        .build()
        return _korvue!!
    }

private var _korvue: ImageVector? = null
