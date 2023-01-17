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

public val SolidGroup.Trophy: ImageVector
    get() {
        if (_trophy != null) {
            return _trophy!!
        }
        _trophy = Builder(name = "Trophy", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(400.0f, 0.0f)
                horizontalLineTo(176.0f)
                curveToRelative(-26.5f, 0.0f, -48.1f, 21.8f, -47.1f, 48.2f)
                curveToRelative(0.2f, 5.3f, 0.4f, 10.6f, 0.7f, 15.8f)
                horizontalLineTo(24.0f)
                curveTo(10.7f, 64.0f, 0.0f, 74.7f, 0.0f, 88.0f)
                curveToRelative(0.0f, 92.6f, 33.5f, 157.0f, 78.5f, 200.7f)
                curveToRelative(44.3f, 43.1f, 98.3f, 64.8f, 138.1f, 75.8f)
                curveToRelative(23.4f, 6.5f, 39.4f, 26.0f, 39.4f, 45.6f)
                curveToRelative(0.0f, 20.9f, -17.0f, 37.9f, -37.9f, 37.9f)
                horizontalLineTo(192.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineTo(384.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(357.9f)
                curveTo(337.0f, 448.0f, 320.0f, 431.0f, 320.0f, 410.1f)
                curveToRelative(0.0f, -19.6f, 15.9f, -39.2f, 39.4f, -45.6f)
                curveToRelative(39.9f, -11.0f, 93.9f, -32.7f, 138.2f, -75.8f)
                curveTo(542.5f, 245.0f, 576.0f, 180.6f, 576.0f, 88.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                horizontalLineTo(446.4f)
                curveToRelative(0.3f, -5.2f, 0.5f, -10.4f, 0.7f, -15.8f)
                curveTo(448.1f, 21.8f, 426.5f, 0.0f, 400.0f, 0.0f)
                close()
                moveTo(48.9f, 112.0f)
                horizontalLineToRelative(84.4f)
                curveToRelative(9.1f, 90.1f, 29.2f, 150.3f, 51.9f, 190.6f)
                curveToRelative(-24.9f, -11.0f, -50.8f, -26.5f, -73.2f, -48.3f)
                curveToRelative(-32.0f, -31.1f, -58.0f, -76.0f, -63.0f, -142.3f)
                close()
                moveTo(464.1f, 254.3f)
                curveToRelative(-22.4f, 21.8f, -48.3f, 37.3f, -73.2f, 48.3f)
                curveToRelative(22.7f, -40.3f, 42.8f, -100.5f, 51.9f, -190.6f)
                horizontalLineToRelative(84.4f)
                curveToRelative(-5.1f, 66.3f, -31.1f, 111.2f, -63.0f, 142.3f)
                close()
            }
        }
        .build()
        return _trophy!!
    }

private var _trophy: ImageVector? = null
