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

public val SharpGroup.FilterAltOff: ImageVector
    get() {
        if (_filterAltOff != null) {
            return _filterAltOff!!
        }
        _filterAltOff = Builder(name = "FilterAltOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.05f, 4.0f)
                lineToRelative(-14.22f, 0.0f)
                lineToRelative(7.97f, 7.97f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.81f, 2.81f)
                lineToRelative(-1.42f, 1.41f)
                lineToRelative(8.61f, 8.78f)
                lineToRelative(0.0f, 7.0f)
                lineToRelative(4.0f, 0.0f)
                lineToRelative(0.0f, -3.17f)
                lineToRelative(5.78f, 5.78f)
                lineToRelative(1.41f, -1.42f)
                close()
            }
        }
        .build()
        return _filterAltOff!!
    }

private var _filterAltOff: ImageVector? = null
