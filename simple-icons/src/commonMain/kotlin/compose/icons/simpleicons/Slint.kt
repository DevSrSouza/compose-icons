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

public val SimpleIcons.Slint: ImageVector
    get() {
        if (_slint != null) {
            return _slint!!
        }
        _slint = Builder(name = "Slint", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.503f, 23.914f)
                lineToRelative(13.61f, -9.399f)
                reflectiveCurveToRelative(0.614f, -0.351f, 0.614f, -0.906f)
                curveToRelative(0.0f, -0.739f, -0.776f, -0.979f, -0.776f, -0.979f)
                lineToRelative(-7.488f, -2.953f)
                curveToRelative(-0.267f, -0.104f, -0.634f, 0.189f, -0.29f, 0.56f)
                lineToRelative(2.479f, 2.471f)
                reflectiveCurveToRelative(0.688f, 0.675f, 0.688f, 1.117f)
                reflectiveCurveToRelative(-0.423f, 0.836f, -0.423f, 0.836f)
                lineToRelative(-9.02f, 8.684f)
                curveToRelative(-0.32f, 0.31f, 0.113f, 0.87f, 0.606f, 0.569f)
                close()
                moveTo(17.497f, 0.087f)
                lineTo(3.887f, 9.484f)
                reflectiveCurveToRelative(-0.614f, 0.351f, -0.614f, 0.906f)
                curveToRelative(0.0f, 0.739f, 0.776f, 0.98f, 0.776f, 0.98f)
                lineToRelative(7.488f, 2.953f)
                curveToRelative(0.267f, 0.103f, 0.636f, -0.19f, 0.29f, -0.559f)
                lineToRelative(-2.479f, -2.48f)
                reflectiveCurveToRelative(-0.688f, -0.673f, -0.688f, -1.116f)
                curveToRelative(0.0f, -0.444f, 0.423f, -0.837f, 0.423f, -0.837f)
                lineTo(18.097f, 0.654f)
                curveToRelative(0.326f, -0.31f, -0.106f, -0.87f, -0.6f, -0.567f)
                close()
            }
        }
        .build()
        return _slint!!
    }

private var _slint: ImageVector? = null
