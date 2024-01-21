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

public val SolidGroup.Bone: ImageVector
    get() {
        if (_bone != null) {
            return _bone!!
        }
        _bone = Builder(name = "Bone", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(153.7f, 144.8f)
                curveToRelative(6.9f, 16.3f, 20.6f, 31.2f, 38.3f, 31.2f)
                horizontalLineTo(384.0f)
                curveToRelative(17.7f, 0.0f, 31.4f, -14.9f, 38.3f, -31.2f)
                curveTo(434.4f, 116.1f, 462.9f, 96.0f, 496.0f, 96.0f)
                curveToRelative(44.2f, 0.0f, 80.0f, 35.8f, 80.0f, 80.0f)
                curveToRelative(0.0f, 30.4f, -17.0f, 56.9f, -42.0f, 70.4f)
                curveToRelative(-3.6f, 1.9f, -6.0f, 5.5f, -6.0f, 9.6f)
                reflectiveCurveToRelative(2.4f, 7.7f, 6.0f, 9.6f)
                curveToRelative(25.0f, 13.5f, 42.0f, 40.0f, 42.0f, 70.4f)
                curveToRelative(0.0f, 44.2f, -35.8f, 80.0f, -80.0f, 80.0f)
                curveToRelative(-33.1f, 0.0f, -61.6f, -20.1f, -73.7f, -48.8f)
                curveTo(415.4f, 350.9f, 401.7f, 336.0f, 384.0f, 336.0f)
                horizontalLineTo(192.0f)
                curveToRelative(-17.7f, 0.0f, -31.4f, 14.9f, -38.3f, 31.2f)
                curveTo(141.6f, 395.9f, 113.1f, 416.0f, 80.0f, 416.0f)
                curveToRelative(-44.2f, 0.0f, -80.0f, -35.8f, -80.0f, -80.0f)
                curveToRelative(0.0f, -30.4f, 17.0f, -56.9f, 42.0f, -70.4f)
                curveToRelative(3.6f, -1.9f, 6.0f, -5.5f, 6.0f, -9.6f)
                reflectiveCurveToRelative(-2.4f, -7.7f, -6.0f, -9.6f)
                curveTo(17.0f, 232.9f, 0.0f, 206.4f, 0.0f, 176.0f)
                curveToRelative(0.0f, -44.2f, 35.8f, -80.0f, 80.0f, -80.0f)
                curveToRelative(33.1f, 0.0f, 61.6f, 20.1f, 73.7f, 48.8f)
                close()
            }
        }
        .build()
        return _bone!!
    }

private var _bone: ImageVector? = null
