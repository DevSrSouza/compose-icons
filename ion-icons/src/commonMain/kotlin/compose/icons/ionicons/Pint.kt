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

public val IonIcons.Pint: ImageVector
    get() {
        if (_pint != null) {
            return _pint!!
        }
        _pint = Builder(name = "Pint", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(399.0f, 99.29f)
                curveToRelative(-0.15f, -2.13f, -0.3f, -4.35f, -0.44f, -6.68f)
                lineTo(395.69f, 46.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -31.91f, -30.0f)
                horizontalLineTo(148.21f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 116.3f, 46.0f)
                lineToRelative(-2.91f, 46.63f)
                curveToRelative(-0.14f, 2.31f, -0.29f, 4.51f, -0.43f, 6.62f)
                curveToRelative(-1.29f, 19.24f, -2.23f, 33.14f, 3.73f, 65.66f)
                curveToRelative(1.67f, 9.11f, 5.22f, 22.66f, 9.73f, 39.82f)
                curveToRelative(12.61f, 48.0f, 33.71f, 128.36f, 33.71f, 195.63f)
                verticalLineTo(472.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f)
                horizontalLineTo(327.87f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, -24.0f)
                verticalLineTo(400.38f)
                curveToRelative(0.0f, -77.09f, 21.31f, -153.29f, 34.0f, -198.81f)
                curveToRelative(4.38f, -15.63f, 7.83f, -28.0f, 9.41f, -36.62f)
                curveTo(401.27f, 132.44f, 400.33f, 118.53f, 399.0f, 99.29f)
                close()
                moveTo(364.0f, 51.75f)
                lineToRelative(1.5f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.25f)
                horizontalLineToRelative(-211.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.25f)
                lineToRelative(1.48f, -24.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 152.0f, 48.0f)
                horizontalLineTo(360.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 364.0f, 51.75f)
                close()
            }
        }
        .build()
        return _pint!!
    }

private var _pint: ImageVector? = null
