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

public val BrandsGroup.WatchmanMonitoring: ImageVector
    get() {
        if (_watchmanMonitoring != null) {
            return _watchmanMonitoring!!
        }
        _watchmanMonitoring = Builder(name = "WatchmanMonitoring", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 16.0f)
                curveTo(123.45f, 16.0f, 16.0f, 123.45f, 16.0f, 256.0f)
                reflectiveCurveTo(123.45f, 496.0f, 256.0f, 496.0f)
                reflectiveCurveTo(496.0f, 388.55f, 496.0f, 256.0f)
                reflectiveCurveTo(388.55f, 16.0f, 256.0f, 16.0f)
                close()
                moveTo(121.69f, 429.12f)
                curveTo(70.06f, 388.97f, 36.74f, 326.32f, 36.74f, 256.0f)
                arcToRelative(218.52f, 218.52f, 0.0f, false, true, 9.59f, -64.12f)
                lineToRelative(102.9f, -17.9f)
                lineToRelative(-0.12f, 10.97f)
                lineToRelative(-13.94f, 2.01f)
                reflectiveCurveToRelative(-0.14f, 12.5f, -0.14f, 19.55f)
                arcToRelative(12.78f, 12.78f, 0.0f, false, false, 4.89f, 10.35f)
                lineToRelative(9.47f, 7.4f)
                close()
                moveTo(227.38f, 145.85f)
                lineTo(235.86f, 138.23f)
                reflectiveCurveToRelative(6.93f, -5.38f, -0.14f, -9.34f)
                curveToRelative(-7.19f, -4.02f, -39.53f, -34.5f, -39.53f, -34.5f)
                curveToRelative(-5.35f, -5.48f, -8.26f, -7.35f, -15.46f, 0.0f)
                curveToRelative(0.0f, 0.0f, -32.34f, 30.47f, -39.53f, 34.5f)
                curveToRelative(-7.08f, 3.96f, -0.14f, 9.34f, -0.14f, 9.34f)
                lineToRelative(8.48f, 7.62f)
                lineToRelative(-0.05f, 4.37f)
                lineTo(75.98f, 131.04f)
                curveToRelative(39.64f, -56.94f, 105.53f, -94.3f, 180.02f, -94.3f)
                arcTo(218.75f, 218.75f, 0.0f, false, true, 420.93f, 111.77f)
                lineToRelative(-193.51f, 37.7f)
                close()
                moveTo(261.45f, 475.12f)
                lineTo(227.55f, 224.26f)
                lineTo(237.01f, 216.86f)
                arcToRelative(12.78f, 12.78f, 0.0f, false, false, 4.89f, -10.35f)
                curveToRelative(0.0f, -7.04f, -0.14f, -19.55f, -0.14f, -19.55f)
                lineToRelative(-13.94f, -2.01f)
                lineToRelative(-0.12f, -10.47f)
                lineToRelative(241.71f, 31.39f)
                arcTo(218.87f, 218.87f, 0.0f, false, true, 475.26f, 256.0f)
                curveTo(475.26f, 375.07f, 379.83f, 472.21f, 261.45f, 475.12f)
                close()
            }
        }
        .build()
        return _watchmanMonitoring!!
    }

private var _watchmanMonitoring: ImageVector? = null
