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

public val OutlineGroup.FiberDvr: ImageVector
    get() {
        if (_fiberDvr != null) {
            return _fiberDvr!!
        }
        _fiberDvr = Builder(name = "FiberDvr", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.87f, 12.43f)
                lineToRelative(-1.0f, -3.43f)
                horizontalLineToRelative(-1.5f)
                lineToRelative(1.75f, 6.0f)
                horizontalLineToRelative(1.5f)
                lineToRelative(1.75f, -6.0f)
                horizontalLineToRelative(-1.5f)
                close()
                moveTo(21.0f, 11.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.85f, -0.65f, -1.5f, -1.5f, -1.5f)
                lineTo(16.0f, 9.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.15f)
                lineToRelative(0.85f, 2.0f)
                lineTo(21.0f, 15.0f)
                lineToRelative(-0.9f, -2.1f)
                curveToRelative(0.5f, -0.25f, 0.9f, -0.8f, 0.9f, -1.4f)
                close()
                moveTo(19.5f, 11.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(6.5f, 9.0f)
                lineTo(3.0f, 9.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.85f, 0.0f, 1.5f, -0.65f, 1.5f, -1.5f)
                verticalLineToRelative(-3.0f)
                curveTo(8.0f, 9.65f, 7.35f, 9.0f, 6.5f, 9.0f)
                close()
                moveTo(6.5f, 13.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _fiberDvr!!
    }

private var _fiberDvr: ImageVector? = null
