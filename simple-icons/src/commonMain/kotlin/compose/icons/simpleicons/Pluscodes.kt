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

public val SimpleIcons.Pluscodes: ImageVector
    get() {
        if (_pluscodes != null) {
            return _pluscodes!!
        }
        _pluscodes = Builder(name = "Pluscodes", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, -2.4f, 2.4f)
                arcTo(2.4f, 2.4f, 0.0f, false, false, 12.0f, 4.8f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 2.4f, -2.4f)
                arcTo(2.4f, 2.4f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(9.543f, 9.543f)
                verticalLineToRelative(4.914f)
                horizontalLineToRelative(4.914f)
                lineTo(14.457f, 9.543f)
                close()
                moveTo(2.4f, 9.6f)
                arcTo(2.4f, 2.4f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 2.4f, 2.4f)
                arcTo(2.4f, 2.4f, 0.0f, false, false, 4.8f, 12.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, -2.4f, -2.4f)
                close()
                moveTo(21.6f, 9.6f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, -2.4f, 2.4f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 2.4f, 2.4f)
                arcTo(2.4f, 2.4f, 0.0f, false, false, 24.0f, 12.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, -2.4f, -2.4f)
                close()
                moveTo(12.0f, 19.2f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, -2.4f, 2.4f)
                arcTo(2.4f, 2.4f, 0.0f, false, false, 12.0f, 24.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 2.4f, -2.4f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, -2.4f, -2.4f)
                close()
            }
        }
        .build()
        return _pluscodes!!
    }

private var _pluscodes: ImageVector? = null
