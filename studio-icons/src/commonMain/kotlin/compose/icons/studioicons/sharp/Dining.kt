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

public val SharpGroup.Dining: ImageVector
    get() {
        if (_dining != null) {
            return _dining!!
        }
        _dining = Builder(name = "Dining", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 2.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(20.0f)
                verticalLineTo(2.0f)
                close()
                moveTo(11.0f, 10.3f)
                curveToRelative(0.0f, 0.93f, -0.64f, 1.71f, -1.5f, 1.93f)
                verticalLineTo(19.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(-6.77f)
                curveToRelative(-0.86f, -0.22f, -1.5f, -1.0f, -1.5f, -1.93f)
                verticalLineTo(6.0f)
                horizontalLineTo(7.0f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(0.75f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(0.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(0.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.3f)
                close()
                moveTo(15.58f, 12.59f)
                lineToRelative(-0.08f, 0.03f)
                verticalLineTo(19.0f)
                horizontalLineTo(14.0f)
                verticalLineToRelative(-6.38f)
                lineToRelative(-0.08f, -0.04f)
                curveToRelative(-0.97f, -0.47f, -1.67f, -1.7f, -1.67f, -3.18f)
                curveToRelative(0.0f, -1.88f, 1.13f, -3.4f, 2.5f, -3.4f)
                curveToRelative(1.38f, 0.0f, 2.5f, 1.53f, 2.5f, 3.41f)
                curveTo(17.25f, 10.89f, 16.55f, 12.12f, 15.58f, 12.59f)
                close()
            }
        }
        .build()
        return _dining!!
    }

private var _dining: ImageVector? = null
