package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.Bulb: ImageVector
    get() {
        if (_bulb != null) {
            return _bulb!!
        }
        _bulb = Builder(name = "Bulb", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 464.0f)
                horizontalLineTo(224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 32.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -32.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(304.0f, 416.0f)
                horizontalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 32.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -32.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(369.42f, 62.69f)
                curveTo(339.35f, 32.58f, 299.07f, 16.0f, 256.0f, 16.0f)
                arcTo(159.62f, 159.62f, 0.0f, false, false, 96.0f, 176.0f)
                curveToRelative(0.0f, 46.62f, 17.87f, 90.23f, 49.0f, 119.64f)
                lineToRelative(4.36f, 4.09f)
                curveTo(167.37f, 316.57f, 192.0f, 339.64f, 192.0f, 360.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                verticalLineTo(274.82f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.13f, -7.47f)
                arcTo(130.73f, 130.73f, 0.0f, false, true, 208.71f, 253.0f)
                arcTo(16.0f, 16.0f, 0.0f, true, true, 227.29f, 227.0f)
                curveToRelative(7.4f, 5.24f, 21.65f, 13.0f, 28.71f, 13.0f)
                reflectiveCurveToRelative(21.31f, -7.78f, 28.73f, -13.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 303.29f, 253.0f)
                arcToRelative(130.73f, 130.73f, 0.0f, false, true, -26.16f, 14.32f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.13f, 7.47f)
                verticalLineTo(392.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(360.0f)
                curveToRelative(0.0f, -19.88f, 24.36f, -42.93f, 42.15f, -59.77f)
                lineToRelative(4.91f, -4.66f)
                curveTo(399.08f, 265.0f, 416.0f, 223.61f, 416.0f, 176.0f)
                arcTo(159.16f, 159.16f, 0.0f, false, false, 369.42f, 62.69f)
                close()
            }
        }
        .build()
        return _bulb!!
    }

private var _bulb: ImageVector? = null
