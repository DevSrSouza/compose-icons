package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Dev: ImageVector
    get() {
        if (_dev != null) {
            return _dev!!
        }
        _dev = Builder(name = "Dev", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.12f, 208.29f)
                curveToRelative(-3.88f, -2.9f, -7.77f, -4.35f, -11.65f, -4.35f)
                lineTo(91.03f, 203.94f)
                verticalLineToRelative(104.47f)
                horizontalLineToRelative(17.45f)
                curveToRelative(3.88f, 0.0f, 7.77f, -1.45f, 11.65f, -4.35f)
                curveToRelative(3.88f, -2.9f, 5.82f, -7.25f, 5.82f, -13.06f)
                verticalLineToRelative(-69.65f)
                curveToRelative(-0.01f, -5.8f, -1.96f, -10.16f, -5.83f, -13.06f)
                close()
                moveTo(404.1f, 32.0f)
                lineTo(43.9f, 32.0f)
                curveTo(19.7f, 32.0f, 0.06f, 51.59f, 0.0f, 75.8f)
                verticalLineToRelative(360.4f)
                curveTo(0.06f, 460.41f, 19.7f, 480.0f, 43.9f, 480.0f)
                horizontalLineToRelative(360.2f)
                curveToRelative(24.21f, 0.0f, 43.84f, -19.59f, 43.9f, -43.8f)
                lineTo(448.0f, 75.8f)
                curveToRelative(-0.06f, -24.21f, -19.7f, -43.8f, -43.9f, -43.8f)
                close()
                moveTo(154.2f, 291.19f)
                curveToRelative(0.0f, 18.81f, -11.61f, 47.31f, -48.36f, 47.25f)
                horizontalLineToRelative(-46.4f)
                lineTo(59.44f, 172.98f)
                horizontalLineToRelative(47.38f)
                curveToRelative(35.44f, 0.0f, 47.36f, 28.46f, 47.37f, 47.28f)
                lineToRelative(0.01f, 70.93f)
                close()
                moveTo(254.88f, 202.53f)
                lineTo(201.6f, 202.53f)
                verticalLineToRelative(38.42f)
                horizontalLineToRelative(32.57f)
                verticalLineToRelative(29.57f)
                lineTo(201.6f, 270.52f)
                verticalLineToRelative(38.41f)
                horizontalLineToRelative(53.29f)
                verticalLineToRelative(29.57f)
                horizontalLineToRelative(-62.18f)
                curveToRelative(-11.16f, 0.29f, -20.44f, -8.53f, -20.72f, -19.69f)
                lineTo(171.99f, 193.7f)
                curveToRelative(-0.27f, -11.15f, 8.56f, -20.41f, 19.71f, -20.69f)
                horizontalLineToRelative(63.19f)
                lineToRelative(-0.01f, 29.52f)
                close()
                moveTo(358.52f, 317.82f)
                curveToRelative(-13.2f, 30.75f, -36.85f, 24.63f, -47.44f, 0.0f)
                lineToRelative(-38.53f, -144.8f)
                horizontalLineToRelative(32.57f)
                lineToRelative(29.71f, 113.72f)
                lineToRelative(29.57f, -113.72f)
                horizontalLineToRelative(32.58f)
                lineToRelative(-38.46f, 144.8f)
                close()
            }
        }
        .build()
        return _dev!!
    }

private var _dev: ImageVector? = null
