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
                moveTo(224.0f, 136.0f)
                lineTo(224.0f, 0.0f)
                lineTo(24.0f, 0.0f)
                curveTo(10.7f, 0.0f, 0.0f, 10.7f, 0.0f, 24.0f)
                verticalLineToRelative(464.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(336.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                lineTo(384.0f, 160.0f)
                lineTo(248.0f, 160.0f)
                curveToRelative(-13.2f, 0.0f, -24.0f, -10.8f, -24.0f, -24.0f)
                close()
                moveTo(292.53f, 315.48f)
                lineToRelative(11.31f, 11.31f)
                curveToRelative(6.25f, 6.25f, 6.25f, 16.38f, 0.0f, 22.63f)
                lineToRelative(-29.9f, 29.9f)
                lineTo(304.0f, 409.38f)
                curveToRelative(6.25f, 6.25f, 6.25f, 16.38f, 0.0f, 22.63f)
                lineToRelative(-11.31f, 11.31f)
                curveToRelative(-6.25f, 6.25f, -16.38f, 6.25f, -22.63f, 0.0f)
                lineTo(240.0f, 413.25f)
                lineToRelative(-30.06f, 30.06f)
                curveToRelative(-6.25f, 6.25f, -16.38f, 6.25f, -22.63f, 0.0f)
                lineTo(176.0f, 432.0f)
                curveToRelative(-6.25f, -6.25f, -6.25f, -16.38f, 0.0f, -22.63f)
                lineToRelative(30.06f, -30.06f)
                lineTo(146.74f, 320.0f)
                lineTo(128.0f, 320.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 8.84f, -7.16f, 16.0f, -16.0f, 16.0f)
                lineTo(96.0f, 384.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, -7.16f, -16.0f, -16.0f)
                lineTo(80.0f, 208.0f)
                curveToRelative(0.0f, -8.84f, 7.16f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(80.0f)
                curveToRelative(35.35f, 0.0f, 64.0f, 28.65f, 64.0f, 64.0f)
                curveToRelative(0.0f, 24.22f, -13.62f, 45.05f, -33.46f, 55.92f)
                lineTo(240.0f, 345.38f)
                lineToRelative(29.9f, -29.9f)
                curveToRelative(6.25f, -6.25f, 16.38f, -6.25f, 22.63f, 0.0f)
                close()
                moveTo(176.0f, 272.0f)
                horizontalLineToRelative(-48.0f)
                verticalLineToRelative(-32.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(8.82f, 0.0f, 16.0f, 7.18f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.18f, 16.0f, -16.0f, 16.0f)
                close()
                moveTo(384.0f, 121.9f)
                verticalLineToRelative(6.1f)
                lineTo(256.0f, 128.0f)
                lineTo(256.0f, 0.0f)
                horizontalLineToRelative(6.1f)
                curveToRelative(6.4f, 0.0f, 12.5f, 2.5f, 17.0f, 7.0f)
                lineToRelative(97.9f, 98.0f)
                curveToRelative(4.5f, 4.5f, 7.0f, 10.6f, 7.0f, 16.9f)
                close()
            }
        }
        .build()
        return _filePrescription!!
    }

private var _filePrescription: ImageVector? = null
