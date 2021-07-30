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

public val SimpleIcons.Palantir: ImageVector
    get() {
        if (_palantir != null) {
            return _palantir!!
        }
        _palantir = Builder(name = "Palantir", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.147f, 18.0f)
                lineTo(12.0f, 21.178f)
                lineTo(3.853f, 18.0f)
                lineTo(2.5f, 20.343f)
                lineTo(12.0f, 24.0f)
                lineToRelative(9.5f, -3.657f)
                lineTo(20.147f, 18.0f)
                close()
                moveTo(12.0f, 0.0f)
                arcToRelative(9.5f, 9.5f, 0.0f, true, false, 0.0f, 19.0f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, 0.0f, -19.0f)
                close()
                moveTo(12.0f, 16.078f)
                arcToRelative(6.568f, 6.568f, 0.0f, true, true, 0.0f, -13.136f)
                arcToRelative(6.568f, 6.568f, 0.0f, false, true, 0.0f, 13.136f)
                close()
            }
        }
        .build()
        return _palantir!!
    }

private var _palantir: ImageVector? = null
