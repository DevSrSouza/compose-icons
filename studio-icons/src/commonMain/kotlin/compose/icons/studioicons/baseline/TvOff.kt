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

public val BaselineGroup.TvOff: ImageVector
    get() {
        if (_tvOff != null) {
            return _tvOff!!
        }
        _tvOff = Builder(name = "TvOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 3.54f)
                lineToRelative(1.53f, 1.53f)
                curveTo(1.65f, 5.28f, 1.0f, 6.06f, 1.0f, 7.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(15.46f)
                lineToRelative(2.0f, 2.0f)
                lineToRelative(1.26f, -1.27f)
                lineTo(2.27f, 2.27f)
                lineTo(1.0f, 3.54f)
                close()
                moveTo(3.0f, 19.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(1.46f)
                lineToRelative(12.0f, 12.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(21.0f, 5.0f)
                horizontalLineToRelative(-7.58f)
                lineToRelative(3.29f, -3.3f)
                lineTo(16.0f, 1.0f)
                lineToRelative(-4.0f, 4.0f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(-0.7f, 0.7f)
                lineTo(10.58f, 5.0f)
                horizontalLineTo(7.52f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(11.48f)
                lineToRelative(1.65f, 1.65f)
                curveToRelative(0.22f, -0.32f, 0.35f, -0.71f, 0.35f, -1.13f)
                verticalLineTo(7.0f)
                curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _tvOff!!
    }

private var _tvOff: ImageVector? = null
