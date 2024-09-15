package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.Flag: ImageVector
    get() {
        if (_flag != null) {
            return _flag!!
        }
        _flag = Builder(name = "Flag", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(336.17f, 80.0f)
                curveToRelative(-49.13f, 0.0f, -93.31f, -32.0f, -161.91f, -32.0f)
                curveToRelative(-31.3f, 0.0f, -58.3f, 6.48f, -80.72f, 15.17f)
                arcToRelative(48.04f, 48.04f, 0.0f, false, false, 2.14f, -20.73f)
                curveTo(93.07f, 19.58f, 74.17f, 1.59f, 51.2f, 0.1f)
                curveTo(23.24f, -1.71f, 0.0f, 20.43f, 0.0f, 48.0f)
                curveToRelative(0.0f, 17.76f, 9.66f, 33.26f, 24.0f, 41.56f)
                verticalLineTo(496.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-83.44f)
                curveTo(109.87f, 395.28f, 143.26f, 384.0f, 199.83f, 384.0f)
                curveToRelative(49.13f, 0.0f, 93.31f, 32.0f, 161.91f, 32.0f)
                curveToRelative(58.48f, 0.0f, 101.97f, -22.62f, 128.55f, -39.98f)
                curveTo(503.85f, 367.16f, 512.0f, 352.05f, 512.0f, 335.86f)
                verticalLineTo(95.94f)
                curveToRelative(0.0f, -34.46f, -35.26f, -57.77f, -66.9f, -44.12f)
                curveTo(409.19f, 67.31f, 371.64f, 80.0f, 336.17f, 80.0f)
                close()
                moveTo(464.0f, 336.0f)
                curveToRelative(-21.78f, 15.41f, -60.82f, 32.0f, -102.26f, 32.0f)
                curveToRelative(-59.94f, 0.0f, -102.0f, -32.0f, -161.91f, -32.0f)
                curveToRelative(-43.36f, 0.0f, -96.38f, 9.4f, -127.83f, 24.0f)
                verticalLineTo(128.0f)
                curveToRelative(21.78f, -15.41f, 60.82f, -32.0f, 102.26f, -32.0f)
                curveToRelative(59.94f, 0.0f, 102.0f, 32.0f, 161.91f, 32.0f)
                curveToRelative(43.27f, 0.0f, 96.32f, -17.37f, 127.83f, -32.0f)
                verticalLineToRelative(240.0f)
                close()
            }
        }
        .build()
        return _flag!!
    }

private var _flag: ImageVector? = null
