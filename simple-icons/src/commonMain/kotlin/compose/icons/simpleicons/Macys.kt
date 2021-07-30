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

public val SimpleIcons.Macys: ImageVector
    get() {
        if (_macys != null) {
            return _macys!!
        }
        _macys = Builder(name = "Macys", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.015f, 0.624f)
                lineTo(9.19f, 9.293f)
                horizontalLineTo(0.0f)
                lineToRelative(7.445f, 5.384f)
                lineToRelative(-2.819f, 8.673f)
                lineTo(12.0f, 17.986f)
                lineToRelative(7.422f, 5.393f)
                lineToRelative(-2.835f, -8.713f)
                lineTo(24.0f, 9.292f)
                horizontalLineToRelative(-9.162f)
                lineTo(12.015f, 0.622f)
                verticalLineToRelative(0.002f)
                close()
            }
        }
        .build()
        return _macys!!
    }

private var _macys: ImageVector? = null
