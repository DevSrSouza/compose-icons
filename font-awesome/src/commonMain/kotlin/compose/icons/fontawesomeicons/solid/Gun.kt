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

public val SolidGroup.Gun: ImageVector
    get() {
        if (_gun != null) {
            return _gun!!
        }
        _gun = Builder(name = "Gun", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(528.0f, 56.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.7f, -24.0f, 24.0f)
                verticalLineToRelative(8.0f)
                horizontalLineTo(32.0f)
                curveTo(14.3f, 64.0f, 0.0f, 78.3f, 0.0f, 96.0f)
                verticalLineTo(208.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineTo(42.0f)
                curveToRelative(20.8f, 0.0f, 36.1f, 19.6f, 31.0f, 39.8f)
                lineTo(33.0f, 440.2f)
                curveToRelative(-2.4f, 9.6f, -0.2f, 19.7f, 5.8f, 27.5f)
                reflectiveCurveTo(54.1f, 480.0f, 64.0f, 480.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(14.7f, 0.0f, 27.5f, -10.0f, 31.0f, -24.2f)
                lineTo(217.0f, 352.0f)
                horizontalLineTo(321.4f)
                curveToRelative(23.7f, 0.0f, 44.8f, -14.9f, 52.7f, -37.2f)
                lineTo(400.9f, 240.0f)
                horizontalLineTo(432.0f)
                curveToRelative(8.5f, 0.0f, 16.6f, -3.4f, 22.6f, -9.4f)
                lineTo(477.3f, 208.0f)
                horizontalLineTo(544.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineTo(96.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(528.0f)
                verticalLineTo(56.0f)
                close()
                moveTo(321.4f, 304.0f)
                horizontalLineTo(229.0f)
                lineToRelative(16.0f, -64.0f)
                horizontalLineToRelative(105.0f)
                lineToRelative(-21.0f, 58.7f)
                curveToRelative(-1.1f, 3.2f, -4.2f, 5.3f, -7.5f, 5.3f)
                close()
                moveTo(80.0f, 128.0f)
                horizontalLineTo(464.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.2f, 16.0f, -16.0f, 16.0f)
                horizontalLineTo(80.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.2f, -16.0f, 16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _gun!!
    }

private var _gun: ImageVector? = null
