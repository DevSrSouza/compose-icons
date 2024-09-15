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

public val BrandsGroup.Discord: ImageVector
    get() {
        if (_discord != null) {
            return _discord!!
        }
        _discord = Builder(name = "Discord", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(297.22f, 243.2f)
                curveToRelative(0.0f, 15.62f, -11.52f, 28.42f, -26.11f, 28.42f)
                curveToRelative(-14.34f, 0.0f, -26.11f, -12.8f, -26.11f, -28.42f)
                reflectiveCurveToRelative(11.52f, -28.42f, 26.11f, -28.42f)
                curveToRelative(14.59f, 0.0f, 26.11f, 12.8f, 26.11f, 28.42f)
                close()
                moveTo(177.66f, 214.78f)
                curveToRelative(-14.59f, 0.0f, -26.11f, 12.8f, -26.11f, 28.42f)
                reflectiveCurveToRelative(11.78f, 28.42f, 26.11f, 28.42f)
                curveToRelative(14.59f, 0.0f, 26.11f, -12.8f, 26.11f, -28.42f)
                curveToRelative(0.26f, -15.62f, -11.52f, -28.42f, -26.11f, -28.42f)
                close()
                moveTo(448.0f, 52.74f)
                lineTo(448.0f, 512.0f)
                curveToRelative(-64.49f, -56.99f, -43.87f, -38.13f, -118.78f, -107.78f)
                lineToRelative(13.57f, 47.36f)
                lineTo(52.48f, 451.58f)
                curveTo(23.55f, 451.58f, 0.0f, 428.03f, 0.0f, 398.85f)
                lineTo(0.0f, 52.74f)
                curveTo(0.0f, 23.55f, 23.55f, 0.0f, 52.48f, 0.0f)
                horizontalLineToRelative(343.04f)
                curveTo(424.45f, 0.0f, 448.0f, 23.55f, 448.0f, 52.74f)
                close()
                moveTo(375.04f, 295.42f)
                curveToRelative(0.0f, -82.43f, -36.86f, -149.25f, -36.86f, -149.25f)
                curveToRelative(-36.86f, -27.65f, -71.94f, -26.88f, -71.94f, -26.88f)
                lineToRelative(-3.58f, 4.1f)
                curveToRelative(43.52f, 13.31f, 63.74f, 32.51f, 63.74f, 32.51f)
                curveToRelative(-60.81f, -33.33f, -132.24f, -33.33f, -191.23f, -7.42f)
                curveToRelative(-9.47f, 4.35f, -15.1f, 7.42f, -15.1f, 7.42f)
                reflectiveCurveToRelative(21.25f, -20.22f, 67.33f, -33.54f)
                lineToRelative(-2.56f, -3.07f)
                reflectiveCurveToRelative(-35.07f, -0.77f, -71.94f, 26.88f)
                curveToRelative(0.0f, 0.0f, -36.86f, 66.82f, -36.86f, 149.25f)
                curveToRelative(0.0f, 0.0f, 21.5f, 37.12f, 78.08f, 38.91f)
                curveToRelative(0.0f, 0.0f, 9.47f, -11.52f, 17.15f, -21.25f)
                curveToRelative(-32.51f, -9.73f, -44.8f, -30.21f, -44.8f, -30.21f)
                curveToRelative(3.77f, 2.64f, 9.98f, 6.05f, 10.5f, 6.4f)
                curveToRelative(43.21f, 24.2f, 104.59f, 32.13f, 159.74f, 8.96f)
                curveToRelative(8.96f, -3.33f, 18.94f, -8.19f, 29.44f, -15.1f)
                curveToRelative(0.0f, 0.0f, -12.8f, 20.99f, -46.34f, 30.46f)
                curveToRelative(7.68f, 9.73f, 16.9f, 20.74f, 16.9f, 20.74f)
                curveToRelative(56.58f, -1.79f, 78.34f, -38.91f, 78.34f, -38.91f)
                close()
            }
        }
        .build()
        return _discord!!
    }

private var _discord: ImageVector? = null
