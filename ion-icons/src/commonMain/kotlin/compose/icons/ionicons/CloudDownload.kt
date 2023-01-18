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

public val IonIcons.CloudDownload: ImageVector
    get() {
        if (_cloudDownload != null) {
            return _cloudDownload!!
        }
        _cloudDownload = Builder(name = "CloudDownload", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(472.7f, 189.5f)
                curveToRelative(-13.26f, -8.43f, -29.83f, -14.56f, -48.08f, -17.93f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 412.0f, 159.28f)
                curveToRelative(-7.86f, -34.51f, -24.6f, -64.13f, -49.15f, -86.58f)
                curveTo(334.15f, 46.45f, 296.21f, 32.0f, 256.0f, 32.0f)
                curveToRelative(-35.35f, 0.0f, -68.0f, 11.08f, -94.37f, 32.0f)
                arcToRelative(150.13f, 150.13f, 0.0f, false, false, -41.95f, 52.83f)
                arcTo(16.05f, 16.05f, 0.0f, false, true, 108.0f, 125.8f)
                curveToRelative(-27.13f, 4.9f, -50.53f, 14.68f, -68.41f, 28.7f)
                curveTo(13.7f, 174.83f, 0.0f, 203.56f, 0.0f, 237.6f)
                curveTo(0.0f, 305.0f, 55.93f, 352.0f, 136.0f, 352.0f)
                horizontalLineTo(240.0f)
                verticalLineTo(224.45f)
                curveToRelative(0.0f, -8.61f, 6.62f, -16.0f, 15.23f, -16.43f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 272.0f, 224.0f)
                verticalLineTo(352.0f)
                horizontalLineTo(396.0f)
                curveToRelative(72.64f, 0.0f, 116.0f, -34.24f, 116.0f, -91.6f)
                curveTo(512.0f, 230.35f, 498.41f, 205.83f, 472.7f, 189.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 425.42f)
                lineToRelative(-36.7f, -36.64f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.6f, 22.65f)
                lineToRelative(64.0f, 63.89f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.6f, 0.0f)
                lineToRelative(64.0f, -63.89f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.6f, -22.65f)
                lineTo(272.0f, 425.42f)
                verticalLineTo(352.0f)
                horizontalLineTo(240.0f)
                close()
            }
        }
        .build()
        return _cloudDownload!!
    }

private var _cloudDownload: ImageVector? = null
