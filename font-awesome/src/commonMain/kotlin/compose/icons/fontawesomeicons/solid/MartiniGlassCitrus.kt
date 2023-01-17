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

public val SolidGroup.MartiniGlassCitrus: ImageVector
    get() {
        if (_martiniGlassCitrus != null) {
            return _martiniGlassCitrus!!
        }
        _martiniGlassCitrus = Builder(name = "MartiniGlassCitrus", defaultWidth = 576.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(432.0f, 240.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, -43.0f, 96.0f, -96.0f)
                reflectiveCurveToRelative(-43.0f, -96.0f, -96.0f, -96.0f)
                curveToRelative(-35.5f, 0.0f, -66.6f, 19.3f, -83.2f, 48.0f)
                horizontalLineTo(296.2f)
                curveTo(316.0f, 40.1f, 369.3f, 0.0f, 432.0f, 0.0f)
                curveToRelative(79.5f, 0.0f, 144.0f, 64.5f, 144.0f, 144.0f)
                reflectiveCurveToRelative(-64.5f, 144.0f, -144.0f, 144.0f)
                curveToRelative(-27.7f, 0.0f, -53.5f, -7.8f, -75.5f, -21.3f)
                lineToRelative(35.4f, -35.4f)
                curveToRelative(12.2f, 5.6f, 25.8f, 8.7f, 40.1f, 8.7f)
                close()
                moveTo(1.8f, 142.8f)
                curveTo(5.5f, 133.8f, 14.3f, 128.0f, 24.0f, 128.0f)
                horizontalLineTo(392.0f)
                curveToRelative(9.7f, 0.0f, 18.5f, 5.8f, 22.2f, 14.8f)
                reflectiveCurveToRelative(1.7f, 19.3f, -5.2f, 26.2f)
                lineToRelative(-177.0f, 177.0f)
                verticalLineTo(464.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                horizontalLineTo(208.0f)
                horizontalLineTo(120.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.7f, -24.0f, 24.0f, -24.0f)
                horizontalLineToRelative(64.0f)
                verticalLineTo(345.9f)
                lineTo(7.0f, 169.0f)
                curveToRelative(-6.9f, -6.9f, -8.9f, -17.2f, -5.2f, -26.2f)
                close()
            }
        }
        .build()
        return _martiniGlassCitrus!!
    }

private var _martiniGlassCitrus: ImageVector? = null
