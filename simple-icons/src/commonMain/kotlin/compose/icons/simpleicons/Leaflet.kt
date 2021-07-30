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

public val SimpleIcons.Leaflet: ImageVector
    get() {
        if (_leaflet != null) {
            return _leaflet!!
        }
        _leaflet = Builder(name = "Leaflet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.69f, 0.0f)
                curveToRelative(-0.355f, 0.574f, -8.432f, 4.74f, -10.856f, 8.649f)
                curveToRelative(-2.424f, 3.91f, -3.116f, 6.988f, -2.237f, 9.882f)
                curveToRelative(0.879f, 2.893f, 2.559f, 2.763f, 3.516f, 3.717f)
                curveToRelative(0.958f, 0.954f, 2.257f, 2.113f, 4.332f, 1.645f)
                curveToRelative(2.717f, -0.613f, 5.335f, -2.426f, 6.638f, -7.508f)
                curveToRelative(1.302f, -5.082f, 0.448f, -9.533f, -0.103f, -11.99f)
                arcTo(35.395f, 35.395f, 0.0f, false, false, 17.69f, 0.0f)
                close()
                moveTo(17.552f, 0.858f)
                lineToRelative(-9.22f, 21.585f)
                lineToRelative(-0.574f, -0.577f)
                close()
            }
        }
        .build()
        return _leaflet!!
    }

private var _leaflet: ImageVector? = null
