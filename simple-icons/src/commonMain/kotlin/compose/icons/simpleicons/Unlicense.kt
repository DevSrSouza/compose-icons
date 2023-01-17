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

public val SimpleIcons.Unlicense: ImageVector
    get() {
        if (_unlicense != null) {
            return _unlicense!!
        }
        _unlicense = Builder(name = "Unlicense", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.627f, -5.373f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.627f, 0.0f, 12.0f)
                reflectiveCurveTo(5.373f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.373f, 12.0f, 12.0f)
                close()
                moveTo(12.0f, 2.449f)
                arcTo(9.551f, 9.551f, 0.0f, false, false, 2.449f, 12.0f)
                curveToRelative(0.0f, 2.09f, 0.672f, 4.024f, 1.811f, 5.597f)
                lineTo(17.597f, 4.26f)
                arcTo(9.508f, 9.508f, 0.0f, false, false, 12.0f, 2.449f)
                close()
                moveTo(12.0f, 21.551f)
                arcTo(9.551f, 9.551f, 0.0f, false, false, 21.551f, 12.0f)
                curveToRelative(0.0f, -2.09f, -0.672f, -4.024f, -1.811f, -5.597f)
                lineTo(6.403f, 19.74f)
                arcTo(9.508f, 9.508f, 0.0f, false, false, 12.0f, 21.551f)
                close()
                moveTo(12.0f, 18.735f)
                arcToRelative(6.704f, 6.704f, 0.0f, false, true, -3.34f, -0.885f)
                lineToRelative(2.32f, -2.32f)
                arcToRelative(3.674f, 3.674f, 0.0f, false, false, 4.388f, -2.06f)
                horizontalLineToRelative(3.206f)
                arcTo(6.737f, 6.737f, 0.0f, false, true, 12.0f, 18.734f)
                close()
                moveTo(5.265f, 12.0f)
                arcTo(6.735f, 6.735f, 0.0f, false, true, 15.34f, 6.15f)
                lineToRelative(-2.32f, 2.32f)
                arcToRelative(3.673f, 3.673f, 0.0f, false, false, -4.55f, 4.55f)
                lineToRelative(-2.32f, 2.32f)
                arcTo(6.704f, 6.704f, 0.0f, false, true, 5.265f, 12.0f)
                close()
                moveTo(18.545f, 10.408f)
                horizontalLineToRelative(-2.443f)
                lineTo(17.85f, 8.66f)
                curveToRelative(0.309f, 0.54f, 0.545f, 1.128f, 0.695f, 1.748f)
                close()
            }
        }
        .build()
        return _unlicense!!
    }

private var _unlicense: ImageVector? = null
