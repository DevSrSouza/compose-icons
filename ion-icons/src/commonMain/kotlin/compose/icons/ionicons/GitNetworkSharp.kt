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

public val IonIcons.GitNetworkSharp: ImageVector
    get() {
        if (_gitNetworkSharp != null) {
            return _gitNetworkSharp!!
        }
        _gitNetworkSharp = Builder(name = "GitNetworkSharp", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 32.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, -57.67f, 91.73f)
                lineTo(255.5f, 204.55f)
                lineToRelative(-70.19f, -80.1f)
                arcTo(64.0f, 64.0f, 0.0f, true, false, 128.0f, 160.0f)
                curveToRelative(1.1f, 0.0f, 2.2f, 0.0f, 3.29f, -0.08f)
                lineTo(224.0f, 265.7f)
                verticalLineToRelative(94.91f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 64.0f, 0.0f)
                verticalLineTo(264.56f)
                lineToRelative(91.78f, -104.71f)
                curveToRelative(1.39f, 0.09f, 2.8f, 0.15f, 4.22f, 0.15f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 0.0f, -128.0f)
                close()
                moveTo(96.0f, 96.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 96.0f, 96.0f)
                close()
                moveTo(256.0f, 448.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 256.0f, 448.0f)
                close()
                moveTo(384.0f, 128.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 384.0f, 128.0f)
                close()
            }
        }
        .build()
        return _gitNetworkSharp!!
    }

private var _gitNetworkSharp: ImageVector? = null
