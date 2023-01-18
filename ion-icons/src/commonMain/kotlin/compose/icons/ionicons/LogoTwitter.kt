package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.LogoTwitter: ImageVector
    get() {
        if (_logoTwitter != null) {
            return _logoTwitter!!
        }
        _logoTwitter = Builder(name = "LogoTwitter", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(496.0f, 109.5f)
                arcToRelative(201.8f, 201.8f, 0.0f, false, true, -56.55f, 15.3f)
                arcToRelative(97.51f, 97.51f, 0.0f, false, false, 43.33f, -53.6f)
                arcToRelative(197.74f, 197.74f, 0.0f, false, true, -62.56f, 23.5f)
                arcTo(99.14f, 99.14f, 0.0f, false, false, 348.31f, 64.0f)
                curveToRelative(-54.42f, 0.0f, -98.46f, 43.4f, -98.46f, 96.9f)
                arcToRelative(93.21f, 93.21f, 0.0f, false, false, 2.54f, 22.1f)
                arcToRelative(280.7f, 280.7f, 0.0f, false, true, -203.0f, -101.3f)
                arcTo(95.69f, 95.69f, 0.0f, false, false, 36.0f, 130.4f)
                curveTo(36.0f, 164.0f, 53.53f, 193.7f, 80.0f, 211.1f)
                arcTo(97.5f, 97.5f, 0.0f, false, true, 35.22f, 199.0f)
                verticalLineToRelative(1.2f)
                curveToRelative(0.0f, 47.0f, 34.0f, 86.1f, 79.0f, 95.0f)
                arcToRelative(100.76f, 100.76f, 0.0f, false, true, -25.94f, 3.4f)
                arcToRelative(94.38f, 94.38f, 0.0f, false, true, -18.51f, -1.8f)
                curveToRelative(12.51f, 38.5f, 48.92f, 66.5f, 92.05f, 67.3f)
                arcTo(199.59f, 199.59f, 0.0f, false, true, 39.5f, 405.6f)
                arcTo(203.0f, 203.0f, 0.0f, false, true, 16.0f, 404.2f)
                arcTo(278.68f, 278.68f, 0.0f, false, false, 166.74f, 448.0f)
                curveToRelative(181.36f, 0.0f, 280.44f, -147.7f, 280.44f, -275.8f)
                curveToRelative(0.0f, -4.2f, -0.11f, -8.4f, -0.31f, -12.5f)
                arcTo(198.48f, 198.48f, 0.0f, false, false, 496.0f, 109.5f)
                close()
            }
        }
        .build()
        return _logoTwitter!!
    }

private var _logoTwitter: ImageVector? = null
