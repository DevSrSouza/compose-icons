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

public val IonIcons.CloudDownloadSharp: ImageVector
    get() {
        if (_cloudDownloadSharp != null) {
            return _cloudDownloadSharp!!
        }
        _cloudDownloadSharp = Builder(name = "CloudDownloadSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(472.7f, 189.5f)
                curveToRelative(-15.76f, -10.0f, -36.21f, -16.79f, -58.59f, -19.54f)
                curveToRelative(-6.65f, -39.1f, -24.22f, -72.52f, -51.27f, -97.26f)
                curveTo(334.15f, 46.45f, 296.21f, 32.0f, 256.0f, 32.0f)
                curveToRelative(-35.35f, 0.0f, -68.0f, 11.08f, -94.37f, 32.0f)
                arcToRelative(149.7f, 149.7f, 0.0f, false, false, -45.29f, 60.42f)
                curveToRelative(-30.67f, 4.32f, -57.0f, 14.61f, -76.71f, 30.0f)
                curveTo(13.7f, 174.83f, 0.0f, 203.56f, 0.0f, 237.6f)
                curveTo(0.0f, 305.0f, 55.92f, 352.0f, 136.0f, 352.0f)
                horizontalLineTo(240.0f)
                verticalLineTo(208.0f)
                horizontalLineToRelative(32.0f)
                verticalLineTo(352.0f)
                horizontalLineTo(396.0f)
                curveToRelative(72.64f, 0.0f, 116.0f, -34.24f, 116.0f, -91.6f)
                curveTo(512.0f, 230.35f, 498.41f, 205.83f, 472.7f, 189.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 419.42f)
                lineToRelative(-48.02f, -48.42f)
                lineToRelative(-22.61f, 23.0f)
                lineToRelative(86.63f, 86.0f)
                lineToRelative(86.63f, -86.0f)
                lineToRelative(-22.61f, -23.0f)
                lineToRelative(-48.02f, 48.42f)
                lineToRelative(0.0f, -67.42f)
                lineToRelative(-32.0f, 0.0f)
                lineToRelative(0.0f, 67.42f)
                close()
            }
        }
        .build()
        return _cloudDownloadSharp!!
    }

private var _cloudDownloadSharp: ImageVector? = null
