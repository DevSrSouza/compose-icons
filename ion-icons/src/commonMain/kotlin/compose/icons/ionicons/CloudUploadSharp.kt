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

public val IonIcons.CloudUploadSharp: ImageVector
    get() {
        if (_cloudUploadSharp != null) {
            return _cloudUploadSharp!!
        }
        _cloudUploadSharp = Builder(name = "CloudUploadSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(473.66f, 210.0f)
                curveToRelative(-16.56f, -12.3f, -37.7f, -20.75f, -59.52f, -24.0f)
                curveToRelative(-6.62f, -39.18f, -24.21f, -72.67f, -51.3f, -97.45f)
                curveTo(334.15f, 62.25f, 296.21f, 47.79f, 256.0f, 47.79f)
                curveToRelative(-35.35f, 0.0f, -68.0f, 11.08f, -94.37f, 32.05f)
                arcToRelative(149.61f, 149.61f, 0.0f, false, false, -45.32f, 60.49f)
                curveToRelative(-29.94f, 4.6f, -57.12f, 16.68f, -77.39f, 34.55f)
                curveTo(13.46f, 197.33f, 0.0f, 227.24f, 0.0f, 261.39f)
                curveToRelative(0.0f, 34.52f, 14.49f, 66.0f, 40.79f, 88.76f)
                curveToRelative(25.12f, 21.69f, 58.94f, 33.64f, 95.21f, 33.64f)
                horizontalLineTo(240.0f)
                verticalLineTo(230.42f)
                lineToRelative(-48.0f, 48.0f)
                lineToRelative(-22.63f, -22.63f)
                lineTo(256.0f, 169.17f)
                lineToRelative(86.63f, 86.62f)
                lineTo(320.0f, 278.42f)
                lineToRelative(-48.0f, -48.0f)
                verticalLineTo(383.79f)
                horizontalLineTo(396.0f)
                curveToRelative(31.34f, 0.0f, 59.91f, -8.8f, 80.45f, -24.77f)
                curveToRelative(23.26f, -18.1f, 35.55f, -44.0f, 35.55f, -74.83f)
                curveTo(512.0f, 254.25f, 498.74f, 228.58f, 473.66f, 210.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 383.79f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(80.41f)
                horizontalLineToRelative(-32.0f)
                close()
            }
        }
        .build()
        return _cloudUploadSharp!!
    }

private var _cloudUploadSharp: ImageVector? = null
