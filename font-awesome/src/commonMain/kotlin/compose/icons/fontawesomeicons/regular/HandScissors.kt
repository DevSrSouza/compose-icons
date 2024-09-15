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

public val RegularGroup.HandScissors: ImageVector
    get() {
        if (_handScissors != null) {
            return _handScissors!!
        }
        _handScissors = Builder(name = "HandScissors", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 480.0f)
                lineToRelative(70.0f, -0.01f)
                curveToRelative(5.11f, 0.0f, 10.23f, -0.58f, 15.2f, -1.73f)
                lineToRelative(119.0f, -27.43f)
                curveTo(490.56f, 443.83f, 512.0f, 417.02f, 512.0f, 386.28f)
                lineTo(512.0f, 180.57f)
                curveToRelative(0.0f, -23.84f, -13.03f, -45.95f, -34.01f, -57.69f)
                lineToRelative(-98.0f, -54.85f)
                curveToRelative(-34.41f, -19.26f, -67.26f, -5.82f, -92.22f, 24.73f)
                lineTo(142.85f, 37.01f)
                curveToRelative(-37.89f, -14.58f, -80.61f, 3.73f, -95.64f, 41.2f)
                curveToRelative(-15.1f, 37.64f, 3.63f, 80.37f, 41.94f, 95.11f)
                lineTo(168.0f, 192.0f)
                lineToRelative(-94.0f, -9.14f)
                curveToRelative(-40.8f, 0.0f, -74.0f, 32.81f, -74.0f, 73.14f)
                curveToRelative(0.0f, 40.33f, 33.2f, 73.14f, 74.0f, 73.14f)
                horizontalLineToRelative(87.64f)
                curveToRelative(-3.67f, 26.25f, 8.69f, 51.3f, 30.34f, 65.01f)
                curveTo(178.66f, 436.74f, 211.04f, 480.0f, 256.0f, 480.0f)
                close()
                moveTo(256.0f, 431.99f)
                curveToRelative(-25.16f, 0.0f, -25.12f, -36.57f, 0.0f, -36.57f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-6.86f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                horizontalLineToRelative(-28.0f)
                curveToRelative(-25.16f, 0.0f, -25.12f, -36.57f, 0.0f, -36.57f)
                horizontalLineToRelative(28.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-6.86f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                lineTo(74.0f, 281.14f)
                curveToRelative(-34.43f, 0.0f, -34.38f, -50.28f, 0.0f, -50.28f)
                horizontalLineToRelative(182.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-11.63f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -10.25f, -14.93f)
                lineTo(106.39f, 128.51f)
                curveToRelative(-31.55f, -12.14f, -13.43f, -59.28f, 19.22f, -46.72f)
                lineToRelative(166.55f, 64.09f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 18.14f, -4.81f)
                lineToRelative(21.76f, -26.65f)
                curveToRelative(5.82f, -7.13f, 16.35f, -9.06f, 24.49f, -4.51f)
                lineToRelative(98.0f, 54.85f)
                curveToRelative(5.83f, 3.26f, 9.45f, 9.32f, 9.45f, 15.81f)
                verticalLineToRelative(205.7f)
                curveToRelative(0.0f, 8.49f, -5.99f, 15.8f, -14.58f, 17.78f)
                lineToRelative(-119.0f, 27.43f)
                arcToRelative(19.74f, 19.74f, 0.0f, false, true, -4.42f, 0.5f)
                horizontalLineToRelative(-70.0f)
                close()
            }
        }
        .build()
        return _handScissors!!
    }

private var _handScissors: ImageVector? = null
