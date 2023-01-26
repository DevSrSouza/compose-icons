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

public val BaselineGroup.FiberDvr: ImageVector
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
                verticalLineTo(10.5f)
                close()
                moveTo(4.5f, 10.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(10.5f)
                close()
                moveTo(21.0f, 3.0f)
                horizontalLineTo(3.0f)
                curveTo(1.89f, 3.0f, 1.0f, 3.89f, 1.0f, 5.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.11f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(5.0f)
                curveTo(23.0f, 3.89f, 22.11f, 3.0f, 21.0f, 3.0f)
                close()
                moveTo(8.0f, 13.5f)
                curveTo(8.0f, 14.35f, 7.35f, 15.0f, 6.5f, 15.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(3.5f)
                curveTo(7.35f, 9.0f, 8.0f, 9.65f, 8.0f, 10.5f)
                verticalLineTo(13.5f)
                close()
                moveTo(12.62f, 15.0f)
                horizontalLineToRelative(-1.5f)
                lineTo(9.37f, 9.0f)
                horizontalLineToRelative(1.5f)
                lineToRelative(1.0f, 3.43f)
                lineToRelative(1.0f, -3.43f)
                horizontalLineToRelative(1.5f)
                lineTo(12.62f, 15.0f)
                close()
                moveTo(21.0f, 11.5f)
                curveToRelative(0.0f, 0.6f, -0.4f, 1.15f, -0.9f, 1.4f)
                lineTo(21.0f, 15.0f)
                horizontalLineToRelative(-1.5f)
                lineToRelative(-0.85f, -2.0f)
                horizontalLineTo(17.5f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.85f, 0.0f, 1.5f, 0.65f, 1.5f, 1.5f)
                verticalLineTo(11.5f)
                close()
            }
        }
        .build()
        return _fiberDvr!!
    }

private var _fiberDvr: ImageVector? = null
