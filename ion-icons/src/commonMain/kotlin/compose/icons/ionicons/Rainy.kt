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

public val IonIcons.Rainy: ImageVector
    get() {
        if (_rainy != null) {
            return _rainy!!
        }
        _rainy = Builder(name = "Rainy", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(456.26f, 139.37f)
                curveToRelative(-16.77f, -16.73f, -39.17f, -28.41f, -65.17f, -34.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -11.19f, -9.0f)
                arcToRelative(142.24f, 142.24f, 0.0f, false, false, -42.19f, -53.21f)
                curveTo(314.48f, 25.39f, 286.23f, 16.0f, 256.0f, 16.0f)
                arcToRelative(140.24f, 140.24f, 0.0f, false, false, -93.5f, 35.32f)
                curveToRelative(-24.2f, 21.56f, -40.91f, 51.34f, -48.43f, 85.83f)
                arcToRelative(16.05f, 16.05f, 0.0f, false, true, -11.72f, 12.18f)
                curveToRelative(-25.0f, 6.3f, -35.71f, 12.54f, -49.21f, 24.56f)
                curveTo(34.0f, 190.93f, 24.0f, 214.14f, 24.0f, 240.8f)
                curveToRelative(0.0f, 30.55f, 11.23f, 55.64f, 32.47f, 72.56f)
                curveTo(75.08f, 328.17f, 100.5f, 336.0f, 130.0f, 336.0f)
                horizontalLineTo(364.0f)
                curveToRelative(33.2f, 0.0f, 64.11f, -11.46f, 87.0f, -32.28f)
                curveToRelative(23.84f, -21.65f, 37.0f, -51.67f, 37.0f, -84.52f)
                curveTo(488.0f, 187.71f, 477.0f, 160.11f, 456.26f, 139.37f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.0f, 448.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -13.3f, -24.88f)
                lineToRelative(32.0f, -48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 26.62f, 17.76f)
                lineToRelative(-32.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 112.0f, 448.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 496.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -13.29f, -24.88f)
                lineToRelative(64.0f, -96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 26.62f, 17.76f)
                lineToRelative(-64.0f, 96.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 160.0f, 496.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(272.0f, 448.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -13.3f, -24.88f)
                lineToRelative(32.0f, -48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 26.62f, 17.76f)
                lineToRelative(-32.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 272.0f, 448.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 496.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -13.3f, -24.88f)
                lineToRelative(64.0f, -96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 26.62f, 17.76f)
                lineToRelative(-64.0f, 96.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 320.0f, 496.0f)
                close()
            }
        }
        .build()
        return _rainy!!
    }

private var _rainy: ImageVector? = null
