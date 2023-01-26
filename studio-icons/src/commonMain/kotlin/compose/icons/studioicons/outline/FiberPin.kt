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

public val OutlineGroup.FiberPin: ImageVector
    get() {
        if (_fiberPin != null) {
            return _fiberPin!!
        }
        _fiberPin = Builder(name = "FiberPin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 15.0f)
                horizontalLineToRelative(1.5f)
                lineTo(12.5f, 9.0f)
                lineTo(11.0f, 9.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(18.75f, 9.0f)
                verticalLineToRelative(3.5f)
                lineTo(16.25f, 9.0f)
                lineTo(15.0f, 9.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(-3.5f)
                lineTo(18.8f, 15.0f)
                lineTo(20.0f, 15.0f)
                lineTo(20.0f, 9.0f)
                horizontalLineToRelative(-1.25f)
                close()
                moveTo(7.5f, 9.0f)
                lineTo(4.0f, 9.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.85f, 0.0f, 1.5f, -0.65f, 1.5f, -1.5f)
                verticalLineToRelative(-1.0f)
                curveTo(9.0f, 9.65f, 8.35f, 9.0f, 7.5f, 9.0f)
                close()
                moveTo(7.5f, 11.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _fiberPin!!
    }

private var _fiberPin: ImageVector? = null
