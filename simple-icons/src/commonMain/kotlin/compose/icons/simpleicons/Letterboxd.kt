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

public val SimpleIcons.Letterboxd: ImageVector
    get() {
        if (_letterboxd != null) {
            return _letterboxd!!
        }
        _letterboxd = Builder(name = "Letterboxd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.29f, 16.752f)
                verticalLineTo(7.2f)
                horizontalLineTo(6.546f)
                verticalLineTo(4.8f)
                horizontalLineToRelative(6.328f)
                verticalLineToRelative(2.4f)
                horizontalLineToRelative(-1.746f)
                verticalLineToRelative(9.574f)
                horizontalLineToRelative(3.925f)
                verticalLineToRelative(-2.618f)
                horizontalLineToRelative(2.839f)
                verticalLineTo(19.2f)
                horizontalLineTo(6.545f)
                verticalLineToRelative(-2.448f)
                horizontalLineToRelative(1.746f)
                close()
                moveTo(0.0f, 12.0f)
                curveToRelative(0.0f, 6.628f, 5.372f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.372f, 12.0f, -12.0f)
                reflectiveCurveTo(18.628f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveTo(0.0f, 5.372f, 0.0f, 12.0f)
                close()
            }
        }
        .build()
        return _letterboxd!!
    }

private var _letterboxd: ImageVector? = null
