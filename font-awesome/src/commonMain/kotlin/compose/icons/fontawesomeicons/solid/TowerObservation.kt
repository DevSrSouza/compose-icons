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

public val SolidGroup.TowerObservation: ImageVector
    get() {
        if (_towerObservation != null) {
            return _towerObservation!!
        }
        _towerObservation = Builder(name = "TowerObservation", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(241.7f, 3.4f)
                curveToRelative(9.0f, -4.5f, 19.6f, -4.5f, 28.6f, 0.0f)
                lineToRelative(160.0f, 80.0f)
                curveToRelative(15.8f, 7.9f, 22.2f, 27.1f, 14.3f, 42.9f)
                curveTo(439.0f, 137.5f, 427.7f, 144.0f, 416.0f, 144.0f)
                verticalLineToRelative(80.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineToRelative(-4.9f)
                lineToRelative(32.0f, 192.0f)
                lineTo(480.0f, 448.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(384.5f, 512.0f)
                curveToRelative(-0.4f, 0.0f, -0.8f, 0.0f, -1.1f, 0.0f)
                lineTo(128.6f, 512.0f)
                curveToRelative(-0.4f, 0.0f, -0.8f, 0.0f, -1.1f, 0.0f)
                lineTo(32.0f, 512.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                horizontalLineToRelative(68.9f)
                lineToRelative(32.0f, -192.0f)
                lineTo(128.0f, 256.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(96.0f, 144.0f)
                curveToRelative(-11.7f, 0.0f, -23.0f, -6.5f, -28.6f, -17.7f)
                curveToRelative(-7.9f, -15.8f, -1.5f, -35.0f, 14.3f, -42.9f)
                lineToRelative(160.0f, -80.0f)
                close()
                moveTo(314.5f, 448.0f)
                lineTo(256.0f, 399.2f)
                lineTo(197.5f, 448.0f)
                horizontalLineToRelative(117.0f)
                close()
                moveTo(197.8f, 256.0f)
                lineToRelative(-4.7f, 28.3f)
                lineTo(256.0f, 336.8f)
                lineToRelative(62.9f, -52.5f)
                lineTo(314.2f, 256.0f)
                lineTo(197.8f, 256.0f)
                close()
                moveTo(183.9f, 339.2f)
                lineToRelative(-11.2f, 67.0f)
                lineTo(218.5f, 368.0f)
                lineToRelative(-34.6f, -28.8f)
                close()
                moveTo(293.5f, 368.0f)
                lineToRelative(45.8f, 38.1f)
                lineToRelative(-11.2f, -67.0f)
                lineTo(293.5f, 368.0f)
                close()
                moveTo(176.0f, 128.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                reflectiveCurveToRelative(7.2f, 16.0f, 16.0f, 16.0f)
                lineTo(336.0f, 160.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                reflectiveCurveToRelative(-7.2f, -16.0f, -16.0f, -16.0f)
                lineTo(176.0f, 128.0f)
                close()
            }
        }
        .build()
        return _towerObservation!!
    }

private var _towerObservation: ImageVector? = null
