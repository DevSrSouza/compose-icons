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

public val IonIcons.WomanSharp: ImageVector
    get() {
        if (_womanSharp != null) {
            return _womanSharp!!
        }
        _womanSharp = Builder(name = "WomanSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(255.75f, 56.0f)
                moveToRelative(-56.0f, 0.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 112.0f, 0.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, -112.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(310.28f, 191.4f)
                horizontalLineToRelative(0.05f)
                lineToRelative(7.66f, -2.3f)
                lineToRelative(36.79f, 122.6f)
                lineToRelative(46.0f, -13.8f)
                lineToRelative(-16.21f, -54.16f)
                curveToRelative(0.0f, -0.12f, 0.0f, -0.24f, -0.07f, -0.36f)
                lineToRelative(-16.84f, -56.12f)
                lineToRelative(-4.71f, -15.74f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-0.9f, -3.0f)
                horizontalLineTo(362.0f)
                lineToRelative(-2.51f, -8.45f)
                arcToRelative(44.84f, 44.84f, 0.0f, false, false, -43.0f, -32.08f)
                horizontalLineTo(195.24f)
                arcToRelative(44.84f, 44.84f, 0.0f, false, false, -43.0f, 32.08f)
                lineToRelative(-2.51f, 8.45f)
                horizontalLineToRelative(-0.06f)
                lineToRelative(-0.9f, 3.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-4.71f, 15.74f)
                lineToRelative(-16.84f, 56.12f)
                curveToRelative(0.0f, 0.12f, 0.0f, 0.24f, -0.07f, 0.36f)
                lineTo(110.94f, 297.9f)
                lineToRelative(46.0f, 13.8f)
                lineTo(193.7f, 189.1f)
                lineToRelative(7.54f, 2.26f)
                lineTo(148.25f, 368.0f)
                horizontalLineToRelative(51.5f)
                verticalLineTo(512.0f)
                horizontalLineToRelative(52.0f)
                verticalLineTo(368.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(512.0f)
                horizontalLineToRelative(52.0f)
                verticalLineTo(368.0f)
                horizontalLineToRelative(51.51f)
                close()
            }
        }
        .build()
        return _womanSharp!!
    }

private var _womanSharp: ImageVector? = null
