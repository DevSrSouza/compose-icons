package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Cheese: ImageVector
    get() {
        if (_cheese != null) {
            return _cheese!!
        }
        _cheese = Builder(name = "Cheese", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 288.0f)
                verticalLineToRelative(160.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                horizontalLineToRelative(448.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                verticalLineTo(288.0f)
                close()
                moveTo(299.83f, 32.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -21.13f, 7.0f)
                lineTo(0.0f, 256.0f)
                horizontalLineToRelative(512.0f)
                curveToRelative(0.0f, -119.89f, -94.0f, -217.8f, -212.17f, -224.0f)
                close()
            }
        }
        .build()
        return _cheese!!
    }

private var _cheese: ImageVector? = null
