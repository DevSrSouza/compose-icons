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

public val IonIcons.TextSharp: ImageVector
    get() {
        if (_textSharp != null) {
            return _textSharp!!
        }
        _textSharp = Builder(name = "TextSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(404.42f, 170.0f)
                curveToRelative(-41.23f, 0.0f, -78.07f, 24.06f, -93.85f, 61.3f)
                lineTo(304.0f, 246.52f)
                lineToRelative(40.33f, 17.18f)
                lineToRelative(6.56f, -15.22f)
                curveToRelative(8.9f, -21.0f, 29.91f, -34.55f, 53.53f, -34.55f)
                curveToRelative(34.55f, 0.0f, 57.76f, 23.27f, 57.76f, 57.91f)
                verticalLineToRelative(2.3f)
                curveToRelative(-22.12f, 0.59f, -48.65f, 2.05f, -72.27f, 4.84f)
                curveToRelative(-54.52f, 6.43f, -87.06f, 36.23f, -87.06f, 79.72f)
                curveToRelative(0.0f, 23.16f, 8.72f, 44.0f, 24.56f, 58.59f)
                curveTo(342.28f, 431.0f, 362.55f, 438.0f, 384.51f, 438.0f)
                curveToRelative(30.86f, 0.0f, 57.5f, -7.33f, 77.67f, -22.64f)
                verticalLineTo(438.0f)
                horizontalLineTo(506.0f)
                verticalLineTo(271.84f)
                curveTo(506.0f, 212.83f, 463.28f, 170.0f, 404.42f, 170.0f)
                close()
                moveTo(384.51f, 395.07f)
                curveToRelative(-17.46f, 0.0f, -37.85f, -9.84f, -37.85f, -36.37f)
                curveToRelative(0.0f, -10.65f, 3.82f, -18.11f, 12.38f, -24.19f)
                curveToRelative(8.34f, -5.92f, 21.12f, -10.15f, 36.0f, -11.9f)
                curveToRelative(21.78f, -2.57f, 46.31f, -3.95f, 67.0f, -4.52f)
                curveTo(459.88f, 369.58f, 434.47f, 395.07f, 384.51f, 395.07f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(93.25f, 325.87f)
                horizontalLineToRelative(125.5f)
                lineTo(260.94f, 438.0f)
                horizontalLineTo(308.0f)
                lineTo(155.0f, 48.0f)
                lineTo(4.0f, 438.0f)
                horizontalLineTo(51.06f)
                close()
                moveTo(156.0f, 160.71f)
                lineTo(202.25f, 282.0f)
                horizontalLineToRelative(-92.5f)
                close()
            }
        }
        .build()
        return _textSharp!!
    }

private var _textSharp: ImageVector? = null
