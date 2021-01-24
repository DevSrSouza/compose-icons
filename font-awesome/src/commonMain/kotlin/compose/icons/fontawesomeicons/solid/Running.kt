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

public val SolidGroup.Running: ImageVector
    get() {
        if (_running != null) {
            return _running!!
        }
        _running = Builder(name = "Running", defaultWidth = 416.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 416.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(272.0f, 96.0f)
                curveToRelative(26.51f, 0.0f, 48.0f, -21.49f, 48.0f, -48.0f)
                reflectiveCurveTo(298.51f, 0.0f, 272.0f, 0.0f)
                reflectiveCurveToRelative(-48.0f, 21.49f, -48.0f, 48.0f)
                reflectiveCurveToRelative(21.49f, 48.0f, 48.0f, 48.0f)
                close()
                moveTo(113.69f, 317.47f)
                lineToRelative(-14.8f, 34.52f)
                horizontalLineTo(32.0f)
                curveToRelative(-17.67f, 0.0f, -32.0f, 14.33f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(77.45f)
                curveToRelative(19.25f, 0.0f, 36.58f, -11.44f, 44.11f, -29.09f)
                lineToRelative(8.79f, -20.52f)
                lineToRelative(-10.67f, -6.3f)
                curveToRelative(-17.32f, -10.23f, -30.06f, -25.37f, -37.99f, -42.61f)
                close()
                moveTo(384.0f, 223.99f)
                horizontalLineToRelative(-44.03f)
                lineToRelative(-26.06f, -53.25f)
                curveToRelative(-12.5f, -25.55f, -35.45f, -44.23f, -61.78f, -50.94f)
                lineToRelative(-71.08f, -21.14f)
                curveToRelative(-28.3f, -6.8f, -57.77f, -0.55f, -80.84f, 17.14f)
                lineToRelative(-39.67f, 30.41f)
                curveToRelative(-14.03f, 10.75f, -16.69f, 30.83f, -5.92f, 44.86f)
                reflectiveCurveToRelative(30.84f, 16.66f, 44.86f, 5.92f)
                lineToRelative(39.69f, -30.41f)
                curveToRelative(7.67f, -5.89f, 17.44f, -8.0f, 25.27f, -6.14f)
                lineToRelative(14.7f, 4.37f)
                lineToRelative(-37.46f, 87.39f)
                curveToRelative(-12.62f, 29.48f, -1.31f, 64.01f, 26.3f, 80.31f)
                lineToRelative(84.98f, 50.17f)
                lineToRelative(-27.47f, 87.73f)
                curveToRelative(-5.28f, 16.86f, 4.11f, 34.81f, 20.97f, 40.09f)
                curveToRelative(3.19f, 1.0f, 6.41f, 1.48f, 9.58f, 1.48f)
                curveToRelative(13.61f, 0.0f, 26.23f, -8.77f, 30.52f, -22.45f)
                lineToRelative(31.64f, -101.06f)
                curveToRelative(5.91f, -20.77f, -2.89f, -43.08f, -21.64f, -54.39f)
                lineToRelative(-61.24f, -36.14f)
                lineToRelative(31.31f, -78.28f)
                lineToRelative(20.27f, 41.43f)
                curveToRelative(8.0f, 16.34f, 24.92f, 26.89f, 43.11f, 26.89f)
                horizontalLineTo(384.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.33f, -31.99f, -32.0f, -31.99f)
                close()
            }
        }
        .build()
        return _running!!
    }

private var _running: ImageVector? = null
