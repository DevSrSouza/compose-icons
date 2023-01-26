package compose.icons.studioicons.sharp

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
import compose.icons.studioicons.SharpGroup

public val SharpGroup.Living: ImageVector
    get() {
        if (_living != null) {
            return _living!!
        }
        _living = Builder(name = "Living", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 12.0f)
                lineToRelative(0.0f, 2.5f)
                lineToRelative(-7.0f, 0.0f)
                lineToRelative(0.0f, -2.5f)
                lineToRelative(-0.98f, 0.0f)
                lineToRelative(-1.02f, 0.0f)
                lineToRelative(0.0f, 4.5f)
                lineToRelative(11.0f, 0.0f)
                lineToRelative(0.0f, -4.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 10.0f)
                lineToRelative(0.0f, 3.0f)
                lineToRelative(4.0f, 0.0f)
                lineToRelative(0.0f, -3.0f)
                lineToRelative(2.25f, -0.01f)
                lineToRelative(0.0f, -2.49f)
                lineToRelative(-8.5f, 0.0f)
                lineToRelative(0.0f, 2.49f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 2.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(20.0f)
                verticalLineTo(2.0f)
                close()
                moveTo(19.0f, 9.99f)
                verticalLineTo(18.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(-8.0f)
                lineToRelative(1.25f, -0.01f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(11.5f)
                verticalLineToRelative(3.99f)
                horizontalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _living!!
    }

private var _living: ImageVector? = null
