package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.FlashlightOff: ImageVector
    get() {
        if (_flashlightOff != null) {
            return _flashlightOff!!
        }
        _flashlightOff = Builder(name = "FlashlightOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineTo(8.0f, 10.83f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-3.17f)
                lineToRelative(3.78f, 3.78f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.81f, 2.81f)
                close()
                moveTo(14.0f, 20.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-7.17f)
                lineToRelative(4.0f, 4.0f)
                verticalLineTo(20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                lineToRelative(0.0f, 1.0f)
                lineToRelative(-8.17f, 0.0f)
                lineToRelative(2.0f, 2.0f)
                lineToRelative(6.17f, 0.0f)
                lineToRelative(0.0f, 0.39f)
                lineToRelative(-2.0f, 3.01f)
                lineToRelative(0.0f, 0.77f)
                lineToRelative(2.0f, 2.0f)
                lineToRelative(0.0f, -2.17f)
                lineToRelative(2.0f, -3.0f)
                lineToRelative(0.0f, -6.0f)
                lineToRelative(-12.0f, 0.0f)
                lineToRelative(0.0f, 1.17f)
                lineToRelative(0.83f, 0.83f)
                close()
            }
        }
        .build()
        return _flashlightOff!!
    }

private var _flashlightOff: ImageVector? = null
