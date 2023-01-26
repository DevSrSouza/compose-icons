package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.RepeatOneOn: ImageVector
    get() {
        if (_repeatOneOn != null) {
            return _repeatOneOn!!
        }
        _repeatOneOn = Builder(name = "RepeatOneOn", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 1.0f)
                horizontalLineTo(3.0f)
                curveTo(1.9f, 1.0f, 1.0f, 1.9f, 1.0f, 3.0f)
                verticalLineToRelative(18.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(3.0f)
                curveTo(23.0f, 1.9f, 22.1f, 1.0f, 21.0f, 1.0f)
                close()
                moveTo(19.0f, 19.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(3.0f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(4.0f, -4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(10.0f, 10.5f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineTo(10.0f)
                close()
                moveTo(17.0f, 10.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(12.0f)
                verticalLineTo(2.0f)
                lineToRelative(4.0f, 4.0f)
                lineTo(17.0f, 10.0f)
                close()
            }
        }
        .build()
        return _repeatOneOn!!
    }

private var _repeatOneOn: ImageVector? = null
