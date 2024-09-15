package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.EuroSign: ImageVector
    get() {
        if (_euroSign != null) {
            return _euroSign!!
        }
        _euroSign = Builder(name = "EuroSign", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(310.71f, 413.77f)
                curveToRelative(-1.31f, -6.63f, -7.84f, -10.87f, -14.42f, -9.37f)
                curveToRelative(-10.69f, 2.44f, -27.42f, 5.41f, -45.43f, 5.41f)
                curveToRelative(-56.76f, 0.0f, -101.93f, -34.79f, -121.46f, -85.45f)
                horizontalLineToRelative(113.69f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.71f, -9.37f)
                lineToRelative(6.37f, -28.36f)
                curveToRelative(1.69f, -7.5f, -4.02f, -14.63f, -11.71f, -14.63f)
                horizontalLineTo(115.22f)
                curveToRelative(-1.21f, -14.33f, -1.41f, -28.29f, 0.14f, -42.24f)
                horizontalLineTo(261.95f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.72f, -9.43f)
                lineToRelative(6.51f, -29.75f)
                curveToRelative(1.64f, -7.48f, -4.06f, -14.57f, -11.72f, -14.57f)
                horizontalLineTo(130.18f)
                curveToRelative(20.63f, -44.99f, 62.69f, -75.03f, 117.62f, -75.03f)
                curveToRelative(14.49f, 0.0f, 28.56f, 2.25f, 37.85f, 4.14f)
                curveToRelative(6.22f, 1.27f, 12.35f, -2.5f, 14.0f, -8.62f)
                lineToRelative(11.99f, -44.37f)
                curveToRelative(1.82f, -6.74f, -2.46f, -13.62f, -9.33f, -14.92f)
                curveTo(290.22f, 34.91f, 270.71f, 32.0f, 249.63f, 32.0f)
                curveTo(152.45f, 32.0f, 74.03f, 92.25f, 45.08f, 176.0f)
                horizontalLineTo(12.0f)
                curveToRelative(-6.63f, 0.0f, -12.0f, 5.37f, -12.0f, 12.0f)
                verticalLineToRelative(29.75f)
                curveToRelative(0.0f, 6.63f, 5.37f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(21.57f)
                curveToRelative(-1.01f, 13.61f, -1.18f, 29.29f, -0.18f, 42.24f)
                horizontalLineTo(12.0f)
                curveToRelative(-6.63f, 0.0f, -12.0f, 5.37f, -12.0f, 12.0f)
                verticalLineToRelative(28.36f)
                curveToRelative(0.0f, 6.63f, 5.37f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(30.11f)
                curveTo(67.14f, 414.69f, 145.26f, 480.0f, 249.63f, 480.0f)
                curveToRelative(26.3f, 0.0f, 48.56f, -4.54f, 61.1f, -7.79f)
                curveToRelative(6.17f, -1.6f, 10.03f, -7.71f, 8.79f, -13.96f)
                lineToRelative(-8.82f, -44.49f)
                close()
            }
        }
        .build()
        return _euroSign!!
    }

private var _euroSign: ImageVector? = null
