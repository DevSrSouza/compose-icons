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

public val RoundGroup.VerticalShadesClosed: ImageVector
    get() {
        if (_verticalShadesClosed != null) {
            return _verticalShadesClosed!!
        }
        _verticalShadesClosed = Builder(name = "VerticalShadesClosed", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 19.0f)
                verticalLineTo(5.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.9f, 3.0f, 4.0f, 3.9f, 4.0f, 5.0f)
                verticalLineToRelative(14.0f)
                horizontalLineTo(3.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(13.0f, 5.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(11.0f, 19.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(5.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(6.0f, 5.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(14.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(16.5f, 19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(18.0f)
                verticalLineToRelative(14.0f)
                horizontalLineTo(16.5f)
                close()
            }
        }
        .build()
        return _verticalShadesClosed!!
    }

private var _verticalShadesClosed: ImageVector? = null
