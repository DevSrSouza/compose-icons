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

public val SharpGroup.Vaccines: ImageVector
    get() {
        if (_vaccines != null) {
            return _vaccines!!
        }
        _vaccines = Builder(name = "Vaccines", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.5f)
                horizontalLineTo(8.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(1.5f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.0f, 0.45f, 0.0f, 1.0f, 0.0f)
                verticalLineTo(17.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.0f)
                lineToRelative(2.0f, 1.5f)
                verticalLineTo(17.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(7.5f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f)
                verticalLineTo(5.5f)
                close()
                moveTo(9.0f, 9.0f)
                horizontalLineTo(6.5f)
                verticalLineToRelative(1.5f)
                horizontalLineTo(9.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(6.5f)
                verticalLineToRelative(1.5f)
                horizontalLineTo(9.0f)
                lineTo(9.0f, 15.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.5f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(19.5f, 10.5f)
                verticalLineTo(10.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(-7.0f)
                lineToRelative(-0.01f, 2.0f)
                horizontalLineToRelative(1.01f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.5f, -1.5f, 1.16f, -1.5f, 3.0f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-8.5f)
                curveTo(21.0f, 11.66f, 19.5f, 11.0f, 19.5f, 10.5f)
                close()
                moveTo(16.5f, 10.5f)
                verticalLineTo(10.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.6f, 1.5f, 2.0f, 1.5f, 3.0f)
                verticalLineTo(14.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.21f, 0.0f, -0.39f, 0.0f, -0.5f)
                curveTo(15.0f, 12.5f, 16.5f, 12.1f, 16.5f, 10.5f)
                close()
                moveTo(15.0f, 20.0f)
                curveToRelative(0.0f, 0.0f, 0.0f, -0.63f, 0.0f, -1.5f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _vaccines!!
    }

private var _vaccines: ImageVector? = null
