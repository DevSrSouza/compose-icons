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

public val SolidGroup.Horse: ImageVector
    get() {
        if (_horse != null) {
            return _horse!!
        }
        _horse = Builder(name = "Horse", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(575.92f, 76.6f)
                curveToRelative(-0.01f, -8.13f, -3.02f, -15.87f, -8.58f, -21.8f)
                curveToRelative(-3.78f, -4.03f, -8.58f, -9.12f, -13.69f, -14.5f)
                curveToRelative(11.06f, -6.84f, 19.5f, -17.49f, 22.18f, -30.66f)
                curveTo(576.85f, 4.68f, 572.96f, 0.0f, 567.9f, 0.0f)
                lineTo(447.92f, 0.0f)
                curveToRelative(-70.69f, 0.0f, -128.0f, 57.31f, -128.0f, 128.0f)
                lineTo(160.0f, 128.0f)
                curveToRelative(-28.84f, 0.0f, -54.4f, 12.98f, -72.0f, 33.11f)
                lineTo(88.0f, 160.0f)
                curveToRelative(-48.53f, 0.0f, -88.0f, 39.47f, -88.0f, 88.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-56.0f)
                curveToRelative(0.0f, -13.22f, 6.87f, -24.39f, 16.78f, -31.68f)
                curveToRelative(-0.21f, 2.58f, -0.78f, 5.05f, -0.78f, 7.68f)
                curveToRelative(0.0f, 27.64f, 11.84f, 52.36f, 30.54f, 69.88f)
                lineToRelative(-25.72f, 68.6f)
                arcToRelative(63.945f, 63.945f, 0.0f, false, false, -2.16f, 37.99f)
                lineToRelative(24.85f, 99.41f)
                arcTo(15.982f, 15.982f, 0.0f, false, false, 107.02f, 512.0f)
                horizontalLineToRelative(65.96f)
                curveToRelative(10.41f, 0.0f, 18.05f, -9.78f, 15.52f, -19.88f)
                lineToRelative(-26.31f, -105.26f)
                lineToRelative(23.84f, -63.59f)
                lineTo(320.0f, 345.6f)
                lineTo(320.0f, 496.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                lineTo(416.0f, 318.22f)
                curveToRelative(19.74f, -20.19f, 32.0f, -47.75f, 32.0f, -78.22f)
                curveToRelative(0.0f, -0.22f, -0.07f, -0.42f, -0.08f, -0.64f)
                lineTo(447.92f, 136.89f)
                lineToRelative(16.0f, 7.11f)
                lineToRelative(18.9f, 37.7f)
                curveToRelative(7.45f, 14.87f, 25.05f, 21.55f, 40.49f, 15.37f)
                lineToRelative(32.55f, -13.02f)
                arcToRelative(31.997f, 31.997f, 0.0f, false, false, 20.12f, -29.74f)
                lineToRelative(-0.06f, -77.71f)
                close()
                moveTo(511.92f, 96.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, -7.16f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.16f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.16f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.16f, 16.0f, -16.0f, 16.0f)
                close()
            }
        }
        .build()
        return _horse!!
    }

private var _horse: ImageVector? = null
