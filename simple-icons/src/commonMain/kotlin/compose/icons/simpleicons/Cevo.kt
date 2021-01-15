package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Cevo: ImageVector
    get() {
        if (_cevo != null) {
            return _cevo!!
        }
        _cevo = Builder(name = "Cevo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5f, 6.0f)
                horizontalLineToRelative(12.0f)
                lineToRelative(6.0f, 10.3f)
                lineTo(24.0f, 12.0f)
                lineTo(18.0f, 1.6f)
                lineTo(6.0f, 1.6f)
                lineTo(3.5f, 6.0f)
                close()
                moveTo(2.6f, 7.5f)
                lineTo(0.0f, 12.0f)
                lineToRelative(6.0f, 10.4f)
                horizontalLineToRelative(12.0f)
                lineToRelative(2.6f, -4.5f)
                lineToRelative(-2.5f, -4.3f)
                lineToRelative(-2.6f, 4.5f)
                horizontalLineToRelative(-7.0f)
                lineTo(5.0f, 12.0f)
                lineToRelative(2.6f, -4.5f)
                horizontalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _cevo!!
    }

private var _cevo: ImageVector? = null
