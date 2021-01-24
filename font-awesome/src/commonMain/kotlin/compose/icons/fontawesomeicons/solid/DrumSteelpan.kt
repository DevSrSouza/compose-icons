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

public val SolidGroup.DrumSteelpan: ImageVector
    get() {
        if (_drumSteelpan != null) {
            return _drumSteelpan!!
        }
        _drumSteelpan = Builder(name = "DrumSteelpan", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 32.0f)
                curveTo(128.94f, 32.0f, 0.0f, 89.31f, 0.0f, 160.0f)
                verticalLineToRelative(192.0f)
                curveToRelative(0.0f, 70.69f, 128.94f, 128.0f, 288.0f, 128.0f)
                reflectiveCurveToRelative(288.0f, -57.31f, 288.0f, -128.0f)
                lineTo(576.0f, 160.0f)
                curveToRelative(0.0f, -70.69f, -128.94f, -128.0f, -288.0f, -128.0f)
                close()
                moveTo(205.01f, 190.36f)
                curveToRelative(-4.45f, 16.61f, -14.54f, 30.57f, -28.31f, 40.48f)
                curveTo(100.23f, 217.46f, 48.0f, 190.78f, 48.0f, 160.0f)
                curveToRelative(0.0f, -30.16f, 50.11f, -56.39f, 124.04f, -70.03f)
                lineToRelative(25.6f, 44.34f)
                curveToRelative(9.86f, 17.09f, 12.48f, 36.99f, 7.37f, 56.05f)
                close()
                moveTo(288.0f, 240.0f)
                curveToRelative(-21.08f, 0.0f, -41.41f, -1.0f, -60.89f, -2.7f)
                curveToRelative(8.06f, -26.13f, 32.15f, -45.3f, 60.89f, -45.3f)
                reflectiveCurveToRelative(52.83f, 19.17f, 60.89f, 45.3f)
                curveTo(329.41f, 239.0f, 309.08f, 240.0f, 288.0f, 240.0f)
                close()
                moveTo(352.0f, 96.0f)
                curveToRelative(0.0f, 35.29f, -28.71f, 64.0f, -64.0f, 64.0f)
                reflectiveCurveToRelative(-64.0f, -28.71f, -64.0f, -64.0f)
                lineTo(224.0f, 82.96f)
                curveToRelative(20.4f, -1.88f, 41.8f, -2.96f, 64.0f, -2.96f)
                reflectiveCurveToRelative(43.6f, 1.08f, 64.0f, 2.96f)
                lineTo(352.0f, 96.0f)
                close()
                moveTo(398.93f, 230.9f)
                curveToRelative(-13.81f, -9.91f, -23.94f, -23.9f, -28.4f, -40.54f)
                curveToRelative(-5.11f, -19.06f, -2.49f, -38.96f, 7.38f, -56.04f)
                lineToRelative(25.65f, -44.42f)
                curveTo(477.72f, 103.5f, 528.0f, 129.79f, 528.0f, 160.0f)
                curveToRelative(0.0f, 30.83f, -52.4f, 57.54f, -129.07f, 70.9f)
                close()
            }
        }
        .build()
        return _drumSteelpan!!
    }

private var _drumSteelpan: ImageVector? = null
