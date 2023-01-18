package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.MicOff: ImageVector
    get() {
        if (_micOff != null) {
            return _micOff!!
        }
        _micOff = Builder(name = "MicOff", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(432.0f, 400.0f)
                lineTo(96.0f, 64.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(400.0f, 240.0f)
                verticalLineTo(208.45f)
                curveToRelative(0.0f, -8.61f, -6.62f, -16.0f, -15.23f, -16.43f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 368.0f, 208.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(111.68f, 111.68f, 0.0f, false, true, -2.68f, 24.38f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.53f, 1.84f)
                lineToRelative(22.59f, 22.59f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 3.29f, -0.72f)
                arcTo(143.27f, 143.27f, 0.0f, false, false, 400.0f, 240.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 352.0f)
                arcTo(112.36f, 112.36f, 0.0f, false, true, 144.0f, 240.0f)
                verticalLineTo(208.45f)
                curveToRelative(0.0f, -8.61f, -6.62f, -16.0f, -15.23f, -16.43f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 112.0f, 208.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 74.0f, 56.1f, 135.12f, 128.0f, 143.11f)
                verticalLineTo(432.0f)
                horizontalLineTo(192.45f)
                curveToRelative(-8.61f, 0.0f, -16.0f, 6.62f, -16.43f, 15.23f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 192.0f, 464.0f)
                horizontalLineTo(319.55f)
                curveToRelative(8.61f, 0.0f, 16.0f, -6.62f, 16.43f, -15.23f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 320.0f, 432.0f)
                horizontalLineTo(272.0f)
                verticalLineTo(383.11f)
                arcToRelative(143.08f, 143.08f, 0.0f, false, false, 52.0f, -16.22f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.91f, -6.35f)
                lineToRelative(-18.4f, -18.39f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.41f, -0.58f)
                arcTo(111.0f, 111.0f, 0.0f, false, true, 256.0f, 352.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(257.14f, 48.0f)
                arcToRelative(79.66f, 79.66f, 0.0f, false, false, -68.47f, 36.57f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.54f, 5.0f)
                lineTo(332.59f, 233.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 3.41f, -1.42f)
                verticalLineTo(128.91f)
                curveTo(336.0f, 85.0f, 301.0f, 48.6f, 257.14f, 48.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(179.41f, 215.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -3.41f, 1.42f)
                verticalLineTo(239.0f)
                arcToRelative(80.89f, 80.89f, 0.0f, false, false, 23.45f, 56.9f)
                arcToRelative(78.55f, 78.55f, 0.0f, false, false, 77.8f, 21.19f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.86f, -3.35f)
                close()
            }
        }
        .build()
        return _micOff!!
    }

private var _micOff: ImageVector? = null
