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

public val IonIcons.Beaker: ImageVector
    get() {
        if (_beaker != null) {
            return _beaker!!
        }
        _beaker = Builder(name = "Beaker", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(444.0f, 32.0f)
                horizontalLineTo(128.0f)
                curveToRelative(-19.38f, 0.0f, -45.9f, 4.34f, -64.11f, 24.77f)
                curveTo(52.17f, 69.92f, 48.0f, 85.66f, 48.0f, 96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 13.8f, 15.85f)
                curveTo(91.7f, 116.0f, 96.0f, 117.79f, 96.0f, 136.0f)
                verticalLineTo(400.0f)
                arcTo(80.07f, 80.07f, 0.0f, false, false, 176.0f, 480.0f)
                horizontalLineTo(368.0f)
                arcToRelative(80.11f, 80.11f, 0.0f, false, false, 80.0f, -80.0f)
                verticalLineTo(96.0f)
                curveToRelative(0.0f, -12.55f, 7.46f, -27.25f, 10.0f, -31.36f)
                lineToRelative(0.1f, -0.14f)
                curveToRelative(0.22f, -0.35f, 0.5f, -0.72f, 0.78f, -1.1f)
                curveToRelative(2.0f, -2.79f, 5.09f, -7.0f, 5.09f, -12.95f)
                curveTo(464.0f, 39.79f, 454.89f, 32.0f, 444.0f, 32.0f)
                close()
                moveTo(84.11f, 83.08f)
                curveToRelative(5.24f, -8.87f, 17.17f, -19.0f, 44.29f, -19.0f)
                horizontalLineTo(422.83f)
                curveTo(419.3f, 72.87f, 416.0f, 84.27f, 416.0f, 96.0f)
                verticalLineToRelative(64.0f)
                horizontalLineTo(128.0f)
                verticalLineTo(136.0f)
                curveTo(128.0f, 98.68f, 106.65f, 87.86f, 84.11f, 83.08f)
                close()
            }
        }
        .build()
        return _beaker!!
    }

private var _beaker: ImageVector? = null
