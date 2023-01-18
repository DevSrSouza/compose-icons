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

public val IonIcons.Train: ImageVector
    get() {
        if (_train != null) {
            return _train!!
        }
        _train = Builder(name = "Train", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(233.337f, 326.664f)
                arcToRelative(31.94f, 32.05f, 45.0f, true, false, 45.326f, -45.326f)
                arcToRelative(31.94f, 32.05f, 45.0f, true, false, -45.326f, 45.326f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.0f, 32.0f)
                lineTo(337.0f, 32.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -7.87f, -3.78f)
                arcTo(31.94f, 31.94f, 0.0f, false, false, 304.0f, 16.0f)
                lineTo(208.0f, 16.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -26.11f, 13.52f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 177.0f, 32.0f)
                lineTo(160.0f, 32.0f)
                curveToRelative(-36.81f, 0.0f, -64.0f, 28.84f, -64.0f, 64.0f)
                lineTo(96.0f, 351.0f)
                curveToRelative(0.0f, 23.27f, 25.6f, 42.06f, 83.0f, 60.94f)
                arcToRelative(753.0f, 753.0f, 0.0f, false, false, 73.77f, 19.73f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 6.46f, 0.0f)
                arcTo(753.0f, 753.0f, 0.0f, false, false, 333.0f, 411.94f)
                curveToRelative(57.4f, -18.88f, 83.0f, -37.67f, 83.0f, -60.94f)
                lineTo(416.0f, 96.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 352.0f, 32.0f)
                close()
                moveTo(184.0f, 128.0f)
                lineTo(328.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(184.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(176.0f, 136.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 184.0f, 128.0f)
                close()
                moveTo(260.18f, 367.87f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 59.69f, -59.69f)
                arcTo(64.07f, 64.07f, 0.0f, false, true, 260.18f, 367.87f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(395.31f, 468.69f)
                lineTo(347.63f, 421.0f)
                curveToRelative(-6.09f, -6.1f, -16.0f, -6.66f, -22.38f, -0.86f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -0.56f, 23.16f)
                lineToRelative(4.68f, 4.69f)
                horizontalLineTo(182.63f)
                lineToRelative(4.36f, -4.37f)
                curveToRelative(6.1f, -6.09f, 6.66f, -16.0f, 0.86f, -22.38f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -23.16f, -0.56f)
                lineToRelative(-48.0f, 48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 22.62f, 22.62f)
                lineTo(150.63f, 480.0f)
                horizontalLineTo(361.37f)
                lineToRelative(11.32f, 11.31f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.62f, -22.62f)
                close()
            }
        }
        .build()
        return _train!!
    }

private var _train: ImageVector? = null
