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

public val SimpleIcons.Androidauto: ImageVector
    get() {
        if (_androidauto != null) {
            return _androidauto!!
        }
        _androidauto = Builder(name = "Androidauto", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveToRelative(-0.6f, 0.0f, -1.11f, 0.32f, -1.39f, 0.8f)
                lineTo(0.48f, 18.4f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, false, 1.39f, 2.4f)
                horizontalLineToRelative(2.0f)
                lineToRelative(7.7f, -13.58f)
                lineToRelative(0.43f, -0.77f)
                lineToRelative(8.13f, 14.35f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, false, 1.39f, -2.4f)
                lineTo(13.39f, 0.8f)
                arcTo(1.6f, 1.6f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 7.47f)
                lineToRelative(-9.07f, 16.0f)
                lineToRelative(0.54f, 0.53f)
                lineTo(12.0f, 20.8f)
                lineToRelative(8.53f, 3.2f)
                lineToRelative(0.54f, -0.53f)
                close()
            }
        }
        .build()
        return _androidauto!!
    }

private var _androidauto: ImageVector? = null
