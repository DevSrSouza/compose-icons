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

public val BrandsGroup.Rev: ImageVector
    get() {
        if (_rev != null) {
            return _rev!!
        }
        _rev = Builder(name = "Rev", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(289.67f, 274.89f)
                arcToRelative(65.57f, 65.57f, 0.0f, true, true, -65.56f, -65.56f)
                arcToRelative(65.64f, 65.64f, 0.0f, false, true, 65.56f, 65.56f)
                close()
                moveTo(429.22f, 269.84f)
                horizontalLineToRelative(-0.13f)
                arcToRelative(204.69f, 204.69f, 0.0f, false, false, -74.32f, -153.0f)
                lineToRelative(-45.38f, 26.2f)
                arcToRelative(157.07f, 157.07f, 0.0f, false, true, 71.81f, 131.84f)
                curveTo(381.2f, 361.5f, 310.73f, 432.0f, 224.11f, 432.0f)
                reflectiveCurveTo(67.0f, 361.5f, 67.0f, 274.88f)
                curveToRelative(0.0f, -81.88f, 63.0f, -149.27f, 143.0f, -156.43f)
                verticalLineToRelative(39.12f)
                lineToRelative(108.77f, -62.79f)
                lineTo(210.0f, 32.0f)
                verticalLineToRelative(38.32f)
                curveToRelative(-106.7f, 7.25f, -191.0f, 96.0f, -191.0f, 204.57f)
                curveToRelative(0.0f, 111.59f, 89.12f, 202.29f, 200.06f, 205.0f)
                verticalLineToRelative(0.11f)
                horizontalLineToRelative(210.16f)
                lineTo(429.22f, 269.84f)
                close()
            }
        }
        .build()
        return _rev!!
    }

private var _rev: ImageVector? = null
