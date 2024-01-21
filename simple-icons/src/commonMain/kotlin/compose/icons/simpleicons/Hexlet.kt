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

public val SimpleIcons.Hexlet: ImageVector
    get() {
        if (_hexlet != null) {
            return _hexlet!!
        }
        _hexlet = Builder(name = "Hexlet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.732f, 7.099f)
                verticalLineToRelative(6.422f)
                lineTo(7.268f, 13.521f)
                lineTo(7.268f, 7.099f)
                lineTo(4.563f, 6.085f)
                lineTo(4.563f, 24.0f)
                horizontalLineToRelative(2.705f)
                verticalLineToRelative(-7.775f)
                horizontalLineToRelative(9.464f)
                lineTo(16.732f, 24.0f)
                horizontalLineToRelative(2.705f)
                lineTo(19.437f, 6.085f)
                lineToRelative(-2.705f, 1.014f)
                close()
                moveTo(19.775f, 3.042f)
                lineTo(12.0f, 0.0f)
                lineTo(4.225f, 3.042f)
                lineTo(12.0f, 5.746f)
                lineToRelative(7.775f, -2.704f)
                close()
            }
        }
        .build()
        return _hexlet!!
    }

private var _hexlet: ImageVector? = null
