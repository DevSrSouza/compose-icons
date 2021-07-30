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

public val BrandsGroup.Stackpath: ImageVector
    get() {
        if (_stackpath != null) {
            return _stackpath!!
        }
        _stackpath = Builder(name = "Stackpath", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.6f, 232.4f)
                curveToRelative(0.0f, 8.5f, -4.26f, 20.49f, -21.34f, 20.49f)
                horizontalLineToRelative(-19.61f)
                verticalLineToRelative(-41.47f)
                horizontalLineToRelative(19.61f)
                curveToRelative(17.13f, 0.0f, 21.34f, 12.36f, 21.34f, 20.98f)
                close()
                moveTo(448.0f, 32.0f)
                verticalLineToRelative(448.0f)
                lineTo(0.0f, 480.0f)
                lineTo(0.0f, 32.0f)
                close()
                moveTo(151.3f, 287.84f)
                curveToRelative(0.0f, -21.24f, -12.12f, -34.54f, -46.72f, -44.85f)
                curveToRelative(-20.57f, -7.41f, -26.0f, -10.91f, -26.0f, -18.63f)
                reflectiveCurveToRelative(7.0f, -14.61f, 20.41f, -14.61f)
                curveToRelative(14.09f, 0.0f, 20.79f, 8.45f, 20.79f, 18.35f)
                horizontalLineToRelative(30.7f)
                lineToRelative(0.19f, -0.57f)
                curveToRelative(0.5f, -19.57f, -15.06f, -41.65f, -51.12f, -41.65f)
                curveToRelative(-23.37f, 0.0f, -52.55f, 10.75f, -52.55f, 38.29f)
                curveToRelative(0.0f, 19.4f, 9.25f, 31.29f, 50.74f, 44.37f)
                curveToRelative(17.26f, 6.15f, 21.91f, 10.4f, 21.91f, 19.48f)
                curveToRelative(0.0f, 15.2f, -19.13f, 14.23f, -19.47f, 14.23f)
                curveToRelative(-20.4f, 0.0f, -25.65f, -9.1f, -25.65f, -21.9f)
                horizontalLineToRelative(-30.8f)
                lineToRelative(-0.18f, 0.56f)
                curveToRelative(-0.68f, 31.32f, 28.38f, 45.22f, 56.63f, 45.22f)
                curveToRelative(29.98f, 0.0f, 51.12f, -13.55f, 51.12f, -38.29f)
                close()
                moveTo(276.68f, 232.21f)
                curveToRelative(0.0f, -25.3f, -18.43f, -45.46f, -53.42f, -45.46f)
                horizontalLineToRelative(-51.78f)
                verticalLineToRelative(138.18f)
                horizontalLineToRelative(32.17f)
                verticalLineToRelative(-47.36f)
                horizontalLineToRelative(19.61f)
                curveToRelative(30.25f, 0.0f, 53.42f, -15.95f, 53.42f, -45.36f)
                close()
                moveTo(297.94f, 325.0f)
                lineTo(347.0f, 186.78f)
                horizontalLineToRelative(-31.09f)
                lineTo(268.0f, 325.0f)
                close()
                moveTo(404.46f, 186.78f)
                horizontalLineToRelative(-31.09f)
                lineTo(325.46f, 325.0f)
                horizontalLineToRelative(29.94f)
                close()
            }
        }
        .build()
        return _stackpath!!
    }

private var _stackpath: ImageVector? = null
