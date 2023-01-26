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

public val RoundGroup.KingBed: ImageVector
    get() {
        if (_kingBed != null) {
            return _kingBed!!
        }
        _kingBed = Builder(name = "KingBed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 10.0f)
                verticalLineTo(7.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.9f, 5.0f, 4.0f, 5.9f, 4.0f, 7.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(1.33f)
                lineToRelative(0.51f, 1.53f)
                curveTo(3.94f, 18.81f, 4.2f, 19.0f, 4.5f, 19.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.3f, 0.0f, 0.56f, -0.19f, 0.66f, -0.47f)
                lineTo(5.67f, 17.0f)
                horizontalLineToRelative(12.67f)
                lineToRelative(0.51f, 1.53f)
                curveTo(18.94f, 18.81f, 19.2f, 19.0f, 19.5f, 19.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.3f, 0.0f, 0.56f, -0.19f, 0.66f, -0.47f)
                lineTo(20.67f, 17.0f)
                horizontalLineTo(22.0f)
                verticalLineToRelative(-5.0f)
                curveTo(22.0f, 10.9f, 21.1f, 10.0f, 20.0f, 10.0f)
                close()
                moveTo(11.0f, 10.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(8.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(18.0f, 10.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _kingBed!!
    }

private var _kingBed: ImageVector? = null
