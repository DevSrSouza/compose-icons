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

public val SimpleIcons.Planet: ImageVector
    get() {
        if (_planet != null) {
            return _planet!!
        }
        _planet = Builder(name = "Planet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.891f, 6.582f)
                curveToRelative(-1.159f, 0.0f, -2.4f, 0.457f, -3.217f, 1.633f)
                horizontalLineToRelative(-0.033f)
                arcToRelative(1.59f, 1.59f, 0.0f, false, false, -1.59f, -1.59f)
                horizontalLineToRelative(-0.048f)
                verticalLineToRelative(10.86f)
                arcToRelative(1.792f, 1.792f, 0.0f, false, false, 1.784f, 1.784f)
                verticalLineToRelative(-4.703f)
                horizontalLineToRelative(0.034f)
                curveToRelative(0.343f, 0.571f, 1.29f, 1.536f, 3.185f, 1.536f)
                curveToRelative(2.857f, 0.0f, 4.572f, -2.352f, 4.572f, -4.638f)
                curveToRelative(0.002f, -2.416f, -1.616f, -4.882f, -4.687f, -4.882f)
                close()
                moveTo(12.825f, 14.557f)
                curveToRelative(-1.714f, 0.0f, -3.07f, -1.388f, -3.07f, -3.217f)
                curveToRelative(0.0f, -1.666f, 1.242f, -3.2f, 3.023f, -3.2f)
                curveToRelative(1.845f, 0.0f, 3.103f, 1.616f, 3.103f, 3.233f)
                curveToRelative(-0.001f, 1.905f, -1.455f, 3.184f, -3.056f, 3.184f)
                close()
                moveTo(12.001f, 24.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 24.0f, 12.001f)
                arcTo(12.013f, 12.013f, 0.0f, false, true, 12.001f, 24.0f)
                close()
                moveTo(12.001f, 1.144f)
                arcToRelative(10.861f, 10.861f, 0.0f, true, false, 10.861f, 10.862f)
                arcToRelative(10.87f, 10.87f, 0.0f, false, false, -10.86f, -10.862f)
                close()
            }
        }
        .build()
        return _planet!!
    }

private var _planet: ImageVector? = null
