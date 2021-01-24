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

public val SolidGroup.FileMedicalAlt: ImageVector
    get() {
        if (_fileMedicalAlt != null) {
            return _fileMedicalAlt!!
        }
        _fileMedicalAlt = Builder(name = "FileMedicalAlt", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 136.0f)
                lineTo(288.0f, 0.0f)
                lineTo(88.0f, 0.0f)
                curveTo(74.7f, 0.0f, 64.0f, 10.7f, 64.0f, 24.0f)
                verticalLineToRelative(232.0f)
                lineTo(8.0f, 256.0f)
                curveToRelative(-4.4f, 0.0f, -8.0f, 3.6f, -8.0f, 8.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 4.4f, 3.6f, 8.0f, 8.0f, 8.0f)
                horizontalLineToRelative(140.9f)
                curveToRelative(3.0f, 0.0f, 5.8f, 1.7f, 7.2f, 4.4f)
                lineToRelative(19.9f, 39.8f)
                lineToRelative(56.8f, -113.7f)
                curveToRelative(2.9f, -5.9f, 11.4f, -5.9f, 14.3f, 0.0f)
                lineToRelative(34.7f, 69.5f)
                lineTo(352.0f, 288.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.2f, 16.0f, -16.0f, 16.0f)
                horizontalLineToRelative(-89.9f)
                lineTo(240.0f, 275.8f)
                lineToRelative(-56.8f, 113.7f)
                curveToRelative(-2.9f, 5.9f, -11.4f, 5.9f, -14.3f, 0.0f)
                lineTo(134.1f, 320.0f)
                lineTo(64.0f, 320.0f)
                verticalLineToRelative(168.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(336.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                lineTo(448.0f, 160.0f)
                lineTo(312.0f, 160.0f)
                curveToRelative(-13.2f, 0.0f, -24.0f, -10.8f, -24.0f, -24.0f)
                close()
                moveTo(441.0f, 105.0f)
                lineTo(343.1f, 7.0f)
                curveToRelative(-4.5f, -4.5f, -10.6f, -7.0f, -17.0f, -7.0f)
                lineTo(320.0f, 0.0f)
                verticalLineToRelative(128.0f)
                horizontalLineToRelative(128.0f)
                verticalLineToRelative(-6.1f)
                curveToRelative(0.0f, -6.3f, -2.5f, -12.4f, -7.0f, -16.9f)
                close()
            }
        }
        .build()
        return _fileMedicalAlt!!
    }

private var _fileMedicalAlt: ImageVector? = null
