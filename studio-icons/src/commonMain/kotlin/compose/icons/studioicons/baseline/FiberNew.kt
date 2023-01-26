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

public val BaselineGroup.FiberNew: ImageVector
    get() {
        if (_fiberNew != null) {
            return _fiberNew!!
        }
        _fiberNew = Builder(name = "FiberNew", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.0f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 4.0f, 2.01f, 4.89f, 2.01f, 6.0f)
                lineTo(2.0f, 18.0f)
                curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 4.89f, 21.11f, 4.0f, 20.0f, 4.0f)
                close()
                moveTo(8.5f, 15.0f)
                horizontalLineTo(7.3f)
                lineToRelative(-2.55f, -3.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(3.5f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(1.25f)
                lineToRelative(2.5f, 3.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(8.5f)
                verticalLineTo(15.0f)
                close()
                moveTo(13.5f, 10.26f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(1.12f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(1.26f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(1.11f)
                horizontalLineToRelative(2.5f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(10.26f)
                close()
                moveTo(20.5f, 14.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(4.51f)
                horizontalLineToRelative(1.13f)
                verticalLineTo(9.99f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(3.51f)
                horizontalLineToRelative(1.12f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(1.25f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _fiberNew!!
    }

private var _fiberNew: ImageVector? = null
