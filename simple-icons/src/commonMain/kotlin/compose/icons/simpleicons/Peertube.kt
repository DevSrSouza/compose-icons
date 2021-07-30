package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Peertube: ImageVector
    get() {
        if (_peertube != null) {
            return _peertube!!
        }
        _peertube = Builder(name = "Peertube", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.545f)
                verticalLineToRelative(10.91f)
                lineTo(20.727f, 12.0f)
                moveTo(3.273f, 12.0f)
                verticalLineToRelative(12.0f)
                lineTo(12.0f, 17.455f)
                moveTo(3.273f, 0.0f)
                verticalLineToRelative(12.0f)
                lineTo(12.0f, 6.545f)
            }
        }
        .build()
        return _peertube!!
    }

private var _peertube: ImageVector? = null
