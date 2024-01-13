package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.HeadSideCoughSlash: ImageVector
    get() {
        if (_headSideCoughSlash != null) {
            return _headSideCoughSlash!!
        }
        _headSideCoughSlash = Builder(name = "HeadSideCoughSlash", defaultWidth = 640.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 325.8f)
                lineToRelative(44.0f, 34.5f)
                curveToRelative(8.1f, 1.4f, 14.8f, 6.8f, 18.0f, 14.1f)
                lineTo(552.9f, 408.0f)
                curveToRelative(10.6f, 0.4f, 19.5f, 7.6f, 22.2f, 17.4f)
                lineToRelative(39.1f, 30.6f)
                curveToRelative(0.6f, 0.0f, 1.2f, -0.1f, 1.8f, -0.1f)
                curveToRelative(11.1f, 0.0f, 20.4f, 7.5f, 23.2f, 17.8f)
                horizontalLineToRelative(-3.9f)
                curveToRelative(6.2f, 8.5f, 6.4f, 20.4f, -0.4f, 29.0f)
                curveToRelative(-8.2f, 10.4f, -23.3f, 12.3f, -33.7f, 4.1f)
                lineTo(9.2f, 42.9f)
                curveTo(-1.2f, 34.7f, -3.1f, 19.6f, 5.1f, 9.2f)
                reflectiveCurveTo(28.4f, -3.1f, 38.8f, 5.1f)
                lineTo(89.6f, 44.9f)
                curveTo(127.0f, 16.7f, 173.5f, 0.0f, 224.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                curveToRelative(95.2f, 0.0f, 181.2f, 69.3f, 197.3f, 160.2f)
                curveToRelative(2.3f, 13.0f, 6.8f, 25.7f, 15.1f, 36.0f)
                lineToRelative(42.0f, 52.6f)
                curveToRelative(6.2f, 7.8f, 9.6f, 17.4f, 9.6f, 27.4f)
                curveToRelative(0.0f, 24.2f, -19.6f, 43.8f, -43.8f, 43.8f)
                lineTo(448.0f, 320.0f)
                verticalLineToRelative(0.0f)
                verticalLineToRelative(5.8f)
                close()
                moveTo(0.0f, 224.2f)
                curveToRelative(0.0f, -38.7f, 9.8f, -75.1f, 27.1f, -106.9f)
                lineTo(341.8f, 365.3f)
                lineToRelative(-2.5f, 0.3f)
                curveToRelative(-11.0f, 1.4f, -19.2f, 10.7f, -19.2f, 21.8f)
                curveToRelative(0.0f, 11.6f, 9.0f, 21.2f, 20.6f, 21.9f)
                lineToRelative(62.0f, 3.9f)
                lineToRelative(43.0f, 33.9f)
                curveTo(439.3f, 466.2f, 421.2f, 480.0f, 400.0f, 480.0f)
                lineTo(320.0f, 480.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                lineTo(256.0f, 512.0f)
                verticalLineToRelative(0.0f)
                lineTo(96.0f, 512.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(64.0f, 407.3f)
                curveToRelative(0.0f, -16.7f, -6.9f, -32.5f, -17.1f, -45.8f)
                curveTo(16.6f, 322.4f, 0.0f, 274.1f, 0.0f, 224.2f)
                close()
                moveTo(616.0f, 360.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, -48.0f)
                close()
                moveTo(552.0f, 312.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, -48.0f)
                close()
                moveTo(592.0f, 288.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 48.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -48.0f, 0.0f)
                close()
            }
        }
        .build()
        return _headSideCoughSlash!!
    }

private var _headSideCoughSlash: ImageVector? = null
