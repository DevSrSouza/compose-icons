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

public val SimpleIcons.Atlassian: ImageVector
    get() {
        if (_atlassian != null) {
            return _atlassian!!
        }
        _atlassian = Builder(name = "Atlassian", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.12f, 11.084f)
                arcToRelative(0.683f, 0.683f, 0.0f, false, false, -1.16f, 0.126f)
                lineTo(0.075f, 22.974f)
                arcToRelative(0.703f, 0.703f, 0.0f, false, false, 0.63f, 1.018f)
                horizontalLineToRelative(8.19f)
                arcToRelative(0.678f, 0.678f, 0.0f, false, false, 0.63f, -0.39f)
                curveToRelative(1.767f, -3.65f, 0.696f, -9.203f, -2.406f, -12.52f)
                close()
                moveTo(11.434f, 0.386f)
                arcToRelative(15.515f, 15.515f, 0.0f, false, false, -0.906f, 15.317f)
                lineToRelative(3.95f, 7.9f)
                arcToRelative(0.703f, 0.703f, 0.0f, false, false, 0.628f, 0.388f)
                horizontalLineToRelative(8.19f)
                arcToRelative(0.703f, 0.703f, 0.0f, false, false, 0.63f, -1.017f)
                lineTo(12.63f, 0.38f)
                arcToRelative(0.664f, 0.664f, 0.0f, false, false, -1.196f, 0.006f)
                close()
            }
        }
        .build()
        return _atlassian!!
    }

private var _atlassian: ImageVector? = null
