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

public val BrandsGroup.Mdb: ImageVector
    get() {
        if (_mdb != null) {
            return _mdb!!
        }
        _mdb = Builder(name = "Mdb", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.37f, 160.41f)
                lineTo(7.0f, 352.0f)
                horizontalLineToRelative(43.91f)
                lineToRelative(5.59f, -79.83f)
                lineTo(84.43f, 352.0f)
                horizontalLineToRelative(44.71f)
                lineToRelative(25.54f, -77.43f)
                lineToRelative(4.79f, 77.43f)
                lineTo(205.0f, 352.0f)
                lineToRelative(-12.79f, -191.59f)
                lineTo(146.7f, 160.41f)
                lineTo(106.0f, 277.74f)
                lineTo(63.67f, 160.41f)
                close()
                moveTo(298.37f, 160.41f)
                horizontalLineToRelative(-47.9f)
                lineTo(250.47f, 352.0f)
                horizontalLineToRelative(47.9f)
                reflectiveCurveToRelative(95.0f, 0.8f, 94.2f, -95.79f)
                curveToRelative(-0.78f, -94.21f, -94.18f, -95.78f, -94.18f, -95.78f)
                close()
                moveTo(297.17f, 306.87f)
                lineTo(297.17f, 204.78f)
                reflectiveCurveToRelative(46.0f, 4.27f, 46.8f, 50.57f)
                reflectiveCurveToRelative(-46.78f, 51.54f, -46.78f, 51.54f)
                close()
                moveTo(535.46f, 232.63f)
                arcToRelative(56.16f, 56.16f, 0.0f, false, false, 8.0f, -38.31f)
                curveToRelative(-5.34f, -35.76f, -55.08f, -34.32f, -55.08f, -34.32f)
                horizontalLineToRelative(-51.9f)
                verticalLineToRelative(191.58f)
                lineTo(482.0f, 351.58f)
                reflectiveCurveToRelative(87.0f, 4.79f, 87.0f, -63.85f)
                curveToRelative(0.0f, -43.14f, -33.52f, -55.08f, -33.52f, -55.08f)
                close()
                moveTo(483.56f, 200.69f)
                reflectiveCurveToRelative(13.57f, -1.59f, 16.0f, 9.59f)
                curveToRelative(1.43f, 6.66f, -4.0f, 12.0f, -4.0f, 12.0f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(-21.57f)
                close()
                moveTo(483.46f, 310.15f)
                lineToRelative(0.1f, -24.92f)
                lineTo(483.56f, 267.0f)
                horizontalLineToRelative(0.08f)
                reflectiveCurveToRelative(41.58f, -4.73f, 41.19f, 22.43f)
                curveToRelative(-0.33f, 25.65f, -41.35f, 20.74f, -41.35f, 20.74f)
                close()
            }
        }
        .build()
        return _mdb!!
    }

private var _mdb: ImageVector? = null
