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

public val SharpGroup.DynamicFeed: ImageVector
    get() {
        if (_dynamicFeed != null) {
            return _dynamicFeed!!
        }
        _dynamicFeed = Builder(name = "DynamicFeed", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 8.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, 9.0f)
                lineToRelative(11.0f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(-9.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 3.0f)
                horizontalLineTo(10.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(12.0f)
                verticalLineTo(3.0f)
                close()
                moveTo(20.0f, 11.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 12.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, 9.0f)
                lineToRelative(11.0f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(-9.0f, 0.0f)
                close()
            }
        }
        .build()
        return _dynamicFeed!!
    }

private var _dynamicFeed: ImageVector? = null
