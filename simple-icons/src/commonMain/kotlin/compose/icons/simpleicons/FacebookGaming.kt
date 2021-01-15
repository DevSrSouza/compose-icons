package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.FacebookGaming: ImageVector
    get() {
        if (_facebookGaming != null) {
            return _facebookGaming!!
        }
        _facebookGaming = Builder(name = "FacebookGaming", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(15.67f)
                verticalLineToRelative(-7.35f)
                lineTo(7.35f, 16.65f)
                verticalLineToRelative(-9.3f)
                lineTo(24.0f, 7.35f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(8.33f, 15.68f)
                horizontalLineToRelative(8.32f)
                lineTo(16.65f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 8.32f)
                lineTo(8.33f, 8.32f)
                close()
            }
        }
        .build()
        return _facebookGaming!!
    }

private var _facebookGaming: ImageVector? = null
