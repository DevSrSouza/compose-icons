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

public val IonIcons.ThumbsDownSharp: ImageVector
    get() {
        if (_thumbsDownSharp != null) {
            return _thumbsDownSharp!!
        }
        _thumbsDownSharp = Builder(name = "ThumbsDownSharp", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.0f, 320.0f)
                lineToRelative(156.05f, 12.0f)
                lineToRelative(-23.0f, 89.4f)
                curveToRelative(-6.08f, 26.6f, 0.7f, 41.87f, 22.39f, 48.62f)
                lineToRelative(34.69f, 9.85f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.4f, -1.72f)
                lineToRelative(129.0f, -202.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.81f, -3.81f)
                horizontalLineTo(496.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(378.39f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -15.18f, -2.46f)
                lineToRelative(-76.3f, -25.43f)
                arcTo(80.0f, 80.0f, 0.0f, false, false, 261.61f, 32.0f)
                horizontalLineTo(83.68f)
                curveToRelative(-19.0f, 0.0f, -31.5f, 13.52f, -35.23f, 32.16f)
                lineTo(16.0f, 206.42f)
                verticalLineTo(280.0f)
                curveTo(16.0f, 302.06f, 34.0f, 318.0f, 56.0f, 320.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(372.66f, 279.16f)
                lineToRelative(-1.0f, 2.0f)
                arcToRelative(16.29f, 16.29f, 0.0f, false, true, 6.77f, -7.26f)
                arcTo(16.48f, 16.48f, 0.0f, false, false, 372.66f, 279.16f)
                close()
            }
        }
        .build()
        return _thumbsDownSharp!!
    }

private var _thumbsDownSharp: ImageVector? = null
