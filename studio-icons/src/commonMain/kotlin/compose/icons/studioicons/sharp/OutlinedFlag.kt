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

public val SharpGroup.OutlinedFlag: ImageVector
    get() {
        if (_outlinedFlag != null) {
            return _outlinedFlag!!
        }
        _outlinedFlag = Builder(name = "OutlinedFlag", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 6.0f)
                lineToRelative(-1.0f, -2.0f)
                lineTo(5.0f, 4.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(5.0f)
                lineToRelative(1.0f, 2.0f)
                horizontalLineToRelative(7.0f)
                lineTo(20.0f, 6.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(18.0f, 14.0f)
                horizontalLineToRelative(-4.0f)
                lineToRelative(-1.0f, -2.0f)
                lineTo(7.0f, 12.0f)
                lineTo(7.0f, 6.0f)
                horizontalLineToRelative(5.0f)
                lineToRelative(1.0f, 2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _outlinedFlag!!
    }

private var _outlinedFlag: ImageVector? = null
