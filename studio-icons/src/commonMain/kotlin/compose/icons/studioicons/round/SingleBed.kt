package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.SingleBed: ImageVector
    get() {
        if (_singleBed != null) {
            return _singleBed!!
        }
        _singleBed = Builder(name = "SingleBed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 10.0f)
                verticalLineTo(7.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(8.0f)
                curveTo(6.9f, 5.0f, 6.0f, 5.9f, 6.0f, 7.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(1.33f)
                lineToRelative(0.51f, 1.53f)
                curveTo(5.94f, 18.81f, 6.2f, 19.0f, 6.5f, 19.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.3f, 0.0f, 0.56f, -0.19f, 0.66f, -0.47f)
                lineTo(7.67f, 17.0f)
                horizontalLineToRelative(8.67f)
                lineToRelative(0.51f, 1.53f)
                curveTo(16.94f, 18.81f, 17.2f, 19.0f, 17.5f, 19.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.3f, 0.0f, 0.56f, -0.19f, 0.66f, -0.47f)
                lineTo(18.67f, 17.0f)
                horizontalLineTo(20.0f)
                verticalLineToRelative(-5.0f)
                curveTo(20.0f, 10.9f, 19.1f, 10.0f, 18.0f, 10.0f)
                close()
                moveTo(11.0f, 10.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(8.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(16.0f, 10.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _singleBed!!
    }

private var _singleBed: ImageVector? = null
