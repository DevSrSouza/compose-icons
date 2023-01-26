package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.TwoWheeler: ImageVector
    get() {
        if (_twoWheeler != null) {
            return _twoWheeler!!
        }
        _twoWheeler = Builder(name = "TwoWheeler", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 11.0f)
                curveToRelative(-0.18f, 0.0f, -0.36f, 0.03f, -0.53f, 0.05f)
                lineTo(17.41f, 9.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(6.0f)
                lineToRelative(-3.72f, 1.86f)
                lineTo(13.41f, 5.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.59f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineTo(11.0f)
                lineToRelative(-4.0f, 2.0f)
                lineTo(5.0f, 9.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f)
                curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(3.49f, -6.1f)
                lineToRelative(1.01f, 1.01f)
                curveTo(16.59f, 12.64f, 16.0f, 13.75f, 16.0f, 15.0f)
                curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f)
                curveTo(24.0f, 12.79f, 22.21f, 11.0f, 20.0f, 11.0f)
                close()
                moveTo(4.0f, 17.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                curveTo(6.0f, 16.1f, 5.1f, 17.0f, 4.0f, 17.0f)
                close()
                moveTo(20.0f, 17.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                curveTo(22.0f, 16.1f, 21.1f, 17.0f, 20.0f, 17.0f)
                close()
            }
        }
        .build()
        return _twoWheeler!!
    }

private var _twoWheeler: ImageVector? = null
