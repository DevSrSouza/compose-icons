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

public val BrandsGroup.Ideal: ImageVector
    get() {
        if (_ideal != null) {
            return _ideal!!
        }
        _ideal = Builder(name = "Ideal", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(125.61f, 165.48f)
                arcToRelative(49.07f, 49.07f, 0.0f, true, false, 49.06f, 49.06f)
                arcTo(49.08f, 49.08f, 0.0f, false, false, 125.61f, 165.48f)
                close()
                moveTo(86.15f, 425.84f)
                horizontalLineToRelative(78.94f)
                lineTo(165.09f, 285.32f)
                lineTo(86.15f, 285.32f)
                close()
                moveTo(237.61f, 214.24f)
                curveToRelative(0.0f, -20.0f, -10.0f, -22.53f, -18.74f, -22.53f)
                lineTo(204.82f, 191.71f)
                lineTo(204.82f, 237.5f)
                horizontalLineToRelative(14.05f)
                curveTo(228.62f, 237.5f, 237.61f, 234.69f, 237.61f, 214.24f)
                close()
                moveTo(439.3f, 260.24f)
                lineTo(439.3f, 168.93f)
                horizontalLineToRelative(22.75f)
                lineTo(462.05f, 237.5f)
                horizontalLineToRelative(33.69f)
                curveTo(486.5f, 113.08f, 388.61f, 86.19f, 299.67f, 86.19f)
                lineTo(204.84f, 86.19f)
                lineTo(204.84f, 169.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(25.6f, 0.0f, 41.5f, 17.35f, 41.5f, 45.26f)
                curveToRelative(0.0f, 28.81f, -15.52f, 46.0f, -41.5f, 46.0f)
                horizontalLineToRelative(-14.0f)
                lineTo(204.84f, 425.88f)
                horizontalLineToRelative(94.83f)
                curveToRelative(144.61f, 0.0f, 194.94f, -67.16f, 196.72f, -165.64f)
                close()
                moveTo(329.55f, 260.24f)
                lineTo(273.3f, 260.24f)
                lineTo(273.3f, 169.0f)
                horizontalLineToRelative(54.43f)
                verticalLineToRelative(22.73f)
                lineTo(296.0f, 191.73f)
                verticalLineToRelative(10.58f)
                horizontalLineToRelative(30.0f)
                lineTo(326.0f, 225.0f)
                lineTo(296.0f, 225.0f)
                lineTo(296.0f, 237.5f)
                horizontalLineToRelative(33.51f)
                close()
                moveTo(404.21f, 260.24f)
                lineTo(399.05f, 242.57f)
                lineTo(369.31f, 242.57f)
                lineToRelative(-5.18f, 17.67f)
                lineTo(340.47f, 260.24f)
                lineTo(368.0f, 168.92f)
                horizontalLineToRelative(32.35f)
                lineToRelative(27.53f, 91.34f)
                close()
                moveTo(299.65f, 32.0f)
                lineTo(32.0f, 32.0f)
                lineTo(32.0f, 480.0f)
                lineTo(299.65f, 480.0f)
                curveToRelative(161.85f, 0.0f, 251.0f, -79.73f, 251.0f, -224.52f)
                curveTo(550.62f, 172.0f, 518.0f, 32.0f, 299.65f, 32.0f)
                close()
                moveTo(299.65f, 458.92f)
                lineTo(53.07f, 458.92f)
                lineTo(53.07f, 53.07f)
                lineTo(299.65f, 53.07f)
                curveToRelative(142.1f, 0.0f, 229.9f, 64.61f, 229.9f, 202.41f)
                curveTo(529.55f, 389.57f, 448.55f, 458.92f, 299.65f, 458.92f)
                close()
                moveTo(383.51f, 194.07f)
                lineTo(376.0f, 219.88f)
                lineTo(392.4f, 219.88f)
                lineToRelative(-7.52f, -25.81f)
                close()
            }
        }
        .build()
        return _ideal!!
    }

private var _ideal: ImageVector? = null
