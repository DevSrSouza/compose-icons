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

public val SharpGroup.FiberDvr: ImageVector
    get() {
        if (_fiberDvr != null) {
            return _fiberDvr!!
        }
        _fiberDvr = Builder(name = "FiberDvr", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 10.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(4.5f, 10.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(23.0f, 3.0f)
                lineTo(1.0f, 3.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(22.0f)
                lineTo(23.0f, 3.0f)
                close()
                moveTo(8.0f, 13.5f)
                curveToRelative(0.0f, 0.85f, -0.65f, 1.5f, -1.5f, 1.5f)
                lineTo(3.0f, 15.0f)
                lineTo(3.0f, 9.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.85f, 0.0f, 1.5f, 0.65f, 1.5f, 1.5f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(12.62f, 15.0f)
                horizontalLineToRelative(-1.5f)
                lineTo(9.37f, 9.0f)
                horizontalLineToRelative(1.5f)
                lineToRelative(1.0f, 3.43f)
                lineToRelative(1.0f, -3.43f)
                horizontalLineToRelative(1.5f)
                lineToRelative(-1.75f, 6.0f)
                close()
                moveTo(21.0f, 12.9f)
                horizontalLineToRelative(-0.9f)
                lineTo(21.0f, 15.0f)
                horizontalLineToRelative(-1.5f)
                lineToRelative(-0.85f, -2.0f)
                lineTo(17.5f, 13.0f)
                verticalLineToRelative(2.0f)
                lineTo(16.0f, 15.0f)
                lineTo(16.0f, 9.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.9f)
                close()
            }
        }
        .build()
        return _fiberDvr!!
    }

private var _fiberDvr: ImageVector? = null
