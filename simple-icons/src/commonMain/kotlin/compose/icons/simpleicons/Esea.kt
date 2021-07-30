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

public val SimpleIcons.Esea: ImageVector
    get() {
        if (_esea != null) {
            return _esea!!
        }
        _esea = Builder(name = "Esea", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.054f, 2.767f)
                lineTo(8.95f, 9.511f)
                lineTo(0.0f, 9.65f)
                lineToRelative(5.832f, 4.47f)
                lineTo(1.042f, 21.0f)
                lineToRelative(8.491f, -4.088f)
                lineToRelative(5.711f, 4.322f)
                verticalLineTo(14.12f)
                lineTo(24.0f, 9.796f)
                lineToRelative(-17.255f, 4.02f)
                arcToRelative(12.575f, 12.575f, 0.0f, false, false, 1.589f, -1.955f)
                arcToRelative(5.475f, 5.475f, 0.0f, false, false, 0.617f, -1.786f)
                lineToRelative(5.593f, -0.15f)
                close()
            }
        }
        .build()
        return _esea!!
    }

private var _esea: ImageVector? = null
