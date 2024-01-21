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

public val SimpleIcons.Metacritic: ImageVector
    get() {
        if (_metacritic != null) {
            return _metacritic!!
        }
        _metacritic = Builder(name = "Metacritic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.99f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 24.0f, 12.0f)
                verticalLineToRelative(-0.014f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 11.99f, 0.0f)
                close()
                moveTo(11.935f, 2.564f)
                arcToRelative(9.399f, 9.399f, 0.0f, false, true, 9.407f, 9.389f)
                verticalLineToRelative(0.01f)
                arcToRelative(9.399f, 9.399f, 0.0f, true, true, -9.408f, -9.399f)
                close()
                moveTo(10.325f, 19.762f)
                lineTo(12.371f, 17.716f)
                lineTo(8.431f, 13.776f)
                curveToRelative(-0.165f, -0.166f, -0.345f, -0.373f, -0.442f, -0.608f)
                curveToRelative(-0.221f, -0.47f, -0.318f, -1.203f, 0.221f, -1.742f)
                curveToRelative(0.664f, -0.664f, 1.548f, -0.387f, 2.406f, 0.47f)
                lineToRelative(3.788f, 3.788f)
                lineToRelative(2.046f, -2.046f)
                lineToRelative(-3.954f, -3.954f)
                arcToRelative(2.48f, 2.48f, 0.0f, false, true, -0.456f, -0.622f)
                curveToRelative(-0.263f, -0.539f, -0.25f, -1.216f, 0.235f, -1.7f)
                curveToRelative(0.677f, -0.678f, 1.562f, -0.429f, 2.544f, 0.553f)
                lineToRelative(3.677f, 3.677f)
                lineToRelative(2.046f, -2.046f)
                lineToRelative(-3.982f, -3.982f)
                curveToRelative(-2.018f, -2.018f, -3.912f, -1.949f, -5.212f, -0.65f)
                curveToRelative(-0.498f, 0.499f, -0.802f, 1.024f, -0.954f, 1.618f)
                arcToRelative(4.026f, 4.026f, 0.0f, false, false, -0.055f, 1.686f)
                lineToRelative(-0.027f, 0.028f)
                curveToRelative(-0.996f, -0.414f, -2.13f, -0.166f, -3.0f, 0.705f)
                curveToRelative(-1.162f, 1.161f, -1.12f, 2.392f, -0.982f, 3.11f)
                lineToRelative(-0.042f, 0.043f)
                lineToRelative(-1.009f, -0.816f)
                lineToRelative(-1.77f, 1.77f)
                arcToRelative(64.1f, 64.1f, 0.0f, false, true, 2.213f, 2.1f)
                close()
            }
        }
        .build()
        return _metacritic!!
    }

private var _metacritic: ImageVector? = null
