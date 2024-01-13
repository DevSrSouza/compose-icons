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

public val SimpleIcons.Affinitypublisher: ImageVector
    get() {
        if (_affinitypublisher != null) {
            return _affinitypublisher!!
        }
        _affinitypublisher = Builder(name = "Affinitypublisher", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 2.344f)
                verticalLineToRelative(19.312f)
                arcTo(2.345f, 2.345f, 0.0f, false, true, 21.656f, 24.0f)
                lineTo(2.344f, 24.0f)
                arcTo(2.345f, 2.345f, 0.0f, false, true, 0.0f, 21.656f)
                lineTo(0.0f, 2.344f)
                arcTo(2.345f, 2.345f, 0.0f, false, true, 2.344f, 0.0f)
                horizontalLineToRelative(19.312f)
                arcTo(2.345f, 2.345f, 0.0f, false, true, 24.0f, 2.344f)
                close()
                moveTo(22.242f, 18.951f)
                lineTo(12.312f, 1.758f)
                horizontalLineToRelative(-1.639f)
                lineTo(9.75f, 3.354f)
                lineToRelative(10.91f, 18.888f)
                horizontalLineToRelative(0.645f)
                curveToRelative(0.517f, 0.0f, 0.937f, -0.42f, 0.937f, -0.937f)
                verticalLineToRelative(-2.354f)
                close()
                moveTo(15.331f, 22.242f)
                lineTo(7.086f, 7.967f)
                lineToRelative(-1.263f, 2.187f)
                arcToRelative(1.657f, 1.657f, 0.0f, false, false, 0.0f, 1.657f)
                curveToRelative(1.512f, 2.615f, 6.025f, 10.431f, 6.025f, 10.431f)
                horizontalLineToRelative(3.483f)
                close()
                moveTo(21.305f, 1.758f)
                horizontalLineToRelative(-8.071f)
                lineToRelative(9.008f, 15.596f)
                lineTo(22.242f, 2.695f)
                arcToRelative(0.938f, 0.938f, 0.0f, false, false, -0.937f, -0.937f)
                close()
                moveTo(10.925f, 22.242f)
                lineTo(4.883f, 11.781f)
                lineToRelative(-3.125f, 5.411f)
                verticalLineToRelative(4.113f)
                curveToRelative(0.0f, 0.517f, 0.42f, 0.937f, 0.938f, 0.937f)
                horizontalLineToRelative(8.229f)
                close()
                moveTo(19.737f, 22.242f)
                lineTo(9.289f, 4.153f)
                lineTo(7.598f, 7.08f)
                lineToRelative(8.656f, 15.162f)
                horizontalLineToRelative(3.483f)
                close()
            }
        }
        .build()
        return _affinitypublisher!!
    }

private var _affinitypublisher: ImageVector? = null
