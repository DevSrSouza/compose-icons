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

public val IonIcons.IceCream: ImageVector
    get() {
        if (_iceCream != null) {
            return _iceCream!!
        }
        _iceCream = Builder(name = "IceCream", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(183.0f, 352.0f)
                curveToRelative(-21.84f, -0.52f, -39.0f, -18.9f, -39.0f, -40.74f)
                verticalLineTo(277.19f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.0f, -7.74f)
                curveTo(104.25f, 260.6f, 80.0f, 229.74f, 80.0f, 192.0f)
                arcToRelative(80.14f, 80.14f, 0.0f, false, true, 66.27f, -78.82f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.62f, -6.83f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, true, 206.22f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.62f, 6.83f)
                arcTo(80.0f, 80.0f, 0.0f, false, true, 352.0f, 272.0f)
                arcToRelative(74.33f, 74.33f, 0.0f, false, true, -47.45f, -17.41f)
                arcToRelative(7.93f, 7.93f, 0.0f, false, false, -9.92f, -0.14f)
                arcTo(62.89f, 62.89f, 0.0f, false, true, 256.0f, 268.0f)
                arcToRelative(80.47f, 80.47f, 0.0f, false, true, -21.8f, -3.18f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.2f, 7.69f)
                verticalLineTo(312.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 183.0f, 352.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(263.39f, 299.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.39f, 7.91f)
                verticalLineTo(312.0f)
                arcToRelative(72.11f, 72.11f, 0.0f, false, true, -50.69f, 68.76f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.91f, 10.78f)
                lineToRelative(40.91f, 94.8f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 256.0f, 496.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 14.69f, -9.7f)
                lineToRelative(73.78f, -172.15f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.2f, -11.07f)
                arcToRelative(106.31f, 106.31f, 0.0f, false, true, -35.9f, -11.59f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.13f, -0.2f)
                arcTo(95.0f, 95.0f, 0.0f, false, true, 263.39f, 299.7f)
                close()
            }
        }
        .build()
        return _iceCream!!
    }

private var _iceCream: ImageVector? = null
