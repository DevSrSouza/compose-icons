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

public val SolidGroup.ParachuteBox: ImageVector
    get() {
        if (_parachuteBox != null) {
            return _parachuteBox!!
        }
        _parachuteBox = Builder(name = "ParachuteBox", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(511.9f, 175.0f)
                curveToRelative(-9.1f, -75.6f, -78.4f, -132.4f, -158.3f, -158.7f)
                curveTo(390.0f, 55.7f, 416.0f, 116.9f, 416.0f, 192.0f)
                horizontalLineToRelative(28.1f)
                lineTo(327.5f, 321.5f)
                curveToRelative(-2.5f, -0.6f, -4.8f, -1.5f, -7.5f, -1.5f)
                horizontalLineToRelative(-48.0f)
                verticalLineTo(192.0f)
                horizontalLineToRelative(112.0f)
                curveTo(384.0f, 76.8f, 315.1f, 0.0f, 256.0f, 0.0f)
                reflectiveCurveTo(128.0f, 76.8f, 128.0f, 192.0f)
                horizontalLineToRelative(112.0f)
                verticalLineToRelative(128.0f)
                horizontalLineToRelative(-48.0f)
                curveToRelative(-2.7f, 0.0f, -5.0f, 0.9f, -7.5f, 1.5f)
                lineTo(67.9f, 192.0f)
                horizontalLineTo(96.0f)
                curveToRelative(0.0f, -75.1f, 26.0f, -136.3f, 62.4f, -175.7f)
                curveTo(78.5f, 42.7f, 9.2f, 99.5f, 0.1f, 175.0f)
                curveToRelative(-1.1f, 9.1f, 6.8f, 17.0f, 16.0f, 17.0f)
                horizontalLineToRelative(8.7f)
                lineToRelative(136.7f, 151.9f)
                curveToRelative(-0.7f, 2.6f, -1.6f, 5.2f, -1.6f, 8.1f)
                verticalLineToRelative(128.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(128.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineTo(352.0f)
                curveToRelative(0.0f, -2.9f, -0.9f, -5.4f, -1.6f, -8.1f)
                lineTo(487.1f, 192.0f)
                horizontalLineToRelative(8.7f)
                curveToRelative(9.3f, 0.0f, 17.2f, -7.8f, 16.1f, -17.0f)
                close()
            }
        }
        .build()
        return _parachuteBox!!
    }

private var _parachuteBox: ImageVector? = null
