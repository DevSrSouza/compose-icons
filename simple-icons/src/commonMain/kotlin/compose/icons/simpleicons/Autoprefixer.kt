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

public val SimpleIcons.Autoprefixer: ImageVector
    get() {
        if (_autoprefixer != null) {
            return _autoprefixer!!
        }
        _autoprefixer = Builder(name = "Autoprefixer", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.87f, 21.045f)
                horizontalLineToRelative(2.923f)
                lineToRelative(0.959f, -3.068f)
                horizontalLineToRelative(4.503f)
                lineToRelative(0.949f, 3.068f)
                horizontalLineToRelative(2.922f)
                lineTo(11.94f, 2.955f)
                lineToRelative(-6.07f, 18.09f)
                close()
                moveTo(12.032f, 10.925f)
                lineTo(13.575f, 15.842f)
                horizontalLineToRelative(-3.153f)
                lineToRelative(1.553f, -4.916f)
                horizontalLineToRelative(0.057f)
                close()
                moveTo(24.0f, 17.617f)
                lineToRelative(-0.378f, -1.182f)
                lineToRelative(-6.266f, -0.59f)
                lineToRelative(0.733f, 2.127f)
                lineToRelative(5.91f, -0.354f)
                close()
                moveTo(6.644f, 15.843f)
                lineToRelative(-6.266f, 0.591f)
                lineTo(0.0f, 17.616f)
                lineToRelative(5.911f, 0.355f)
                lineToRelative(0.733f, -2.128f)
                close()
            }
        }
        .build()
        return _autoprefixer!!
    }

private var _autoprefixer: ImageVector? = null
