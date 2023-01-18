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

public val IonIcons.MicOffOutline: ImageVector
    get() {
        if (_micOffOutline != null) {
            return _micOffOutline!!
        }
        _micOffOutline = Builder(name = "MicOffOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
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
                arcToRelative(111.58f, 111.58f, 0.0f, false, true, -2.45f, 23.31f)
                arcToRelative(4.05f, 4.05f, 0.0f, false, false, 1.07f, 3.69f)
                lineToRelative(21.82f, 21.81f)
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
                lineTo(307.0f, 342.63f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.51f, -0.78f)
                arcTo(110.78f, 110.78f, 0.0f, false, true, 256.0f, 352.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 80.0f)
                arcToRelative(47.18f, 47.18f, 0.0f, false, true, 48.0f, 48.0f)
                verticalLineToRelative(74.72f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.17f, 2.82f)
                lineTo(332.59f, 233.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 3.41f, -1.42f)
                verticalLineTo(128.91f)
                curveTo(336.0f, 85.0f, 301.0f, 48.6f, 257.14f, 48.0f)
                arcToRelative(79.66f, 79.66f, 0.0f, false, false, -68.47f, 36.57f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.54f, 5.0f)
                lineToRelative(19.54f, 19.54f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 3.25f, -0.63f)
                arcTo(47.44f, 47.44f, 0.0f, false, true, 256.0f, 80.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(207.27f, 242.9f)
                lineTo(179.41f, 215.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -3.41f, 1.42f)
                verticalLineTo(239.0f)
                arcToRelative(80.89f, 80.89f, 0.0f, false, false, 23.45f, 56.9f)
                arcToRelative(78.55f, 78.55f, 0.0f, false, false, 77.8f, 21.19f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.86f, -3.35f)
                lineTo(253.2f, 288.83f)
                arcToRelative(4.08f, 4.08f, 0.0f, false, false, -2.42f, -1.15f)
                curveToRelative(-21.65f, -2.52f, -39.48f, -20.44f, -42.37f, -42.43f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 207.27f, 242.9f)
                close()
            }
        }
        .build()
        return _micOffOutline!!
    }

private var _micOffOutline: ImageVector? = null
