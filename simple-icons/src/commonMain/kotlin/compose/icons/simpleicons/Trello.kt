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

public val SimpleIcons.Trello: ImageVector
    get() {
        if (_trello != null) {
            return _trello!!
        }
        _trello = Builder(name = "Trello", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.147f, 0.0f)
                lineTo(2.853f, 0.0f)
                arcTo(2.86f, 2.86f, 0.0f, false, false, 0.0f, 2.853f)
                verticalLineToRelative(18.294f)
                arcTo(2.86f, 2.86f, 0.0f, false, false, 2.853f, 24.0f)
                horizontalLineToRelative(18.294f)
                arcTo(2.86f, 2.86f, 0.0f, false, false, 24.0f, 21.147f)
                lineTo(24.0f, 2.853f)
                arcTo(2.86f, 2.86f, 0.0f, false, false, 21.147f, 0.0f)
                close()
                moveTo(10.34f, 17.287f)
                arcToRelative(0.953f, 0.953f, 0.0f, false, true, -0.953f, 0.953f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(0.954f, 0.954f, 0.0f, false, true, -0.954f, -0.953f)
                lineTo(4.433f, 5.38f)
                arcToRelative(0.953f, 0.953f, 0.0f, false, true, 0.954f, -0.953f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.954f, 0.954f, 0.0f, false, true, 0.953f, 0.953f)
                close()
                moveTo(19.573f, 11.82f)
                arcToRelative(0.944f, 0.944f, 0.0f, false, true, -0.953f, 0.947f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(0.947f, 0.947f, 0.0f, false, true, -0.953f, -0.947f)
                lineTo(13.667f, 5.38f)
                arcToRelative(0.953f, 0.953f, 0.0f, false, true, 0.953f, -0.953f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.954f, 0.954f, 0.0f, false, true, 0.953f, 0.953f)
                close()
            }
        }
        .build()
        return _trello!!
    }

private var _trello: ImageVector? = null
