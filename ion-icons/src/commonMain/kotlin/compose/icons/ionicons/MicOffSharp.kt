package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Square as StrokeCapSquare
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.MicOffSharp: ImageVector
    get() {
        if (_micOffSharp != null) {
            return _micOffSharp!!
        }
        _micOffSharp = Builder(name = "MicOffSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCapSquare, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(432.0f, 400.0f)
                lineTo(96.0f, 64.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(368.0f, 192.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(111.74f, 111.74f, 0.0f, false, true, -2.93f, 25.45f)
                lineTo(390.65f, 291.0f)
                arcTo(143.07f, 143.07f, 0.0f, false, false, 400.0f, 240.0f)
                verticalLineTo(192.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(272.0f, 432.0f)
                verticalLineTo(383.11f)
                arcToRelative(143.11f, 143.11f, 0.0f, false, false, 56.65f, -18.83f)
                lineTo(305.0f, 340.65f)
                arcTo(112.13f, 112.13f, 0.0f, false, true, 144.0f, 240.0f)
                verticalLineTo(192.0f)
                horizontalLineTo(112.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 74.0f, 56.1f, 135.12f, 128.0f, 143.11f)
                verticalLineTo(432.0f)
                horizontalLineTo(176.0f)
                verticalLineToRelative(32.0f)
                horizontalLineTo(336.0f)
                verticalLineTo(432.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(336.0f, 236.37f)
                verticalLineTo(128.0f)
                curveToRelative(0.0f, -44.86f, -35.14f, -80.0f, -80.0f, -80.0f)
                arcToRelative(79.68f, 79.68f, 0.0f, false, false, -69.0f, 39.34f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 211.63f)
                verticalLineTo(239.0f)
                arcToRelative(80.89f, 80.89f, 0.0f, false, false, 23.45f, 56.9f)
                arcToRelative(78.55f, 78.55f, 0.0f, false, false, 81.0f, 20.21f)
                close()
            }
        }
        .build()
        return _micOffSharp!!
    }

private var _micOffSharp: ImageVector? = null
