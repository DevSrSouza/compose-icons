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

public val SimpleIcons.Chainlink: ImageVector
    get() {
        if (_chainlink != null) {
            return _chainlink!!
        }
        _chainlink = Builder(name = "Chainlink", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                lineTo(9.798f, 1.266f)
                lineToRelative(-6.0f, 3.468f)
                lineTo(1.596f, 6.0f)
                verticalLineToRelative(12.0f)
                lineToRelative(2.202f, 1.266f)
                lineToRelative(6.055f, 3.468f)
                lineTo(12.055f, 24.0f)
                lineToRelative(2.202f, -1.266f)
                lineToRelative(5.945f, -3.468f)
                lineTo(22.404f, 18.0f)
                verticalLineTo(6.0f)
                lineToRelative(-2.202f, -1.266f)
                lineToRelative(-6.0f, -3.468f)
                close()
                moveTo(6.0f, 15.468f)
                verticalLineTo(8.532f)
                lineToRelative(6.0f, -3.468f)
                lineToRelative(6.0f, 3.468f)
                verticalLineToRelative(6.936f)
                lineToRelative(-6.0f, 3.468f)
                close()
            }
        }
        .build()
        return _chainlink!!
    }

private var _chainlink: ImageVector? = null
