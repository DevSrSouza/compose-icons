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

public val IonIcons.Glasses: ImageVector
    get() {
        if (_glasses != null) {
            return _glasses!!
        }
        _glasses = Builder(name = "Glasses", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.0f, 184.0f)
                horizontalLineTo(453.1f)
                arcToRelative(78.72f, 78.72f, 0.0f, false, false, -16.0f, -7.18f)
                curveTo(419.5f, 171.0f, 396.26f, 168.0f, 368.0f, 168.0f)
                reflectiveCurveToRelative(-51.5f, 3.0f, -69.06f, 8.82f)
                curveToRelative(-14.06f, 4.69f, -20.25f, 9.86f, -22.25f, 11.87f)
                horizontalLineToRelative(0.0f)
                arcToRelative(47.94f, 47.94f, 0.0f, false, false, -41.36f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-2.0f, -2.0f, -8.19f, -7.18f, -22.25f, -11.87f)
                curveTo(195.5f, 171.0f, 172.26f, 168.0f, 144.0f, 168.0f)
                reflectiveCurveToRelative(-51.5f, 3.0f, -69.06f, 8.82f)
                arcToRelative(78.72f, 78.72f, 0.0f, false, false, -16.0f, 7.18f)
                horizontalLineTo(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 32.0f)
                horizontalLineToRelative(0.17f)
                curveToRelative(1.0f, 45.46f, 6.44f, 72.78f, 18.11f, 92.23f)
                arcToRelative(66.78f, 66.78f, 0.0f, false, false, 31.92f, 28.0f)
                curveToRelative(12.23f, 5.24f, 27.22f, 7.79f, 45.8f, 7.79f)
                curveToRelative(24.15f, 0.0f, 58.48f, -3.71f, 77.72f, -35.77f)
                curveToRelative(9.68f, -16.14f, 15.09f, -37.69f, 17.21f, -70.52f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 240.0f, 232.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 1.07f, 5.71f)
                curveToRelative(2.12f, 32.83f, 7.53f, 54.38f, 17.21f, 70.52f)
                arcToRelative(66.78f, 66.78f, 0.0f, false, false, 31.92f, 28.0f)
                curveToRelative(12.23f, 5.24f, 27.22f, 7.79f, 45.8f, 7.79f)
                curveToRelative(24.15f, 0.0f, 58.48f, -3.71f, 77.72f, -35.77f)
                curveToRelative(11.67f, -19.45f, 17.13f, -46.77f, 18.11f, -92.23f)
                horizontalLineTo(464.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -32.0f)
                close()
            }
        }
        .build()
        return _glasses!!
    }

private var _glasses: ImageVector? = null
