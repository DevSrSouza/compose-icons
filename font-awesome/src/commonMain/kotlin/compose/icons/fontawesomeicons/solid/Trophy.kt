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
                moveTo(552.0f, 64.0f)
                horizontalLineTo(448.0f)
                verticalLineTo(24.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                horizontalLineTo(152.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                verticalLineToRelative(40.0f)
                horizontalLineTo(24.0f)
                curveTo(10.7f, 64.0f, 0.0f, 74.7f, 0.0f, 88.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 35.7f, 22.5f, 72.4f, 61.9f, 100.7f)
                curveToRelative(31.5f, 22.7f, 69.8f, 37.1f, 110.0f, 41.7f)
                curveTo(203.3f, 338.5f, 240.0f, 360.0f, 240.0f, 360.0f)
                verticalLineToRelative(72.0f)
                horizontalLineToRelative(-48.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, 20.7f, -64.0f, 56.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 6.6f, 5.4f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(296.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, -5.4f, 12.0f, -12.0f)
                verticalLineToRelative(-12.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -56.0f, -64.0f, -56.0f)
                horizontalLineToRelative(-48.0f)
                verticalLineToRelative(-72.0f)
                reflectiveCurveToRelative(36.7f, -21.5f, 68.1f, -73.6f)
                curveToRelative(40.3f, -4.6f, 78.6f, -19.0f, 110.0f, -41.7f)
                curveToRelative(39.3f, -28.3f, 61.9f, -65.0f, 61.9f, -100.7f)
                verticalLineTo(88.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                close()
                moveTo(99.3f, 192.8f)
                curveTo(74.9f, 175.2f, 64.0f, 155.6f, 64.0f, 144.0f)
                verticalLineToRelative(-16.0f)
                horizontalLineToRelative(64.2f)
                curveToRelative(1.0f, 32.6f, 5.8f, 61.2f, 12.8f, 86.2f)
                curveToRelative(-15.1f, -5.2f, -29.2f, -12.4f, -41.7f, -21.4f)
                close()
                moveTo(512.0f, 144.0f)
                curveToRelative(0.0f, 16.1f, -17.7f, 36.1f, -35.3f, 48.8f)
                curveToRelative(-12.5f, 9.0f, -26.7f, 16.2f, -41.8f, 21.4f)
                curveToRelative(7.0f, -25.0f, 11.8f, -53.6f, 12.8f, -86.2f)
                horizontalLineTo(512.0f)
                verticalLineToRelative(16.0f)
                close()
            }
        }
        .build()
        return _trophy!!
    }

private var _trophy: ImageVector? = null
