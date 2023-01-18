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

public val IonIcons.Bicycle: ImageVector
    get() {
        if (_bicycle != null) {
            return _bicycle!!
        }
        _bicycle = Builder(name = "Bicycle", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(388.0f, 448.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, 92.0f, -92.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 388.0f, 448.0f)
                close()
                moveTo(388.0f, 296.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, false, 60.0f, 60.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, false, 388.0f, 296.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(124.0f, 448.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, 92.0f, -92.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 124.0f, 448.0f)
                close()
                moveTo(124.0f, 296.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, false, 60.0f, 60.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, false, 124.0f, 296.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 128.0f)
                arcToRelative(31.89f, 31.89f, 0.0f, false, false, 32.0f, -32.1f)
                arcTo(31.55f, 31.55f, 0.0f, false, false, 320.2f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -0.2f, 64.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(367.55f, 192.0f)
                horizontalLineTo(323.79f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.51f, -2.08f)
                lineToRelative(-31.74f, -58.17f)
                horizontalLineToRelative(0.0f)
                arcTo(31.0f, 31.0f, 0.0f, false, false, 239.16f, 124.0f)
                horizontalLineToRelative(0.0f)
                lineTo(169.3f, 194.4f)
                arcToRelative(32.56f, 32.56f, 0.0f, false, false, -9.3f, 22.4f)
                curveToRelative(0.0f, 17.4f, 12.6f, 23.6f, 18.5f, 27.1f)
                curveTo(207.0f, 260.32f, 227.07f, 272.33f, 238.08f, 279.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.92f, 3.41f)
                verticalLineToRelative(69.12f)
                curveToRelative(0.0f, 8.61f, 6.62f, 16.0f, 15.23f, 16.43f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 272.0f, 352.0f)
                verticalLineTo(266.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -6.66f, -13.0f)
                lineToRelative(-37.0f, -26.61f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.58f, -6.0f)
                lineToRelative(42.0f, -44.79f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.42f, 0.79f)
                lineTo(298.0f, 215.77f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 312.0f, 224.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.77f)
                curveTo(383.58f, 198.62f, 376.16f, 192.0f, 367.55f, 192.0f)
                close()
            }
        }
        .build()
        return _bicycle!!
    }

private var _bicycle: ImageVector? = null
