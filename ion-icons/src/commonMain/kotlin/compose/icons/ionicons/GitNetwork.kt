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

public val IonIcons.GitNetwork: ImageVector
    get() {
        if (_gitNetwork != null) {
            return _gitNetwork!!
        }
        _gitNetwork = Builder(name = "GitNetwork", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 96.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, -96.31f, 55.21f)
                curveToRelative(-1.79f, 20.87f, -11.47f, 38.1f, -28.87f, 51.29f)
                curveTo(305.07f, 216.0f, 280.09f, 224.0f, 256.0f, 224.0f)
                reflectiveCurveToRelative(-49.07f, -8.0f, -66.82f, -21.5f)
                curveToRelative(-17.4f, -13.19f, -27.08f, -30.42f, -28.87f, -51.29f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, -64.11f, 0.29f)
                curveToRelative(2.08f, 40.87f, 21.17f, 76.87f, 54.31f, 102.0f)
                curveTo(171.3f, 269.26f, 197.0f, 280.19f, 224.0f, 285.09f)
                verticalLineToRelative(75.52f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 64.0f, 0.0f)
                verticalLineTo(285.09f)
                curveToRelative(27.0f, -4.9f, 52.7f, -15.83f, 73.49f, -31.59f)
                curveToRelative(33.14f, -25.13f, 52.23f, -61.13f, 54.31f, -102.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 448.0f, 96.0f)
                close()
                moveTo(128.0f, 64.0f)
                arcTo(32.0f, 32.0f, 0.0f, true, true, 96.0f, 96.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 128.0f, 64.0f)
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
        return _gitNetwork!!
    }

private var _gitNetwork: ImageVector? = null
