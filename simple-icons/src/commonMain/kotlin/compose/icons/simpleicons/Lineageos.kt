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

public val SimpleIcons.Lineageos: ImageVector
    get() {
        if (_lineageos != null) {
            return _lineageos!!
        }
        _lineageos = Builder(name = "Lineageos", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.645f, 12.057f)
                arcToRelative(2.404f, 2.404f, 0.0f, false, false, -1.803f, 0.799f)
                lineToRelative(-0.138f, -0.054f)
                arcToRelative(17.801f, 17.801f, 0.0f, false, false, -2.867f, -0.859f)
                arcToRelative(4.808f, 4.808f, 0.0f, false, false, -9.616f, 0.0f)
                horizontalLineToRelative(-0.132f)
                arcToRelative(17.747f, 17.747f, 0.0f, false, false, -2.764f, 0.835f)
                lineToRelative(-0.138f, 0.054f)
                arcToRelative(2.404f, 2.404f, 0.0f, true, false, 0.559f, 1.07f)
                arcToRelative(16.599f, 16.599f, 0.0f, false, true, 2.578f, -0.775f)
                arcToRelative(4.808f, 4.808f, 0.0f, false, false, 9.357f, 0.0f)
                arcToRelative(16.557f, 16.557f, 0.0f, false, true, 2.578f, 0.769f)
                arcToRelative(2.404f, 2.404f, 0.0f, true, false, 2.386f, -1.839f)
                close()
                moveTo(2.414f, 15.663f)
                arcToRelative(1.202f, 1.202f, 0.0f, true, true, 1.202f, -1.202f)
                arcToRelative(1.202f, 1.202f, 0.0f, false, true, -1.202f, 1.202f)
                close()
                moveTo(12.03f, 15.663f)
                arcToRelative(3.606f, 3.606f, 0.0f, true, true, 3.606f, -3.606f)
                arcToRelative(3.606f, 3.606f, 0.0f, false, true, -3.606f, 3.606f)
                close()
                moveTo(21.645f, 15.663f)
                arcToRelative(1.202f, 1.202f, 0.0f, true, true, 1.202f, -1.202f)
                arcToRelative(1.202f, 1.202f, 0.0f, false, true, -1.202f, 1.202f)
                close()
                moveTo(13.833f, 12.057f)
                arcToRelative(1.803f, 1.803f, 0.0f, true, true, -1.803f, -1.803f)
                arcToRelative(1.803f, 1.803f, 0.0f, false, true, 1.803f, 1.803f)
                close()
            }
        }
        .build()
        return _lineageos!!
    }

private var _lineageos: ImageVector? = null
