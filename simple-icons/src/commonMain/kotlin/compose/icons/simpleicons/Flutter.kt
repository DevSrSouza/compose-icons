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

public val SimpleIcons.Flutter: ImageVector
    get() {
        if (_flutter != null) {
            return _flutter!!
        }
        _flutter = Builder(name = "Flutter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.314f, 0.0f)
                lineTo(2.3f, 12.0f)
                lineTo(6.0f, 15.7f)
                lineTo(21.684f, 0.013f)
                horizontalLineToRelative(-7.357f)
                close()
                moveTo(14.328f, 11.072f)
                lineTo(7.857f, 17.53f)
                lineToRelative(6.47f, 6.47f)
                lineTo(21.7f, 24.0f)
                lineToRelative(-6.46f, -6.468f)
                lineToRelative(6.46f, -6.46f)
                horizontalLineToRelative(-7.37f)
                close()
            }
        }
        .build()
        return _flutter!!
    }

private var _flutter: ImageVector? = null
