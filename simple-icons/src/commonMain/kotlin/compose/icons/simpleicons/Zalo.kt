package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Zalo: ImageVector
    get() {
        if (_zalo != null) {
            return _zalo!!
        }
        _zalo = Builder(name = "Zalo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.49f, 10.2722f)
                verticalLineToRelative(-0.4496f)
                horizontalLineToRelative(1.3467f)
                verticalLineToRelative(6.3218f)
                horizontalLineToRelative(-0.7704f)
                arcToRelative(0.576f, 0.576f, 0.0f, false, true, -0.5763f, -0.5729f)
                lineToRelative(-6.0E-4f, 5.0E-4f)
                arcToRelative(3.273f, 3.273f, 0.0f, false, true, -1.9372f, 0.6321f)
                curveToRelative(-1.8138f, 0.0f, -3.2844f, -1.4697f, -3.2844f, -3.2823f)
                curveToRelative(0.0f, -1.8125f, 1.4706f, -3.2822f, 3.2844f, -3.2822f)
                arcToRelative(3.273f, 3.273f, 0.0f, false, true, 1.9372f, 0.6321f)
                lineToRelative(6.0E-4f, 5.0E-4f)
                close()
                moveTo(6.9188f, 7.7896f)
                verticalLineToRelative(0.205f)
                curveToRelative(0.0f, 0.3823f, -0.051f, 0.6944f, -0.2995f, 1.0605f)
                lineToRelative(-0.03f, 0.0343f)
                curveToRelative(-0.0542f, 0.0615f, -0.1815f, 0.206f, -0.2421f, 0.2843f)
                lineTo(2.024f, 14.8f)
                horizontalLineToRelative(4.8948f)
                verticalLineToRelative(0.7682f)
                arcToRelative(0.5764f, 0.5764f, 0.0f, false, true, -0.5767f, 0.5761f)
                lineTo(0.0f, 16.1443f)
                verticalLineToRelative(-0.3622f)
                curveToRelative(0.0f, -0.4436f, 0.1102f, -0.6414f, 0.2495f, -0.8476f)
                lineTo(4.8582f, 9.23f)
                lineTo(0.1922f, 9.23f)
                lineTo(0.1922f, 7.7896f)
                horizontalLineToRelative(6.7266f)
                close()
                moveTo(15.4701f, 16.1444f)
                arcToRelative(0.4805f, 0.4805f, 0.0f, false, true, -0.4803f, -0.4798f)
                verticalLineToRelative(-7.875f)
                horizontalLineToRelative(1.4416f)
                verticalLineToRelative(8.3548f)
                lineTo(15.47f, 16.1444f)
                close()
                moveTo(20.6934f, 9.6f)
                curveTo(22.52f, 9.6f, 24.0f, 11.0807f, 24.0f, 12.9044f)
                curveToRelative(0.0f, 1.8252f, -1.4801f, 3.306f, -3.3066f, 3.306f)
                curveToRelative(-1.8264f, 0.0f, -3.3066f, -1.4808f, -3.3066f, -3.306f)
                curveToRelative(0.0f, -1.8237f, 1.4802f, -3.3044f, 3.3066f, -3.3044f)
                close()
                moveTo(10.5522f, 14.853f)
                curveToRelative(1.0675f, 0.0f, 1.9324f, -0.8645f, 1.9324f, -1.9312f)
                curveToRelative(0.0f, -1.065f, -0.865f, -1.9295f, -1.9324f, -1.9295f)
                reflectiveCurveToRelative(-1.9324f, 0.8644f, -1.9324f, 1.9295f)
                curveToRelative(0.0f, 1.0667f, 0.865f, 1.9312f, 1.9324f, 1.9312f)
                close()
                moveTo(20.6934f, 14.8497f)
                curveToRelative(1.0737f, 0.0f, 1.945f, -0.8707f, 1.945f, -1.9453f)
                curveToRelative(0.0f, -1.073f, -0.8713f, -1.9436f, -1.945f, -1.9436f)
                curveToRelative(-1.0753f, 0.0f, -1.945f, 0.8706f, -1.945f, 1.9436f)
                curveToRelative(0.0f, 1.0746f, 0.8697f, 1.9453f, 1.945f, 1.9453f)
                close()
            }
        }
        .build()
        return _zalo!!
    }

private var _zalo: ImageVector? = null
