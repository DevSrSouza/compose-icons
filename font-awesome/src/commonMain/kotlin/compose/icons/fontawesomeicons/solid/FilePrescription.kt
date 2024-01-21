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

public val SolidGroup.FilePrescription: ImageVector
    get() {
        if (_filePrescription != null) {
            return _filePrescription!!
        }
        _filePrescription = Builder(name = "FilePrescription", defaultWidth = 384.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 0.0f)
                curveTo(28.7f, 0.0f, 0.0f, 28.7f, 0.0f, 64.0f)
                lineTo(0.0f, 448.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineTo(320.0f, 512.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineTo(384.0f, 160.0f)
                lineTo(256.0f, 160.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(224.0f, 0.0f)
                lineTo(64.0f, 0.0f)
                close()
                moveTo(256.0f, 0.0f)
                lineTo(256.0f, 128.0f)
                lineTo(384.0f, 128.0f)
                lineTo(256.0f, 0.0f)
                close()
                moveTo(104.0f, 196.0f)
                horizontalLineToRelative(72.0f)
                curveToRelative(33.1f, 0.0f, 60.0f, 26.9f, 60.0f, 60.0f)
                curveToRelative(0.0f, 25.5f, -15.9f, 47.2f, -38.3f, 55.9f)
                lineToRelative(43.0f, 40.3f)
                lineToRelative(33.8f, -31.0f)
                curveToRelative(8.1f, -7.5f, 20.8f, -6.9f, 28.3f, 1.2f)
                reflectiveCurveToRelative(6.9f, 20.8f, -1.2f, 28.3f)
                lineTo(270.0f, 379.7f)
                lineToRelative(31.7f, 29.7f)
                curveToRelative(8.1f, 7.6f, 8.5f, 20.2f, 0.9f, 28.3f)
                reflectiveCurveToRelative(-20.2f, 8.5f, -28.3f, 0.9f)
                lineToRelative(-33.9f, -31.8f)
                lineToRelative(-34.9f, 32.0f)
                curveToRelative(-8.1f, 7.5f, -20.8f, 6.9f, -28.3f, -1.2f)
                reflectiveCurveToRelative(-6.9f, -20.8f, 1.2f, -28.3f)
                lineToRelative(32.6f, -29.9f)
                lineToRelative(-64.8f, -60.8f)
                curveToRelative(-0.9f, -0.8f, -1.6f, -1.7f, -2.3f, -2.6f)
                lineTo(124.0f, 316.0f)
                verticalLineToRelative(44.0f)
                curveToRelative(0.0f, 11.0f, -9.0f, 20.0f, -20.0f, 20.0f)
                reflectiveCurveToRelative(-20.0f, -9.0f, -20.0f, -20.0f)
                lineTo(84.0f, 296.0f)
                lineTo(84.0f, 216.0f)
                curveToRelative(0.0f, -11.0f, 9.0f, -20.0f, 20.0f, -20.0f)
                close()
                moveTo(176.0f, 276.0f)
                curveToRelative(11.0f, 0.0f, 20.0f, -9.0f, 20.0f, -20.0f)
                reflectiveCurveToRelative(-9.0f, -20.0f, -20.0f, -20.0f)
                lineTo(124.0f, 236.0f)
                verticalLineToRelative(40.0f)
                horizontalLineToRelative(52.0f)
                close()
            }
        }
        .build()
        return _filePrescription!!
    }

private var _filePrescription: ImageVector? = null
