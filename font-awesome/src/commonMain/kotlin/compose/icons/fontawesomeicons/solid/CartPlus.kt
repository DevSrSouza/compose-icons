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

public val SolidGroup.CartPlus: ImageVector
    get() {
        if (_cartPlus != null) {
            return _cartPlus!!
        }
        _cartPlus = Builder(name = "CartPlus", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(504.72f, 320.0f)
                horizontalLineTo(211.57f)
                lineToRelative(6.55f, 32.0f)
                horizontalLineToRelative(268.42f)
                curveToRelative(15.4f, 0.0f, 26.82f, 14.3f, 23.4f, 29.32f)
                lineToRelative(-5.52f, 24.28f)
                curveTo(523.11f, 414.67f, 536.0f, 433.83f, 536.0f, 456.0f)
                curveToRelative(0.0f, 31.2f, -25.52f, 56.44f, -56.82f, 55.99f)
                curveToRelative(-29.82f, -0.43f, -54.35f, -24.63f, -55.15f, -54.45f)
                curveToRelative(-0.44f, -16.29f, 6.09f, -31.05f, 16.8f, -41.55f)
                horizontalLineTo(231.18f)
                curveTo(241.55f, 426.17f, 248.0f, 440.33f, 248.0f, 456.0f)
                curveToRelative(0.0f, 31.81f, -26.53f, 57.43f, -58.67f, 55.94f)
                curveToRelative(-28.54f, -1.33f, -51.75f, -24.39f, -53.25f, -52.92f)
                curveToRelative(-1.16f, -22.03f, 10.44f, -41.46f, 28.05f, -51.59f)
                lineTo(93.88f, 64.0f)
                horizontalLineTo(24.0f)
                curveTo(10.74f, 64.0f, 0.0f, 53.26f, 0.0f, 40.0f)
                verticalLineTo(24.0f)
                curveTo(0.0f, 10.74f, 10.74f, 0.0f, 24.0f, 0.0f)
                horizontalLineToRelative(102.53f)
                curveToRelative(11.4f, 0.0f, 21.23f, 8.02f, 23.51f, 19.19f)
                lineTo(159.21f, 64.0f)
                horizontalLineTo(551.99f)
                curveToRelative(15.4f, 0.0f, 26.82f, 14.3f, 23.4f, 29.32f)
                lineToRelative(-47.27f, 208.0f)
                curveTo(525.64f, 312.25f, 515.92f, 320.0f, 504.72f, 320.0f)
                close()
                moveTo(408.0f, 168.0f)
                horizontalLineToRelative(-48.0f)
                verticalLineToRelative(-40.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                horizontalLineToRelative(-16.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, 7.16f, -16.0f, 16.0f)
                verticalLineToRelative(40.0f)
                horizontalLineToRelative(-48.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, 7.16f, -16.0f, 16.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-40.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _cartPlus!!
    }

private var _cartPlus: ImageVector? = null
