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

public val SolidGroup.BoxTissue: ImageVector
    get() {
        if (_boxTissue != null) {
            return _boxTissue!!
        }
        _boxTissue = Builder(name = "BoxTissue", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(92.5f, 0.0f)
                horizontalLineTo(208.0f)
                curveToRelative(40.0f, 0.0f, 52.0f, 24.0f, 64.0f, 48.0f)
                reflectiveCurveToRelative(24.0f, 48.0f, 64.0f, 48.0f)
                horizontalLineToRelative(85.2f)
                curveTo(436.0f, 96.0f, 448.0f, 108.0f, 448.0f, 122.8f)
                curveToRelative(0.0f, 3.4f, -0.7f, 6.8f, -1.9f, 10.0f)
                lineTo(409.6f, 224.0f)
                lineTo(384.0f, 288.0f)
                horizontalLineTo(128.0f)
                lineToRelative(-16.0f, -64.0f)
                lineTo(64.9f, 35.4f)
                curveToRelative(-0.6f, -2.3f, -0.9f, -4.6f, -0.9f, -6.9f)
                curveTo(64.0f, 12.8f, 76.8f, 0.0f, 92.5f, 0.0f)
                close()
                moveTo(79.0f, 224.0f)
                lineToRelative(16.0f, 64.0f)
                horizontalLineTo(80.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                reflectiveCurveToRelative(7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(48.0f)
                horizontalLineTo(384.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                reflectiveCurveToRelative(-7.2f, -16.0f, -16.0f, -16.0f)
                horizontalLineTo(418.5f)
                lineToRelative(25.6f, -64.0f)
                horizontalLineTo(464.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                verticalLineTo(384.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(272.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                horizontalLineTo(79.0f)
                close()
                moveTo(0.0f, 416.0f)
                horizontalLineTo(512.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                horizontalLineTo(48.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                verticalLineTo(416.0f)
                close()
            }
        }
        .build()
        return _boxTissue!!
    }

private var _boxTissue: ImageVector? = null
