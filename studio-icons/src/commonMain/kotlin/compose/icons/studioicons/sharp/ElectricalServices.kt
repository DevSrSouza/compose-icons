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

public val SharpGroup.ElectricalServices: ImageVector
    get() {
        if (_electricalServices != null) {
            return _electricalServices!!
        }
        _electricalServices = Builder(name = "ElectricalServices", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 13.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(-2.0f, 0.0f)
                lineToRelative(0.0f, 4.0f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(5.0f, 0.0f)
                lineToRelative(0.0f, -8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 11.0f)
                lineToRelative(7.0f, 0.0f)
                lineToRelative(0.0f, -7.0f)
                lineToRelative(-8.0f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(6.0f, 0.0f)
                lineToRelative(0.0f, 3.0f)
                lineToRelative(-7.0f, 0.0f)
                lineToRelative(0.0f, 8.0f)
                lineToRelative(6.0f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(-4.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 17.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _electricalServices!!
    }

private var _electricalServices: ImageVector? = null
