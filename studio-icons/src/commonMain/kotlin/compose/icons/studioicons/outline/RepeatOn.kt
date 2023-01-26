package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.RepeatOn: ImageVector
    get() {
        if (_repeatOn != null) {
            return _repeatOn!!
        }
        _repeatOn = Builder(name = "RepeatOn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                horizontalLineTo(6.83f)
                lineToRelative(1.58f, 1.58f)
                lineTo(7.0f, 22.0f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(1.41f, 1.42f)
                lineTo(6.83f, 17.0f)
                horizontalLineTo(17.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(17.0f, 10.0f)
                lineToRelative(-1.41f, -1.42f)
                lineTo(17.17f, 7.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(12.17f)
                lineToRelative(-1.58f, -1.58f)
                lineTo(17.0f, 2.0f)
                lineToRelative(4.0f, 4.0f)
                lineTo(17.0f, 10.0f)
                close()
            }
        }
        .build()
        return _repeatOn!!
    }

private var _repeatOn: ImageVector? = null
