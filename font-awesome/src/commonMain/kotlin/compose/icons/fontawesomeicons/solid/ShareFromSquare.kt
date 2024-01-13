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

public val SolidGroup.ShareFromSquare: ImageVector
    get() {
        if (_shareFromSquare != null) {
            return _shareFromSquare!!
        }
        _shareFromSquare = Builder(name = "ShareFromSquare", defaultWidth = 576.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.0f, 224.0f)
                horizontalLineTo(305.5f)
                curveToRelative(-45.0f, 0.0f, -81.5f, 36.5f, -81.5f, 81.5f)
                curveToRelative(0.0f, 22.3f, 10.3f, 34.3f, 19.2f, 40.5f)
                curveToRelative(6.8f, 4.7f, 12.8f, 12.0f, 12.8f, 20.3f)
                curveToRelative(0.0f, 9.8f, -8.0f, 17.8f, -17.8f, 17.8f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-2.4f, 0.0f, -4.8f, -0.4f, -7.1f, -1.4f)
                curveTo(210.8f, 374.8f, 128.0f, 333.4f, 128.0f, 240.0f)
                curveToRelative(0.0f, -79.5f, 64.5f, -144.0f, 144.0f, -144.0f)
                horizontalLineToRelative(80.0f)
                verticalLineTo(34.7f)
                curveTo(352.0f, 15.5f, 367.5f, 0.0f, 386.7f, 0.0f)
                curveToRelative(8.6f, 0.0f, 16.8f, 3.2f, 23.2f, 8.9f)
                lineTo(548.1f, 133.3f)
                curveToRelative(7.6f, 6.8f, 11.9f, 16.5f, 11.9f, 26.7f)
                reflectiveCurveToRelative(-4.3f, 19.9f, -11.9f, 26.7f)
                lineToRelative(-139.0f, 125.1f)
                curveToRelative(-5.9f, 5.3f, -13.5f, 8.2f, -21.4f, 8.2f)
                horizontalLineTo(384.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                verticalLineTo(224.0f)
                close()
                moveTo(80.0f, 96.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                verticalLineTo(432.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineTo(400.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                verticalLineTo(384.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 44.2f, -35.8f, 80.0f, -80.0f, 80.0f)
                horizontalLineTo(80.0f)
                curveToRelative(-44.2f, 0.0f, -80.0f, -35.8f, -80.0f, -80.0f)
                verticalLineTo(112.0f)
                curveTo(0.0f, 67.8f, 35.8f, 32.0f, 80.0f, 32.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(80.0f)
                close()
            }
        }
        .build()
        return _shareFromSquare!!
    }

private var _shareFromSquare: ImageVector? = null
