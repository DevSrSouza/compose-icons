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

public val BrandsGroup.Digg: ImageVector
    get() {
        if (_digg != null) {
            return _digg!!
        }
        _digg = Builder(name = "Digg", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(81.7f, 172.3f)
                lineTo(0.0f, 172.3f)
                verticalLineToRelative(174.4f)
                horizontalLineToRelative(132.7f)
                lineTo(132.7f, 96.0f)
                horizontalLineToRelative(-51.0f)
                verticalLineToRelative(76.3f)
                close()
                moveTo(81.7f, 305.7f)
                lineTo(50.9f, 305.7f)
                verticalLineToRelative(-92.3f)
                horizontalLineToRelative(30.8f)
                verticalLineToRelative(92.3f)
                close()
                moveTo(378.9f, 172.3f)
                verticalLineToRelative(174.4f)
                horizontalLineToRelative(81.8f)
                verticalLineToRelative(28.5f)
                horizontalLineToRelative(-81.8f)
                lineTo(378.9f, 416.0f)
                lineTo(512.0f, 416.0f)
                lineTo(512.0f, 172.3f)
                lineTo(378.9f, 172.3f)
                close()
                moveTo(460.7f, 305.7f)
                horizontalLineToRelative(-30.8f)
                verticalLineToRelative(-92.3f)
                horizontalLineToRelative(30.8f)
                verticalLineToRelative(92.3f)
                close()
                moveTo(225.1f, 346.7f)
                horizontalLineToRelative(82.1f)
                verticalLineToRelative(28.5f)
                horizontalLineToRelative(-82.1f)
                lineTo(225.1f, 416.0f)
                horizontalLineToRelative(133.3f)
                lineTo(358.4f, 172.3f)
                lineTo(225.1f, 172.3f)
                verticalLineToRelative(174.4f)
                close()
                moveTo(276.3f, 213.4f)
                horizontalLineToRelative(30.8f)
                verticalLineToRelative(92.3f)
                horizontalLineToRelative(-30.8f)
                verticalLineToRelative(-92.3f)
                close()
                moveTo(153.3f, 96.0f)
                horizontalLineToRelative(51.3f)
                verticalLineToRelative(51.0f)
                horizontalLineToRelative(-51.3f)
                lineTo(153.3f, 96.0f)
                close()
                moveTo(153.3f, 172.3f)
                horizontalLineToRelative(51.3f)
                verticalLineToRelative(174.4f)
                horizontalLineToRelative(-51.3f)
                lineTo(153.3f, 172.3f)
                close()
            }
        }
        .build()
        return _digg!!
    }

private var _digg: ImageVector? = null
