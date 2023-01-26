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

public val SharpGroup.NoCell: ImageVector
    get() {
        if (_noCell != null) {
            return _noCell!!
        }
        _noCell = Builder(name = "NoCell", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.19f, 21.19f)
                lineTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineTo(5.0f, 7.83f)
                verticalLineTo(23.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-1.17f)
                lineToRelative(0.78f, 0.78f)
                lineTo(21.19f, 21.19f)
                close()
                moveTo(7.0f, 18.0f)
                verticalLineTo(9.83f)
                lineTo(15.17f, 18.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(8.83f, 6.0f)
                lineTo(5.0f, 2.17f)
                verticalLineTo(1.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(15.17f)
                lineToRelative(-2.0f, -2.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(8.83f)
                close()
            }
        }
        .build()
        return _noCell!!
    }

private var _noCell: ImageVector? = null
