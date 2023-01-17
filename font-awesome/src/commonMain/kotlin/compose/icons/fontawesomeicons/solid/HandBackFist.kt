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

public val SolidGroup.HandBackFist: ImageVector
    get() {
        if (_handBackFist != null) {
            return _handBackFist!!
        }
        _handBackFist = Builder(name = "HandBackFist", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 0.0f)
                curveTo(117.5f, 0.0f, 96.0f, 21.5f, 96.0f, 48.0f)
                verticalLineTo(96.0f)
                verticalLineToRelative(28.5f)
                verticalLineTo(176.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                reflectiveCurveToRelative(-16.0f, -7.2f, -16.0f, -16.0f)
                verticalLineTo(149.3f)
                lineToRelative(-9.0f, 7.5f)
                curveTo(40.4f, 169.0f, 32.0f, 187.0f, 32.0f, 206.0f)
                verticalLineTo(244.0f)
                curveToRelative(0.0f, 38.0f, 16.9f, 74.0f, 46.1f, 98.3f)
                lineTo(128.0f, 384.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineTo(320.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineTo(374.7f)
                curveToRelative(46.9f, -19.0f, 80.0f, -65.0f, 80.0f, -118.7f)
                verticalLineTo(176.0f)
                verticalLineTo(160.0f)
                verticalLineTo(144.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                curveToRelative(-12.4f, 0.0f, -23.6f, 4.7f, -32.1f, 12.3f)
                curveTo(350.0f, 83.5f, 329.3f, 64.0f, 304.0f, 64.0f)
                curveToRelative(-12.4f, 0.0f, -23.6f, 4.7f, -32.1f, 12.3f)
                curveTo(270.0f, 51.5f, 249.3f, 32.0f, 224.0f, 32.0f)
                curveToRelative(-12.4f, 0.0f, -23.6f, 4.7f, -32.1f, 12.3f)
                curveTo(190.0f, 19.5f, 169.3f, 0.0f, 144.0f, 0.0f)
                close()
            }
        }
        .build()
        return _handBackFist!!
    }

private var _handBackFist: ImageVector? = null
