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

public val SimpleIcons.Radixui: ImageVector
    get() {
        if (_radixui != null) {
            return _radixui!!
        }
        _radixui = Builder(name = "Radixui", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.52f, 24.0f)
                arcToRelative(7.68f, 7.68f, 0.0f, false, true, -7.68f, -7.68f)
                arcToRelative(7.68f, 7.68f, 0.0f, false, true, 7.68f, -7.68f)
                lineTo(11.52f, 24.0f)
                close()
                moveTo(11.52f, 0.0f)
                verticalLineToRelative(7.68f)
                lineTo(3.84f, 7.68f)
                lineTo(3.84f, 0.0f)
                horizontalLineToRelative(7.68f)
                close()
                moveTo(16.32f, 7.68f)
                arcToRelative(3.84f, 3.84f, 0.0f, true, true, 0.0f, -7.68f)
                arcToRelative(3.84f, 3.84f, 0.0f, false, true, 0.0f, 7.68f)
                close()
            }
        }
        .build()
        return _radixui!!
    }

private var _radixui: ImageVector? = null
