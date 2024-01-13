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

public val SolidGroup.MaskFace: ImageVector
    get() {
        if (_maskFace != null) {
            return _maskFace!!
        }
        _maskFace = Builder(name = "MaskFace", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 64.0f)
                curveToRelative(-27.2f, 0.0f, -53.8f, 8.0f, -76.4f, 23.1f)
                lineToRelative(-37.1f, 24.8f)
                curveToRelative(-15.8f, 10.5f, -34.3f, 16.1f, -53.3f, 16.1f)
                lineTo(144.0f, 128.0f)
                lineTo(128.0f, 128.0f)
                lineTo(56.0f, 128.0f)
                curveToRelative(-30.9f, 0.0f, -56.0f, 25.1f, -56.0f, 56.0f)
                verticalLineToRelative(85.0f)
                curveToRelative(0.0f, 55.1f, 37.5f, 103.1f, 90.9f, 116.4f)
                lineToRelative(108.0f, 27.0f)
                curveTo(233.8f, 435.0f, 275.4f, 448.0f, 320.0f, 448.0f)
                reflectiveCurveToRelative(86.2f, -13.0f, 121.1f, -35.5f)
                lineToRelative(108.0f, -27.0f)
                curveTo(602.5f, 372.1f, 640.0f, 324.1f, 640.0f, 269.0f)
                lineTo(640.0f, 184.0f)
                curveToRelative(0.0f, -30.9f, -25.1f, -56.0f, -56.0f, -56.0f)
                lineTo(512.0f, 128.0f)
                lineTo(496.0f, 128.0f)
                horizontalLineToRelative(-9.2f)
                curveToRelative(-19.0f, 0.0f, -37.5f, -5.6f, -53.3f, -16.1f)
                lineTo(396.4f, 87.1f)
                curveTo(373.8f, 72.0f, 347.2f, 64.0f, 320.0f, 64.0f)
                close()
                moveTo(132.3f, 346.3f)
                lineToRelative(-29.8f, -7.4f)
                curveTo(70.5f, 330.9f, 48.0f, 302.1f, 48.0f, 269.0f)
                lineTo(48.0f, 184.0f)
                curveToRelative(0.0f, -4.4f, 3.6f, -8.0f, 8.0f, -8.0f)
                lineTo(96.0f, 176.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 45.1f, 13.4f, 87.2f, 36.3f, 122.3f)
                close()
                moveTo(537.4f, 338.9f)
                lineToRelative(-29.8f, 7.4f)
                curveToRelative(23.0f, -35.2f, 36.3f, -77.2f, 36.3f, -122.3f)
                lineTo(543.9f, 176.0f)
                horizontalLineToRelative(40.0f)
                curveToRelative(4.4f, 0.0f, 8.0f, 3.6f, 8.0f, 8.0f)
                verticalLineToRelative(85.0f)
                curveToRelative(0.0f, 33.0f, -22.5f, 61.8f, -54.5f, 69.9f)
                close()
                moveTo(192.0f, 208.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                lineTo(432.0f, 192.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.2f, 16.0f, -16.0f, 16.0f)
                lineTo(208.0f, 224.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                close()
                moveTo(208.0f, 256.0f)
                lineTo(432.0f, 256.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.2f, 16.0f, -16.0f, 16.0f)
                lineTo(208.0f, 288.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.2f, -16.0f, 16.0f, -16.0f)
                close()
                moveTo(224.0f, 336.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                lineTo(400.0f, 320.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.2f, 16.0f, -16.0f, 16.0f)
                lineTo(240.0f, 352.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _maskFace!!
    }

private var _maskFace: ImageVector? = null
