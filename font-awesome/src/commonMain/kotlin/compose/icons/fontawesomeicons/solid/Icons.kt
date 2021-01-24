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

public val SolidGroup.Icons: ImageVector
    get() {
        if (_icons != null) {
            return _icons!!
        }
        _icons = Builder(name = "Icons", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.65f, 219.35f)
                arcToRelative(15.68f, 15.68f, 0.0f, false, false, 22.65f, 0.0f)
                lineToRelative(96.75f, -99.83f)
                curveToRelative(28.15f, -29.0f, 26.5f, -77.1f, -4.91f, -103.88f)
                curveTo(203.75f, -7.7f, 163.0f, -3.5f, 137.86f, 22.44f)
                lineTo(128.0f, 32.58f)
                lineToRelative(-9.85f, -10.14f)
                curveTo(93.05f, -3.5f, 52.25f, -7.7f, 24.86f, 15.64f)
                curveToRelative(-31.41f, 26.78f, -33.0f, 74.85f, -5.0f, 103.88f)
                close()
                moveTo(260.57f, 319.84f)
                horizontalLineToRelative(-48.0f)
                lineToRelative(-7.08f, -14.24f)
                arcToRelative(27.39f, 27.39f, 0.0f, false, false, -25.66f, -17.78f)
                horizontalLineToRelative(-71.71f)
                arcToRelative(27.39f, 27.39f, 0.0f, false, false, -25.66f, 17.78f)
                lineToRelative(-7.0f, 14.24f)
                horizontalLineToRelative(-48.0f)
                arcTo(27.45f, 27.45f, 0.0f, false, false, 0.0f, 347.3f)
                verticalLineToRelative(137.25f)
                arcTo(27.44f, 27.44f, 0.0f, false, false, 27.43f, 512.0f)
                horizontalLineToRelative(233.14f)
                arcTo(27.45f, 27.45f, 0.0f, false, false, 288.0f, 484.55f)
                lineTo(288.0f, 347.3f)
                arcToRelative(27.45f, 27.45f, 0.0f, false, false, -27.43f, -27.46f)
                close()
                moveTo(144.0f, 468.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, true, 52.0f, -52.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, -52.0f, 52.0f)
                close()
                moveTo(499.4f, 352.1f)
                horizontalLineToRelative(-60.58f)
                lineToRelative(22.36f, -50.75f)
                curveToRelative(2.1f, -6.65f, -3.93f, -13.21f, -12.18f, -13.21f)
                horizontalLineToRelative(-75.59f)
                curveToRelative(-6.3f, 0.0f, -11.66f, 3.9f, -12.5f, 9.1f)
                lineToRelative(-16.8f, 106.93f)
                curveToRelative(-1.0f, 6.3f, 4.88f, 11.89f, 12.5f, 11.89f)
                horizontalLineToRelative(62.31f)
                lineToRelative(-24.2f, 83.0f)
                curveToRelative(-1.89f, 6.65f, 4.2f, 12.9f, 12.23f, 12.9f)
                arcToRelative(13.26f, 13.26f, 0.0f, false, false, 10.92f, -5.25f)
                lineToRelative(92.4f, -138.91f)
                curveToRelative(4.88f, -6.91f, -1.16f, -15.7f, -10.87f, -15.7f)
                close()
                moveTo(478.08f, 0.33f)
                lineTo(329.51f, 23.17f)
                curveTo(314.87f, 25.42f, 304.0f, 38.92f, 304.0f, 54.83f)
                lineTo(304.0f, 161.6f)
                arcToRelative(83.25f, 83.25f, 0.0f, false, false, -16.0f, -1.7f)
                curveToRelative(-35.35f, 0.0f, -64.0f, 21.48f, -64.0f, 48.0f)
                reflectiveCurveToRelative(28.65f, 48.0f, 64.0f, 48.0f)
                curveToRelative(35.2f, 0.0f, 63.73f, -21.32f, 64.0f, -47.66f)
                lineTo(352.0f, 99.66f)
                lineToRelative(112.0f, -17.22f)
                verticalLineToRelative(47.18f)
                arcToRelative(83.25f, 83.25f, 0.0f, false, false, -16.0f, -1.7f)
                curveToRelative(-35.35f, 0.0f, -64.0f, 21.48f, -64.0f, 48.0f)
                reflectiveCurveToRelative(28.65f, 48.0f, 64.0f, 48.0f)
                curveToRelative(35.2f, 0.0f, 63.73f, -21.32f, 64.0f, -47.66f)
                lineTo(512.0f, 32.0f)
                curveToRelative(0.0f, -19.48f, -16.0f, -34.42f, -33.92f, -31.67f)
                close()
            }
        }
        .build()
        return _icons!!
    }

private var _icons: ImageVector? = null
