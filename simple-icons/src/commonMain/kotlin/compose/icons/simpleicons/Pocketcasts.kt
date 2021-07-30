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

public val SimpleIcons.Pocketcasts: ImageVector
    get() {
        if (_pocketcasts != null) {
            return _pocketcasts!!
        }
        _pocketcasts = Builder(name = "Pocketcasts", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.372f, 0.0f, 0.0f, 5.372f, 0.0f, 12.0f)
                curveToRelative(0.0f, 6.628f, 5.372f, 12.0f, 12.0f, 12.0f)
                curveToRelative(6.628f, 0.0f, 12.0f, -5.372f, 12.0f, -12.0f)
                curveTo(24.0f, 5.372f, 18.628f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(15.564f, 12.0f)
                curveToRelative(0.0f, -1.968f, -1.596f, -3.564f, -3.564f, -3.564f)
                curveToRelative(-1.968f, 0.0f, -3.564f, 1.595f, -3.564f, 3.564f)
                curveToRelative(0.0f, 1.968f, 1.595f, 3.564f, 3.564f, 3.564f)
                verticalLineTo(17.6f)
                curveToRelative(-3.093f, 0.0f, -5.6f, -2.507f, -5.6f, -5.6f)
                curveToRelative(0.0f, -3.093f, 2.507f, -5.6f, 5.6f, -5.6f)
                curveToRelative(3.093f, 0.0f, 5.6f, 2.507f, 5.6f, 5.6f)
                horizontalLineTo(15.564f)
                close()
                moveTo(19.0f, 12.0f)
                curveToRelative(0.0f, -3.866f, -3.134f, -7.0f, -7.0f, -7.0f)
                curveToRelative(-3.866f, 0.0f, -7.0f, 3.134f, -7.0f, 7.0f)
                curveToRelative(0.0f, 3.866f, 3.134f, 7.0f, 7.0f, 7.0f)
                verticalLineToRelative(2.333f)
                curveToRelative(-5.155f, 0.0f, -9.333f, -4.179f, -9.333f, -9.333f)
                curveToRelative(0.0f, -5.155f, 4.179f, -9.333f, 9.333f, -9.333f)
                curveToRelative(5.155f, 0.0f, 9.333f, 4.179f, 9.333f, 9.333f)
                horizontalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _pocketcasts!!
    }

private var _pocketcasts: ImageVector? = null
