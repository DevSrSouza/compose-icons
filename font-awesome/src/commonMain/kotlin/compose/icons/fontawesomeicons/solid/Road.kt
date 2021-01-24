package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Road: ImageVector
    get() {
        if (_road != null) {
            return _road!!
        }
        _road = Builder(name = "Road", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(573.19f, 402.67f)
                lineToRelative(-139.79f, -320.0f)
                curveTo(428.43f, 71.29f, 417.6f, 64.0f, 405.68f, 64.0f)
                horizontalLineToRelative(-97.59f)
                lineToRelative(2.45f, 23.16f)
                curveToRelative(0.5f, 4.72f, -3.21f, 8.84f, -7.96f, 8.84f)
                horizontalLineToRelative(-29.16f)
                curveToRelative(-4.75f, 0.0f, -8.46f, -4.12f, -7.96f, -8.84f)
                lineTo(267.91f, 64.0f)
                horizontalLineToRelative(-97.59f)
                curveToRelative(-11.93f, 0.0f, -22.76f, 7.29f, -27.73f, 18.67f)
                lineTo(2.8f, 402.67f)
                curveTo(-6.45f, 423.86f, 8.31f, 448.0f, 30.54f, 448.0f)
                horizontalLineToRelative(196.84f)
                lineToRelative(10.31f, -97.68f)
                curveToRelative(0.86f, -8.14f, 7.72f, -14.32f, 15.91f, -14.32f)
                horizontalLineToRelative(68.8f)
                curveToRelative(8.19f, 0.0f, 15.05f, 6.18f, 15.91f, 14.32f)
                lineTo(348.62f, 448.0f)
                horizontalLineToRelative(196.84f)
                curveToRelative(22.23f, 0.0f, 36.99f, -24.14f, 27.73f, -45.33f)
                close()
                moveTo(260.4f, 135.16f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.96f, -7.16f)
                horizontalLineToRelative(39.29f)
                curveToRelative(4.09f, 0.0f, 7.53f, 3.09f, 7.96f, 7.16f)
                lineToRelative(4.6f, 43.58f)
                curveToRelative(0.75f, 7.09f, -4.81f, 13.26f, -11.93f, 13.26f)
                horizontalLineToRelative(-40.54f)
                curveToRelative(-7.13f, 0.0f, -12.68f, -6.17f, -11.93f, -13.26f)
                lineToRelative(4.59f, -43.58f)
                close()
                moveTo(315.64f, 304.0f)
                horizontalLineToRelative(-55.29f)
                curveToRelative(-9.5f, 0.0f, -16.91f, -8.23f, -15.91f, -17.68f)
                lineToRelative(5.07f, -48.0f)
                curveToRelative(0.86f, -8.14f, 7.72f, -14.32f, 15.91f, -14.32f)
                horizontalLineToRelative(45.15f)
                curveToRelative(8.19f, 0.0f, 15.05f, 6.18f, 15.91f, 14.32f)
                lineToRelative(5.07f, 48.0f)
                curveToRelative(1.0f, 9.45f, -6.41f, 17.68f, -15.91f, 17.68f)
                close()
            }
        }
        .build()
        return _road!!
    }

private var _road: ImageVector? = null
