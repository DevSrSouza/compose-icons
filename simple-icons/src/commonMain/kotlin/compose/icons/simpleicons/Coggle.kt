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

public val SimpleIcons.Coggle: ImageVector
    get() {
        if (_coggle != null) {
            return _coggle!!
        }
        _coggle = Builder(name = "Coggle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.684f, 0.0f)
                arcTo(3.683f, 3.683f, 0.0f, false, false, 0.0f, 3.684f)
                verticalLineToRelative(10.92f)
                curveToRelative(2.052f, -0.535f, 3.606f, -1.577f, 5.158f, -3.13f)
                horizontalLineToRelative(7.367f)
                verticalLineToRelative(7.368f)
                curveToRelative(-1.88f, 1.88f, -5.438f, 4.598f, -8.052f, 5.158f)
                horizontalLineToRelative(15.843f)
                arcTo(3.683f, 3.683f, 0.0f, false, false, 24.0f, 20.316f)
                verticalLineTo(8.881f)
                curveToRelative(-1.544f, 0.537f, -3.087f, 1.575f, -4.63f, 3.119f)
                lineToRelative(-4.74f, 4.736f)
                verticalLineTo(9.37f)
                horizontalLineTo(7.265f)
                lineToRelative(3.683f, -3.685f)
                curveToRelative(2.35f, -2.35f, 5.96f, -5.119f, 8.58f, -5.684f)
                horizontalLineTo(3.684f)
                close()
            }
        }
        .build()
        return _coggle!!
    }

private var _coggle: ImageVector? = null
