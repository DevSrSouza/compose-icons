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

public val SolidGroup.KiwiBird: ImageVector
    get() {
        if (_kiwiBird != null) {
            return _kiwiBird!!
        }
        _kiwiBird = Builder(name = "KiwiBird", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(575.81f, 217.98f)
                curveTo(572.64f, 157.41f, 518.28f, 112.0f, 457.63f, 112.0f)
                horizontalLineToRelative(-9.37f)
                curveToRelative(-52.82f, 0.0f, -104.25f, -16.25f, -147.74f, -46.24f)
                curveToRelative(-41.99f, -28.96f, -96.04f, -41.62f, -153.21f, -28.7f)
                curveTo(129.3f, 41.12f, -0.08f, 78.24f, 0.0f, 224.0f)
                curveToRelative(0.04f, 70.95f, 38.68f, 132.8f, 95.99f, 166.01f)
                lineTo(95.99f, 464.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-54.26f)
                curveToRelative(15.36f, 3.96f, 31.4f, 6.26f, 48.0f, 6.26f)
                curveToRelative(5.44f, 0.0f, 10.68f, -0.73f, 16.0f, -1.18f)
                lineTo(207.99f, 464.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-59.43f)
                curveToRelative(14.24f, -5.06f, 27.88f, -11.39f, 40.34f, -19.51f)
                curveTo(342.07f, 355.25f, 393.86f, 336.0f, 448.46f, 336.0f)
                curveToRelative(25.48f, 0.0f, 16.01f, -0.31f, 23.05f, -0.78f)
                lineToRelative(74.41f, 136.44f)
                curveToRelative(2.86f, 5.23f, 8.3f, 8.34f, 14.05f, 8.34f)
                curveToRelative(1.31f, 0.0f, 2.64f, -0.16f, 3.95f, -0.5f)
                curveToRelative(7.09f, -1.8f, 12.05f, -8.19f, 12.05f, -15.5f)
                curveToRelative(0.0f, 0.0f, 0.14f, -240.24f, -0.16f, -246.02f)
                close()
                moveTo(463.97f, 248.0f)
                curveToRelative(-13.25f, 0.0f, -24.0f, -10.75f, -24.0f, -24.0f)
                curveToRelative(0.0f, -13.26f, 10.75f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.74f, 24.0f, 24.0f)
                curveToRelative(0.0f, 13.25f, -10.75f, 24.0f, -24.0f, 24.0f)
                close()
                moveTo(543.97f, 401.25f)
                lineToRelative(-39.86f, -73.08f)
                curveToRelative(15.12f, -5.83f, 28.73f, -14.6f, 39.86f, -25.98f)
                verticalLineToRelative(99.06f)
                close()
            }
        }
        .build()
        return _kiwiBird!!
    }

private var _kiwiBird: ImageVector? = null
