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

public val SolidGroup.Procedures: ImageVector
    get() {
        if (_procedures != null) {
            return _procedures!!
        }
        _procedures = Builder(name = "Procedures", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(528.0f, 224.0f)
                lineTo(272.0f, 224.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                verticalLineToRelative(144.0f)
                lineTo(64.0f, 384.0f)
                lineTo(64.0f, 144.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                lineTo(16.0f, 128.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                verticalLineToRelative(-48.0f)
                horizontalLineToRelative(512.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                lineTo(640.0f, 336.0f)
                curveToRelative(0.0f, -61.9f, -50.1f, -112.0f, -112.0f, -112.0f)
                close()
                moveTo(136.0f, 96.0f)
                horizontalLineToRelative(126.1f)
                lineToRelative(27.6f, 55.2f)
                curveToRelative(5.9f, 11.8f, 22.7f, 11.8f, 28.6f, 0.0f)
                lineTo(368.0f, 51.8f)
                lineTo(390.1f, 96.0f)
                lineTo(512.0f, 96.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                reflectiveCurveToRelative(-7.2f, -16.0f, -16.0f, -16.0f)
                lineTo(409.9f, 64.0f)
                lineTo(382.3f, 8.8f)
                curveTo(376.4f, -3.0f, 359.6f, -3.0f, 353.7f, 8.8f)
                lineTo(304.0f, 108.2f)
                lineToRelative(-19.9f, -39.8f)
                curveToRelative(-1.4f, -2.7f, -4.1f, -4.4f, -7.2f, -4.4f)
                lineTo(136.0f, 64.0f)
                curveToRelative(-4.4f, 0.0f, -8.0f, 3.6f, -8.0f, 8.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 4.4f, 3.6f, 8.0f, 8.0f, 8.0f)
                close()
                moveTo(160.0f, 352.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                reflectiveCurveToRelative(-28.7f, -64.0f, -64.0f, -64.0f)
                reflectiveCurveToRelative(-64.0f, 28.7f, -64.0f, 64.0f)
                reflectiveCurveToRelative(28.7f, 64.0f, 64.0f, 64.0f)
                close()
            }
        }
        .build()
        return _procedures!!
    }

private var _procedures: ImageVector? = null
