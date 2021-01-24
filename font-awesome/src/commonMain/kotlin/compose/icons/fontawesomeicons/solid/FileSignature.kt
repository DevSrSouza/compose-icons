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

public val SolidGroup.FileSignature: ImageVector
    get() {
        if (_fileSignature != null) {
            return _fileSignature!!
        }
        _fileSignature = Builder(name = "FileSignature", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(218.17f, 424.14f)
                curveToRelative(-2.95f, -5.92f, -8.09f, -6.52f, -10.17f, -6.52f)
                reflectiveCurveToRelative(-7.22f, 0.59f, -10.02f, 6.19f)
                lineToRelative(-7.67f, 15.34f)
                curveToRelative(-6.37f, 12.78f, -25.03f, 11.37f, -29.48f, -2.09f)
                lineTo(144.0f, 386.59f)
                lineToRelative(-10.61f, 31.88f)
                curveToRelative(-5.89f, 17.66f, -22.38f, 29.53f, -41.0f, 29.53f)
                lineTo(80.0f, 448.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, -7.16f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.16f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(12.39f)
                curveToRelative(4.83f, 0.0f, 9.11f, -3.08f, 10.64f, -7.66f)
                lineToRelative(18.19f, -54.64f)
                curveToRelative(3.3f, -9.81f, 12.44f, -16.41f, 22.78f, -16.41f)
                reflectiveCurveToRelative(19.48f, 6.59f, 22.77f, 16.41f)
                lineToRelative(13.88f, 41.64f)
                curveToRelative(19.75f, -16.19f, 54.06f, -9.7f, 66.0f, 14.16f)
                curveToRelative(1.89f, 3.78f, 5.49f, 5.95f, 9.36f, 6.26f)
                verticalLineToRelative(-82.12f)
                lineToRelative(128.0f, -127.09f)
                lineTo(384.01f, 160.0f)
                lineTo(248.0f, 160.0f)
                curveToRelative(-13.2f, 0.0f, -24.0f, -10.8f, -24.0f, -24.0f)
                lineTo(224.0f, 0.0f)
                lineTo(24.0f, 0.0f)
                curveTo(10.7f, 0.0f, 0.0f, 10.7f, 0.0f, 24.0f)
                verticalLineToRelative(464.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(336.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                verticalLineToRelative(-40.0f)
                lineToRelative(-128.0f, -0.11f)
                curveToRelative(-16.12f, -0.31f, -30.58f, -9.28f, -37.83f, -23.75f)
                close()
                moveTo(384.0f, 121.9f)
                curveToRelative(0.0f, -6.3f, -2.5f, -12.4f, -7.0f, -16.9f)
                lineTo(279.1f, 7.0f)
                curveToRelative(-4.5f, -4.5f, -10.6f, -7.0f, -17.0f, -7.0f)
                lineTo(256.0f, 0.0f)
                verticalLineToRelative(128.0f)
                horizontalLineToRelative(128.0f)
                verticalLineToRelative(-6.1f)
                close()
                moveTo(288.0f, 346.96f)
                lineTo(288.0f, 416.0f)
                horizontalLineToRelative(68.99f)
                lineToRelative(161.68f, -162.78f)
                lineToRelative(-67.88f, -67.88f)
                lineTo(288.0f, 346.96f)
                close()
                moveTo(568.54f, 167.33f)
                lineToRelative(-31.87f, -31.87f)
                curveToRelative(-9.94f, -9.94f, -26.07f, -9.94f, -36.01f, 0.0f)
                lineToRelative(-27.25f, 27.25f)
                lineToRelative(67.88f, 67.88f)
                lineToRelative(27.25f, -27.25f)
                curveToRelative(9.95f, -9.94f, 9.95f, -26.07f, 0.0f, -36.01f)
                close()
            }
        }
        .build()
        return _fileSignature!!
    }

private var _fileSignature: ImageVector? = null
